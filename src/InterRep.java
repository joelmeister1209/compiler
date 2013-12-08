import java.util.*;

@SuppressWarnings("serial")
public class InterRep extends LinkedList<Object>{
	boolean useAllocation = false; //true to use register allocation (./tiny)

	public String scope, var_name ;
	int ri, numParams, numLocVars, numLocTemps;

	static public final List<String> compChars = 
		new LinkedList<String>(Arrays.asList("<", ">", "=", "!=", "<=", ">="));
	public List<IRNode> rlist = 
		new LinkedList<IRNode>();//IR CODE
	public List<String> ilist = 
		new LinkedList<String>();
	public HashMap<Object, Object> jumpFromTo = 
		new LinkedHashMap<Object, Object>();
	public Stack<Object> branchStack = 
		new Stack<Object>();


	public Register r0 = new Register("r0");
	public Register r1 = new Register("r1");
	public Register r2 = new Register("r2");
	public Register r3 = new Register("r3");

	public Register ensure(String opr){ 
		if(r0.getVar().equals(opr)) return r0;
		if(r1.getVar().equals(opr)) return r1;
		if(r2.getVar().equals(opr)) return r2;
		if(r3.getVar().equals(opr)) return r3;
		Register r = allocate(opr);
		this.ilist.add("move "+opr+" "+r);
		return r;
	}
	private int i=0;
	public Register allocate(String opr){ 
		if(r0.isFree) {
			r0.setVar(opr);
			return r0;
		}
		if(r1.isFree){
			r1.setVar(opr);
			return r1;
		}
		if(r2.isFree){
			r2.setVar(opr);
			return r2;
		}
		if(r3.isFree){
			r3.setVar(opr);
			return r3;
		}
		Register r = chooseReg();
		r.setVar(opr);
		return r;
	}
	public Register chooseReg(){
		//i is declared above allocate(..)
		if(i == 0) return free(r0); 
		if(i == 1) return free(r1); 
		if(i == 2) return free(r2); 
		return free(r3); 
	}
	public boolean isNumeric(String str){
		  try  
		  {  
		    double d = Double.parseDouble(str);  
		  }  
		  catch(NumberFormatException nfe)  
		  {  
		    return false;  
		  }  
		  return true;  
	}
	public Register free(Register reg){ 
		if(!isNumeric(reg.getVar()))
			this.ilist.add("move "+reg+" "+reg.getVar()+" ;free");//temporary
		i = (i+1) % 4;//temporary
		return reg;
	}
	public void buildIR(){
		String[] split;
		ListIterator<IRNode> itr = null;
		itr = this.rlist.listIterator();
		while(itr.hasNext()){
			IRNode n = (IRNode)itr.next();
			String str = (n).toString();
			split = (str).split(" ");
			if( str.startsWith(";STRING")) 
				split = str.split(" ",3); 
			else if(str.startsWith(";LABEL") ){
				branchStack.push(split[1]);
				split = (str).split(" ");
			}else if(str.startsWith(";JUMP") && !branchStack.empty() && split.length == 1){
				str += jumpFromTo.get(branchStack.peek());
				split = (str).split(" ");
			} else if( compChars.contains(split[0].substring(2)) ){
				str += " "+jumpFromTo.get(branchStack.peek());
				if( ((String)branchStack.pop()).startsWith("while") ){
					str += " w";
				}
				split = (str).split(" ");
			}
			buildInstruction(split); //builds this.ilist
		}
		computeLiveness();
		dumpIRlist(); //prints the IR list
	}
	
	private void dumpIRlist(){
		String[] split;
		ListIterator<IRNode> itr = null;
		itr = this.rlist.listIterator();
		IRNode n = null;
		String str;
		while(itr.hasNext()){
			n = (IRNode)itr.next();
			str = (n).toString();
			split = (str).split(" ");
			System.out.println(str);
			//n.printLiveIn();
			//n.printGenKill();
		}
	}
	
	private String[] findStack(String[] split){
		for(int i = 0; i < split.length; i++){
			if(split[i].startsWith("$P")){
				split[i] = "$"+(6+numParams-1-Integer.parseInt(split[i].substring(2)));//numParams
			}
			else if(split[i].startsWith("$L")){
				split[i] = "$-"+ split[i].substring(2);//numLocVars
			}
			else if(split[i].startsWith("$T")){
				split[i] = "$-"+(this.numLocVars+Integer.parseInt(split[i].substring(2)));//numLocVars
				if( useAllocation){
					split[i] = ensure(split[i]).toString();
				} else{
					split[i] = split[i].replace("$-","r");
				}
			}
			else if(split[i].startsWith("$R")){
				split[i] = "$"+(6-1+this.numParams);//numParams
			}
		}
		return split;
	}
	
