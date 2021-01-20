/**
 */
package Voter2GroupVoters;

import GroupVoters.GroupVotersContainer;

import Voter.Container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container2 Group Voters Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.Container2GroupVotersContainer#getSource <em>Source</em>}</li>
 *   <li>{@link Voter2GroupVoters.Container2GroupVotersContainer#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getContainer2GroupVotersContainer()
 * @model
 * @generated
 */
public interface Container2GroupVotersContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Container)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getContainer2GroupVotersContainer_Source()
	 * @model
	 * @generated
	 */
	Container getSource();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Container2GroupVotersContainer#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Container value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(GroupVotersContainer)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getContainer2GroupVotersContainer_Target()
	 * @model
	 * @generated
	 */
	GroupVotersContainer getTarget();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Container2GroupVotersContainer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GroupVotersContainer value);

} // Container2GroupVotersContainer
