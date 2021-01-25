/**
 */
package Voter2GroupVoters;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Voter2GroupVoters.Voter2GroupVotersPackage
 * @generated
 */
public interface Voter2GroupVotersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Voter2GroupVotersFactory eINSTANCE = Voter2GroupVoters.impl.Voter2GroupVotersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container2 Group Voters Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container2 Group Voters Container</em>'.
	 * @generated
	 */
	Container2GroupVotersContainer createContainer2GroupVotersContainer();

	/**
	 * Returns a new object of class '<em>Voter2 Group Voter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voter2 Group Voter</em>'.
	 * @generated
	 */
	Voter2GroupVoter createVoter2GroupVoter();

	/**
	 * Returns a new object of class '<em>Voter2 Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voter2 Group</em>'.
	 * @generated
	 */
	Voter2Group createVoter2Group();

	/**
	 * Returns a new object of class '<em>Container2 Group Voters Container Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container2 Group Voters Container Marker</em>'.
	 * @generated
	 */
	Container2GroupVotersContainer__Marker createContainer2GroupVotersContainer__Marker();

	/**
	 * Returns a new object of class '<em>Voter2 Group Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voter2 Group Marker</em>'.
	 * @generated
	 */
	Voter2Group__Marker createVoter2Group__Marker();

	/**
	 * Returns a new object of class '<em>Voter2 Group Voter Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voter2 Group Voter Marker</em>'.
	 * @generated
	 */
	Voter2GroupVoter__Marker createVoter2GroupVoter__Marker();

	/**
	 * Returns a new object of class '<em>Voter Relation2 Voter Group Relation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voter Relation2 Voter Group Relation Marker</em>'.
	 * @generated
	 */
	VoterRelation2VoterGroupRelation__Marker createVoterRelation2VoterGroupRelation__Marker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Voter2GroupVotersPackage getVoter2GroupVotersPackage();

} //Voter2GroupVotersFactory
