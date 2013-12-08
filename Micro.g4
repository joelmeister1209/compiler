grammar Micro;

@header{
	import java.io.*;
	import java.util.*;
}
@members{;
	public SymbolTable symbolTable = new SymbolTable("GLOBAL",null);
	public SymbolTable currTable = symbolTable;
	int i = 1;
	int tmp_i =0;
	int lbl = 0;
	void debug(Object o){
		//uncomment to enable debug comments
		//currTable.IR.addInstruction(";DEBUG "+o,null);
	}
	char type = 'I';
	boolean blockScopes = false;
}
/* Program */
program : 'PROGRAM' id 'BEGIN' pgm_body 'END' 
	{ 
	symbolTable.buildIR();
	symbolTable.buildExecCode();
	System.out.println("end");//end of code
	}
	;
id returns [String s] : IDENTIFIER {$s=$IDENTIFIER.text;};
pgm_body : decl func_declarations ;
decl : string_decl_list decl 
	| var_decl_list decl 	
	| ;

/* Global String Declaration ==*/

string_decl_list : string_decl+ ;
string_decl 	 : 'STRING' id ':=' str ';' 
	{
		currTable.addSymbol($id.s, "STRING", $str.s, currTable.scope);
		currTable.IR.addString($id.s,$str.s);
	};
str returns [String s]
	: STRINGLITERAL {$s=$STRINGLITERAL.text;};

/* Variable Declaration ==*/
var_decl_list     : var_decl+ ;
var_decl          : var_type{type=Character.toLowerCase(((String)$var_type.s).charAt(0));} id_list["DECL"]  ';' 
	;
var_type returns [String s] 
	: 'FLOAT' { $s="FLOAT"; }
	| 'INT' { $s="INT"; };
any_type  returns [String s]  
	: var_type {$s=$var_type.s;}
	| 'VOID' { $s="VOID"; };
id_list[String instruction] returns [String s]: id 
	{/*name, type, value, scope*/
		if($id.s!=null) $s=$id.s;
		String t = (type=='f') ? "FLOAT": "INT";
		if($instruction.equals("DECL")){			
			currTable.addSymbol($id.s, t, null, currTable.scope);
			if(currTable.scope == "GLOBAL"){
				if(t=="INT") currTable.IR.addInt($id.s);
				else if(t=="FLOAT")  currTable.IR.addFloat($id.s);
			}
			else {
				currTable.setSymbolStackSpace($id.s, currTable.newLoc(true));
			}
			currTable.incLinkCount();
		} else if ($instruction.equals("READ")){
			//System.out.println(";add read for "+$id_list.s+"->"+currTable.getSymbolStackSpace($id_list.s));
			if(currTable.symbols.get($id_list.s) != null) {
				type = currTable.symbols.get($id_list.s).type.charAt(0);
				type = Character.toUpperCase(type);
				currTable.IR.addRead(currTable.getSymbolStackSpace($id_list.s), type);
			}else if(symbolTable.symbols.get($id_list.s) != null
				&& symbolTable.symbols.get($id_list.s).type.equals("STRING")) {
				currTable.IR.addRead(currTable.getSymbolStackSpace($id_list.s), 'S');
			} else{//global
				type = symbolTable.symbols.get($id_list.s).type.charAt(0);
				type = Character.toUpperCase(type);
				currTable.IR.addRead(currTable.getSymbolStackSpace($id_list.s), type);
			}
		}else if ($instruction.equals("WRITE")){
			if(currTable.symbols.get($id_list.s) != null) {
				type = currTable.symbols.get($id_list.s).type.charAt(0);
				type = Character.toUpperCase(type);
				currTable.IR.addWrite(currTable.getSymbolStackSpace($id_list.s), type);
			}else if(symbolTable.symbols.get($id_list.s) != null
				&& symbolTable.symbols.get($id_list.s).type.equals("STRING")) {
				currTable.IR.addWrite(currTable.getSymbolStackSpace($id_list.s), 'S');
			} else{//global
				type = symbolTable.symbols.get($id_list.s).type.charAt(0);
				type = Character.toUpperCase(type);
				currTable.IR.addWrite(currTable.getSymbolStackSpace($id_list.s), type);
			}
		} else{	System.out.println(";I hope this doesn't get called =/");}
		
	}
	id_tail[$instruction] ;
id_tail [String i] : ',' id_list[$i] | ;

/* Function Paramater List ==*/
param_decl_list   : param_decl param_decl_tail | ;
param_decl_tail	  : ',' param_decl param_decl_tail | ;
param_decl        : var_type id 
	{
		currTable.addSymbol($id.s, $var_type.s, null, currTable.scope);
		currTable.setSymbolStackSpace($id.s, "\$P"+currTable.numParams);
		currTable.incNumParams();
	}; 

/* Function Declarations ==*/
func_declarations : func_decl*  ;
func_decl         : 'FUNCTION' any_type id 
	{ 
		currTable = currTable.pushScope($id.s); 
		currTable.IR.addLabel($id.s); 
		currTable.IR.addInstruction(";LINK ",null);
	}
	'(' param_decl_list ')' 'BEGIN' func_body 'END' 
	{ 
		currTable = currTable.popScope(); 
	}
	;
