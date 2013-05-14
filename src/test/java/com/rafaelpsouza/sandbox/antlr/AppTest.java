/*
 */
package com.rafaelpsouza.sandbox.antlr;

import com.rafaelpsouza.sandbox.antlr.app.CommandInput;
import com.rafaelpsouza.sandbox.antlr.app.DslApp;
import com.rafaelpsouza.sandbox.antlr.listener.ServicesDslLoader;
import static junit.framework.Assert.*;
import org.junit.Test;

/**
 *
 * @author Rafael Souza
 */
public class AppTest {
	
	@Test
	public void testValidExportPDF(){
		DslApp dslApp = new DslApp();
		CommandInput commandInput = dslApp.createCommand("export PDF from \"dev\" to \"c:\\dev\" with (\"export-input-jsonformat\")");
		assertEquals("export", commandInput.getServiceCalled());
		assertEquals("PDF", commandInput.getExportFormat());
		assertEquals("\"c:\\dev\"", commandInput.getOutputPath());
		assertEquals("\"export-input-jsonformat\"", commandInput.getServiceInput());
	}
	
	@Test
	public void testValidRetrieve(){
		DslApp dslApp = new DslApp();
		CommandInput commandInput = dslApp.createCommand("retrieve to \"c:\\dev\\ret1.txt\" from \"build\" with (\"retrieve-input-jsonformat\")");
		assertEquals("retrieve", commandInput.getServiceCalled());
		assertEquals(null, commandInput.getExportFormat());
		assertEquals("\"c:\\dev\\ret1.txt\"", commandInput.getOutputPath());
		assertEquals("\"retrieve-input-jsonformat\"", commandInput.getServiceInput());
	} 
	
	@Test
	public void testValidExportCommands(){
		DslApp dslApp = new DslApp();
		dslApp.createCommand("export DOC from \"qa-edc\" to \"c:\\dev\" with (\"export-input-jsonformat\")");
		dslApp.createCommand("export DOCX from \"prod-eagan\" to \"c:\\dev\" with (\"export-input-jsonformat\")");
		dslApp.createCommand("export ZIP from \"build\" to \"c:\\dev\" with (\"export-input-jsonformat\")");
		dslApp.createCommand("export PDF to \"c:\\dev\" with (\"export-input-jsonformat\") from \"dev\"");
		dslApp.createCommand("export DOC with (\"export-input-jsonformat\") from \"qa-edc\" to \"c:\\dev\"");
		dslApp.createCommand("export DOCX from \"prod-eagan\" with (\"export-input-jsonformat\") to \"c:\\dev\"");
	}
	
	@Test
	public void testValidRetrieveCommands(){
		DslApp dslApp = new DslApp();
		dslApp.createCommand("retrieve to \"c:\\dev\\retprod.txt\" with (\"[{json:bla}]\") from \"prod\" ");
		dslApp.createCommand("retrieve with (\"jsonformat\") to \"c:\\dev\\ret2.txt\" from \"qa\"");
		dslApp.createCommand("retrieve to \"c:\\dev\\retprod.txt\" with (\"[{json:bla}]\") from \"prod\"");
		dslApp.createCommand("retrieve to \"c:\\dev\\retprod.txt\" with (\"1234***\") from \"prod\"");
	}
	
}
