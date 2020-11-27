package voterSim.rules.api.matches;

import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import Voter.Voter1;
import voterSim.rules.api.rules.ConnectedV1V3Pattern;

/**
 * A match for the pattern <code>connectedV1V3()</code>.
 */
public class ConnectedV1V3Match extends GraphTransformationMatch<ConnectedV1V3Match, ConnectedV1V3Pattern> {
	private Voter1 varV1;
	private Voter1 varV3;

	/**
	 * Creates a new match for the pattern <code>connectedV1V3()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConnectedV1V3Match(final ConnectedV1V3Pattern pattern, final IMatch match) {
		super(pattern, match);
		varV1 = (Voter1) match.get("v1");
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
		s += "	v3 --> " + varV3 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
