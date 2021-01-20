package groupVotersGen.rules.api.rules;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersGen.rules.api.matches.ConnectedVGMatch;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@7b348fc6 (name: g), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@574ade24 (name: v)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class ConnectedVGPattern extends GraphTransformationPattern<ConnectedVGMatch, ConnectedVGPattern> {
	private static String patternName = "connectedVG";

	/**
	 * Creates a new pattern connectedVG().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public ConnectedVGPattern(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public ConnectedVGMatch convertMatch(final IMatch match) {
		return new ConnectedVGMatch(this, match);
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
	public ConnectedVGPattern bindG(final Group object) {
		parameters.put("g", Objects.requireNonNull(object, "g must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node g to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConnectedVGPattern unbindG() {
		parameters.remove("g");
		return this;
	}

	/**
	 * Binds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConnectedVGPattern bindV(final Voter1 object) {
		parameters.put("v", Objects.requireNonNull(object, "v must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public ConnectedVGPattern unbindV() {
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
