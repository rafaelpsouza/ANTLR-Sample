package com.rafaelpsouza.sandbox.antlr;

// Generated from ServicesDsl.g4 by ANTLR 4.0

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class ServicesDslBaseListener implements ServicesDslListener {
	@Override public void enterTo(ServicesDslParser.ToContext ctx) { }
	@Override public void exitTo(ServicesDslParser.ToContext ctx) { }

	@Override public void enterWith(ServicesDslParser.WithContext ctx) { }
	@Override public void exitWith(ServicesDslParser.WithContext ctx) { }

	@Override public void enterService(ServicesDslParser.ServiceContext ctx) { }
	@Override public void exitService(ServicesDslParser.ServiceContext ctx) { }

	@Override public void enterCommand(ServicesDslParser.CommandContext ctx) { }
	@Override public void exitCommand(ServicesDslParser.CommandContext ctx) { }

	@Override public void enterFrom(ServicesDslParser.FromContext ctx) { }
	@Override public void exitFrom(ServicesDslParser.FromContext ctx) { }

	@Override public void enterFormat(ServicesDslParser.FormatContext ctx) { }
	@Override public void exitFormat(ServicesDslParser.FormatContext ctx) { }

	@Override public void enterOperator(ServicesDslParser.OperatorContext ctx) { }
	@Override public void exitOperator(ServicesDslParser.OperatorContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}