/**
 */
package Voter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Voter.Container#getVoters <em>Voters</em>}</li>
 * </ul>
 *
 * @see Voter.VoterPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Voters</b></em>' containment reference list.
	 * The list contents are of type {@link Voter.Voter1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voters</em>' containment reference list.
	 * @see Voter.VoterPackage#getContainer_Voters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Voter1> getVoters();

} // Container
