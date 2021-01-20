package groupVotersSim.rules.api;

import groupVotersSim.rules.api.rules.AgreeFalsePattern;
import groupVotersSim.rules.api.rules.AgreeTruePattern;
import groupVotersSim.rules.api.rules.ConvertRule;
import groupVotersSim.rules.api.rules.FalseMemberVGPattern;
import groupVotersSim.rules.api.rules.HetGroupPattern;
import groupVotersSim.rules.api.rules.HomGroupFalsePattern;
import groupVotersSim.rules.api.rules.HomGroupTruePattern;
import groupVotersSim.rules.api.rules.SwitchSameRule;
import groupVotersSim.rules.api.rules.TrueMemberVGPattern;
import groupVotersSim.rules.api.rules.V1InG2Pattern;
import groupVotersSim.rules.api.rules.VoteFalsePattern;
import groupVotersSim.rules.api.rules.VoteTruePattern;
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

/**
 * The RulesAPI with 2 rules and 14 patterns.
 */
public class RulesAPI extends GraphTransformationAPI {
	
	public static String patternPath = "GroupVotersSim/src-gen/groupVotersSim/rules/api/ibex-patterns.xmi";

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
		map.put("switchSame", () -> switchSame());
		map.put("agreeFalse", () -> agreeFalse());
		map.put("agreeTrue", () -> agreeTrue());
		map.put("falseMemberVG", () -> falseMemberVG());
		map.put("hetGroup", () -> hetGroup());
		map.put("homGroupFalse", () -> homGroupFalse());
		map.put("homGroupTrue", () -> homGroupTrue());
		map.put("trueMemberVG", () -> trueMemberVG());
		map.put("v1InG2", () -> v1InG2());
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
		map.put(switchSame(), new double[]{
		switchSame().getProbability().get().getProbability(), 0.0});					
		return map;
	}
					
	/**
	* Creates a new instance of the rule <code>convert()</code> which does the following:
	* rules match groups rather than seeing them as a positive conditionsdoes this make it harder to compare with the basic voter model ?voter changes vote to equal that of other voter in group
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
	* Creates a new instance of the rule <code>switchSame()</code> which does the following:
	* switch group away from conflicting voter to voter with same vote
	*
	* @return the new instance of the rule»
	*/
	public SwitchSameRule switchSame() {
		try{
			SwitchSameRule rule = (SwitchSameRule) interpreter.getRegisteredGraphTransformationPattern("switchSame");
			return rule;
		} catch(Exception e) {
			return new SwitchSameRule(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>agreeFalse()</code> which does the following:
	* when sharingGroupV1V2
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
	* Creates a new instance of the pattern <code>falseMemberVG()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public FalseMemberVGPattern falseMemberVG() {
		try{
			FalseMemberVGPattern pattern = (FalseMemberVGPattern) interpreter.getRegisteredGraphTransformationPattern("falseMemberVG");
			return pattern;
		} catch(Exception e) {
			return new FalseMemberVGPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>hetGroup()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public HetGroupPattern hetGroup() {
		try{
			HetGroupPattern pattern = (HetGroupPattern) interpreter.getRegisteredGraphTransformationPattern("hetGroup");
			return pattern;
		} catch(Exception e) {
			return new HetGroupPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>homGroupFalse()</code> which does the following:
	* when sharingGroupV1V2condition sharingGroupV1V2 = enforce sharingGroupV1V2Patternpattern sharingGroupV1V2Pattern(){g:Groupv1:Voter1 {-member-> g}v2:Voter1 {-member-> g}}
	*
	* @return the new instance of the pattern»
	*/
	public HomGroupFalsePattern homGroupFalse() {
		try{
			HomGroupFalsePattern pattern = (HomGroupFalsePattern) interpreter.getRegisteredGraphTransformationPattern("homGroupFalse");
			return pattern;
		} catch(Exception e) {
			return new HomGroupFalsePattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>homGroupTrue()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public HomGroupTruePattern homGroupTrue() {
		try{
			HomGroupTruePattern pattern = (HomGroupTruePattern) interpreter.getRegisteredGraphTransformationPattern("homGroupTrue");
			return pattern;
		} catch(Exception e) {
			return new HomGroupTruePattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>trueMemberVG()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public TrueMemberVGPattern trueMemberVG() {
		try{
			TrueMemberVGPattern pattern = (TrueMemberVGPattern) interpreter.getRegisteredGraphTransformationPattern("trueMemberVG");
			return pattern;
		} catch(Exception e) {
			return new TrueMemberVGPattern(this, interpreter);
		}
	}
	/**
	* Creates a new instance of the pattern <code>v1InG2()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public V1InG2Pattern v1InG2() {
		try{
			V1InG2Pattern pattern = (V1InG2Pattern) interpreter.getRegisteredGraphTransformationPattern("v1InG2");
			return pattern;
		} catch(Exception e) {
			return new V1InG2Pattern(this, interpreter);
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
