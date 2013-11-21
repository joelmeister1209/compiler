import java.util.*;

public class SymbolTable{
	/*http://stackoverflow.com/questions/5439529/determine-if-a-string-is-an-integer-in-java*/
	/*not plagiarising */
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    // only got here if we didn't return false
	    return true;
	}
	LinkedHashMap<String,SymbolTable> symboltables = new LinkedHashMap<String,SymbolTable>();
	LinkedHashMap<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();
	List<String> callParamList = new ArrayList<String>();
	boolean callParams = false;
	boolean funcCall = false;
	boolean returning = false;
	boolean gettingExpr = false;
	InterRep IR = new InterRep(); 
	int linkCount = 0;
	int tmpstrcnt = 1;
	int numParams = 1;
	int numLocVars = 1;
	
	String scope;
	SymbolTable parent;
	
	public char getTypeOf(Object obj){
		if(symbols.get(obj) == null) return this.parent.symbols.get(obj).type.charAt(0);
		return symbols.get(obj).type.charAt(0);
	}
	public String getSymbolStackSpace(Object s){
		if( this.symbols.get(s) == null ) {
			//System.out.println(";you must have missed: "+s);
			return (String)s;
		}
		return this.symbols.get(s).stackSpace;
	}
	public void setSymbolStackSpace(Object symName, Object space){
		this.symbols.get(symName).setStackSpace(space);
	}
	public String newLoc(boolean inc){
		if(inc) {
			this.numLocVars++;
			//IR.ri = this.tmpstrcnt+1; // i make more registers during cmp instructions
			return "$L"+(this.numLocVars-1);
		}
		else {
			return "$L"+this.numLocVars;
		}
	}
	public String newTemp(boolean inc){
		if(inc) {
			//IR.ri = this.tmpstrcnt; // i make more registers during cmp instructions
			this.tmpstrcnt++;
			IR.numLocTemps = this.tmpstrcnt;
			return "$T"+(this.tmpstrcnt-1);
		}
		else {
			return "$T"+this.tmpstrcnt;
		}
	}
	public void incNumParams(){
		this.numParams++;
		IR.numParams = this.numParams;
	}
	public void incLinkCount(){
		this.linkCount++;
		IR.numLocVars = this.linkCount;
	}
	public void buildIR(){
		IR.buildIR();	
		if(this.scope.equals("GLOBAL")) {
			System.out.println(";JSR main");
			System.out.println(";SYS HALT");
		}
		for(SymbolTable st : symboltables.values()){
			st.IR.buildIR();
		}
	}
	public void buildExecCode(){
		ListIterator<String> itr = null;
		itr = this.IR.ilist.listIterator();
		while(itr.hasNext()){
			String obj = (String)itr.next();
			if( obj.equals("link") )
				obj += " "+(this.numLocVars+this.tmpstrcnt); //this.linkCount;
			System.out.println(obj);
		}
		if(this.scope.equals("GLOBAL")) {
			System.out.println("jsr main");
			System.out.println("sys halt");
		}
		for(SymbolTable st : symboltables.values()){
			st.buildExecCode();
		}
	}
	SymbolTable(String s, SymbolTable p){
		this.parent = p;
		this.scope = s;
		IR.scope = s;
	}
	void addSymbol(String n, String t, String v, String sc){
		Symbol s = new Symbol(n,t,v,sc);
		if(!this.symbols.containsKey(s.name)){
			this.symbols.put(s.name,s);
		} else {
			System.out.println("DECLARATION ERROR "+s.name);
			System.exit(0);
		}
	}
	SymbolTable pushScope(String s){
		if(!this.symboltables.containsKey(s)) {
			SymbolTable tmp = new SymbolTable(s,this);
			this.symboltables.put(s,tmp);
			return this.symboltables.get(s);
		} else {
			System.out.println("scope name already used");
			System.exit(0);
		} return null;
	}

	SymbolTable popScope(){
		return this.parent;
	}
	public void printTable(){
		System.out.println("Symbol table " + this.scope);
		
		for ( String key : this.symbols.keySet()) {
			this.symbols.get(key).printInfo();
		}
		for ( String key : this.symboltables.keySet() ){
			System.out.println();
			this.symboltables.get(key).printTable();
		}
	}
}

