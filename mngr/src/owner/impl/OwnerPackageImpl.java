/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owner.impl;

import const_.ConstPackage;

import const_.impl.ConstPackageImpl;

import elem.ElemPackage;

import elem.impl.ElemPackageImpl;

import exp.ExpPackage;

import exp.impl.ExpPackageImpl;

import mngr.MngrPackage;

import mngr.impl.MngrPackageImpl;

import named.NamedPackage;

import named.impl.NamedPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owner.Element;
import owner.OwnerFactory;
import owner.OwnerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwnerPackageImpl extends EPackageImpl implements OwnerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

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
	 * @see owner.OwnerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OwnerPackageImpl() {
		super(eNS_URI, OwnerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OwnerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OwnerPackage init() {
		if (isInited) return (OwnerPackage)EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI);

		// Obtain or create and register package
		OwnerPackageImpl theOwnerPackage = (OwnerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OwnerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OwnerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MngrPackageImpl theMngrPackage = (MngrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) instanceof MngrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) : MngrPackage.eINSTANCE);
		NamedPackageImpl theNamedPackage = (NamedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) instanceof NamedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) : NamedPackage.eINSTANCE);
		ElemPackageImpl theElemPackage = (ElemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) instanceof ElemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) : ElemPackage.eINSTANCE);
		ExpPackageImpl theExpPackage = (ExpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) instanceof ExpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) : ExpPackage.eINSTANCE);
		ConstPackageImpl theConstPackage = (ConstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) instanceof ConstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) : ConstPackage.eINSTANCE);

		// Create package meta-data objects
		theOwnerPackage.createPackageContents();
		theMngrPackage.createPackageContents();
		theNamedPackage.createPackageContents();
		theElemPackage.createPackageContents();
		theExpPackage.createPackageContents();
		theConstPackage.createPackageContents();

		// Initialize created meta-data
		theOwnerPackage.initializePackageContents();
		theMngrPackage.initializePackageContents();
		theNamedPackage.initializePackageContents();
		theElemPackage.initializePackageContents();
		theExpPackage.initializePackageContents();
		theConstPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOwnerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OwnerPackage.eNS_URI, theOwnerPackage);
		return theOwnerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Owner() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerFactory getOwnerFactory() {
		return (OwnerFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNER);
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
		ElemPackage theElemPackage = (ElemPackage)EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(theElemPackage.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OwnerPackageImpl
