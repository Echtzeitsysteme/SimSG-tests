package groupVotersGen.rules.api.rules;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersGen.rules.api.matches.FalseMemberVGMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@4a990051 (name: g), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@e952fca (name: v)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FalseMemberVGPattern extends GraphTransformationPattern<FalseMemberVGMatch, FalseMemberVGPattern> {
	private static String patternName = "falseMemberVG";

	/**
	 * Creates a new pattern falseMemberVG().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FalseMemberVGPattern(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FalseMemberVGMatch convertMatch(final IMatch match) {
		return new FalseMemberVGMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("g");
		names.add("v");
		return names;
	}

	/**
	 * Binds the node g to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FalseMemberVGPattern bindG(final Group object) {
		parameters.put("g", Objects.requireNonNull(object, "g must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node g to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FalseMemberVGPattern unbindG() {
		parameters.remove("g");
		return this;
	}

	/**
	 * Binds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FalseMemberVGPattern bindV(final Voter1 object) {
		parameters.put("v", Objects.requireNonNull(object, "v must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FalseMemberVGPattern unbindV() {
		parameters.remove("v");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	g --> " + parameters.get("g") + System.lineSeparator();
		s += "	v --> " + parameters.get("v") + System.lineSeparator();
		s += "}";
		return s;
	}
}
