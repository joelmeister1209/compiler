import java.util.*;


public class IRNode{
	List<String> gen = new ArrayList<String>(); //used
	List<String> kill = new ArrayList<String>(); //defined
	List<String> liveIn = new ArrayList<String>();
	List<String> liveOut = new ArrayList<String>();
	
	private String string="";
	public IRNode(String s){ 
		this.string = s; 
		this.genKill(this.string);
	}
	public String toString(){return this.string;}
	public void printGenKill(){
		if(!this.gen.isEmpty()){
			System.out.print(";gen: [");
			for(String s : this.gen){
				System.out.print(" "+s);
			}
			System.out.println(" ]");
		}
		if(!this.kill.isEmpty()){
			System.out.print(";kill [");
			for(String s : this.kill){
				System.out.print(" "+s);
			}
			System.out.println("]");
		}
	}
	public void printLiveIn(){
		if(this.gen.isEmpty()) return;
		System.out.print(";live: [");
		for(String s : this.liveIn){
			System.out.print(" "+s);
		}
		System.out.println(" ]");
	}
	boolean goodluck = false;
	public void genKill(String str){
		String[] strSplit = str.split(" ");
		if(goodluck){
			System.out.println(" ;) ");
		}
		else if(str.contains("PUSH")){//use
			if(strSplit.length < 2) return;
			this.gen.add(strSplit[1]);
		}
		else if(str.contains("POP")){ //define
			if(strSplit.length < 2) return;
			this.kill.add(strSplit[1]);
		}
		else if(str.contains("WRITE")){ //use
			if(strSplit.length < 2) return;
			this.gen.add(strSplit[1]);
		}
		else if(str.contains("READ")){ //define
			if(strSplit.length < 2) return;
			this.kill.add(strSplit[1]);
		}
		else if(InterRep.compChars.contains(str.substring(2,3))
				||InterRep.compChars.contains(str.substring(2,4))){ //use
			if(strSplit.length < 3) return;
			this.gen.add(strSplit[1]);
			this.gen.add(strSplit[2]);
		}
		else if(str.contains("ADD") ||str.contains("SUB")
				|| str.contains("MULT") ||str.contains("DIV")){ //use and define
			if(strSplit.length < 4) return;
			this.gen.add(strSplit[1]);
			this.gen.add(strSplit[2]);
			this.kill.add(strSplit[3]);
		}
		else if(str.contains("INT") || str.contains("FLOAT") || str.contains("STRING")){ //def
			if(strSplit.length < 2) return;
			this.gen.add(strSplit[1]);
		}
		else if(str.contains("STORE")){ 
			if(strSplit.length < 3) return;
			this.gen.add(strSplit[1]);
			this.kill.add(strSplit[2]);
		}
		else if(str.contains("RET")){ 
			
		}
	}
}
