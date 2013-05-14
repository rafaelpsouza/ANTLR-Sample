/*
 */
package com.rafaelpsouza.sandbox.antlr.app;

import com.rafaelpsouza.sandbox.antlr.ServicesDslLexer;
import com.rafaelpsouza.sandbox.antlr.ServicesDslParser;
import com.rafaelpsouza.sandbox.antlr.listener.ServiceDslErrorListener;
import com.rafaelpsouza.sandbox.antlr.listener.ServicesDslLoader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Rafael Souza
 */
public class DslApp {
	
	public CommandInput createCommand(String command){
		ParseTree parseTree = loadTree(command);
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		ServicesDslLoader dslLoader = new ServicesDslLoader();
		treeWalker.walk(dslLoader, parseTree);
		return dslLoader.getCommandInput();
	}
	
	public void doCommand(CommandInput commandInput){
		//Call services
	}
	
	private static ParseTree loadTree(String command) throws RecognitionException {
		ServicesDslLexer lexer = new ServicesDslLexer(new ANTLRInputStream(command));
		//ServicesDslLexer lexer = new ServicesDslExtendedLexer(new ANTLRInputStream(command));
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		ServicesDslParser parser = new ServicesDslParser(commonTokenStream);
		parser.removeErrorListeners();
		parser.addErrorListener(new ServiceDslErrorListener());
		ParseTree parseTree = parser.command();
		return parseTree;
	}	
}
