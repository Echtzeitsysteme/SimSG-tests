package voterSim.rules.api;

import org.emoflon.ibex.gt.hipe.runtime.HiPEGTEngine;

/**
 * An application using the RulesAPI with HiPE.
 */
public class RulesHiPEApp extends RulesApp {

	/**
	 * Creates the application with HiPE.
	 */
	public RulesHiPEApp() {
		super(new HiPEGTEngine());
	}

	/**
	 * Creates the application with HiPE.
	 * 
	 * @param workspacePath
	 *            the workspace path
	 */
	public RulesHiPEApp(final String workspacePath) {
		super(new HiPEGTEngine(), workspacePath);
	}
}
