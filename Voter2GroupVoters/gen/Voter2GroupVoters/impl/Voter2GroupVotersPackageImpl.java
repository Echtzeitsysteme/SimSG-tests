/**
 */
package Voter2GroupVoters.impl;

import GroupVoters.GroupVotersPackage;

import Voter.VoterPackage;

import Voter2GroupVoters.Container2GroupVotersContainer;
import Voter2GroupVoters.Container2GroupVotersContainer__Marker;
import Voter2GroupVoters.Voter2Group;
import Voter2GroupVoters.Voter2GroupVoter;
import Voter2GroupVoters.Voter2GroupVoter__Marker;
import Voter2GroupVoters.Voter2GroupVotersFactory;
import Voter2GroupVoters.Voter2GroupVotersPackage;
import Voter2GroupVoters.Voter2Group__Marker;
import Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker;

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
	private EClass voter2GroupVoterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voter2GroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass container2GroupVotersContainer__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voter2Group__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voter2GroupVoter__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voterRelation2VoterGroupRelation__MarkerEClass = null;

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
		RuntimePackage.eINSTANCE.eClass();
		VoterPackage.eINSTANCE.eClass();

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
	public EClass getVoter2GroupVoter() {
		return voter2GroupVoterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2GroupVoter_Source() {
		return (EReference)voter2GroupVoterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2GroupVoter_Target() {
		return (EReference)voter2GroupVoterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoter2Group() {
		return voter2GroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group_Source() {
		return (EReference)voter2GroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group_Target() {
		return (EReference)voter2GroupEClass.getEStructuralFeatures().get(1);
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
	public EClass getVoter2Group__Marker() {
		return voter2Group__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CONTEXT__SRC__v() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CONTEXT__SRC__v2() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CONTEXT__TRG__gV() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CONTEXT__TRG__gV2() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CONTEXT__TRG__group() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CONTEXT__CORR__v2g1() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CREATE__CORR__v2g2() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CONTEXT__CORR__v2gv() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2Group__Marker_CONTEXT__CORR__v2gv2() {
		return (EReference)voter2Group__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoter2GroupVoter__Marker() {
		return voter2GroupVoter__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2GroupVoter__Marker_CONTEXT__SRC__c() {
		return (EReference)voter2GroupVoter__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2GroupVoter__Marker_CREATE__SRC__v() {
		return (EReference)voter2GroupVoter__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2GroupVoter__Marker_CREATE__TRG__gV() {
		return (EReference)voter2GroupVoter__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2GroupVoter__Marker_CONTEXT__TRG__gvc() {
		return (EReference)voter2GroupVoter__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2GroupVoter__Marker_CONTEXT__CORR__c2gvc() {
		return (EReference)voter2GroupVoter__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter2GroupVoter__Marker_CREATE__CORR__v2gv() {
		return (EReference)voter2GroupVoter__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoterRelation2VoterGroupRelation__Marker() {
		return voterRelation2VoterGroupRelation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v2() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV2() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CREATE__TRG__group() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g1() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g2() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv2() {
		return (EReference)voterRelation2VoterGroupRelation__MarkerEClass.getEStructuralFeatures().get(8);
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

		voter2GroupVoterEClass = createEClass(VOTER2_GROUP_VOTER);
		createEReference(voter2GroupVoterEClass, VOTER2_GROUP_VOTER__SOURCE);
		createEReference(voter2GroupVoterEClass, VOTER2_GROUP_VOTER__TARGET);

		voter2GroupEClass = createEClass(VOTER2_GROUP);
		createEReference(voter2GroupEClass, VOTER2_GROUP__SOURCE);
		createEReference(voter2GroupEClass, VOTER2_GROUP__TARGET);

		container2GroupVotersContainer__MarkerEClass = createEClass(CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER);
		createEReference(container2GroupVotersContainer__MarkerEClass, CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C);
		createEReference(container2GroupVotersContainer__MarkerEClass, CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC);
		createEReference(container2GroupVotersContainer__MarkerEClass, CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC);

		voter2Group__MarkerEClass = createEClass(VOTER2_GROUP_MARKER);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CONTEXT_SRC_V);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CONTEXT_SRC_V2);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CONTEXT_TRG_GV);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CONTEXT_TRG_GV2);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CONTEXT_TRG_GROUP);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CONTEXT_CORR_V2G1);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CREATE_CORR_V2G2);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CONTEXT_CORR_V2GV);
		createEReference(voter2Group__MarkerEClass, VOTER2_GROUP_MARKER__CONTEXT_CORR_V2GV2);

		voter2GroupVoter__MarkerEClass = createEClass(VOTER2_GROUP_VOTER_MARKER);
		createEReference(voter2GroupVoter__MarkerEClass, VOTER2_GROUP_VOTER_MARKER__CONTEXT_SRC_C);
		createEReference(voter2GroupVoter__MarkerEClass, VOTER2_GROUP_VOTER_MARKER__CREATE_SRC_V);
		createEReference(voter2GroupVoter__MarkerEClass, VOTER2_GROUP_VOTER_MARKER__CREATE_TRG_GV);
		createEReference(voter2GroupVoter__MarkerEClass, VOTER2_GROUP_VOTER_MARKER__CONTEXT_TRG_GVC);
		createEReference(voter2GroupVoter__MarkerEClass, VOTER2_GROUP_VOTER_MARKER__CONTEXT_CORR_C2GVC);
		createEReference(voter2GroupVoter__MarkerEClass, VOTER2_GROUP_VOTER_MARKER__CREATE_CORR_V2GV);

		voterRelation2VoterGroupRelation__MarkerEClass = createEClass(VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V2);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV2);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_TRG_GROUP);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G1);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G2);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV);
		createEReference(voterRelation2VoterGroupRelation__MarkerEClass, VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV2);
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
		voter2Group__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		voter2GroupVoter__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		voterRelation2VoterGroupRelation__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(container2GroupVotersContainerEClass, Container2GroupVotersContainer.class, "Container2GroupVotersContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer2GroupVotersContainer_Source(), theVoterPackage.getContainer(), null, "source", null, 0, 1, Container2GroupVotersContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer2GroupVotersContainer_Target(), theGroupVotersPackage.getGroupVotersContainer(), null, "target", null, 0, 1, Container2GroupVotersContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voter2GroupVoterEClass, Voter2GroupVoter.class, "Voter2GroupVoter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoter2GroupVoter_Source(), theVoterPackage.getVoter1(), null, "source", null, 0, 1, Voter2GroupVoter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2GroupVoter_Target(), theGroupVotersPackage.getVoter1(), null, "target", null, 0, 1, Voter2GroupVoter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voter2GroupEClass, Voter2Group.class, "Voter2Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoter2Group_Source(), theVoterPackage.getVoter1(), null, "source", null, 0, 1, Voter2Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group_Target(), theGroupVotersPackage.getGroup(), null, "target", null, 0, 1, Voter2Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(container2GroupVotersContainer__MarkerEClass, Container2GroupVotersContainer__Marker.class, "Container2GroupVotersContainer__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer2GroupVotersContainer__Marker_CREATE__SRC__c(), theVoterPackage.getContainer(), null, "CREATE__SRC__c", null, 1, 1, Container2GroupVotersContainer__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer2GroupVotersContainer__Marker_CREATE__TRG__gvc(), theGroupVotersPackage.getGroupVotersContainer(), null, "CREATE__TRG__gvc", null, 1, 1, Container2GroupVotersContainer__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer2GroupVotersContainer__Marker_CREATE__CORR__c2gvc(), this.getContainer2GroupVotersContainer(), null, "CREATE__CORR__c2gvc", null, 1, 1, Container2GroupVotersContainer__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voter2Group__MarkerEClass, Voter2Group__Marker.class, "Voter2Group__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoter2Group__Marker_CONTEXT__SRC__v(), theVoterPackage.getVoter1(), null, "CONTEXT__SRC__v", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group__Marker_CONTEXT__SRC__v2(), theVoterPackage.getVoter1(), null, "CONTEXT__SRC__v2", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group__Marker_CONTEXT__TRG__gV(), theGroupVotersPackage.getVoter1(), null, "CONTEXT__TRG__gV", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group__Marker_CONTEXT__TRG__gV2(), theGroupVotersPackage.getVoter1(), null, "CONTEXT__TRG__gV2", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group__Marker_CONTEXT__TRG__group(), theGroupVotersPackage.getGroup(), null, "CONTEXT__TRG__group", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group__Marker_CONTEXT__CORR__v2g1(), this.getVoter2Group(), null, "CONTEXT__CORR__v2g1", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group__Marker_CREATE__CORR__v2g2(), this.getVoter2Group(), null, "CREATE__CORR__v2g2", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group__Marker_CONTEXT__CORR__v2gv(), this.getVoter2GroupVoter(), null, "CONTEXT__CORR__v2gv", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2Group__Marker_CONTEXT__CORR__v2gv2(), this.getVoter2GroupVoter(), null, "CONTEXT__CORR__v2gv2", null, 1, 1, Voter2Group__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voter2GroupVoter__MarkerEClass, Voter2GroupVoter__Marker.class, "Voter2GroupVoter__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoter2GroupVoter__Marker_CONTEXT__SRC__c(), theVoterPackage.getContainer(), null, "CONTEXT__SRC__c", null, 1, 1, Voter2GroupVoter__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2GroupVoter__Marker_CREATE__SRC__v(), theVoterPackage.getVoter1(), null, "CREATE__SRC__v", null, 1, 1, Voter2GroupVoter__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2GroupVoter__Marker_CREATE__TRG__gV(), theGroupVotersPackage.getVoter1(), null, "CREATE__TRG__gV", null, 1, 1, Voter2GroupVoter__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2GroupVoter__Marker_CONTEXT__TRG__gvc(), theGroupVotersPackage.getGroupVotersContainer(), null, "CONTEXT__TRG__gvc", null, 1, 1, Voter2GroupVoter__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2GroupVoter__Marker_CONTEXT__CORR__c2gvc(), this.getContainer2GroupVotersContainer(), null, "CONTEXT__CORR__c2gvc", null, 1, 1, Voter2GroupVoter__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter2GroupVoter__Marker_CREATE__CORR__v2gv(), this.getVoter2GroupVoter(), null, "CREATE__CORR__v2gv", null, 1, 1, Voter2GroupVoter__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voterRelation2VoterGroupRelation__MarkerEClass, VoterRelation2VoterGroupRelation__Marker.class, "VoterRelation2VoterGroupRelation__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v(), theVoterPackage.getVoter1(), null, "CONTEXT__SRC__v", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v2(), theVoterPackage.getVoter1(), null, "CONTEXT__SRC__v2", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV(), theGroupVotersPackage.getVoter1(), null, "CONTEXT__TRG__gV", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV2(), theGroupVotersPackage.getVoter1(), null, "CONTEXT__TRG__gV2", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CREATE__TRG__group(), theGroupVotersPackage.getGroup(), null, "CREATE__TRG__group", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g1(), this.getVoter2Group(), null, "CREATE__CORR__v2g1", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g2(), this.getVoter2Group(), null, "CREATE__CORR__v2g2", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv(), this.getVoter2GroupVoter(), null, "CONTEXT__CORR__v2gv", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv2(), this.getVoter2GroupVoter(), null, "CONTEXT__CORR__v2gv2", null, 1, 1, VoterRelation2VoterGroupRelation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Voter2GroupVotersPackageImpl
