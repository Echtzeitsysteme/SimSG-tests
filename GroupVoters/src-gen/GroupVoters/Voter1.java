/**
 */
package GroupVoters;

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
 *   <li>{@link GroupVoters.Voter1#getMember <em>Member</em>}</li>
 *   <li>{@link GroupVoters.Voter1#isVote <em>Vote</em>}</li>
 * </ul>
 *
 * @see GroupVoters.GroupVotersPackage#getVoter1()
 * @model
 * @generated
 */
public interface Voter1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link GroupVoters.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see GroupVoters.GroupVotersPackage#getVoter1_Member()
	 * @model
	 * @generated
	 */
	EList<Group> getMember();

	/**
	 * Returns the value of the '<em><b>Vote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vote</em>' attribute.
	 * @see #setVote(boolean)
	 * @see GroupVoters.GroupVotersPackage#getVoter1_Vote()
	 * @model
	 * @generated
	 */
	boolean isVote();

	/**
	 * Sets the value of the '{@link GroupVoters.Voter1#isVote <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vote</em>' attribute.
	 * @see #isVote()
	 * @generated
	 */
	void setVote(boolean value);

} // Voter1
