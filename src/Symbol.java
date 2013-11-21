import java.io.*;
import java.util.*;
import java.lang.*;

public class Symbol{
	String name;//identifier
	String type;//INT,STRING,etc
	String value;
	String scope;
	String stackSpace;

	public void setStackSpace(Object s){this.stackSpace = (String)s;}
	public Symbol(String n) { this.name = n; }
	public Symbol(String n, String t) { 
		this.name = n; this.type = t; 
	}
	public Symbol(String n, String t, String v) { 
		this.name = n; this.type = t; this.value = v; 
	}
	public Symbol(String n, String t, String v, String s) { 
		this.name = n; this.type = t; this.value = v; scope = s; 
	}

	void setType (String t) { this.type = t; }
	String getType () { return this.type; }
	void setValue(String v) { this.value = v; }
	String getValue() { return this.value; }
	void setScope(String s) { this.scope = s; }
	String getScope() { return this.scope; }

	public void printInfo(){
		String s = "";
		s =  "name " + name + " type " + type ;
		if(value!=null) s =  "name " + name + " type " + type + " value " + value ;
		System.out.println(s);
	}
}

