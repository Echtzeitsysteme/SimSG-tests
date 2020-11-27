package voterSim2.rules.api;

import org.emoflon.ibex.gt.viatra.runtime.ViatraGTEngine;

/**
 * An application using the RulesAPI with Viatra.
 */
public class RulesViatraApp extends RulesApp {

	/**
	 * Creates the application with Viatra.
	 */
	public RulesViatraApp() {
		super(new ViatraGTEngine());
	}

	/**
	 * Creates the application with Viatra.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public RulesViatraApp(final String workspacePath) {
		super(new ViatraGTEngine(), workspacePath);
	}
}
