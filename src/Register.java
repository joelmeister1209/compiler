
public class Register {
	String var;
	boolean isFree;
	boolean isDirty;
	String name;
	public Register(String n){
		this.name = n;
		isFree = true; 
		//isDirty = false; 
		isDirty = true; //temp
		this.var = ""; 
	}
	public Register() {
		isFree = true; 
		//isDirty = false;
		isDirty = true; //temp
		this.var = "";
	}
	public Register setVar(String s) { 
		var=s; 
		this.isFree = false;
		return this; 
	}
	public String toString() {
		return this.name; 
	}
}
