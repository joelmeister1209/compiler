// Generated from Micro.g4 by ANTLR 4.1

	import java.io.*;
	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, COMMENT=34, OPERATOR=35, KEYWORD=36, IDENTIFIER=37, 
		INTLITERAL=38, FLOATLITERAL=39, STRINGLITERAL=40, WHITESPACE=41, EXTRA=42;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'DO'", "'*'", "'-'", "'PROGRAM'", "'('", "'READ'", 
		"'<'", "'END'", "'!='", "'<='", "'ENDIF'", "'VOID'", "'STRING'", "'IF'", 
		"'TRUE'", "'FALSE'", "'WRITE'", "')'", "'+'", "'WHILE'", "'ELSIF'", "'='", 
		"';'", "'FUNCTION'", "'>'", "'FLOAT'", "':='", "'RETURN'", "'/'", "'BEGIN'", 
		"'>='", "'INT'", "COMMENT", "OPERATOR", "KEYWORD", "IDENTIFIER", "INTLITERAL", 
		"FLOATLITERAL", "STRINGLITERAL", "WHITESPACE", "EXTRA"
	};
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_pgm_body = 2, RULE_decl = 3, RULE_string_decl_list = 4, 
		RULE_string_decl = 5, RULE_str = 6, RULE_var_decl_list = 7, RULE_var_decl = 8, 
		RULE_var_type = 9, RULE_any_type = 10, RULE_id_list = 11, RULE_id_tail = 12, 
		RULE_param_decl_list = 13, RULE_param_decl_tail = 14, RULE_param_decl = 15, 
		RULE_func_declarations = 16, RULE_func_decl = 17, RULE_func_body = 18, 
		RULE_stmt_list = 19, RULE_stmt = 20, RULE_base_stmt = 21, RULE_assign_stmt = 22, 
		RULE_assign_expr = 23, RULE_read_stmt = 24, RULE_write_stmt = 25, RULE_return_stmt = 26, 
		RULE_expr = 27, RULE_expr_tail = 28, RULE_factor = 29, RULE_factor_tail = 30, 
		RULE_postfix_expr = 31, RULE_call_expr = 32, RULE_expr_list = 33, RULE_expr_list_tail = 34, 
		RULE_primary = 35, RULE_addop = 36, RULE_mulop = 37, RULE_if_stmt = 38, 
		RULE_else_part = 39, RULE_cond = 40, RULE_compop = 41, RULE_do_while_stmt = 42;
	public static final String[] ruleNames = {
		"program", "id", "pgm_body", "decl", "string_decl_list", "string_decl", 
		"str", "var_decl_list", "var_decl", "var_type", "any_type", "id_list", 
		"id_tail", "param_decl_list", "param_decl_tail", "param_decl", "func_declarations", 
		"func_decl", "func_body", "stmt_list", "stmt", "base_stmt", "assign_stmt", 
		"assign_expr", "read_stmt", "write_stmt", "return_stmt", "expr", "expr_tail", 
		"factor", "factor_tail", "postfix_expr", "call_expr", "expr_list", "expr_list_tail", 
		"primary", "addop", "mulop", "if_stmt", "else_part", "cond", "compop", 
		"do_while_stmt"
	};

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	;
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

	public MicroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(5);
			setState(87); id();
			setState(88); match(31);
			setState(89); pgm_body();
			setState(90); match(9);
			 
				symbolTable.buildIR();
				symbolTable.buildExecCode();
				System.out.println("end");//end of code
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public String s;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(MicroParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); ((IdContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((IdContext)_localctx).s = (((IdContext)_localctx).IDENTIFIER!=null?((IdContext)_localctx).IDENTIFIER.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pgm_bodyContext extends ParserRuleContext {
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPgm_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPgm_body(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgm_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); decl();
			setState(97); func_declarations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Var_decl_listContext var_decl_list() {
			return getRuleContext(Var_decl_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public String_decl_listContext string_decl_list() {
			return getRuleContext(String_decl_listContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(106);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); string_decl_list();
				setState(100); decl();
				}
				break;
			case 27:
			case 33:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); var_decl_list();
				setState(103); decl();
				}
				break;
			case 2:
			case 7:
			case 9:
			case 12:
			case 15:
			case 18:
			case 21:
			case 22:
			case 25:
			case 29:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_decl_listContext extends ParserRuleContext {
		public List<String_declContext> string_decl() {
			return getRuleContexts(String_declContext.class);
		}
		public String_declContext string_decl(int i) {
			return getRuleContext(String_declContext.class,i);
		}
		public String_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterString_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitString_decl_list(this);
		}
	}

	public final String_decl_listContext string_decl_list() throws RecognitionException {
		String_decl_listContext _localctx = new String_decl_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_decl_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(108); string_decl();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(111); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_declContext extends ParserRuleContext {
		public IdContext id;
		public StrContext str;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterString_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitString_decl(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(14);
			setState(114); ((String_declContext)_localctx).id = id();
			setState(115); match(28);
			setState(116); ((String_declContext)_localctx).str = str();
			setState(117); match(24);

					currTable.addSymbol(((String_declContext)_localctx).id.s, "STRING", ((String_declContext)_localctx).str.s, currTable.scope);
					currTable.IR.addString(((String_declContext)_localctx).id.s,((String_declContext)_localctx).str.s);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrContext extends ParserRuleContext {
		public String s;
		public Token STRINGLITERAL;
		public TerminalNode STRINGLITERAL() { return getToken(MicroParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); ((StrContext)_localctx).STRINGLITERAL = match(STRINGLITERAL);
			((StrContext)_localctx).s = (((StrContext)_localctx).STRINGLITERAL!=null?((StrContext)_localctx).STRINGLITERAL.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decl_listContext extends ParserRuleContext {
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVar_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVar_decl_list(this);
		}
	}

	public final Var_decl_listContext var_decl_list() throws RecognitionException {
		Var_decl_listContext _localctx = new Var_decl_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(123); var_decl();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_typeContext var_type;
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); ((Var_declContext)_localctx).var_type = var_type();
			type=Character.toLowerCase(((String)((Var_declContext)_localctx).var_type.s).charAt(0));
			setState(130); id_list("DECL");
			setState(131); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public String s;
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_type);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case 27:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(27);
				 ((Var_typeContext)_localctx).s = "FLOAT"; 
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); match(33);
				 ((Var_typeContext)_localctx).s = "INT"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_typeContext extends ParserRuleContext {
		public String s;
		public Var_typeContext var_type;
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAny_type(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_any_type);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case 27:
			case 33:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); ((Any_typeContext)_localctx).var_type = var_type();
				((Any_typeContext)_localctx).s = ((Any_typeContext)_localctx).var_type.s;
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); match(13);
				 ((Any_typeContext)_localctx).s = "VOID"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_listContext extends ParserRuleContext {
		public String instruction;
		public String s;
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Id_listContext(ParserRuleContext parent, int invokingState, String instruction) {
			super(parent, invokingState);
			this.instruction = instruction;
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list(String instruction) throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState(), instruction);
		enterRule(_localctx, 22, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); ((Id_listContext)_localctx).id = id();
			/*name, type, value, scope*/
					if(((Id_listContext)_localctx).id.s!=null) ((Id_listContext)_localctx).s = ((Id_listContext)_localctx).id.s;
					String t = (type=='f') ? "FLOAT": "INT";
					if(_localctx.instruction.equals("DECL")){			
						currTable.addSymbol(((Id_listContext)_localctx).id.s, t, null, currTable.scope);
						currTable.setSymbolStackSpace(((Id_listContext)_localctx).id.s, currTable.newLoc(true));
						currTable.incLinkCount();
					} else if (_localctx.instruction.equals("READ")){
						if(currTable.symbols.get(_localctx.s) != null) {
							type = currTable.symbols.get(_localctx.s).type.charAt(0);
							type = Character.toUpperCase(type);
							currTable.IR.addRead(currTable.getSymbolStackSpace(_localctx.s), type);
						}else if(symbolTable.symbols.get(_localctx.s) != null
							&& symbolTable.symbols.get(_localctx.s).type.equals("STRING")) {
							currTable.IR.addRead(currTable.getSymbolStackSpace(_localctx.s), 'S');
						}
					}else if (_localctx.instruction.equals("WRITE")){
						if(currTable.symbols.get(_localctx.s) != null) {
							type = currTable.symbols.get(_localctx.s).type.charAt(0);
							type = Character.toUpperCase(type);
							currTable.IR.addWrite(currTable.getSymbolStackSpace(_localctx.s), type);
						}else if(symbolTable.symbols.get(_localctx.s) != null
							&& symbolTable.symbols.get(_localctx.s).type.equals("STRING")) {
							currTable.IR.addWrite(currTable.getSymbolStackSpace(_localctx.s), 'S');
						}
					} else{	System.out.println(";I hope this doesn't get called =/");}
					
				
			setState(148); id_tail(_localctx.instruction);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_tailContext extends ParserRuleContext {
		public String i;
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_tailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Id_tailContext(ParserRuleContext parent, int invokingState, String i) {
			super(parent, invokingState);
			this.i = i;
		}
		@Override public int getRuleIndex() { return RULE_id_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId_tail(this);
		}
	}

	public final Id_tailContext id_tail(String i) throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState(), i);
		enterRule(_localctx, 24, RULE_id_tail);
		try {
			setState(153);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); match(1);
				setState(151); id_list(_localctx.i);
				}
				break;
			case 19:
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl_list(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl_list);
		try {
			setState(159);
			switch (_input.LA(1)) {
			case 27:
			case 33:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); param_decl();
				setState(156); param_decl_tail();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl_tail(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param_decl_tail);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); match(1);
				setState(162); param_decl();
				setState(163); param_decl_tail();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type;
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); ((Param_declContext)_localctx).var_type = var_type();
			setState(169); ((Param_declContext)_localctx).id = id();

					currTable.addSymbol(((Param_declContext)_localctx).id.s, ((Param_declContext)_localctx).var_type.s, null, currTable.scope);
					currTable.setSymbolStackSpace(((Param_declContext)_localctx).id.s, "$P"+currTable.numParams);
					currTable.incNumParams();
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declarationsContext extends ParserRuleContext {
		public List<Func_declContext> func_decl() {
			return getRuleContexts(Func_declContext.class);
		}
		public Func_declContext func_decl(int i) {
			return getRuleContext(Func_declContext.class,i);
		}
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_declarations(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==25) {
				{
				{
				setState(172); func_decl();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declContext extends ParserRuleContext {
		public IdContext id;
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(25);
			setState(179); any_type();
			setState(180); ((Func_declContext)_localctx).id = id();
			 
					currTable = currTable.pushScope(((Func_declContext)_localctx).id.s); 
					currTable.IR.addLabel(((Func_declContext)_localctx).id.s); 
					currTable.IR.addInstruction(";LINK ",null);
				
			setState(182); match(6);
			setState(183); param_decl_list();
			setState(184); match(19);
			setState(185); match(31);
			setState(186); func_body();
			setState(187); match(9);
			 
					currTable = currTable.popScope(); 
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_bodyContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); decl();
			setState(191); stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 15) | (1L << 18) | (1L << 29) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(193); stmt();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stmt);
		try {
			setState(202);
			switch (_input.LA(1)) {
			case 7:
			case 18:
			case 29:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); base_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 3);
				{
				setState(201); do_while_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_stmtContext extends ParserRuleContext {
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Base_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterBase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitBase_stmt(this);
		}
	}

	public final Base_stmtContext base_stmt() throws RecognitionException {
		Base_stmtContext _localctx = new Base_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_base_stmt);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); assign_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); read_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 3);
				{
				setState(206); write_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 4);
				{
				setState(207); return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); assign_expr();
			setState(211); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_exprContext extends ParserRuleContext {
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); ((Assign_exprContext)_localctx).id = id();

				
			setState(215); match(28);
			setState(216); expr();

					type = currTable.getTypeOf(((Assign_exprContext)_localctx).id.s);
					if(currTable.returning){
			                        currTable.IR.addInstruction(";POP "+currTable.newTemp(false),null);
			                        currTable.IR.addStore(currTable.newTemp(true),currTable.getSymbolStackSpace(((Assign_exprContext)_localctx).id.s),type);
			                        currTable.returning = false;
			                }else {
						currTable.IR.addStore(currTable.getSymbolStackSpace(currTable.IR.pop()),currTable.getSymbolStackSpace(((Assign_exprContext)_localctx).id.s), type);
					}	
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitRead_stmt(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(7);
			setState(220); match(6);
			setState(221); id_list("READ");
			setState(222); match(19);
			setState(223); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitWrite_stmt(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(18);
			setState(226); match(6);
			setState(227); id_list("WRITE");
			setState(228); match(19);
			setState(229); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(29);
			setState(232); expr();
			setState(233); match(24);

					if(currTable.symbols.containsKey(currTable.IR.peek())) type = currTable.getTypeOf(currTable.IR.peek());
					currTable.IR.addStore(currTable.getSymbolStackSpace(currTable.IR.pop()),"$R", type);
					currTable.IR.addInstruction(";RET ",type);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public String s;
		public Expr_tailContext expr_tail() {
			return getRuleContext(Expr_tailContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case 6:
			case IDENTIFIER:
			case INTLITERAL:
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); factor();
				setState(237); expr_tail();

				debug("EXPR CALL : "+currTable.getSymbolStackSpace(currTable.IR.peek()));
						if(currTable.callParams) 
							currTable.callParamList.add(currTable.getSymbolStackSpace(currTable.IR.pop()));
					
				}
				break;
			case 1:
			case 8:
			case 10:
			case 11:
			case 19:
			case 23:
			case 24:
			case 26:
			case 32:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_tailContext extends ParserRuleContext {
		public String s;
		public AddopContext addop;
		public Expr_tailContext expr_tail() {
			return getRuleContext(Expr_tailContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public Expr_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_tail(this);
		}
	}

	public final Expr_tailContext expr_tail() throws RecognitionException {
		Expr_tailContext _localctx = new Expr_tailContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_tail);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case 4:
			case 20:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); ((Expr_tailContext)_localctx).addop = addop();
				setState(244); factor();
				 
						if(currTable.symbols.containsKey(currTable.IR.peek())) type = currTable.getTypeOf(currTable.IR.peek());
						currTable.IR.addStore(currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false), type);
						currTable.IR.addOp(((Expr_tailContext)_localctx).addop.s, currTable.newTemp(true), currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false),type);
						currTable.IR.push(currTable.newTemp(true));
					
				setState(246); expr_tail();
				}
				break;
			case 1:
			case 8:
			case 10:
			case 11:
			case 19:
			case 23:
			case 24:
			case 26:
			case 32:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public String s;
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Factor_tailContext factor_tail() {
			return getRuleContext(Factor_tailContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); postfix_expr();
			setState(252); factor_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor_tailContext extends ParserRuleContext {
		public String s;
		public MulopContext mulop;
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Factor_tailContext factor_tail() {
			return getRuleContext(Factor_tailContext.class,0);
		}
		public Factor_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFactor_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFactor_tail(this);
		}
	}

	public final Factor_tailContext factor_tail() throws RecognitionException {
		Factor_tailContext _localctx = new Factor_tailContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor_tail);
		try {
			setState(260);
			switch (_input.LA(1)) {
			case 3:
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); ((Factor_tailContext)_localctx).mulop = mulop();
				setState(255); postfix_expr();
				 
						if(currTable.symbols.containsKey(currTable.IR.peek())) type = currTable.getTypeOf(currTable.IR.peek());
						currTable.IR.addStore(currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false), type);
						currTable.IR.addOp(((Factor_tailContext)_localctx).mulop.s, currTable.newTemp(true), currTable.getSymbolStackSpace(currTable.IR.pop()), currTable.newTemp(false),type);
						currTable.IR.push(currTable.newTemp(true));
					
				setState(257); factor_tail();
				}
				break;
			case 1:
			case 4:
			case 8:
			case 10:
			case 11:
			case 19:
			case 20:
			case 23:
			case 24:
			case 26:
			case 32:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_exprContext extends ParserRuleContext {
		public String s;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public Postfix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPostfix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPostfix_expr(this);
		}
	}

	public final Postfix_exprContext postfix_expr() throws RecognitionException {
		Postfix_exprContext _localctx = new Postfix_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_postfix_expr);
		try {
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); call_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_exprContext extends ParserRuleContext {
		public String s;
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCall_expr(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_call_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); ((Call_exprContext)_localctx).id = id();
			setState(267); match(6);
			currTable.callParams = true; 
			setState(269); expr_list();
			setState(270); match(19);

					currTable.IR.addInstruction(";PUSH", null);//space for return value on stack
			                //push call parameters on stack
			                for(int i =0;i<currTable.callParamList.size();i++){
			                        currTable.IR.addInstruction(";PUSH "+currTable.getSymbolStackSpace(currTable.callParamList.get(i)), null);
			                }
					currTable.IR.addInstruction(";JSR "+((Call_exprContext)_localctx).id.s,null);                
					for(int i =0;i<currTable.callParamList.size();i++){
			                        currTable.IR.addInstruction(";POP", null);
			                }
			                currTable.callParamList.clear();
					currTable.returning = true;
					currTable.callParams = false;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public String s;
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); expr();
			setState(274); expr_list_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_list_tailContext extends ParserRuleContext {
		public String s;
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr_list_tail);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276); match(1);
				setState(277); expr();
				setState(278); expr_list_tail();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public String s;
		public IdContext id;
		public Token INTLITERAL;
		public Token FLOATLITERAL;
		public TerminalNode FLOATLITERAL() { return getToken(MicroParser.FLOATLITERAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTLITERAL() { return getToken(MicroParser.INTLITERAL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primary);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(283); match(6);
				setState(284); expr();
				setState(285); match(19);
				 
					
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(288); ((PrimaryContext)_localctx).id = id();
					currTable.IR.push(((PrimaryContext)_localctx).id.s);
					
				}
				break;
			case INTLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(291); ((PrimaryContext)_localctx).INTLITERAL = match(INTLITERAL);
				 currTable.IR.push((((PrimaryContext)_localctx).INTLITERAL!=null?((PrimaryContext)_localctx).INTLITERAL.getText():null));
					
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(293); ((PrimaryContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				 currTable.IR.push((((PrimaryContext)_localctx).FLOATLITERAL!=null?((PrimaryContext)_localctx).FLOATLITERAL.getText():null));
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddopContext extends ParserRuleContext {
		public String s;
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_addop);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case 20:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); match(20);
				((AddopContext)_localctx).s = "ADD";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); match(4);
				((AddopContext)_localctx).s = "SUB";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public String s;
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mulop);
		try {
			setState(307);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); match(3);
				((MulopContext)_localctx).s = "MULT";
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(30);
				((MulopContext)_localctx).s = "DIV";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(15);
			//push 
					if(blockScopes) currTable = currTable.pushScope("BLOCK " + i++); 
					currTable.IR.branchStack.push("label"+(1+lbl));//end of if
					currTable.IR.addLabel("label"+lbl);
					lbl++;
					currTable.IR.branchStack.push("label"+(lbl-1));//if
					lbl++;
				
			setState(311); match(6);
			setState(312); cond();
			setState(313); match(19);
			setState(314); decl();
			setState(315); stmt_list();
			setState(316); else_part();
			setState(317); match(12);
			 //pop
					if(blockScopes) currTable = currTable.popScope();
					Object o = currTable.IR.branchStack.pop();
					currTable.IR.addLabel(currTable.IR.branchStack.peek());//end if
					currTable.IR.jumpFromTo.put(o,currTable.IR.branchStack.pop());//if, end
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_partContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_else_part);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); match(22);
				//pop, push 
						if(blockScopes) currTable = currTable.pushScope("BLOCK " + i++); 
						currTable.IR.jumpFromTo.put(currTable.IR.branchStack.pop(),"label"+lbl);
						currTable.IR.addJump(currTable.IR.branchStack.peek());//should be to end of if-elseif block
						currTable.IR.branchStack.push("label"+lbl);
						currTable.IR.addLabel("label"+lbl);
						lbl++;
					
				setState(322); match(6);
				setState(323); cond();
				setState(324); match(19);
				setState(325); decl();
				setState(326); stmt_list();
				setState(327); else_part();
				//pop 
						if(blockScopes) currTable = currTable.popScope(); 
					
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public Object s;
		public CompopContext compop;
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cond);
		try {
			setState(341);
			switch (_input.LA(1)) {
			case 6:
			case 8:
			case 10:
			case 11:
			case 23:
			case 26:
			case 32:
			case IDENTIFIER:
			case INTLITERAL:
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(333); expr();

							((CondContext)_localctx).s = currTable.IR.peek();
						
				setState(335); ((CondContext)_localctx).compop = compop();
				setState(336); expr();

						char type = 'r';
						if(currTable.symbols.get(_localctx.s) != null) type = currTable.symbols.get(_localctx.s).type.charAt(0);
						else if(symbolTable.symbols.get(_localctx.s) != null) type = symbolTable.symbols.get(_localctx.s).type.charAt(0);
						currTable.IR.addComp((((CondContext)_localctx).compop!=null?_input.getText(((CondContext)_localctx).compop.start,((CondContext)_localctx).compop.stop):null), currTable.getSymbolStackSpace(_localctx.s), 
							currTable.getSymbolStackSpace(currTable.IR.peek()), type);
					
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); match(16);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 3);
				{
				setState(340); match(17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompopContext extends ParserRuleContext {
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCompop(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 10) | (1L << 11) | (1L << 23) | (1L << 26) | (1L << 32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_stmtContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterDo_while_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitDo_while_stmt(this);
		}
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(2);
			 
					if(blockScopes) currTable = currTable.pushScope("BLOCK " + i++);  
					currTable.IR.branchStack.push("while"+lbl);
					currTable.IR.addLabel("while"+(lbl++));
				
			setState(347); decl();
			setState(348); stmt_list();
			setState(349); match(21);
			setState(350); match(6);

					currTable.IR.addLabel("while"+lbl);
					currTable.IR.jumpFromTo.put("while"+lbl, currTable.IR.branchStack.pop());
					lbl++;
				
			setState(352); cond();
			setState(353); match(19);
			 
					if(blockScopes) currTable = currTable.popScope(); 
				
			setState(355); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3,\u0168\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5m\n\5\3\6\6\6p\n\6\r\6\16\6q\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\6\t\177\n\t\r\t\16\t\u0080\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u009c\n\16\3\17\3\17\3\17\3\17\5\17"+
		"\u00a2\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3"+
		"\21\3\22\7\22\u00b0\n\22\f\22\16\22\u00b3\13\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\7\25\u00c5"+
		"\n\25\f\25\16\25\u00c8\13\25\3\26\3\26\3\26\5\26\u00cd\n\26\3\27\3\27"+
		"\3\27\3\27\5\27\u00d3\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u00f4\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u00fc\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u0107"+
		"\n \3!\3!\5!\u010b\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\5$\u011c\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u012a\n%\3&\3"+
		"&\3&\3&\5&\u0130\n&\3\'\3\'\3\'\3\'\5\'\u0136\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u014e\n)\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u0158\n*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPRTV\2\3\7\2\n\n\f\r\31\31\34\34\"\"\u0159\2X\3\2\2\2\4_\3\2\2"+
		"\2\6b\3\2\2\2\bl\3\2\2\2\no\3\2\2\2\fs\3\2\2\2\16z\3\2\2\2\20~\3\2\2\2"+
		"\22\u0082\3\2\2\2\24\u008b\3\2\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32"+
		"\u009b\3\2\2\2\34\u00a1\3\2\2\2\36\u00a8\3\2\2\2 \u00aa\3\2\2\2\"\u00b1"+
		"\3\2\2\2$\u00b4\3\2\2\2&\u00c0\3\2\2\2(\u00c6\3\2\2\2*\u00cc\3\2\2\2,"+
		"\u00d2\3\2\2\2.\u00d4\3\2\2\2\60\u00d7\3\2\2\2\62\u00dd\3\2\2\2\64\u00e3"+
		"\3\2\2\2\66\u00e9\3\2\2\28\u00f3\3\2\2\2:\u00fb\3\2\2\2<\u00fd\3\2\2\2"+
		">\u0106\3\2\2\2@\u010a\3\2\2\2B\u010c\3\2\2\2D\u0113\3\2\2\2F\u011b\3"+
		"\2\2\2H\u0129\3\2\2\2J\u012f\3\2\2\2L\u0135\3\2\2\2N\u0137\3\2\2\2P\u014d"+
		"\3\2\2\2R\u0157\3\2\2\2T\u0159\3\2\2\2V\u015b\3\2\2\2XY\7\7\2\2YZ\5\4"+
		"\3\2Z[\7!\2\2[\\\5\6\4\2\\]\7\13\2\2]^\b\2\1\2^\3\3\2\2\2_`\7\'\2\2`a"+
		"\b\3\1\2a\5\3\2\2\2bc\5\b\5\2cd\5\"\22\2d\7\3\2\2\2ef\5\n\6\2fg\5\b\5"+
		"\2gm\3\2\2\2hi\5\20\t\2ij\5\b\5\2jm\3\2\2\2km\3\2\2\2le\3\2\2\2lh\3\2"+
		"\2\2lk\3\2\2\2m\t\3\2\2\2np\5\f\7\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3"+
		"\2\2\2r\13\3\2\2\2st\7\20\2\2tu\5\4\3\2uv\7\36\2\2vw\5\16\b\2wx\7\32\2"+
		"\2xy\b\7\1\2y\r\3\2\2\2z{\7*\2\2{|\b\b\1\2|\17\3\2\2\2}\177\5\22\n\2~"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\21"+
		"\3\2\2\2\u0082\u0083\5\24\13\2\u0083\u0084\b\n\1\2\u0084\u0085\5\30\r"+
		"\2\u0085\u0086\7\32\2\2\u0086\23\3\2\2\2\u0087\u0088\7\35\2\2\u0088\u008c"+
		"\b\13\1\2\u0089\u008a\7#\2\2\u008a\u008c\b\13\1\2\u008b\u0087\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\25\3\2\2\2\u008d\u008e\5\24\13\2\u008e\u008f"+
		"\b\f\1\2\u008f\u0093\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u0093\b\f\1\2"+
		"\u0092\u008d\3\2\2\2\u0092\u0090\3\2\2\2\u0093\27\3\2\2\2\u0094\u0095"+
		"\5\4\3\2\u0095\u0096\b\r\1\2\u0096\u0097\5\32\16\2\u0097\31\3\2\2\2\u0098"+
		"\u0099\7\3\2\2\u0099\u009c\5\30\r\2\u009a\u009c\3\2\2\2\u009b\u0098\3"+
		"\2\2\2\u009b\u009a\3\2\2\2\u009c\33\3\2\2\2\u009d\u009e\5 \21\2\u009e"+
		"\u009f\5\36\20\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3"+
		"\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7\3\2\2\u00a4"+
		"\u00a5\5 \21\2\u00a5\u00a6\5\36\20\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\3"+
		"\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\37\3\2\2\2\u00aa"+
		"\u00ab\5\24\13\2\u00ab\u00ac\5\4\3\2\u00ac\u00ad\b\21\1\2\u00ad!\3\2\2"+
		"\2\u00ae\u00b0\5$\23\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2#\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7\33\2\2\u00b5\u00b6\5\26\f\2\u00b6\u00b7\5\4\3\2\u00b7\u00b8\b"+
		"\23\1\2\u00b8\u00b9\7\b\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\7\25\2\2"+
		"\u00bb\u00bc\7!\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\7\13\2\2\u00be\u00bf"+
		"\b\23\1\2\u00bf%\3\2\2\2\u00c0\u00c1\5\b\5\2\u00c1\u00c2\5(\25\2\u00c2"+
		"\'\3\2\2\2\u00c3\u00c5\5*\26\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7)\3\2\2\2\u00c8\u00c6\3"+
		"\2\2\2\u00c9\u00cd\5,\27\2\u00ca\u00cd\5N(\2\u00cb\u00cd\5V,\2\u00cc\u00c9"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd+\3\2\2\2\u00ce"+
		"\u00d3\5.\30\2\u00cf\u00d3\5\62\32\2\u00d0\u00d3\5\64\33\2\u00d1\u00d3"+
		"\5\66\34\2\u00d2\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3-\3\2\2\2\u00d4\u00d5\5\60\31\2\u00d5\u00d6"+
		"\7\32\2\2\u00d6/\3\2\2\2\u00d7\u00d8\5\4\3\2\u00d8\u00d9\b\31\1\2\u00d9"+
		"\u00da\7\36\2\2\u00da\u00db\58\35\2\u00db\u00dc\b\31\1\2\u00dc\61\3\2"+
		"\2\2\u00dd\u00de\7\t\2\2\u00de\u00df\7\b\2\2\u00df\u00e0\5\30\r\2\u00e0"+
		"\u00e1\7\25\2\2\u00e1\u00e2\7\32\2\2\u00e2\63\3\2\2\2\u00e3\u00e4\7\24"+
		"\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\7\25\2\2\u00e7"+
		"\u00e8\7\32\2\2\u00e8\65\3\2\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00eb\58\35"+
		"\2\u00eb\u00ec\7\32\2\2\u00ec\u00ed\b\34\1\2\u00ed\67\3\2\2\2\u00ee\u00ef"+
		"\5<\37\2\u00ef\u00f0\5:\36\2\u00f0\u00f1\b\35\1\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f4\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f49\3"+
		"\2\2\2\u00f5\u00f6\5J&\2\u00f6\u00f7\5<\37\2\u00f7\u00f8\b\36\1\2\u00f8"+
		"\u00f9\5:\36\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f5\3\2"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc;\3\2\2\2\u00fd\u00fe\5@!\2\u00fe\u00ff"+
		"\5> \2\u00ff=\3\2\2\2\u0100\u0101\5L\'\2\u0101\u0102\5@!\2\u0102\u0103"+
		"\b \1\2\u0103\u0104\5> \2\u0104\u0107\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0100\3\2\2\2\u0106\u0105\3\2\2\2\u0107?\3\2\2\2\u0108\u010b\5H%\2\u0109"+
		"\u010b\5B\"\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010bA\3\2\2\2\u010c"+
		"\u010d\5\4\3\2\u010d\u010e\7\b\2\2\u010e\u010f\b\"\1\2\u010f\u0110\5D"+
		"#\2\u0110\u0111\7\25\2\2\u0111\u0112\b\"\1\2\u0112C\3\2\2\2\u0113\u0114"+
		"\58\35\2\u0114\u0115\5F$\2\u0115E\3\2\2\2\u0116\u0117\7\3\2\2\u0117\u0118"+
		"\58\35\2\u0118\u0119\5F$\2\u0119\u011c\3\2\2\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0116\3\2\2\2\u011b\u011a\3\2\2\2\u011cG\3\2\2\2\u011d\u011e\7\b\2\2"+
		"\u011e\u011f\58\35\2\u011f\u0120\7\25\2\2\u0120\u0121\b%\1\2\u0121\u012a"+
		"\3\2\2\2\u0122\u0123\5\4\3\2\u0123\u0124\b%\1\2\u0124\u012a\3\2\2\2\u0125"+
		"\u0126\7(\2\2\u0126\u012a\b%\1\2\u0127\u0128\7)\2\2\u0128\u012a\b%\1\2"+
		"\u0129\u011d\3\2\2\2\u0129\u0122\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012aI\3\2\2\2\u012b\u012c\7\26\2\2\u012c\u0130\b&\1\2\u012d"+
		"\u012e\7\6\2\2\u012e\u0130\b&\1\2\u012f\u012b\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130K\3\2\2\2\u0131\u0132\7\5\2\2\u0132\u0136\b\'\1\2\u0133\u0134"+
		"\7 \2\2\u0134\u0136\b\'\1\2\u0135\u0131\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"M\3\2\2\2\u0137\u0138\7\21\2\2\u0138\u0139\b(\1\2\u0139\u013a\7\b\2\2"+
		"\u013a\u013b\5R*\2\u013b\u013c\7\25\2\2\u013c\u013d\5\b\5\2\u013d\u013e"+
		"\5(\25\2\u013e\u013f\5P)\2\u013f\u0140\7\16\2\2\u0140\u0141\b(\1\2\u0141"+
		"O\3\2\2\2\u0142\u0143\7\30\2\2\u0143\u0144\b)\1\2\u0144\u0145\7\b\2\2"+
		"\u0145\u0146\5R*\2\u0146\u0147\7\25\2\2\u0147\u0148\5\b\5\2\u0148\u0149"+
		"\5(\25\2\u0149\u014a\5P)\2\u014a\u014b\b)\1\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u0142\3\2\2\2\u014d\u014c\3\2\2\2\u014eQ\3\2\2\2"+
		"\u014f\u0150\58\35\2\u0150\u0151\b*\1\2\u0151\u0152\5T+\2\u0152\u0153"+
		"\58\35\2\u0153\u0154\b*\1\2\u0154\u0158\3\2\2\2\u0155\u0158\7\22\2\2\u0156"+
		"\u0158\7\23\2\2\u0157\u014f\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3"+
		"\2\2\2\u0158S\3\2\2\2\u0159\u015a\t\2\2\2\u015aU\3\2\2\2\u015b\u015c\7"+
		"\4\2\2\u015c\u015d\b,\1\2\u015d\u015e\5\b\5\2\u015e\u015f\5(\25\2\u015f"+
		"\u0160\7\27\2\2\u0160\u0161\7\b\2\2\u0161\u0162\b,\1\2\u0162\u0163\5R"+
		"*\2\u0163\u0164\7\25\2\2\u0164\u0165\b,\1\2\u0165\u0166\7\32\2\2\u0166"+
		"W\3\2\2\2\30lq\u0080\u008b\u0092\u009b\u00a1\u00a8\u00b1\u00c6\u00cc\u00d2"+
		"\u00f3\u00fb\u0106\u010a\u011b\u0129\u012f\u0135\u014d\u0157";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}