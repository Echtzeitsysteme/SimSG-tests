/**
 */
package Voter2GroupVoters.impl;

import GroupVoters.GroupVotersPackage;

import Voter.VoterPackage;

import Voter2GroupVoters.Container2GroupVotersContainer;
import Voter2GroupVoters.Container2GroupVotersContainer__Marker;
import Voter2GroupVoters.Voter2GroupVotersFactory;
import Voter2GroupVoters.Voter2GroupVotersPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Voter2GroupVotersPackageImpl extends EPackageImpl implements Voter2GroupVotersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass container2GroupVotersContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass container2GroupVotersContainer__MarkerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Voter2GroupVotersPackageImpl() {
		super(eNS_URI, Voter2GroupVotersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Voter2GroupVotersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Voter2GroupVotersPackage init() {
		if (isInited) return (Voter2GroupVotersPackage)EPackage.Registry.INSTANCE.getEPackage(Voter2GroupVotersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVoter2GroupVotersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Voter2GroupVotersPackageImpl theVoter2GroupVotersPackage = registeredVoter2GroupVotersPackage instanceof Voter2GroupVotersPackageImpl ? (Voter2GroupVotersPackageImpl)registeredVoter2GroupVotersPackage : new Voter2GroupVotersPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GroupVotersPackage.eINSTANCE.eClass();
		VoterPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVoter2GroupVotersPackage.createPackageContents();

		// Initialize created meta-data
		theVoter2GroupVotersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVoter2GroupVotersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Voter2GroupVotersPackage.eNS_URI, theVoter2GroupVotersPackage);
		return theVoter2GroupVotersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer2GroupVotersContainer() {
		return container2GroupVotersContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer2GroupVotersContainer_Source() {
		return (EReference)container2GroupVotersContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer2GroupVotersContainer_Target() {
		return (EReference)container2GroupVotersContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer2GroupVotersContainer__Marker() {
		return container2GroupVotersContainer__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer2GroupVotersContainer__Marker_CREATE__SRC__c() {
		return (EReference)container2GroupVotersContainer__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer2GroupVotersContainer__Marker_CREATE__TRG__gvc() {
		return (EReference)container2GroupVotersContainer__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer2GroupVotersContainer__Marker_CREATE__CORR__c2gvc() {
		return (EReference)container2GroupVotersContainer__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVotersFactory getVoter2GroupVotersFactory() {
		return (Voter2GroupVotersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		container2GroupVotersContainerEClass = createEClass(CONTAINER2_GROUP_VOTERS_CONTAINER);
		createEReference(container2GroupVotersContainerEClass, CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE);
		createEReference(container2GroupVotersContainerEClass, CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET);

		container2GroupVotersContainer__MarkerEClass = createEClass(CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER);
		createEReference(container2GroupVotersContainer__MarkerEClass, CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C);
		createEReference(container2GroupVotersContainer__MarkerEClass, CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC);
		createEReference(container2GroupVotersContainer__MarkerEClass, CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VoterPackage theVoterPackage = (VoterPackage)EPackage.Registry.INSTANCE.getEPackage(VoterPackage.eNS_URI);
		GroupVotersPackage theGroupVotersPackage = (GroupVotersPackage)EPackage.Registry.INSTANCE.getEPackage(GroupVotersPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		container2GroupVotersContainer__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(container2GroupVotersContainerEClass, Container2GroupVotersContainer.class, "Container2GroupVotersContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer2GroupVotersContainer_Source(), theVoterPackage.getContainer(), null, "source", null, 0, 1, Container2GroupVotersContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer2GroupVotersContainer_Target(), theGroupVotersPackage.getGroupVotersContainer(), null, "target", null, 0, 1, Container2GroupVotersContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(container2GroupVotersContainer__MarkerEClass, Container2GroupVotersContainer__Marker.class, "Container2GroupVotersContainer__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer2GroupVotersContainer__Marker_CREATE__SRC__c(), theVoterPackage.getContainer(), null, "CREATE__SRC__c", null, 1, 1, Container2GroupVotersContainer__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer2GroupVotersContainer__Marker_CREATE__TRG__gvc(), theGroupVotersPackage.getGroupVotersContainer(), null, "CREATE__TRG__gvc", null, 1, 1, Container2GroupVotersContainer__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer2GroupVotersContainer__Marker_CREATE__CORR__c2gvc(), this.getContainer2GroupVotersContainer(), null, "CREATE__CORR__c2gvc", null, 1, 1, Container2GroupVotersContainer__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Voter2GroupVotersPackageImpl