func_body         : decl stmt_list ;

/* Statement List */
stmt_list         : stmt* ;
stmt              : base_stmt | if_stmt | do_while_stmt  ;
base_stmt         : assign_stmt | read_stmt | write_stmt | return_stmt ;

/* Basic Statements */
assign_stmt       : assign_expr ';' ;
assign_expr       : id {
	}':=' expr {
		type = currTable.getTypeOf($id.s);
		if(currTable.returning){
                        currTable.IR.addInstruction(";POP "+currTable.newTemp(false),null);
                        currTable.IR.addStore(currTable.newTemp(true),currTable.getSymbolStackSpace($id.s),type);
                        currTable.returning = false;
                }else {
			currTable.IR.addStore(currTable.getSymbolStackSpace(currTable.IR.pop()),currTable.getSymbolStackSpace($id.s), type);
		}	
	};
read_stmt         : 'READ' '(' id_list["READ"] ')' ';' ;
write_stmt        : 'WRITE' '(' id_list["WRITE"] ')' ';' ;
return_stmt       : 'RETURN' expr ';' {
		if(currTable.symbols.containsKey(currTable.IR.peek())) type = currTable.getTypeOf(currTable.IR.peek());
		currTable.IR.addStore(currTable.getSymbolStackSpace(currTable.IR.pop()),"\$R", type);
		currTable.IR.addInstruction(";RET ",type);
	};

/* Expressions */
expr returns [String s]: 
	factor expr_tail {
debug("EXPR CALL : "+currTable.getSymbolStackSpace(currTable.IR.peek()));
		if(currTable.callParams) 
			currTable.callParamList.add(currTable.getSymbolStackSpace(currTable.IR.pop()));
	}| ;
expr_tail returns [String s]: 
	addop factor { 
		if(currTable.symbols.containsKey(currTable.IR.peek())) type = currTable.getTypeOf(currTable.IR.peek());
		//currTable.IR.addStore(currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false), type);
		//currTable.IR.addOp($addop.s, currTable.newTemp(true), currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false),type);
		currTable.IR.addOp($addop.s, currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false),type);
		currTable.IR.push(currTable.newTemp(true));
	}expr_tail |  ;
factor returns [String s]: 
	postfix_expr factor_tail ;
factor_tail returns [String s]:
	mulop postfix_expr { 
		if(currTable.symbols.containsKey(currTable.IR.peek())) type = currTable.getTypeOf(currTable.IR.peek());
		//currTable.IR.addStore(currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false), type);
		//currTable.IR.addOp($mulop.s, currTable.newTemp(true), currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false),type);
		currTable.IR.addOp($mulop.s, currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false),type);
		currTable.IR.push(currTable.newTemp(true));
	}factor_tail | ;
postfix_expr returns [String s]: 
	primary | call_expr ;
call_expr returns [String s]: 
	id '(' {currTable.callParams = true; } expr_list ')' {
		currTable.IR.addInstruction(";PUSH", null);//space for return value on stack
                //push call parameters on stack
                for(int i =0;i<currTable.callParamList.size();i++){
                        currTable.IR.addInstruction(";PUSH "+currTable.getSymbolStackSpace(currTable.callParamList.get(i)), null);
                }
		currTable.IR.addInstruction(";JSR "+$id.s,null);                
		for(int i =0;i<currTable.callParamList.size();i++){
                        currTable.IR.addInstruction(";POP", null);
                }
                currTable.callParamList.clear();
		currTable.returning = true;
		currTable.callParams = false;
	}; 
expr_list returns [String s]: 
	expr expr_list_tail ;
expr_list_tail returns [String s]: 
	',' expr expr_list_tail | ;
primary returns [String s]: 
	'(' expr ')' { 
	}
	| id {	currTable.IR.push($id.s);
	} 
	| INTLITERAL{ currTable.IR.push($INTLITERAL.text);
	} 
	| FLOATLITERAL{ currTable.IR.push($FLOATLITERAL.text);
	} ;
addop returns [String s] : 
	'+' {$s="ADD";}
	| '-' {$s="SUB";};
mulop returns [String s] : 
	'*' {$s="MUL";}
	| '/' {$s="DIV";};

/* Complex Statements and Condition */ 

if_stmt           : 'IF' {//push 
		if(blockScopes) currTable = currTable.pushScope("BLOCK " + i++); 
		currTable.IR.branchStack.push("label"+(1+lbl));//end of if
		currTable.IR.addLabel("label"+lbl);
		lbl++;
		currTable.IR.branchStack.push("label"+(lbl-1));//if
		lbl++;
	} 
		'(' cond ')' decl stmt_list else_part 'ENDIF' 
	{ //pop
		if(blockScopes) currTable = currTable.popScope();
		Object o = currTable.IR.branchStack.pop();
		currTable.IR.addLabel(currTable.IR.branchStack.peek());//end if
		currTable.IR.jumpFromTo.put(o,currTable.IR.branchStack.pop());//if, end
	};
