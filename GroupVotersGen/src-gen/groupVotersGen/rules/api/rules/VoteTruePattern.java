package groupVotersGen.rules.api.rules;

import GroupVoters.Voter1;
import groupVotersGen.rules.api.matches.VoteTrueMatch;
import groupVotersGen.rules.api.RulesAPI;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@57660b27 (name: v)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class VoteTruePattern extends GraphTransformationPattern<VoteTrueMatch, VoteTruePattern> {
	private static String patternName = "voteTrue";

	/**
	 * Creates a new pattern voteTrue().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public VoteTruePattern(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public VoteTrueMatch convertMatch(final IMatch match) {
		return new VoteTrueMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("v");
		return names;
	}

	/**
	 * Binds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public VoteTruePattern bindV(final Voter1 object) {
		parameters.put("v", Objects.requireNonNull(object, "v must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public VoteTruePattern unbindV() {
		parameters.remove("v");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	v --> " + parameters.get("v") + System.lineSeparator();
		s += "}";
		return s;
	}
}
