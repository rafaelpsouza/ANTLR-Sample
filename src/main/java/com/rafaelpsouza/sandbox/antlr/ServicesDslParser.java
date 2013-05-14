package com.rafaelpsouza.sandbox.antlr;

// Generated from ServicesDsl.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ServicesDslParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, STRING=12, WS=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'from'", "'with'", "'export'", "'to'", "'DOCX'", "')'", 
		"'retrieve'", "'ZIP'", "'('", "'PDF'", "'DOC'", "STRING", "WS"
	};
	public static final int
		RULE_command = 0, RULE_service = 1, RULE_format = 2, RULE_operator = 3, 
		RULE_from = 4, RULE_to = 5, RULE_with = 6;
	public static final String[] ruleNames = {
		"command", "service", "format", "operator", "from", "to", "with"
	};

	@Override
	public String getGrammarFileName() { return "ServicesDsl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ServicesDslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandContext extends ParserRuleContext {
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); service();
			setState(15); operator();
			setState(16); operator();
			setState(17); operator();
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

	public static class ServiceContext extends ParserRuleContext {
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).exitService(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_service);
		try {
			setState(22);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); match(3);
				setState(20); format();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); match(7);
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

	public static class FormatContext extends ParserRuleContext {
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).exitFormat(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 8) | (1L << 10) | (1L << 11))) != 0)) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator);
		try {
			setState(29);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); from();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); to();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); with();
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ServicesDslParser.STRING, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).exitFrom(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(1);
			setState(32); match(STRING);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ServicesDslParser.STRING, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).exitTo(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(4);
			setState(35); match(STRING);
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ServicesDslParser.STRING, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ServicesDslListener ) ((ServicesDslListener)listener).exitWith(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_with);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(2);
			setState(38); match(9);
			setState(39); match(STRING);
			setState(40); match(6);
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
		"\2\3\17-\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\5\3\5\3\5\5\5 \n\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\2\t\2\4\6\b\n\f\16\2\3\5"+
		"\7\7\n\n\f\r(\2\20\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\37\3\2\2\2\n!\3"+
		"\2\2\2\f$\3\2\2\2\16\'\3\2\2\2\20\21\5\4\3\2\21\22\5\b\5\2\22\23\5\b\5"+
		"\2\23\24\5\b\5\2\24\3\3\2\2\2\25\26\7\5\2\2\26\31\5\6\4\2\27\31\7\t\2"+
		"\2\30\25\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\33\t\2\2\2\33\7\3\2\2\2"+
		"\34 \5\n\6\2\35 \5\f\7\2\36 \5\16\b\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36"+
		"\3\2\2\2 \t\3\2\2\2!\"\7\3\2\2\"#\7\16\2\2#\13\3\2\2\2$%\7\6\2\2%&\7\16"+
		"\2\2&\r\3\2\2\2\'(\7\4\2\2()\7\13\2\2)*\7\16\2\2*+\7\b\2\2+\17\3\2\2\2"+
		"\4\30\37";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}