package voterSim2.rules.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Voter.Voter1;
import voterSim2.rules.api.rules.ConvertRule;

/**
 * A match for the rule <code>convert()</code>.
 */
public class ConvertMatch extends GraphTransformationMatch<ConvertMatch, ConvertRule> {
	private Voter1 varV1;
	private Voter1 varV2;

	/**
	 * Creates a new match for the rule <code>convert()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConvertMatch(final ConvertRule pattern, final IMatch match) {
		super(pattern, match);
		varV1 = (Voter1) match.get("v1");
		varV2 = (Voter1) match.get("v2");
	}

	/**
	 * Returns the v1.
	 *
	 * @return the v1
	 */
	public Voter1 getV1() {
		return varV1;
	}

	/**
	 * Returns the v2.
	 *
	 * @return the v2
	 */
	public Voter1 getV2() {
		return varV2;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	v1 --> " + varV1 + System.lineSeparator();
		s += "	v2 --> " + varV2 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
