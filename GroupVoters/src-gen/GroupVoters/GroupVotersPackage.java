/**
 */
package GroupVoters;

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
 * @see GroupVoters.GroupVotersFactory
 * @model kind="package"
 * @generated
 */
public interface GroupVotersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GroupVoters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/GroupVoters/model/GroupVoters.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GroupVoters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupVotersPackage eINSTANCE = GroupVoters.impl.GroupVotersPackageImpl.init();

	/**
	 * The meta object id for the '{@link GroupVoters.impl.GroupVotersContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GroupVoters.impl.GroupVotersContainerImpl
	 * @see GroupVoters.impl.GroupVotersPackageImpl#getGroupVotersContainer()
	 * @generated
	 */
	int GROUP_VOTERS_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Voter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_VOTERS_CONTAINER__VOTER = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_VOTERS_CONTAINER__GROUP = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_VOTERS_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_VOTERS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GroupVoters.impl.Voter1Impl <em>Voter1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GroupVoters.impl.Voter1Impl
	 * @see GroupVoters.impl.GroupVotersPackageImpl#getVoter1()
	 * @generated
	 */
	int VOTER1 = 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER1__MEMBER = 0;

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
	 * The meta object id for the '{@link GroupVoters.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GroupVoters.impl.GroupImpl
	 * @see GroupVoters.impl.GroupVotersPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link GroupVoters.GroupVotersContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see GroupVoters.GroupVotersContainer
	 * @generated
	 */
	EClass getGroupVotersContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link GroupVoters.GroupVotersContainer#getVoter <em>Voter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voter</em>'.
	 * @see GroupVoters.GroupVotersContainer#getVoter()
	 * @see #getGroupVotersContainer()
	 * @generated
	 */
	EReference getGroupVotersContainer_Voter();

	/**
	 * Returns the meta object for the containment reference list '{@link GroupVoters.GroupVotersContainer#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see GroupVoters.GroupVotersContainer#getGroup()
	 * @see #getGroupVotersContainer()
	 * @generated
	 */
	EReference getGroupVotersContainer_Group();

	/**
	 * Returns the meta object for class '{@link GroupVoters.Voter1 <em>Voter1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voter1</em>'.
	 * @see GroupVoters.Voter1
	 * @generated
	 */
	EClass getVoter1();

	/**
	 * Returns the meta object for the reference list '{@link GroupVoters.Voter1#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see GroupVoters.Voter1#getMember()
	 * @see #getVoter1()
	 * @generated
	 */
	EReference getVoter1_Member();

	/**
	 * Returns the meta object for the attribute '{@link GroupVoters.Voter1#isVote <em>Vote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vote</em>'.
	 * @see GroupVoters.Voter1#isVote()
	 * @see #getVoter1()
	 * @generated
	 */
	EAttribute getVoter1_Vote();

	/**
	 * Returns the meta object for class '{@link GroupVoters.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see GroupVoters.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroupVotersFactory getGroupVotersFactory();

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
		 * The meta object literal for the '{@link GroupVoters.impl.GroupVotersContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GroupVoters.impl.GroupVotersContainerImpl
		 * @see GroupVoters.impl.GroupVotersPackageImpl#getGroupVotersContainer()
		 * @generated
		 */
		EClass GROUP_VOTERS_CONTAINER = eINSTANCE.getGroupVotersContainer();

		/**
		 * The meta object literal for the '<em><b>Voter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_VOTERS_CONTAINER__VOTER = eINSTANCE.getGroupVotersContainer_Voter();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_VOTERS_CONTAINER__GROUP = eINSTANCE.getGroupVotersContainer_Group();

		/**
		 * The meta object literal for the '{@link GroupVoters.impl.Voter1Impl <em>Voter1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GroupVoters.impl.Voter1Impl
		 * @see GroupVoters.impl.GroupVotersPackageImpl#getVoter1()
		 * @generated
		 */
		EClass VOTER1 = eINSTANCE.getVoter1();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTER1__MEMBER = eINSTANCE.getVoter1_Member();

		/**
		 * The meta object literal for the '<em><b>Vote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTER1__VOTE = eINSTANCE.getVoter1_Vote();

		/**
		 * The meta object literal for the '{@link GroupVoters.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GroupVoters.impl.GroupImpl
		 * @see GroupVoters.impl.GroupVotersPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

	}

} //GroupVotersPackage
