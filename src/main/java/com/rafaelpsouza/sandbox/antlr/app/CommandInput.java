/*
 */
package com.rafaelpsouza.sandbox.antlr.app;

/**
 *
 * @author Rafael Souza
 */
public class CommandInput {
	
	private String outputPath;
	private String environment;
	private String serviceInput;
	private String serviceCalled;
	private String exportFormat;

	public String getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getServiceInput() {
		return serviceInput;
	}

	public void setServiceInput(String serviceInput) {
		this.serviceInput = serviceInput;
	}

	public String getServiceCalled() {
		return serviceCalled;
	}

	public void setServiceCalled(String serviceCalled) {
		this.serviceCalled = serviceCalled;
	}

	public String getExportFormat() {
		return exportFormat;
	}

	public void setExportFormat(String exportFormat) {
		this.exportFormat = exportFormat;
	}

	@Override
	public String toString() {
		return "CommandInput{" + "outputPath=" + outputPath + ", environment=" + environment + ", serviceInput=" + serviceInput + ", serviceCalled=" + serviceCalled + ", exportFormat=" + exportFormat + '}';
	}
}
