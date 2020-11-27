package voterSim.rules.api;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An application using the RulesAPI with Democles.
 */
public class RulesDemoclesApp extends RulesApp {

	/**
	 * Creates the application with Democles.
	 */
	public RulesDemoclesApp() {
		super(new DemoclesGTEngine());
	}

	/**
	 * Creates the application with Democles.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public RulesDemoclesApp(final String workspacePath) {
		super(new DemoclesGTEngine(), workspacePath);
	}
}
