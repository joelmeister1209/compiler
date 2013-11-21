
public class Registers {
	class Register{
		String var;
		boolean isFree;
		boolean isDirty;
		public Register(){isFree = true; isDirty = false;}
		public Register setVar(String s) { var=s; return this; }
	}
	Register r0,r1,r2,r3;
	public Register ensure(String opr){ 
		if(r0.var.equals(opr)) return r0;
		if(r1.var.equals(opr)) return r1;
		if(r2.var.equals(opr)) return r2;
		if(r3.var.equals(opr)) return r3;
		Register r = allocate(opr);
		//gen load
		return r;
	}
	public void free(Register r){ 
		/*
		free(r)
			if r is marked dirty and variable is live
				generate store
			mark r as free
		*/
		return;
	}
	public Register allocate(String opr){ 
		if(r0.isFree) return r0.setVar(opr);
		if(r1.isFree) return r1.setVar(opr);
		if(r2.isFree) return r2.setVar(opr);
		if(r3.isFree) return r3.setVar(opr);
		return chooseReg();
	}
	public Register chooseReg(){
		free(r0); //temporary
		return r0;
		//choose the register to use
	}
}
