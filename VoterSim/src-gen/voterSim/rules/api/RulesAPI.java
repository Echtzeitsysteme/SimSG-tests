package voterSim.rules.api;

import java.util.function.Supplier;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import voterSim.rules.api.rules.NewVoterFalseRule;
import voterSim.rules.api.rules.NewVoterTrueRule;
import voterSim.rules.api.rules.VoteFalsePattern;
import voterSim.rules.api.rules.VoteTruePattern;

/**
 * The RulesAPI with 2 rules and 4 patterns.
 */
public class RulesAPI extends GraphTransformationAPI {
	
	public static String patternPath = "VoterSim/src-gen/voterSim/rules/api/ibex-patterns.xmi";

	/**
	 * Creates a new RulesAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public RulesAPI(final IContextPatternInterpreter engine, final ResourceSet model, final String workspacePath) {
		super(engine, model);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
		patternMap = initiatePatternMap();
		gillespieMap = initiateGillespieMap();
	}

	/**
	 * Creates a new RulesAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param defaultResource
	 *            the default resource
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public RulesAPI(final IContextPatternInterpreter engine, final ResourceSet model, final Resource defaultResource,
			final String workspacePath) {
		super(engine, model, defaultResource);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
		patternMap = initiatePatternMap();
		gillespieMap = initiateGillespieMap();
	}
	
	@Override
	protected Map<String, Supplier<? extends GraphTransformationPattern<?,?>>> initiatePatternMap(){
		Map<String, Supplier<? extends GraphTransformationPattern<?,?>>> map = new HashMap<>();
		map.put("newVoterFalse", () -> newVoterFalse());
		map.put("newVoterTrue", () -> newVoterTrue());
		map.put("voteFalse", () -> voteFalse());
		map.put("voteTrue", () -> voteTrue());
		return map;
	}
	
	@Override
	protected Map<GraphTransformationRule<?,?>, double[]> initiateGillespieMap(){
		Map<GraphTransformationRule<?,?>, double[]> map = 
			new HashMap<>();
		map.put(newVoterFalse(), new double[]{
		newVoterFalse().getProbability().get().getProbability(), 0.0});					
		map.put(newVoterTrue(), new double[]{
		newVoterTrue().getProbability().get().getProbability(), 0.0});					
		return map;
	}
					
	/**
	* Creates a new instance of the rule <code>newVoterFalse()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the rule»
	*/
	public NewVoterFalseRule newVoterFalse() {
		try{
			NewVoterFalseRule rule = (NewVoterFalseRule) interpreter.getRegisteredGraphTransformationPattern("newVoterFalse");
			return rule;
		} catch(Exception e) {
			return new NewVoterFalseRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the rule <code>newVoterTrue()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the rule»
	*/
	public NewVoterTrueRule newVoterTrue() {
		try{
			NewVoterTrueRule rule = (NewVoterTrueRule) interpreter.getRegisteredGraphTransformationPattern("newVoterTrue");
			return rule;
		} catch(Exception e) {
			return new NewVoterTrueRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>voteFalse()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public VoteFalsePattern voteFalse() {
		try{
			VoteFalsePattern pattern = (VoteFalsePattern) interpreter.getRegisteredGraphTransformationPattern("voteFalse");
			return pattern;
		} catch(Exception e) {
			return new VoteFalsePattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>voteTrue()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public VoteTruePattern voteTrue() {
		try{
			VoteTruePattern pattern = (VoteTruePattern) interpreter.getRegisteredGraphTransformationPattern("voteTrue");
			return pattern;
		} catch(Exception e) {
			return new VoteTruePattern(this, interpreter);
		}
	}
}
