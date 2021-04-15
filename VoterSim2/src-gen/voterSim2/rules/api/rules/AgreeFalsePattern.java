package voterSim2.rules.api.rules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import Voter.Voter1;
import voterSim2.rules.api.matches.AgreeFalseMatch;
import voterSim2.rules.api.RulesAPI;

/**
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@5e89d268 (name: v1), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@289b1057 (name: v2)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class AgreeFalsePattern extends GraphTransformationPattern<AgreeFalseMatch, AgreeFalsePattern> {
	private static String patternName = "agreeFalse";

	/**
	 * Creates a new pattern agreeFalse().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public AgreeFalsePattern(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public AgreeFalseMatch convertMatch(final IMatch match) {
		return new AgreeFalseMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("v1");
		names.add("v2");
		return names;
	}

	/**
	 * Binds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AgreeFalsePattern bindV1(final Voter1 object) {
		parameters.put("v1", Objects.requireNonNull(object, "v1 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AgreeFalsePattern unbindV1() {
		parameters.remove("v1");
		return this;
	}

	/**
	 * Binds the node v2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AgreeFalsePattern bindV2(final Voter1 object) {
		parameters.put("v2", Objects.requireNonNull(object, "v2 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public AgreeFalsePattern unbindV2() {
		parameters.remove("v2");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	v1 --> " + parameters.get("v1") + System.lineSeparator();
		s += "	v2 --> " + parameters.get("v2") + System.lineSeparator();
		s += "}";
		return s;
	}
}
