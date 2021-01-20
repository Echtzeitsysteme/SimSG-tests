/**
 */
package GroupVoters.impl;

import GroupVoters.Group;
import GroupVoters.GroupVotersContainer;
import GroupVoters.GroupVotersFactory;
import GroupVoters.GroupVotersPackage;
import GroupVoters.Voter1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupVotersPackageImpl extends EPackageImpl implements GroupVotersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupVotersContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voter1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

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
	 * @see GroupVoters.GroupVotersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GroupVotersPackageImpl() {
		super(eNS_URI, GroupVotersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GroupVotersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GroupVotersPackage init() {
		if (isInited)
			return (GroupVotersPackage) EPackage.Registry.INSTANCE.getEPackage(GroupVotersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGroupVotersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GroupVotersPackageImpl theGroupVotersPackage = registeredGroupVotersPackage instanceof GroupVotersPackageImpl
				? (GroupVotersPackageImpl) registeredGroupVotersPackage
				: new GroupVotersPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGroupVotersPackage.createPackageContents();

		// Initialize created meta-data
		theGroupVotersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGroupVotersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GroupVotersPackage.eNS_URI, theGroupVotersPackage);
		return theGroupVotersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupVotersContainer() {
		return groupVotersContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupVotersContainer_Voter() {
		return (EReference) groupVotersContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupVotersContainer_Group() {
		return (EReference) groupVotersContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoter1() {
		return voter1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoter1_Member() {
		return (EReference) voter1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoter1_Vote() {
		return (EAttribute) voter1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersFactory getGroupVotersFactory() {
		return (GroupVotersFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		groupVotersContainerEClass = createEClass(GROUP_VOTERS_CONTAINER);
		createEReference(groupVotersContainerEClass, GROUP_VOTERS_CONTAINER__VOTER);
		createEReference(groupVotersContainerEClass, GROUP_VOTERS_CONTAINER__GROUP);

		voter1EClass = createEClass(VOTER1);
		createEReference(voter1EClass, VOTER1__MEMBER);
		createEAttribute(voter1EClass, VOTER1__VOTE);

		groupEClass = createEClass(GROUP);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(groupVotersContainerEClass, GroupVotersContainer.class, "GroupVotersContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupVotersContainer_Voter(), this.getVoter1(), null, "voter", null, 0, -1,
				GroupVotersContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupVotersContainer_Group(), this.getGroup(), null, "group", null, 0, -1,
				GroupVotersContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voter1EClass, Voter1.class, "Voter1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVoter1_Member(), this.getGroup(), null, "member", null, 0, -1, Voter1.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getVoter1_Vote(), ecorePackage.getEBoolean(), "vote", null, 0, 1, Voter1.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GroupVotersPackageImpl
