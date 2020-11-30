package voterSim2.rules.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Voter.Voter1;
import voterSim2.rules.api.rules.SwitchRandomRule;

/**
 * A match for the rule <code>switchRandom()</code>.
 */
public class SwitchRandomMatch extends GraphTransformationMatch<SwitchRandomMatch, SwitchRandomRule> {
	private Voter1 varV1;
	private Voter1 varV2;
	private Voter1 varV3;

	/**
	 * Creates a new match for the rule <code>switchRandom()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SwitchRandomMatch(final SwitchRandomRule pattern, final IMatch match) {
		super(pattern, match);
		varV1 = (Voter1) match.get("v1");
		varV2 = (Voter1) match.get("v2");
		varV3 = (Voter1) match.get("v3");
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

	/**
	 * Returns the v3.
	 *
	 * @return the v3
	 */
	public Voter1 getV3() {
		return varV3;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	v1 --> " + varV1 + System.lineSeparator();
		s += "	v2 --> " + varV2 + System.lineSeparator();
		s += "	v3 --> " + varV3 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
