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
import voterSim.rules.api.rules.AgreePattern;
import voterSim.rules.api.rules.ConnectedV1V3Pattern;
import voterSim.rules.api.rules.ConvertRule;
import voterSim.rules.api.rules.DisagreePattern;
import voterSim.rules.api.rules.NewVoterFalseRule;
import voterSim.rules.api.rules.NewVoterTrueRule;
import voterSim.rules.api.rules.SwitchingRule;
import voterSim.rules.api.rules.VoteFalsePattern;
import voterSim.rules.api.rules.VoteTruePattern;

/**
 * The RulesAPI with 4 rules and 9 patterns.
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
		map.put("convert", () -> convert());
		map.put("newVoterFalse", () -> newVoterFalse());
		map.put("newVoterTrue", () -> newVoterTrue());
		map.put("switching", () -> switching());
		map.put("agree", () -> agree());
		map.put("connectedV1V3", () -> connectedV1V3());
		map.put("disagree", () -> disagree());
		map.put("voteFalse", () -> voteFalse());
		map.put("voteTrue", () -> voteTrue());
		return map;
	}
	
	@Override
	protected Map<GraphTransformationRule<?,?>, double[]> initiateGillespieMap(){
		Map<GraphTransformationRule<?,?>, double[]> map = 
			new HashMap<>();
		map.put(convert(), new double[]{
		convert().getProbability().get().getProbability(), 0.0});					
		map.put(newVoterFalse(), new double[]{
		newVoterFalse().getProbability().get().getProbability(), 0.0});					
		map.put(newVoterTrue(), new double[]{
		newVoterTrue().getProbability().get().getProbability(), 0.0});					
		map.put(switching(), new double[]{
		switching().getProbability().get().getProbability(), 0.0});					
		return map;
	}
					
	/**
	* Creates a new instance of the rule <code>convert()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the rule»
	*/
	public ConvertRule convert() {
		try{
			ConvertRule rule = (ConvertRule) interpreter.getRegisteredGraphTransformationPattern("convert");
			return rule;
		} catch(Exception e) {
			return new ConvertRule(this, interpreter);
		}
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
	* Creates a new instance of the rule <code>switching()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the rule»
	*/
	public SwitchingRule switching() {
		try{
			SwitchingRule rule = (SwitchingRule) interpreter.getRegisteredGraphTransformationPattern("switching");
			return rule;
		} catch(Exception e) {
			return new SwitchingRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>agree()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public AgreePattern agree() {
		try{
			AgreePattern pattern = (AgreePattern) interpreter.getRegisteredGraphTransformationPattern("agree");
			return pattern;
		} catch(Exception e) {
			return new AgreePattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>connectedV1V3()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public ConnectedV1V3Pattern connectedV1V3() {
		try{
			ConnectedV1V3Pattern pattern = (ConnectedV1V3Pattern) interpreter.getRegisteredGraphTransformationPattern("connectedV1V3");
			return pattern;
		} catch(Exception e) {
			return new ConnectedV1V3Pattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>disagree()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public DisagreePattern disagree() {
		try{
			DisagreePattern pattern = (DisagreePattern) interpreter.getRegisteredGraphTransformationPattern("disagree");
			return pattern;
		} catch(Exception e) {
			return new DisagreePattern(this, interpreter);
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
