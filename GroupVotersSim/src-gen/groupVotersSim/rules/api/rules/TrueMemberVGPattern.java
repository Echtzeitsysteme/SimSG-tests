package groupVotersSim.rules.api.rules;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersSim.rules.api.matches.TrueMemberVGMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@28a8d2fb (name: g), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@64319710 (name: v1)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class TrueMemberVGPattern extends GraphTransformationPattern<TrueMemberVGMatch, TrueMemberVGPattern> {
	private static String patternName = "trueMemberVG";

	/**
	 * Creates a new pattern trueMemberVG().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public TrueMemberVGPattern(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public TrueMemberVGMatch convertMatch(final IMatch match) {
		return new TrueMemberVGMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("g");
		names.add("v1");
		return names;
	}

	/**
	 * Binds the node g to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TrueMemberVGPattern bindG(final Group object) {
		parameters.put("g", Objects.requireNonNull(object, "g must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node g to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TrueMemberVGPattern unbindG() {
		parameters.remove("g");
		return this;
	}

	/**
	 * Binds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TrueMemberVGPattern bindV1(final Voter1 object) {
		parameters.put("v1", Objects.requireNonNull(object, "v1 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public TrueMemberVGPattern unbindV1() {
		parameters.remove("v1");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	g --> " + parameters.get("g") + System.lineSeparator();
		s += "	v1 --> " + parameters.get("v1") + System.lineSeparator();
		s += "}";
		return s;
	}
}