import java.util.*;

@SuppressWarnings("serial")
public class InterRep extends LinkedList<Object>{
	static public final List<String> compChars = new LinkedList<String>(Arrays.asList("<", ">", "=", "!=", "<=", ">="));
	
	public String scope, var_name ;
	int ri, numParams, numLocVars, numLocTemps;
	public List<IRNode> rlist = new LinkedList<IRNode>();//IR CODE
	public List<String> ilist = new LinkedList<String>();
	public HashMap<Object, Object> jumpFromTo = new LinkedHashMap<Object, Object>();
	public Stack<Object> branchStack = new Stack<Object>();

	public void allocate(){
		
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
		
		/*
		for(int i = this.rlist.size()-1; i >= 0; i--){
			n = this.rlist.get(i);
			for(String s : n.gen){
				n.liveIn.add(s);
			}
			for(String s : n.kill){
				n.liveOut.add(s);
			}
		}*/
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
			n.printLiveIn();
			//n.printGenKill();
			for (int i = 0; i < split.length; i++){
				split[i] = split[i].replace("$T","r");
			}
		}
	}
	private void buildInstruction(String[] split){
		if(split == null) return;
		char t = 'i'; //init to ints
		for(int i = 0; i< split.length; i++){
			if(split[i].startsWith("$P")){
				split[i] = "$"+(6+numParams-1-Integer.parseInt(split[i].substring(2)));//numParams
			}
			else if(split[i].startsWith("$L")){
				split[i] = "$-"+ split[i].substring(2);//numLocVars
			}
			else if(split[i].startsWith("$T")){
				split[i] = "$-"+(this.numLocVars+Integer.parseInt(split[i].substring(2)));//numLocTmp
			}
			else if(split[i].startsWith("$R")){
				split[i] = "$"+(6-1+this.numParams);//numLocTmp
			}
		}
		if(split[0].startsWith(";PUSH")){
			if(split.length > 1){
				this.ilist.add("push "+split[1]);
			} else {
				this.ilist.add("push");
			}
			return;
		}
		if(split[0].startsWith(";POP")){
			if(split.length > 1){
				this.ilist.add("pop "+split[1]);
			} else {
				this.ilist.add("pop");
			}
			return;//got lazy
		}
		if (split[0].startsWith(";INT")){
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
			if(split[1].startsWith("$")){
				this.ilist.add("move "+split[1]+" r"+this.numLocTemps);
				this.ilist.add("move "+" r"+this.numLocTemps+" "+split[2]);
				return;
			}
			this.ilist.add("move "+split[1]+" "+split[2]);
		}else if (split[0].startsWith(";ADD")){
			t = Character.toLowerCase(split[0].charAt(4));
			if(t=='f') t = 'r';
			this.ilist.add("move "+split[1]+" "+split[3]);
			this.ilist.add("add"+t+" "+split[2]+" "+split[3]);

		}else if (split[0].startsWith(";SUB")){
			t = Character.toLowerCase(split[0].charAt(4));
			if(t=='f') t = 'r';
			this.ilist.add("move "+split[1]+" "+split[3]);
			this.ilist.add("sub"+t+" "+split[2]+" "+split[3]);

		}else if (split[0].startsWith(";MULT")){
			t = Character.toLowerCase(split[0].charAt(5));
			if(t=='f') t = 'r';
			this.ilist.add("move "+split[1]+" "+split[3]);
			this.ilist.add("mul"+t+" "+split[2]+" "+split[3]);

		}else if (split[0].startsWith(";DIV")){
			t = Character.toLowerCase(split[0].charAt(4));
			if(t=='f') t = 'r';
			this.ilist.add("move "+split[1]+" "+split[3]);
			this.ilist.add("div"+t+" "+split[2]+" "+split[3]);

		}else if (split[0].startsWith(";READ")){
			t = Character.toLowerCase(split[0].charAt(5));
			if(t=='f') t = 'r';
			this.ilist.add("sys read"+t+" "+split[1]);

		}else if (split[0].startsWith(";WRITE")){
			t = Character.toLowerCase(split[0].charAt(6));
			if(t=='f') t = 'r';
			else if (t=='s') {
				this.ilist.add("sys write"+t+" "+split[1]);
			}
			if(t=='r' || t =='i')
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
