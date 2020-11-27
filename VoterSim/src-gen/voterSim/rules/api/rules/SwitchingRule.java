package voterSim.rules.api.rules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationRule;
import org.emoflon.ibex.gt.arithmetic.Probability;
import org.emoflon.ibex.gt.arithmetic.StaticProbability;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXDistributionType;
import Voter.Voter1;
import voterSim.rules.api.matches.SwitchingMatch;
import voterSim.rules.api.RulesAPI;

/**
 * The rule <code>switching()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class SwitchingRule extends GraphTransformationRule<SwitchingMatch, SwitchingRule> {
	private static String patternName = "switching";

	/**
	 * Creates a new rule switching().
	 * 
	 * @param api
	 *            the API the rule belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	 
	/**
	 * The probability that the rule will be applied; if the rule has no probability,
	 * then the Optional will be empty
	 */

	public SwitchingRule(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName, Optional.of(new StaticProbability<SwitchingMatch, SwitchingRule>(interpreter, 0.5, 0.0, IBeXDistributionType.STATIC, OptionalDouble.empty())));
	}

	@Override
	public SwitchingMatch convertMatch(final IMatch match) {
		return new SwitchingMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("v1");
		names.add("v2");
		names.add("v3");
		return names;
	}

	/**
	 * Binds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchingRule bindV1(final Voter1 object) {
		parameters.put("v1", Objects.requireNonNull(object, "v1 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchingRule unbindV1() {
		parameters.remove("v1");
		return this;
	}

	/**
	 * Binds the node v2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchingRule bindV2(final Voter1 object) {
		parameters.put("v2", Objects.requireNonNull(object, "v2 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchingRule unbindV2() {
		parameters.remove("v2");
		return this;
	}

	/**
	 * Binds the node v3 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchingRule bindV3(final Voter1 object) {
		parameters.put("v3", Objects.requireNonNull(object, "v3 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v3 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchingRule unbindV3() {
		parameters.remove("v3");
		return this;
	}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	v1 --> " + parameters.get("v1") + System.lineSeparator();
		s += "	v2 --> " + parameters.get("v2") + System.lineSeparator();
		s += "	v3 --> " + parameters.get("v3") + System.lineSeparator();
		s += "}";
		return s;
	}
}
