package groupVotersSim.rules.api.rules;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersSim.rules.api.matches.SwitchSameMatch;
import groupVotersSim.rules.api.RulesAPI;
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

/**
 * The rule <code>switchSame()</code> which does the following:
 * switch group away from conflicting voter to voter with same vote
 */
@SuppressWarnings("unused")
public class SwitchSameRule extends GraphTransformationRule<SwitchSameMatch, SwitchSameRule> {
	private static String patternName = "switchSame";

	/**
	 * Creates a new rule switchSame().
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

	public SwitchSameRule(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName, Optional.of(new StaticProbability<SwitchSameMatch, SwitchSameRule>(interpreter, 0.05, 0.0, IBeXDistributionType.STATIC, OptionalDouble.empty())));
	}

	@Override
	public SwitchSameMatch convertMatch(final IMatch match) {
		return new SwitchSameMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("g1");
		names.add("g2");
		names.add("v1");
		names.add("v2");
		names.add("v3");
		return names;
	}

	/**
	 * Binds the node g1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule bindG1(final Group object) {
		parameters.put("g1", Objects.requireNonNull(object, "g1 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node g1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule unbindG1() {
		parameters.remove("g1");
		return this;
	}

	/**
	 * Binds the node g2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule bindG2(final Group object) {
		parameters.put("g2", Objects.requireNonNull(object, "g2 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node g2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule unbindG2() {
		parameters.remove("g2");
		return this;
	}

	/**
	 * Binds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule bindV1(final Voter1 object) {
		parameters.put("v1", Objects.requireNonNull(object, "v1 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule unbindV1() {
		parameters.remove("v1");
		return this;
	}

	/**
	 * Binds the node v2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule bindV2(final Voter1 object) {
		parameters.put("v2", Objects.requireNonNull(object, "v2 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule unbindV2() {
		parameters.remove("v2");
		return this;
	}

	/**
	 * Binds the node v3 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule bindV3(final Voter1 object) {
		parameters.put("v3", Objects.requireNonNull(object, "v3 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v3 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public SwitchSameRule unbindV3() {
		parameters.remove("v3");
		return this;
	}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	g1 --> " + parameters.get("g1") + System.lineSeparator();
		s += "	g2 --> " + parameters.get("g2") + System.lineSeparator();
		s += "	v1 --> " + parameters.get("v1") + System.lineSeparator();
		s += "	v2 --> " + parameters.get("v2") + System.lineSeparator();
		s += "	v3 --> " + parameters.get("v3") + System.lineSeparator();
		s += "}";
		return s;
	}
}
