package com.rafaelpsouza.sandbox.antlr;

// Generated from ServicesDsl.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ServicesDslLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, STRING=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'from'", "'with'", "'export'", "'to'", "'DOCX'", "')'", "'retrieve'", 
		"'ZIP'", "'('", "'PDF'", "'DOC'", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "STRING", "WS"
	};


	public ServicesDslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ServicesDsl.g4"; }

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
		case 12: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\17_\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\7\rR\n\r\f\r\16\r"+
		"U\13\r\3\r\3\r\3\16\6\16Z\n\16\r\16\16\16[\3\16\3\16\3S\17\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\2\3\2\3\5\13\f\17\17\"\"`\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2"+
		"\5\"\3\2\2\2\7\'\3\2\2\2\t.\3\2\2\2\13\61\3\2\2\2\r\66\3\2\2\2\178\3\2"+
		"\2\2\21A\3\2\2\2\23E\3\2\2\2\25G\3\2\2\2\27K\3\2\2\2\31O\3\2\2\2\33Y\3"+
		"\2\2\2\35\36\7h\2\2\36\37\7t\2\2\37 \7q\2\2 !\7o\2\2!\4\3\2\2\2\"#\7y"+
		"\2\2#$\7k\2\2$%\7v\2\2%&\7j\2\2&\6\3\2\2\2\'(\7g\2\2()\7z\2\2)*\7r\2\2"+
		"*+\7q\2\2+,\7t\2\2,-\7v\2\2-\b\3\2\2\2./\7v\2\2/\60\7q\2\2\60\n\3\2\2"+
		"\2\61\62\7F\2\2\62\63\7Q\2\2\63\64\7E\2\2\64\65\7Z\2\2\65\f\3\2\2\2\66"+
		"\67\7+\2\2\67\16\3\2\2\289\7t\2\29:\7g\2\2:;\7v\2\2;<\7t\2\2<=\7k\2\2"+
		"=>\7g\2\2>?\7x\2\2?@\7g\2\2@\20\3\2\2\2AB\7\\\2\2BC\7K\2\2CD\7R\2\2D\22"+
		"\3\2\2\2EF\7*\2\2F\24\3\2\2\2GH\7R\2\2HI\7F\2\2IJ\7H\2\2J\26\3\2\2\2K"+
		"L\7F\2\2LM\7Q\2\2MN\7E\2\2N\30\3\2\2\2OS\7$\2\2PR\13\2\2\2QP\3\2\2\2R"+
		"U\3\2\2\2ST\3\2\2\2SQ\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7$\2\2W\32\3\2\2\2"+
		"XZ\t\2\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\16"+
		"\2\2^\34\3\2\2\2\5\2S[";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}