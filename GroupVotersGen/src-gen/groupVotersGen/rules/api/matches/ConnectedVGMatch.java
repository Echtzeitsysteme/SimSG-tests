package groupVotersGen.rules.api.matches;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersGen.rules.api.rules.ConnectedVGPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>connectedVG()</code>.
 */
public class ConnectedVGMatch extends GraphTransformationMatch<ConnectedVGMatch, ConnectedVGPattern> {
	private Group varG;
	private Voter1 varV;

	/**
	 * Creates a new match for the pattern <code>connectedVG()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConnectedVGMatch(final ConnectedVGPattern pattern, final IMatch match) {
		super(pattern, match);
		varG = (Group) match.get("g");
		varV = (Voter1) match.get("v");
	}

	/**
	 * Returns the g.
	 *
	 * @return the g
	 */
	public Group getG() {
		return varG;
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
		s += "	g --> " + varG + System.lineSeparator();
		s += "	v --> " + varV + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
