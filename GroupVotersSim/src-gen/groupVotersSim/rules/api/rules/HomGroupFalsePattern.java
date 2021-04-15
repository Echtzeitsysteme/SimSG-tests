package groupVotersSim.rules.api.rules;

import GroupVoters.Group;
import groupVotersSim.rules.api.matches.HomGroupFalseMatch;
import groupVotersSim.rules.api.RulesAPI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@56339b19 (name: g)] which does the following:
 * when sharingGroupV1V2condition sharingGroupV1V2 = enforce sharingGroupV1V2Patternpattern sharingGroupV1V2Pattern(){g:Groupv1:Voter1 {-member-> g}v2:Voter1 {-member-> g}}
 */
@SuppressWarnings("unused")
public class HomGroupFalsePattern extends GraphTransformationPattern<HomGroupFalseMatch, HomGroupFalsePattern> {
	private static String patternName = "homGroupFalse";

	/**
	 * Creates a new pattern homGroupFalse().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public HomGroupFalsePattern(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public HomGroupFalseMatch convertMatch(final IMatch match) {
		return new HomGroupFalseMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("g");
		return names;
	}

	/**
	 * Binds the node g to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public HomGroupFalsePattern bindG(final Group object) {
		parameters.put("g", Objects.requireNonNull(object, "g must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node g to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public HomGroupFalsePattern unbindG() {
		parameters.remove("g");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	g --> " + parameters.get("g") + System.lineSeparator();
		s += "}";
		return s;
	}
}
