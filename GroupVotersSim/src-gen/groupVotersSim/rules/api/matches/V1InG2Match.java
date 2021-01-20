package groupVotersSim.rules.api.matches;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersSim.rules.api.rules.V1InG2Pattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>v1InG2()</code>.
 */
public class V1InG2Match extends GraphTransformationMatch<V1InG2Match, V1InG2Pattern> {
	private Group varG2;
	private Voter1 varV1;

	/**
	 * Creates a new match for the pattern <code>v1InG2()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public V1InG2Match(final V1InG2Pattern pattern, final IMatch match) {
		super(pattern, match);
		varG2 = (Group) match.get("g2");
		varV1 = (Voter1) match.get("v1");
	}

	/**
	 * Returns the g2.
	 *
	 * @return the g2
	 */
	public Group getG2() {
		return varG2;
	}

	/**
	 * Returns the v1.
	 *
	 * @return the v1
	 */
	public Voter1 getV1() {
		return varV1;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	g2 --> " + varG2 + System.lineSeparator();
		s += "	v1 --> " + varV1 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
