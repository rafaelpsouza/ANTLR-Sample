/*
 */
package com.rafaelpsouza.sandbox.antlr.listener;

import com.rafaelpsouza.sandbox.antlr.ServicesDslBaseListener;
import com.rafaelpsouza.sandbox.antlr.ServicesDslParser;
import com.rafaelpsouza.sandbox.antlr.app.CommandInput;

/**
 *
 * @author Rafael Souza
 */
public class ServicesDslLoader extends ServicesDslBaseListener{
	
	private CommandInput commandInput;

	public ServicesDslLoader() {
		super();
		commandInput = new CommandInput();
	}
	
	@Override
	public void exitTo(ServicesDslParser.ToContext ctx) {
		commandInput.setOutputPath(ctx.STRING().getText());
	}

	@Override
	public void exitWith(ServicesDslParser.WithContext ctx) {
		commandInput.setServiceInput(ctx.STRING().getText());
	}

	@Override
	public void exitService(ServicesDslParser.ServiceContext ctx) {
		commandInput.setServiceCalled(ctx.getChild(0).getText());
	}

	@Override
	public void exitFrom(ServicesDslParser.FromContext ctx) {
		commandInput.setEnvironment(ctx.STRING().getText());
	}

	@Override
	public void exitFormat(ServicesDslParser.FormatContext ctx) {
		commandInput.setExportFormat(ctx.getText());
	}

	public CommandInput getCommandInput() {
		return commandInput;
	}

	public void setCommandInput(CommandInput commandInput) {
		this.commandInput = commandInput;
	}
}