	private List<String> liveList = new LinkedList<String>();
	private void computeLiveness() {
		for(int i = this.rlist.size()-1; i >= 0; i--){
			for(String s : this.rlist.get(i).gen){
				if(!liveList.contains(s)) liveList.add(s);
			}
			for(String s : this.rlist.get(i).kill){
				liveList.remove(s);
			}
			for(String s : liveList){
				this.rlist.get(i).liveIn.add(s);
			}
		}
	}
	private boolean isRegister(String s){
		if(s == "r0" || s == "r1" || s == "r2" || s == "r3")
			return true;
		return false;
	}
	private void buildInstruction(String[] split){
		if(split == null) return;
		char t = 'i'; //init to ints
		Register r = new Register();
		Register rt1 = new Register() ; // second temp register
		split = findStack(split);
		StringBuilder testSB = new StringBuilder(100);
		testSB.append(";processing: ");
		for(int i = 0; i < split.length; i++){
			testSB.append(split[i]+" ");
		} //this.ilist.add(testSB.toString());
		if(split[0].startsWith(";PUSH")){
			if(split.length > 1){
				this.ilist.add("push "+split[1]);
			} else {
				this.ilist.add("push");
			}
		}
		else if(split[0].startsWith(";POP")){
			if(split.length > 1){
				if(useAllocation){
					r = ensure(split[1]);
					this.ilist.add("pop "+r);
					this.ilist.add("move "+r+ " " + r.getVar());
				} else {
					this.ilist.add("pop "+split[1]);
				}
			} else {
				this.ilist.add("pop");
			}
		}
		else if (split[0].startsWith(";INT")){
			if(this.scope.equals("GLOBAL"))
				this.ilist.add("var "+split[1]);
			else
				this.ilist.add(";add stack space for: INT "+split[1]);
		}else if (split[0].startsWith(";FLOAT")){
			if(this.scope.equals("GLOBAL"))
				this.ilist.add("var "+split[1]);
			else
				this.ilist.add(";add stack space for: FLOAT "+split[1]);
		}else if (split[0].startsWith(";LINK")){
			this.ilist.add("link");
		}else if (split[0].startsWith(";RET")){
			this.ilist.add("unlnk");
			this.ilist.add("ret");
		}else if (split[0].startsWith(";STRING")){
			this.ilist.add("str "+split[1]+" "+split[2]);
		}else if(split[0].startsWith(";STORE")){
			if(split[1].startsWith("$") && split[2].startsWith("$")
				||  (! isRegister(split[1]) && !isRegister(split[1]) )		
			){
				if(useAllocation){
					r = ensure(split[1]);
					this.ilist.add("move "+r+" "+split[2]);
				} else {
					this.ilist.add("move "+split[1]+" r"+ri);
					this.ilist.add("move r"+(ri++)+" "+split[2]);
				}
			} else {
				this.ilist.add("move "+split[1]+" "+split[2]);
			}
		}else if (split[0].startsWith(";ADD")
			|| split[0].startsWith(";SUB")
			|| split[0].startsWith(";MUL")
			|| split[0].startsWith(";DIV") 
			){	
			t = Character.toLowerCase(split[0].charAt(4));
			if(t=='f') t = 'r';
			split[0]=split[0].replace(";ADD", "add").substring(0,3); 
			split[0]=split[0].replace(";SUB", "sub").substring(0,3);
			if(split[0].startsWith(";SU")) split[0] = "sub";	
			split[0]=split[0].replace(";MUL", "mul").substring(0,3); 
			if(split[0].startsWith(";MU")) split[0] = "mul";
			split[0]=split[0].replace(";DIV", "div").substring(0,3);
			if(useAllocation){
				this.ilist.add("move "+split[1]+" "+ split[3]);
				this.ilist.add(split[0]+t+" "+split[2]+" "+ split[3]);
			}else {
				this.ilist.add("move "+ split[1] + " " + split[3] );
				this.ilist.add(split[0]+t+" "+split[2]+" "+split[3]);
			}
		}else if (split[0].startsWith(";READ")){
			t = Character.toLowerCase(split[0].charAt(5));
			if(t=='f') t = 'r';
			this.ilist.add("sys read"+t+" "+split[1]);

		}else if (split[0].startsWith(";WRITE")){
			t = Character.toLowerCase(split[0].charAt(6));
			if(t=='f') t = 'r';
			this.ilist.add("sys write"+t+" "+split[1]);
		} else if(split[0].startsWith(";LABEL")){
			this.ilist.add("label "+split[1]);
		} else if(split[0].startsWith(";JUMP")){
			this.ilist.add("jmp "+split[1]);
		} else if(split[0].startsWith(";JSR")){
			this.ilist.add("push r0");
			this.ilist.add("push r1");
			this.ilist.add("push r2");
			this.ilist.add("push r3");
			this.ilist.add("jsr "+split[1]);
			this.ilist.add("pop r3");
			this.ilist.add("pop r2");
			this.ilist.add("pop r1");
			this.ilist.add("pop r0");
		} else if(compChars.contains(split[0].substring(2))){
			this.ilist.add("move "+split[2]+" r"+ri);
			if(split[0].startsWith(";I"))
				this.ilist.add("cmpi "+split[1]+" r"+ri++);
			else
				this.ilist.add("cmpr "+split[1]+" r"+ri++);
			split[0] = ";"+split[0].substring(2);
			if(split.length == 5){
				if(split[0].equals( ";<") ){
					this.ilist.add("jlt " + split[3]); 
				}else if(split[0].equals( ";>")){
					this.ilist.add("jgt " + split[3]); 
				} else if(split[0].equals( ";<=")){
					this.ilist.add("jle " + split[3]); 
				}else if(split[0].equals(  ";>=")){
					this.ilist.add("jge " + split[3]); 
				}else if(split[0].equals( ";=" )){
					this.ilist.add("jeq " + split[3]); 
				}else if(split[0].equals(  ";!=")){
					this.ilist.add("jne " + split[3]); 
				}
			}else {
				if(split[0].equals( ";<") ){
					this.ilist.add("jge " + split[3]); //>=
				}else if(split[0].equals( ";>")){
					this.ilist.add("jle " + split[3]); //<=
				} else if(split[0].equals( ";<=")){
					this.ilist.add("jgt " + split[3]); //>
				}else if(split[0].equals(  ";>=")){
					this.ilist.add("jlt " + split[3]); //<
				}else if(split[0].equals( ";=" )){
					this.ilist.add("jne " + split[3]); //!=
				}else if(split[0].equals(  ";!=")){
					this.ilist.add("jeq " + split[3]); //=
				}
			}
		}
		else{
			StringBuilder sb = new StringBuilder(100);
			for(int k = 0; k < split.length ; k++ ) sb.append(split[k]+" ");
			this.ilist.add(";missed " + sb.toString());
		}
	}
	
