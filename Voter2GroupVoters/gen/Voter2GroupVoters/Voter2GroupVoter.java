/**
 */
package Voter2GroupVoters;

import Voter.Voter1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voter2 Group Voter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.Voter2GroupVoter#getSource <em>Source</em>}</li>
 *   <li>{@link Voter2GroupVoters.Voter2GroupVoter#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter()
 * @model
 * @generated
 */
public interface Voter2GroupVoter extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Voter1)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter_Source()
	 * @model
	 * @generated
	 */
	Voter1 getSource();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Voter2GroupVoter#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Voter1 value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(GroupVoters.Voter1)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter_Target()
	 * @model
	 * @generated
	 */
	GroupVoters.Voter1 getTarget();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Voter2GroupVoter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GroupVoters.Voter1 value);

} // Voter2GroupVoter
