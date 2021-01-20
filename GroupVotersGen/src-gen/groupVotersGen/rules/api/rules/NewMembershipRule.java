package groupVotersGen.rules.api.rules;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersGen.rules.api.matches.NewMembershipMatch;
import groupVotersGen.rules.api.RulesAPI;
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
 * The rule <code>newMembership()</code> which does the following:
 * If this rule is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class NewMembershipRule extends GraphTransformationRule<NewMembershipMatch, NewMembershipRule> {
	private static String patternName = "newMembership";

	/**
	 * Creates a new rule newMembership().
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

	public NewMembershipRule(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName, Optional.of(new StaticProbability<NewMembershipMatch, NewMembershipRule>(interpreter, 1.0, 0.0, IBeXDistributionType.STATIC, OptionalDouble.empty())));
	}

	@Override
	public NewMembershipMatch convertMatch(final IMatch match) {
		return new NewMembershipMatch(this, match);
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
	public NewMembershipRule bindG(final Group object) {
		parameters.put("g", Objects.requireNonNull(object, "g must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node g to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public NewMembershipRule unbindG() {
		parameters.remove("g");
		return this;
	}

	/**
	 * Binds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public NewMembershipRule bindV(final Voter1 object) {
		parameters.put("v", Objects.requireNonNull(object, "v must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public NewMembershipRule unbindV() {
		parameters.remove("v");
		return this;
	}
	@Override
	public String toString() {
		String s = "rule " + patternName + " {" + System.lineSeparator();
		s += "	g --> " + parameters.get("g") + System.lineSeparator();
		s += "	v --> " + parameters.get("v") + System.lineSeparator();
		s += "}";
		return s;
	}
}
