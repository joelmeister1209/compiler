
public class Register {
	private String var;
	private String name;
	boolean isFree;
	boolean isDirty;
	public String getVar(){ return this.var;}
	public Register(String n){
		this.name = n;
		this.isFree = true; 
		//isDirty = false; 
		//this.isFree = false; 
		this.isDirty = true; //temp
		this.var = ""; 
	}
	public Register() {
		this.isFree = true; 
		//isDirty = false;
		//this.isFree = false;
		this.isDirty = true; //temp
		this.var = "";
	}
	public Register setVar(String s) { 
		this.var=s; 
		this.isFree = false;
		return this; 
	}
	public String toString() {
		return this.name; 
	}
}
