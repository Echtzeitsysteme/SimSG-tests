package voterSim2.rules.api;

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
import voterSim2.rules.api.rules.AgreeFalsePattern;
import voterSim2.rules.api.rules.AgreeTruePattern;
import voterSim2.rules.api.rules.ConnectedV1V3Pattern;
import voterSim2.rules.api.rules.ConvertRule;
import voterSim2.rules.api.rules.DisagreePattern;
import voterSim2.rules.api.rules.SwitchRandomRule;
import voterSim2.rules.api.rules.VoteFalsePattern;
import voterSim2.rules.api.rules.VoteTruePattern;

/**
 * The RulesAPI with 2 rules and 8 patterns.
 */
public class RulesAPI extends GraphTransformationAPI {
	
	public static String patternPath = "VoterSim2/src-gen/voterSim2/rules/api/ibex-patterns.xmi";

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
		map.put("switchRandom", () -> switchRandom());
		map.put("agreeFalse", () -> agreeFalse());
		map.put("agreeTrue", () -> agreeTrue());
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
		map.put(switchRandom(), new double[]{
		switchRandom().getProbability().get().getProbability(), 0.0});					
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
	* Creates a new instance of the rule <code>switchRandom()</code> which does the following:
	* rule switchSame() {v1:Voter1{-- -link-> v2++ -link-> v3}v2:Voter1{-- -link-> v1}v3:Voter1{++ -link-> v1}# v1.vote != v2.vote# v1.vote == v3.vote} when notConnectedV1V3 @ 0.5
	*
	* @return the new instance of the rule»
	*/
	public SwitchRandomRule switchRandom() {
		try{
			SwitchRandomRule rule = (SwitchRandomRule) interpreter.getRegisteredGraphTransformationPattern("switchRandom");
			return rule;
		} catch(Exception e) {
			return new SwitchRandomRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>agreeFalse()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public AgreeFalsePattern agreeFalse() {
		try{
			AgreeFalsePattern pattern = (AgreeFalsePattern) interpreter.getRegisteredGraphTransformationPattern("agreeFalse");
			return pattern;
		} catch(Exception e) {
			return new AgreeFalsePattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>agreeTrue()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public AgreeTruePattern agreeTrue() {
		try{
			AgreeTruePattern pattern = (AgreeTruePattern) interpreter.getRegisteredGraphTransformationPattern("agreeTrue");
			return pattern;
		} catch(Exception e) {
			return new AgreeTruePattern(this, interpreter);
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
