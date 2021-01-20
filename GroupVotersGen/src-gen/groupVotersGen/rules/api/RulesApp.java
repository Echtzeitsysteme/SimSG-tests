package groupVotersGen.rules.api;

import GroupVoters.GroupVotersPackage;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

/**
 * An application using the RulesAPI.
 */
public class RulesApp extends GraphTransformationApp<RulesAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public RulesApp(final IContextPatternInterpreter engine) {
		super(engine);
	}

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 * @param workspacePath
	 *            the workspace path
	 */
	public RulesApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(GroupVotersPackage.eINSTANCE);
	}

	@Override
	public RulesAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new RulesAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new RulesAPI(engine, resourceSet, workspacePath);
	}
}
