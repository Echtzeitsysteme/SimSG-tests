/**
 */
package Voter2GroupVoters;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import runtime.RuntimePackage;

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
 * @see Voter2GroupVoters.Voter2GroupVotersFactory
 * @model kind="package"
 * @generated
 */
public interface Voter2GroupVotersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Voter2GroupVoters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Voter2GroupVoters/model/Voter2GroupVoters.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Voter2GroupVoters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Voter2GroupVotersPackage eINSTANCE = Voter2GroupVoters.impl.Voter2GroupVotersPackageImpl.init();

	/**
	 * The meta object id for the '{@link Voter2GroupVoters.impl.Container2GroupVotersContainerImpl <em>Container2 Group Voters Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Voter2GroupVoters.impl.Container2GroupVotersContainerImpl
	 * @see Voter2GroupVoters.impl.Voter2GroupVotersPackageImpl#getContainer2GroupVotersContainer()
	 * @generated
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Container2 Group Voters Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container2 Group Voters Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Voter2GroupVoters.impl.Container2GroupVotersContainer__MarkerImpl <em>Container2 Group Voters Container Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Voter2GroupVoters.impl.Container2GroupVotersContainer__MarkerImpl
	 * @see Voter2GroupVoters.impl.Voter2GroupVotersPackageImpl#getContainer2GroupVotersContainer__Marker()
	 * @generated
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC c</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE TRG gvc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE CORR c2gvc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container2 Group Voters Container Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Container2 Group Voters Container Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Voter2GroupVoters.Container2GroupVotersContainer <em>Container2 Group Voters Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container2 Group Voters Container</em>'.
	 * @see Voter2GroupVoters.Container2GroupVotersContainer
	 * @generated
	 */
	EClass getContainer2GroupVotersContainer();

	/**
	 * Returns the meta object for the reference '{@link Voter2GroupVoters.Container2GroupVotersContainer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Voter2GroupVoters.Container2GroupVotersContainer#getSource()
	 * @see #getContainer2GroupVotersContainer()
	 * @generated
	 */
	EReference getContainer2GroupVotersContainer_Source();

	/**
	 * Returns the meta object for the reference '{@link Voter2GroupVoters.Container2GroupVotersContainer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Voter2GroupVoters.Container2GroupVotersContainer#getTarget()
	 * @see #getContainer2GroupVotersContainer()
	 * @generated
	 */
	EReference getContainer2GroupVotersContainer_Target();

	/**
	 * Returns the meta object for class '{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker <em>Container2 Group Voters Container Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container2 Group Voters Container Marker</em>'.
	 * @see Voter2GroupVoters.Container2GroupVotersContainer__Marker
	 * @generated
	 */
	EClass getContainer2GroupVotersContainer__Marker();

	/**
	 * Returns the meta object for the reference '{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__SRC__c <em>CREATE SRC c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC c</em>'.
	 * @see Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__SRC__c()
	 * @see #getContainer2GroupVotersContainer__Marker()
	 * @generated
	 */
	EReference getContainer2GroupVotersContainer__Marker_CREATE__SRC__c();

	/**
	 * Returns the meta object for the reference '{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__TRG__gvc <em>CREATE TRG gvc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG gvc</em>'.
	 * @see Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__TRG__gvc()
	 * @see #getContainer2GroupVotersContainer__Marker()
	 * @generated
	 */
	EReference getContainer2GroupVotersContainer__Marker_CREATE__TRG__gvc();

	/**
	 * Returns the meta object for the reference '{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__CORR__c2gvc <em>CREATE CORR c2gvc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR c2gvc</em>'.
	 * @see Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__CORR__c2gvc()
	 * @see #getContainer2GroupVotersContainer__Marker()
	 * @generated
	 */
	EReference getContainer2GroupVotersContainer__Marker_CREATE__CORR__c2gvc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Voter2GroupVotersFactory getVoter2GroupVotersFactory();

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
		 * The meta object literal for the '{@link Voter2GroupVoters.impl.Container2GroupVotersContainerImpl <em>Container2 Group Voters Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Voter2GroupVoters.impl.Container2GroupVotersContainerImpl
		 * @see Voter2GroupVoters.impl.Voter2GroupVotersPackageImpl#getContainer2GroupVotersContainer()
		 * @generated
		 */
		EClass CONTAINER2_GROUP_VOTERS_CONTAINER = eINSTANCE.getContainer2GroupVotersContainer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE = eINSTANCE.getContainer2GroupVotersContainer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET = eINSTANCE.getContainer2GroupVotersContainer_Target();

		/**
		 * The meta object literal for the '{@link Voter2GroupVoters.impl.Container2GroupVotersContainer__MarkerImpl <em>Container2 Group Voters Container Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Voter2GroupVoters.impl.Container2GroupVotersContainer__MarkerImpl
		 * @see Voter2GroupVoters.impl.Voter2GroupVotersPackageImpl#getContainer2GroupVotersContainer__Marker()
		 * @generated
		 */
		EClass CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER = eINSTANCE.getContainer2GroupVotersContainer__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC c</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C = eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__SRC__c();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG gvc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC = eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__TRG__gvc();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR c2gvc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC = eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__CORR__c2gvc();

	}

} //Voter2GroupVotersPackage
