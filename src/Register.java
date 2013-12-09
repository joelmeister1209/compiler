
public class Register {
	private String var;
	private String name;
	boolean isFree;
	boolean isDirty;

	public Register() {
		this("");
	}
	public Register(String n){
		this.name = n;
		this.var = "";
		this.isFree = true;
		this.isDirty = false;
	}
	public Register setVar(String s) { 
		this.isFree = false;
		this.var = s;
		return this;
	}
	public String toString() { return this.name; }
	public String getVar(){ return this.var;}
}