else_part         : 'ELSIF' {//pop, push 
		if(blockScopes) currTable = currTable.pushScope("BLOCK " + i++); 
		currTable.IR.jumpFromTo.put(currTable.IR.branchStack.pop(),"label"+lbl);
		currTable.IR.addJump(currTable.IR.branchStack.peek());//should be to end of if-elseif block
		currTable.IR.branchStack.push("label"+lbl);
		currTable.IR.addLabel("label"+lbl);
		lbl++;
	}
	'(' cond ')' decl stmt_list else_part {//pop 
		if(blockScopes) currTable = currTable.popScope(); 
	}
	| ;
cond returns [Object s]     : expr 
		{
			$s=currTable.IR.peek();
		} compop expr {
		char type = 'r';
		if(currTable.symbols.get($s) != null) type = currTable.symbols.get($s).type.charAt(0);
		else if(symbolTable.symbols.get($s) != null) type = symbolTable.symbols.get($s).type.charAt(0);
		currTable.IR.addComp($compop.text, currTable.getSymbolStackSpace($s), 
			currTable.getSymbolStackSpace(currTable.IR.peek()), type);
	}| 'TRUE' | 'FALSE' ;
compop            : '<' | '>' | '=' | '!=' | '<=' | '>=' ;


do_while_stmt       : 'DO' 
	{ 
		if(blockScopes) currTable = currTable.pushScope("BLOCK " + i++);  
		currTable.IR.branchStack.push("while"+lbl);
		currTable.IR.addLabel("while"+(lbl++));
	}
	decl stmt_list 'WHILE' '(' 
	{
		currTable.IR.addLabel("while"+lbl);
		currTable.IR.jumpFromTo.put("while"+lbl, currTable.IR.branchStack.pop());
		lbl++;
	}cond ')' { 
		if(blockScopes) currTable = currTable.popScope(); 
	}
	';' ;

COMMENT : '--' (.)*? '\n' ->skip; //has to be before OPERATOR
OPERATOR : ( ASSIGN | ADD | SUB | MULT | DIV | EQ | NOTEQ | LT | GT | LP | RP | SC | COMMA | LTE | GTE ) ;
KEYWORD : PROGRAM  ;//KEYWORD must be before IDENTIFIER
fragment PROGRAM : 'PROGRAM' ->type(KEYWORD);
fragment BEGIN : 'BEGIN'   ->type(KEYWORD);
fragment END : 'END' ->type(KEYWORD);
fragment FUNCTION : 'FUNCTION'  ->type(KEYWORD);
fragment READ : 'READ'  ->type(KEYWORD);
fragment WRITE : 'WRITE'  ->type(KEYWORD);
fragment IF : 'IF'  ->type(KEYWORD);
fragment ELSIF : 'ELSIF'  ->type(KEYWORD);
fragment ENDIF : 'ENDIF'  ->type(KEYWORD);
fragment DO : 'DO'  ->type(KEYWORD);
fragment WHILE : 'WHILE' ->type(KEYWORD) ;
fragment CONTINUE : 'CONTINUE'  ->type(KEYWORD);
fragment BREAK : 'BREAK' ->type(KEYWORD);
fragment RETURN : 'RETURN'  ->type(KEYWORD);
fragment INT : 'INT'  ->type(KEYWORD);
fragment VOID : 'VOID' ->type(KEYWORD) ;
fragment STRING : 'STRING' ->type(KEYWORD) ;
fragment FLOAT : 'FLOAT' ->type(KEYWORD) ;
fragment TRUE : 'TRUE'  ->type(KEYWORD);
fragment FALSE : 'FALSE'  ->type(KEYWORD);

fragment ASSIGN : ':=' -> type(OPERATOR);
fragment ADD : '+' -> type(OPERATOR);
fragment SUB : '-' -> type(OPERATOR);
fragment MULT : '*' -> type(OPERATOR);
fragment DIV : '/'  -> type(OPERATOR);
fragment EQ : '='  -> type(OPERATOR);
fragment NOTEQ : '!='  -> type(OPERATOR);
fragment LT : '<'  -> type(OPERATOR);
fragment GT : '>'  -> type(OPERATOR);
fragment LP : '('  -> type(OPERATOR);
fragment RP : ')'  -> type(OPERATOR);
fragment SC : ';'  -> type(OPERATOR);
fragment COMMA : ','  -> type(OPERATOR);
fragment LTE : '<='  -> type(OPERATOR);
fragment GTE : '>='  -> type(OPERATOR);

IDENTIFIER : LETTER ANUM* ;
INTLITERAL : DIGIT+ ;
FLOATLITERAL : INTLITERAL+ '.' INTLITERAL+ ;
STRINGLITERAL : '"' ( '\\"' | . )*? '"' ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment ANUM : LETTER | DIGIT ;

WHITESPACE : [ \t\r\n] -> skip ;
EXTRA : ( '\"' | '\:' | '\\' | ':' ) ->skip ;

