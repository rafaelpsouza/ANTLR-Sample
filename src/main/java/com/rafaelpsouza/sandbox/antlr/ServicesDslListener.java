package com.rafaelpsouza.sandbox.antlr;

// Generated from ServicesDsl.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ServicesDslListener extends ParseTreeListener {
	void enterTo(ServicesDslParser.ToContext ctx);
	void exitTo(ServicesDslParser.ToContext ctx);

	void enterWith(ServicesDslParser.WithContext ctx);
	void exitWith(ServicesDslParser.WithContext ctx);

	void enterService(ServicesDslParser.ServiceContext ctx);
	void exitService(ServicesDslParser.ServiceContext ctx);

	void enterCommand(ServicesDslParser.CommandContext ctx);
	void exitCommand(ServicesDslParser.CommandContext ctx);

	void enterFrom(ServicesDslParser.FromContext ctx);
	void exitFrom(ServicesDslParser.FromContext ctx);

	void enterFormat(ServicesDslParser.FormatContext ctx);
	void exitFormat(ServicesDslParser.FormatContext ctx);

	void enterOperator(ServicesDslParser.OperatorContext ctx);
	void exitOperator(ServicesDslParser.OperatorContext ctx);
}