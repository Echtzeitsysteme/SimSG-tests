package groupVotersGen.rules.api;

import groupVotersGen.rules.api.rules.AgreeFalsePattern;
import groupVotersGen.rules.api.rules.AgreeTruePattern;
import groupVotersGen.rules.api.rules.ConnectedVGPattern;
import groupVotersGen.rules.api.rules.FalseMemberVGPattern;
import groupVotersGen.rules.api.rules.HetGroupPattern;
import groupVotersGen.rules.api.rules.HomGroupFalsePattern;
import groupVotersGen.rules.api.rules.HomGroupTruePattern;
import groupVotersGen.rules.api.rules.NewMembershipRule;
import groupVotersGen.rules.api.rules.TrueMemberVGPattern;
import groupVotersGen.rules.api.rules.VoteFalsePattern;
import groupVotersGen.rules.api.rules.VoteTruePattern;
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
 * The RulesAPI with 1 rules and 13 patterns.
 */
public class RulesAPI extends GraphTransformationAPI {
	
	public static String patternPath = "GroupVotersGen/src-gen/groupVotersGen/rules/api/ibex-patterns.xmi";

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
		map.put("newMembership", () -> newMembership());
		map.put("agreeFalse", () -> agreeFalse());
		map.put("agreeTrue", () -> agreeTrue());
		map.put("connectedVG", () -> connectedVG());
		map.put("falseMemberVG", () -> falseMemberVG());
		map.put("hetGroup", () -> hetGroup());
		map.put("homGroupFalse", () -> homGroupFalse());
		map.put("homGroupTrue", () -> homGroupTrue());
		map.put("trueMemberVG", () -> trueMemberVG());
		map.put("voteFalse", () -> voteFalse());
		map.put("voteTrue", () -> voteTrue());
		return map;
	}
	
	@Override
	protected Map<GraphTransformationRule<?,?>, double[]> initiateGillespieMap(){
		Map<GraphTransformationRule<?,?>, double[]> map = 
			new HashMap<>();
		map.put(newMembership(), new double[]{
		newMembership().getProbability().get().getProbability(), 0.0});					
		return map;
	}
					
	/**
	* Creates a new instance of the rule <code>newMembership()</code> which does the following:
	* If this rule is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the rule»
	*/
	public NewMembershipRule newMembership() {
		try{
			NewMembershipRule rule = (NewMembershipRule) interpreter.getRegisteredGraphTransformationPattern("newMembership");
			return rule;
		} catch(Exception e) {
			return new NewMembershipRule(this, interpreter);
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
	* Creates a new instance of the pattern <code>connectedVG()</code> which does the following:
	* If this pattern is not self-explaining, you really should add some comment in the specification.
	*
	* @return the new instance of the pattern»
	*/
	public ConnectedVGPattern connectedVG() {
		try{
			ConnectedVGPattern pattern = (ConnectedVGPattern) interpreter.getRegisteredGraphTransformationPattern("connectedVG");
			return pattern;
		} catch(Exception e) {
			return new ConnectedVGPattern(this, interpreter);
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
