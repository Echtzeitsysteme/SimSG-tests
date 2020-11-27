/**
 */
package Voter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Voter.VoterFactory
 * @model kind="package"
 * @generated
 */
public interface VoterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Voter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Voter/model/Voter.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Voter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VoterPackage eINSTANCE = Voter.impl.VoterPackageImpl.init();

	/**
	 * The meta object id for the '{@link Voter.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Voter.impl.ContainerImpl
	 * @see Voter.impl.VoterPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Voters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOTERS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Voter.impl.Voter1Impl <em>Voter1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Voter.impl.Voter1Impl
	 * @see Voter.impl.VoterPackageImpl#getVoter1()
	 * @generated
	 */
	int VOTER1 = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER1__LINK = 0;

	/**
	 * The feature id for the '<em><b>Vote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER1__VOTE = 1;

	/**
	 * The number of structural features of the '<em>Voter1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Voter1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER1_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link Voter.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see Voter.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link Voter.Container#getVoters <em>Voters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voters</em>'.
	 * @see Voter.Container#getVoters()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Voters();

	/**
	 * Returns the meta object for class '{@link Voter.Voter1 <em>Voter1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voter1</em>'.
	 * @see Voter.Voter1
	 * @generated
	 */
	EClass getVoter1();

	/**
	 * Returns the meta object for the reference list '{@link Voter.Voter1#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see Voter.Voter1#getLink()
	 * @see #getVoter1()
	 * @generated
	 */
	EReference getVoter1_Link();

	/**
	 * Returns the meta object for the attribute '{@link Voter.Voter1#isVote <em>Vote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vote</em>'.
	 * @see Voter.Voter1#isVote()
	 * @see #getVoter1()
	 * @generated
	 */
	EAttribute getVoter1_Vote();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VoterFactory getVoterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Voter.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Voter.impl.ContainerImpl
		 * @see Voter.impl.VoterPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Voters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__VOTERS = eINSTANCE.getContainer_Voters();

		/**
		 * The meta object literal for the '{@link Voter.impl.Voter1Impl <em>Voter1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Voter.impl.Voter1Impl
		 * @see Voter.impl.VoterPackageImpl#getVoter1()
		 * @generated
		 */
		EClass VOTER1 = eINSTANCE.getVoter1();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTER1__LINK = eINSTANCE.getVoter1_Link();

		/**
		 * The meta object literal for the '<em><b>Vote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTER1__VOTE = eINSTANCE.getVoter1_Vote();

	}

} //VoterPackage
