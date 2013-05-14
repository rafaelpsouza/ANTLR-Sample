/*
 */
package com.rafaelpsouza.sandbox.antlr.listener;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author Rafael Souza
 */
public class ServiceDslErrorListener extends BaseErrorListener{

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
		System.out.println("RAFAELLLLLLLLLLLLLLLLLLLLLLLLLLLL");
		throw new RuntimeException(e);
	}
	
	
	
}
