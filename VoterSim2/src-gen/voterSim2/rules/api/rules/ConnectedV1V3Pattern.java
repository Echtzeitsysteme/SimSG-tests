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
import voterSim2.rules.api.matches.ConnectedV1V3Match;
import voterSim2.rules.api.RulesAPI;

/**
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@2b6a451a (name: v1), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@65411ca1 (name: v3)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class ConnectedV1V3Pattern extends GraphTransformationPattern<ConnectedV1V3Match, ConnectedV1V3Pattern> {
	private static String patternName = "connectedV1V3";

	/**
	 * Creates a new pattern connectedV1V3().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public ConnectedV1V3Pattern(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public ConnectedV1V3Match convertMatch(final IMatch match) {
		return new ConnectedV1V3Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("v1");
		names.add("v3");
		return names;
	}

	/**
	 * Binds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConnectedV1V3Pattern bindV1(final Voter1 object) {
		parameters.put("v1", Objects.requireNonNull(object, "v1 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConnectedV1V3Pattern unbindV1() {
		parameters.remove("v1");
		return this;
	}

	/**
	 * Binds the node v3 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConnectedV1V3Pattern bindV3(final Voter1 object) {
		parameters.put("v3", Objects.requireNonNull(object, "v3 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v3 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConnectedV1V3Pattern unbindV3() {
		parameters.remove("v3");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	v1 --> " + parameters.get("v1") + System.lineSeparator();
		s += "	v3 --> " + parameters.get("v3") + System.lineSeparator();
		s += "}";
		return s;
	}
}
