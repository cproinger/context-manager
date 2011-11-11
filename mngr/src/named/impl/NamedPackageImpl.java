/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package named.impl;

import const_.ConstPackage;

import const_.impl.ConstPackageImpl;

import elem.ElemPackage;

import elem.impl.ElemPackageImpl;

import exp.ExpPackage;

import exp.impl.ExpPackageImpl;

import mngr.MngrPackage;

import mngr.impl.MngrPackageImpl;

import named.NamedElement;
import named.NamedFactory;
import named.NamedPackage;
import named.Namespace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owner.OwnerPackage;

import owner.impl.OwnerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedPackageImpl extends EPackageImpl implements NamedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

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
	 * @see named.NamedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NamedPackageImpl() {
		super(eNS_URI, NamedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NamedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NamedPackage init() {
		if (isInited) return (NamedPackage)EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI);

		// Obtain or create and register package
		NamedPackageImpl theNamedPackage = (NamedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NamedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NamedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MngrPackageImpl theMngrPackage = (MngrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) instanceof MngrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) : MngrPackage.eINSTANCE);
		OwnerPackageImpl theOwnerPackage = (OwnerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) instanceof OwnerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) : OwnerPackage.eINSTANCE);
		ElemPackageImpl theElemPackage = (ElemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) instanceof ElemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) : ElemPackage.eINSTANCE);
		ExpPackageImpl theExpPackage = (ExpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) instanceof ExpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) : ExpPackage.eINSTANCE);
		ConstPackageImpl theConstPackage = (ConstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) instanceof ConstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) : ConstPackage.eINSTANCE);

		// Create package meta-data objects
		theNamedPackage.createPackageContents();
		theMngrPackage.createPackageContents();
		theOwnerPackage.createPackageContents();
		theElemPackage.createPackageContents();
		theExpPackage.createPackageContents();
		theConstPackage.createPackageContents();

		// Initialize created meta-data
		theNamedPackage.initializePackageContents();
		theMngrPackage.initializePackageContents();
		theOwnerPackage.initializePackageContents();
		theElemPackage.initializePackageContents();
		theExpPackage.initializePackageContents();
		theConstPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNamedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NamedPackage.eNS_URI, theNamedPackage);
		return theNamedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_QualifiedName() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Namespace() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Member() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedFactory getNamedFactory() {
		return (NamedFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAMESPACE);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_MEMBER);
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
		OwnerPackage theOwnerPackage = (OwnerPackage)EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(theOwnerPackage.getElement());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_Namespace(), this.getNamespace(), this.getNamespace_OwnedMember(), "namespace", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_Member(), this.getNamedElement(), null, "member", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_OwnedMember(), this.getNamedElement(), this.getNamedElement_Namespace(), "ownedMember", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NamedPackageImpl
