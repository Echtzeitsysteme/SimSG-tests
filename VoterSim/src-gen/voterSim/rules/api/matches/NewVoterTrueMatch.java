package voterSim.rules.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Voter.Voter1;
import voterSim.rules.api.rules.NewVoterTrueRule;

/**
 * A match for the rule <code>newVoterTrue()</code>.
 */
public class NewVoterTrueMatch extends GraphTransformationMatch<NewVoterTrueMatch, NewVoterTrueRule> {
	private Voter1 varV0;
	private Voter1 varV1;
	private Voter1 varV2;
	private Voter1 varV;

	/**
	 * Creates a new match for the rule <code>newVoterTrue()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public NewVoterTrueMatch(final NewVoterTrueRule pattern, final IMatch match) {
		super(pattern, match);
		varV0 = (Voter1) match.get("v0");
		varV1 = (Voter1) match.get("v1");
		varV2 = (Voter1) match.get("v2");
		varV = (Voter1) match.get("v");
	}

	/**
	 * Returns the v0.
	 *
	 * @return the v0
	 */
	public Voter1 getV0() {
		return varV0;
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
	 * Returns the v.
	 *
	 * @return the v
	 */
	public Voter1 getV() {
		return varV;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	v0 --> " + varV0 + System.lineSeparator();
		s += "	v1 --> " + varV1 + System.lineSeparator();
		s += "	v2 --> " + varV2 + System.lineSeparator();
		s += "	v --> " + varV + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
