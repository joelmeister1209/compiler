// Generated from Micro.g4 by ANTLR 4.1

	import java.io.*;
	import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "'DO'", "'*'", "'-'", "'PROGRAM'", "'('", "'READ'", "'<'", "'END'", 
		"'!='", "'<='", "'ENDIF'", "'VOID'", "'STRING'", "'IF'", "'TRUE'", "'FALSE'", 
		"'WRITE'", "')'", "'+'", "'WHILE'", "'ELSIF'", "'='", "';'", "'FUNCTION'", 
		"'>'", "'FLOAT'", "':='", "'RETURN'", "'/'", "'BEGIN'", "'>='", "'INT'", 
		"COMMENT", "OPERATOR", "KEYWORD", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "WHITESPACE", "EXTRA"
	};
	public static final String[] ruleNames = {
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"COMMENT", "OPERATOR", "KEYWORD", "PROGRAM", "BEGIN", "END", "FUNCTION", 
		"READ", "WRITE", "IF", "ELSIF", "ENDIF", "DO", "WHILE", "CONTINUE", "BREAK", 
		"RETURN", "INT", "VOID", "STRING", "FLOAT", "TRUE", "FALSE", "ASSIGN", 
		"ADD", "SUB", "MULT", "DIV", "EQ", "NOTEQ", "LT", "GT", "LP", "RP", "SC", 
		"COMMA", "LTE", "GTE", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
		"LETTER", "DIGIT", "ANUM", "WHITESPACE", "EXTRA"
	};

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


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 33: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 36: PROGRAM_action((RuleContext)_localctx, actionIndex); break;

		case 37: BEGIN_action((RuleContext)_localctx, actionIndex); break;

		case 38: END_action((RuleContext)_localctx, actionIndex); break;

		case 39: FUNCTION_action((RuleContext)_localctx, actionIndex); break;

		case 40: READ_action((RuleContext)_localctx, actionIndex); break;

		case 41: WRITE_action((RuleContext)_localctx, actionIndex); break;

		case 42: IF_action((RuleContext)_localctx, actionIndex); break;

		case 43: ELSIF_action((RuleContext)_localctx, actionIndex); break;

		case 44: ENDIF_action((RuleContext)_localctx, actionIndex); break;

		case 45: DO_action((RuleContext)_localctx, actionIndex); break;

		case 46: WHILE_action((RuleContext)_localctx, actionIndex); break;

		case 47: CONTINUE_action((RuleContext)_localctx, actionIndex); break;

		case 48: BREAK_action((RuleContext)_localctx, actionIndex); break;

		case 49: RETURN_action((RuleContext)_localctx, actionIndex); break;

		case 50: INT_action((RuleContext)_localctx, actionIndex); break;

		case 51: VOID_action((RuleContext)_localctx, actionIndex); break;

		case 52: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 53: FLOAT_action((RuleContext)_localctx, actionIndex); break;

		case 54: TRUE_action((RuleContext)_localctx, actionIndex); break;

		case 55: FALSE_action((RuleContext)_localctx, actionIndex); break;

		case 56: ASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 57: ADD_action((RuleContext)_localctx, actionIndex); break;

		case 58: SUB_action((RuleContext)_localctx, actionIndex); break;

		case 59: MULT_action((RuleContext)_localctx, actionIndex); break;

		case 60: DIV_action((RuleContext)_localctx, actionIndex); break;

		case 61: EQ_action((RuleContext)_localctx, actionIndex); break;

		case 62: NOTEQ_action((RuleContext)_localctx, actionIndex); break;

		case 63: LT_action((RuleContext)_localctx, actionIndex); break;

		case 64: GT_action((RuleContext)_localctx, actionIndex); break;

		case 65: LP_action((RuleContext)_localctx, actionIndex); break;

		case 66: RP_action((RuleContext)_localctx, actionIndex); break;

		case 67: SC_action((RuleContext)_localctx, actionIndex); break;

		case 68: COMMA_action((RuleContext)_localctx, actionIndex); break;

		case 69: LTE_action((RuleContext)_localctx, actionIndex); break;

		case 70: GTE_action((RuleContext)_localctx, actionIndex); break;

		case 78: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 79: EXTRA_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void FUNCTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: _type = KEYWORD;  break;
		}
	}
	private void LT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28: _type = OPERATOR;  break;
		}
	}
	private void WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: _type = KEYWORD;  break;
		}
	}
	private void RP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: _type = OPERATOR;  break;
		}
	}
	private void GTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35: _type = OPERATOR;  break;
		}
	}
	private void LP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30: _type = OPERATOR;  break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36: skip();  break;
		}
	}
	private void DO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: _type = KEYWORD;  break;
		}
	}
	private void SUB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: _type = OPERATOR;  break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: _type = KEYWORD;  break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: _type = KEYWORD;  break;
		}
	}
	private void EXTRA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37: skip();  break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: _type = OPERATOR;  break;
		}
	}
	private void LTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34: _type = OPERATOR;  break;
		}
	}
	private void TRUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: _type = KEYWORD;  break;
		}
	}
	private void WRITE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: _type = KEYWORD;  break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: _type = KEYWORD;  break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: _type = KEYWORD;  break;
		}
	}
	private void SC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32: _type = OPERATOR;  break;
		}
	}
	private void NOTEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: _type = OPERATOR;  break;
		}
	}
	private void CONTINUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: _type = KEYWORD;  break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33: _type = OPERATOR;  break;
		}
	}
	private void READ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: _type = KEYWORD;  break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _type = KEYWORD;  break;
		}
	}
	private void RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: _type = KEYWORD;  break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: _type = OPERATOR;  break;
		}
	}
	private void ENDIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: _type = KEYWORD;  break;
		}
	}
	private void GT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29: _type = OPERATOR;  break;
		}
	}
	private void PROGRAM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _type = KEYWORD;  break;
		}
	}
	private void VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: _type = KEYWORD;  break;
		}
	}
	private void ELSIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: _type = KEYWORD;  break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: _type = OPERATOR;  break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: _type = OPERATOR;  break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: _type = KEYWORD;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void FALSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: _type = KEYWORD;  break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: _type = KEYWORD;  break;
		}
	}
	private void ADD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: _type = OPERATOR;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2,\u025e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u0130\n#\f"+
		"#\16#\u0133\13#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\5$\u0148\n$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39"+
		"\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>"+
		"\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D"+
		"\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\7I"+
		"\u022b\nI\fI\16I\u022e\13I\3J\6J\u0231\nJ\rJ\16J\u0232\3K\6K\u0236\nK"+
		"\rK\16K\u0237\3K\3K\6K\u023c\nK\rK\16K\u023d\3L\3L\3L\3L\7L\u0244\nL\f"+
		"L\16L\u0247\13L\3L\3L\3M\3M\3N\3N\3O\3O\5O\u0251\nO\3P\3P\3P\3P\3Q\3Q"+
		"\3Q\3Q\5Q\u025b\nQ\3Q\3Q\4\u0131\u0245R\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1"+
		"\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1"+
		"\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\2G%\1I&\1K\2\3M\2\4O\2"+
		"\5Q\2\6S\2\7U\2\bW\2\tY\2\n[\2\13]\2\f_\2\ra\2\16c\2\17e\2\20g\2\21i\2"+
		"\22k\2\23m\2\24o\2\25q\2\26s\2\27u\2\30w\2\31y\2\32{\2\33}\2\34\177\2"+
		"\35\u0081\2\36\u0083\2\37\u0085\2 \u0087\2!\u0089\2\"\u008b\2#\u008d\2"+
		"$\u008f\2%\u0091\'\1\u0093(\1\u0095)\1\u0097*\1\u0099\2\1\u009b\2\1\u009d"+
		"\2\1\u009f+&\u00a1,\'\3\2\6\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\4\2<<"+
		"^^\u024f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2"+
		"\2\u0097\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\3\u00a3\3\2\2\2\5\u00a5"+
		"\3\2\2\2\7\u00a8\3\2\2\2\t\u00aa\3\2\2\2\13\u00ac\3\2\2\2\r\u00b4\3\2"+
		"\2\2\17\u00b6\3\2\2\2\21\u00bb\3\2\2\2\23\u00bd\3\2\2\2\25\u00c1\3\2\2"+
		"\2\27\u00c4\3\2\2\2\31\u00c7\3\2\2\2\33\u00cd\3\2\2\2\35\u00d2\3\2\2\2"+
		"\37\u00d9\3\2\2\2!\u00dc\3\2\2\2#\u00e1\3\2\2\2%\u00e7\3\2\2\2\'\u00ed"+
		"\3\2\2\2)\u00ef\3\2\2\2+\u00f1\3\2\2\2-\u00f7\3\2\2\2/\u00fd\3\2\2\2\61"+
		"\u00ff\3\2\2\2\63\u0101\3\2\2\2\65\u010a\3\2\2\2\67\u010c\3\2\2\29\u0112"+
		"\3\2\2\2;\u0115\3\2\2\2=\u011c\3\2\2\2?\u011e\3\2\2\2A\u0124\3\2\2\2C"+
		"\u0127\3\2\2\2E\u012b\3\2\2\2G\u0147\3\2\2\2I\u0149\3\2\2\2K\u014b\3\2"+
		"\2\2M\u0155\3\2\2\2O\u015d\3\2\2\2Q\u0163\3\2\2\2S\u016e\3\2\2\2U\u0175"+
		"\3\2\2\2W\u017d\3\2\2\2Y\u0182\3\2\2\2[\u018a\3\2\2\2]\u0192\3\2\2\2_"+
		"\u0197\3\2\2\2a\u019f\3\2\2\2c\u01aa\3\2\2\2e\u01b2\3\2\2\2g\u01bb\3\2"+
		"\2\2i\u01c1\3\2\2\2k\u01c8\3\2\2\2m\u01d1\3\2\2\2o\u01d9\3\2\2\2q\u01e0"+
		"\3\2\2\2s\u01e8\3\2\2\2u\u01ed\3\2\2\2w\u01f1\3\2\2\2y\u01f5\3\2\2\2{"+
		"\u01f9\3\2\2\2}\u01fd\3\2\2\2\177\u0201\3\2\2\2\u0081\u0206\3\2\2\2\u0083"+
		"\u020a\3\2\2\2\u0085\u020e\3\2\2\2\u0087\u0212\3\2\2\2\u0089\u0216\3\2"+
		"\2\2\u008b\u021a\3\2\2\2\u008d\u021e\3\2\2\2\u008f\u0223\3\2\2\2\u0091"+
		"\u0228\3\2\2\2\u0093\u0230\3\2\2\2\u0095\u0235\3\2\2\2\u0097\u023f\3\2"+
		"\2\2\u0099\u024a\3\2\2\2\u009b\u024c\3\2\2\2\u009d\u0250\3\2\2\2\u009f"+
		"\u0252\3\2\2\2\u00a1\u025a\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\4\3\2\2\2"+
		"\u00a5\u00a6\7F\2\2\u00a6\u00a7\7Q\2\2\u00a7\6\3\2\2\2\u00a8\u00a9\7,"+
		"\2\2\u00a9\b\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab\n\3\2\2\2\u00ac\u00ad\7"+
		"R\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af\7Q\2\2\u00af\u00b0\7I\2\2\u00b0\u00b1"+
		"\7T\2\2\u00b1\u00b2\7C\2\2\u00b2\u00b3\7O\2\2\u00b3\f\3\2\2\2\u00b4\u00b5"+
		"\7*\2\2\u00b5\16\3\2\2\2\u00b6\u00b7\7T\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9"+
		"\7C\2\2\u00b9\u00ba\7F\2\2\u00ba\20\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc\22"+
		"\3\2\2\2\u00bd\u00be\7G\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0\7F\2\2\u00c0"+
		"\24\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c3\7?\2\2\u00c3\26\3\2\2\2\u00c4"+
		"\u00c5\7>\2\2\u00c5\u00c6\7?\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7G\2\2\u00c8"+
		"\u00c9\7P\2\2\u00c9\u00ca\7F\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cc\7H\2\2"+
		"\u00cc\32\3\2\2\2\u00cd\u00ce\7X\2\2\u00ce\u00cf\7Q\2\2\u00cf\u00d0\7"+
		"K\2\2\u00d0\u00d1\7F\2\2\u00d1\34\3\2\2\2\u00d2\u00d3\7U\2\2\u00d3\u00d4"+
		"\7V\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7P\2\2\u00d7"+
		"\u00d8\7I\2\2\u00d8\36\3\2\2\2\u00d9\u00da\7K\2\2\u00da\u00db\7H\2\2\u00db"+
		" \3\2\2\2\u00dc\u00dd\7V\2\2\u00dd\u00de\7T\2\2\u00de\u00df\7W\2\2\u00df"+
		"\u00e0\7G\2\2\u00e0\"\3\2\2\2\u00e1\u00e2\7H\2\2\u00e2\u00e3\7C\2\2\u00e3"+
		"\u00e4\7N\2\2\u00e4\u00e5\7U\2\2\u00e5\u00e6\7G\2\2\u00e6$\3\2\2\2\u00e7"+
		"\u00e8\7Y\2\2\u00e8\u00e9\7T\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7V\2\2"+
		"\u00eb\u00ec\7G\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee(\3\2\2\2\u00ef"+
		"\u00f0\7-\2\2\u00f0*\3\2\2\2\u00f1\u00f2\7Y\2\2\u00f2\u00f3\7J\2\2\u00f3"+
		"\u00f4\7K\2\2\u00f4\u00f5\7N\2\2\u00f5\u00f6\7G\2\2\u00f6,\3\2\2\2\u00f7"+
		"\u00f8\7G\2\2\u00f8\u00f9\7N\2\2\u00f9\u00fa\7U\2\2\u00fa\u00fb\7K\2\2"+
		"\u00fb\u00fc\7H\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe\60\3\2\2\2"+
		"\u00ff\u0100\7=\2\2\u0100\62\3\2\2\2\u0101\u0102\7H\2\2\u0102\u0103\7"+
		"W\2\2\u0103\u0104\7P\2\2\u0104\u0105\7E\2\2\u0105\u0106\7V\2\2\u0106\u0107"+
		"\7K\2\2\u0107\u0108\7Q\2\2\u0108\u0109\7P\2\2\u0109\64\3\2\2\2\u010a\u010b"+
		"\7@\2\2\u010b\66\3\2\2\2\u010c\u010d\7H\2\2\u010d\u010e\7N\2\2\u010e\u010f"+
		"\7Q\2\2\u010f\u0110\7C\2\2\u0110\u0111\7V\2\2\u01118\3\2\2\2\u0112\u0113"+
		"\7<\2\2\u0113\u0114\7?\2\2\u0114:\3\2\2\2\u0115\u0116\7T\2\2\u0116\u0117"+
		"\7G\2\2\u0117\u0118\7V\2\2\u0118\u0119\7W\2\2\u0119\u011a\7T\2\2\u011a"+
		"\u011b\7P\2\2\u011b<\3\2\2\2\u011c\u011d\7\61\2\2\u011d>\3\2\2\2\u011e"+
		"\u011f\7D\2\2\u011f\u0120\7G\2\2\u0120\u0121\7I\2\2\u0121\u0122\7K\2\2"+
		"\u0122\u0123\7P\2\2\u0123@\3\2\2\2\u0124\u0125\7@\2\2\u0125\u0126\7?\2"+
		"\2\u0126B\3\2\2\2\u0127\u0128\7K\2\2\u0128\u0129\7P\2\2\u0129\u012a\7"+
		"V\2\2\u012aD\3\2\2\2\u012b\u012c\7/\2\2\u012c\u012d\7/\2\2\u012d\u0131"+
		"\3\2\2\2\u012e\u0130\13\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0135\7\f\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b#\2\2\u0137"+
		"F\3\2\2\2\u0138\u0148\5s:\2\u0139\u0148\5u;\2\u013a\u0148\5w<\2\u013b"+
		"\u0148\5y=\2\u013c\u0148\5{>\2\u013d\u0148\5}?\2\u013e\u0148\5\177@\2"+
		"\u013f\u0148\5\u0081A\2\u0140\u0148\5\u0083B\2\u0141\u0148\5\u0085C\2"+
		"\u0142\u0148\5\u0087D\2\u0143\u0148\5\u0089E\2\u0144\u0148\5\u008bF\2"+
		"\u0145\u0148\5\u008dG\2\u0146\u0148\5\u008fH\2\u0147\u0138\3\2\2\2\u0147"+
		"\u0139\3\2\2\2\u0147\u013a\3\2\2\2\u0147\u013b\3\2\2\2\u0147\u013c\3\2"+
		"\2\2\u0147\u013d\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u013f\3\2\2\2\u0147"+
		"\u0140\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2"+
		"\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"H\3\2\2\2\u0149\u014a\5K&\2\u014aJ\3\2\2\2\u014b\u014c\7R\2\2\u014c\u014d"+
		"\7T\2\2\u014d\u014e\7Q\2\2\u014e\u014f\7I\2\2\u014f\u0150\7T\2\2\u0150"+
		"\u0151\7C\2\2\u0151\u0152\7O\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b&\3"+
		"\2\u0154L\3\2\2\2\u0155\u0156\7D\2\2\u0156\u0157\7G\2\2\u0157\u0158\7"+
		"I\2\2\u0158\u0159\7K\2\2\u0159\u015a\7P\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\b\'\4\2\u015cN\3\2\2\2\u015d\u015e\7G\2\2\u015e\u015f\7P\2\2\u015f"+
		"\u0160\7F\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b(\5\2\u0162P\3\2\2\2\u0163"+
		"\u0164\7H\2\2\u0164\u0165\7W\2\2\u0165\u0166\7P\2\2\u0166\u0167\7E\2\2"+
		"\u0167\u0168\7V\2\2\u0168\u0169\7K\2\2\u0169\u016a\7Q\2\2\u016a\u016b"+
		"\7P\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b)\6\2\u016dR\3\2\2\2\u016e\u016f"+
		"\7T\2\2\u016f\u0170\7G\2\2\u0170\u0171\7C\2\2\u0171\u0172\7F\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\b*\7\2\u0174T\3\2\2\2\u0175\u0176\7Y\2\2\u0176"+
		"\u0177\7T\2\2\u0177\u0178\7K\2\2\u0178\u0179\7V\2\2\u0179\u017a\7G\2\2"+
		"\u017a\u017b\3\2\2\2\u017b\u017c\b+\b\2\u017cV\3\2\2\2\u017d\u017e\7K"+
		"\2\2\u017e\u017f\7H\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b,\t\2\u0181X"+
		"\3\2\2\2\u0182\u0183\7G\2\2\u0183\u0184\7N\2\2\u0184\u0185\7U\2\2\u0185"+
		"\u0186\7K\2\2\u0186\u0187\7H\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b-\n"+
		"\2\u0189Z\3\2\2\2\u018a\u018b\7G\2\2\u018b\u018c\7P\2\2\u018c\u018d\7"+
		"F\2\2\u018d\u018e\7K\2\2\u018e\u018f\7H\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\b.\13\2\u0191\\\3\2\2\2\u0192\u0193\7F\2\2\u0193\u0194\7Q\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\b/\f\2\u0196^\3\2\2\2\u0197\u0198\7Y\2\2\u0198"+
		"\u0199\7J\2\2\u0199\u019a\7K\2\2\u019a\u019b\7N\2\2\u019b\u019c\7G\2\2"+
		"\u019c\u019d\3\2\2\2\u019d\u019e\b\60\r\2\u019e`\3\2\2\2\u019f\u01a0\7"+
		"E\2\2\u01a0\u01a1\7Q\2\2\u01a1\u01a2\7P\2\2\u01a2\u01a3\7V\2\2\u01a3\u01a4"+
		"\7K\2\2\u01a4\u01a5\7P\2\2\u01a5\u01a6\7W\2\2\u01a6\u01a7\7G\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\b\61\16\2\u01a9b\3\2\2\2\u01aa\u01ab\7D\2\2"+
		"\u01ab\u01ac\7T\2\2\u01ac\u01ad\7G\2\2\u01ad\u01ae\7C\2\2\u01ae\u01af"+
		"\7M\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\b\62\17\2\u01b1d\3\2\2\2\u01b2"+
		"\u01b3\7T\2\2\u01b3\u01b4\7G\2\2\u01b4\u01b5\7V\2\2\u01b5\u01b6\7W\2\2"+
		"\u01b6\u01b7\7T\2\2\u01b7\u01b8\7P\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba"+
		"\b\63\20\2\u01baf\3\2\2\2\u01bb\u01bc\7K\2\2\u01bc\u01bd\7P\2\2\u01bd"+
		"\u01be\7V\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\b\64\21\2\u01c0h\3\2\2\2"+
		"\u01c1\u01c2\7X\2\2\u01c2\u01c3\7Q\2\2\u01c3\u01c4\7K\2\2\u01c4\u01c5"+
		"\7F\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\b\65\22\2\u01c7j\3\2\2\2\u01c8"+
		"\u01c9\7U\2\2\u01c9\u01ca\7V\2\2\u01ca\u01cb\7T\2\2\u01cb\u01cc\7K\2\2"+
		"\u01cc\u01cd\7P\2\2\u01cd\u01ce\7I\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0"+
		"\b\66\23\2\u01d0l\3\2\2\2\u01d1\u01d2\7H\2\2\u01d2\u01d3\7N\2\2\u01d3"+
		"\u01d4\7Q\2\2\u01d4\u01d5\7C\2\2\u01d5\u01d6\7V\2\2\u01d6\u01d7\3\2\2"+
		"\2\u01d7\u01d8\b\67\24\2\u01d8n\3\2\2\2\u01d9\u01da\7V\2\2\u01da\u01db"+
		"\7T\2\2\u01db\u01dc\7W\2\2\u01dc\u01dd\7G\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\b8\25\2\u01dfp\3\2\2\2\u01e0\u01e1\7H\2\2\u01e1\u01e2\7C\2\2\u01e2"+
		"\u01e3\7N\2\2\u01e3\u01e4\7U\2\2\u01e4\u01e5\7G\2\2\u01e5\u01e6\3\2\2"+
		"\2\u01e6\u01e7\b9\26\2\u01e7r\3\2\2\2\u01e8\u01e9\7<\2\2\u01e9\u01ea\7"+
		"?\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\b:\27\2\u01ect\3\2\2\2\u01ed\u01ee"+
		"\7-\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\b;\30\2\u01f0v\3\2\2\2\u01f1\u01f2"+
		"\7/\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\b<\31\2\u01f4x\3\2\2\2\u01f5\u01f6"+
		"\7,\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\b=\32\2\u01f8z\3\2\2\2\u01f9\u01fa"+
		"\7\61\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\b>\33\2\u01fc|\3\2\2\2\u01fd"+
		"\u01fe\7?\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\b?\34\2\u0200~\3\2\2\2\u0201"+
		"\u0202\7#\2\2\u0202\u0203\7?\2\2\u0203\u0204\3\2\2\2\u0204\u0205\b@\35"+
		"\2\u0205\u0080\3\2\2\2\u0206\u0207\7>\2\2\u0207\u0208\3\2\2\2\u0208\u0209"+
		"\bA\36\2\u0209\u0082\3\2\2\2\u020a\u020b\7@\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\bB\37\2\u020d\u0084\3\2\2\2\u020e\u020f\7*\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0211\bC \2\u0211\u0086\3\2\2\2\u0212\u0213\7+\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0215\bD!\2\u0215\u0088\3\2\2\2\u0216\u0217\7=\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0219\bE\"\2\u0219\u008a\3\2\2\2\u021a\u021b\7.\2"+
		"\2\u021b\u021c\3\2\2\2\u021c\u021d\bF#\2\u021d\u008c\3\2\2\2\u021e\u021f"+
		"\7>\2\2\u021f\u0220\7?\2\2\u0220\u0221\3\2\2\2\u0221\u0222\bG$\2\u0222"+
		"\u008e\3\2\2\2\u0223\u0224\7@\2\2\u0224\u0225\7?\2\2\u0225\u0226\3\2\2"+
		"\2\u0226\u0227\bH%\2\u0227\u0090\3\2\2\2\u0228\u022c\5\u0099M\2\u0229"+
		"\u022b\5\u009dO\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0092\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
		"\u0231\5\u009bN\2\u0230\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0094\3\2\2\2\u0234\u0236\5\u0093J"+
		"\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\7\60\2\2\u023a\u023c\5\u0093"+
		"J\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u0096\3\2\2\2\u023f\u0245\7$\2\2\u0240\u0241\7^\2"+
		"\2\u0241\u0244\7$\2\2\u0242\u0244\13\2\2\2\u0243\u0240\3\2\2\2\u0243\u0242"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246"+
		"\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7$\2\2\u0249\u0098\3\2"+
		"\2\2\u024a\u024b\t\2\2\2\u024b\u009a\3\2\2\2\u024c\u024d\t\3\2\2\u024d"+
		"\u009c\3\2\2\2\u024e\u0251\5\u0099M\2\u024f\u0251\5\u009bN\2\u0250\u024e"+
		"\3\2\2\2\u0250\u024f\3\2\2\2\u0251\u009e\3\2\2\2\u0252\u0253\t\4\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0255\bP&\2\u0255\u00a0\3\2\2\2\u0256\u025b\7$\2"+
		"\2\u0257\u0258\7^\2\2\u0258\u025b\7<\2\2\u0259\u025b\t\5\2\2\u025a\u0256"+
		"\3\2\2\2\u025a\u0257\3\2\2\2\u025a\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025d\bQ\'\2\u025d\u00a2\3\2\2\2\r\2\u0131\u0147\u022c\u0232\u0237\u023d"+
		"\u0243\u0245\u0250\u025a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}