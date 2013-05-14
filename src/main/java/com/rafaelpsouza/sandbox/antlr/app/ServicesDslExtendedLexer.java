package com.rafaelpsouza.sandbox.antlr.app;

import com.rafaelpsouza.sandbox.antlr.ServicesDslLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

/**
 *
 * @author Rafael Souza
 */
public class ServicesDslExtendedLexer extends ServicesDslLexer{

	public ServicesDslExtendedLexer(CharStream input) {
		super(input);
	}
	
	@Override
	public void recover(LexerNoViableAltException e) {
		throw new RuntimeException(e); 
	}
	
}
