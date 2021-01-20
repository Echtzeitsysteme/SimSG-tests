/**
 */
package GroupVoters;

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
 *   <li>{@link GroupVoters.GroupVotersContainer#getVoter <em>Voter</em>}</li>
 *   <li>{@link GroupVoters.GroupVotersContainer#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see GroupVoters.GroupVotersPackage#getGroupVotersContainer()
 * @model
 * @generated
 */
public interface GroupVotersContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Voter</b></em>' containment reference list.
	 * The list contents are of type {@link GroupVoters.Voter1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voter</em>' containment reference list.
	 * @see GroupVoters.GroupVotersPackage#getGroupVotersContainer_Voter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Voter1> getVoter();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link GroupVoters.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see GroupVoters.GroupVotersPackage#getGroupVotersContainer_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

} // GroupVotersContainer
