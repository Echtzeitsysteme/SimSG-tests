package groupVotersSim.rules.api.rules;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersSim.rules.api.matches.V1InG2Match;
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
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@1745da48 (name: g2), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@220104db (name: v1)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class V1InG2Pattern extends GraphTransformationPattern<V1InG2Match, V1InG2Pattern> {
	private static String patternName = "v1InG2";

	/**
	 * Creates a new pattern v1InG2().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public V1InG2Pattern(final RulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public V1InG2Match convertMatch(final IMatch match) {
		return new V1InG2Match(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("g2");
		names.add("v1");
		return names;
	}

	/**
	 * Binds the node g2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public V1InG2Pattern bindG2(final Group object) {
		parameters.put("g2", Objects.requireNonNull(object, "g2 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node g2 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public V1InG2Pattern unbindG2() {
		parameters.remove("g2");
		return this;
	}

	/**
	 * Binds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public V1InG2Pattern bindV1(final Voter1 object) {
		parameters.put("v1", Objects.requireNonNull(object, "v1 must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node v1 to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public V1InG2Pattern unbindV1() {
		parameters.remove("v1");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + System.lineSeparator();
		s += "	g2 --> " + parameters.get("g2") + System.lineSeparator();
		s += "	v1 --> " + parameters.get("v1") + System.lineSeparator();
		s += "}";
		return s;
	}
}