	public void push(Object o){
		super.push(o);
		//System.out.println("push "+ o);
	}
	public Object pop(){
		Object o = super.pop();
		//System.out.println("pop "+o);
		return o;
	}
	public void printThis(){
		System.out.println("STACK FOR "+this.scope);
		for(Object obj : this){
			System.out.println(obj);
		}
	}
	
	public void addLabel(Object l){
		this.rlist.add(new IRNode(";LABEL "+l));
	}
	public void addJump(){
		this.rlist.add(new IRNode(";JUMP "));
	}
	public void addJump(Object o){
		this.rlist.add(new IRNode(";JUMP "+o));
	}
	public void addComp(Object a, Object b, Object c){
		addComp( a,  b,  c, "int");
	}
	public void addComp(Object a, Object b, Object c, Object type){
		this.rlist.add(new IRNode(";"+type+a+" "+b+" "+c));
	}
	public void addString(Object id,Object str){
		this.rlist.add(new IRNode(";STRING "+id+" "+str));
	}
	public void addInt(Object id){
		this.rlist.add(new IRNode(";INT "+id));
	}
	public void addFloat(Object id){
		this.rlist.add(new IRNode(";FLOAT "+id));
	}
	public void addInstruction(Object s, Object type){
		if(this.scope.equals("GLOBAL")){
			this.rlist.add(new IRNode((String)s));
			return;
		}
		if(s.toString().startsWith(";INT") || s.toString().startsWith(";FLOAT")){
			
			return;
		}
		this.rlist.add(new IRNode((String)s));
	}
	public void addStore(Object a, Object b, Object type){
		this.rlist.add(new IRNode(";STORE"+type+" "+a+" "+b));
	}	
	public void addOp(Object op, Object a, Object b, Object t, Object type){
		this.rlist.add(new IRNode(";"+op+type+" "+b+" "+a+" "+t));
	}
	public void addRead(Object a, Object type){
		this.rlist.add(new IRNode(";READ"+type+" "+a));
	}
	public void addWrite(Object a, Object type){
		this.rlist.add(new IRNode(";WRITE"+type+" "+a));
	}
}
