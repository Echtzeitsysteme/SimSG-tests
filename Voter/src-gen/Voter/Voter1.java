/**
 */
package Voter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voter1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Voter.Voter1#getLink <em>Link</em>}</li>
 *   <li>{@link Voter.Voter1#isVote <em>Vote</em>}</li>
 * </ul>
 *
 * @see Voter.VoterPackage#getVoter1()
 * @model
 * @generated
 */
public interface Voter1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link Voter.Voter1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see Voter.VoterPackage#getVoter1_Link()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Voter1> getLink();

	/**
	 * Returns the value of the '<em><b>Vote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vote</em>' attribute.
	 * @see #setVote(boolean)
	 * @see Voter.VoterPackage#getVoter1_Vote()
	 * @model
	 * @generated
	 */
	boolean isVote();

	/**
	 * Sets the value of the '{@link Voter.Voter1#isVote <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vote</em>' attribute.
	 * @see #isVote()
	 * @generated
	 */
	void setVote(boolean value);

} // Voter1
