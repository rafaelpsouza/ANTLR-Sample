/*
 */
package com.rafaelpsouza.sandbox.antlr.app;

import com.rafaelpsouza.sandbox.antlr.ServicesDslLexer;
import com.rafaelpsouza.sandbox.antlr.ServicesDslParser;
import com.rafaelpsouza.sandbox.antlr.listener.ServicesDslLoader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Rafael Souza
 */
public class Sample1 {
	
	public static void main(String[] args) {
		ParseTree parseTree = loadTree();
		ParseTreeWalker treeWalker = new ParseTreeWalker();
		ServicesDslLoader dslLoader = new ServicesDslLoader();
		treeWalker.walk(dslLoader, parseTree);
		System.out.println(dslLoader.toString());
	}

	private static ParseTree loadTree() throws RecognitionException {
		ServicesDslLexer lexer = new ServicesDslLexer(new ANTLRInputStream("export bla from \"build\" to \"c:\\dev\" with (\"export-input-jsonformat\")"));
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		ServicesDslParser parser = new ServicesDslParser(commonTokenStream);
		ParseTree parseTree = parser.command();
		return parseTree;
	}
}
