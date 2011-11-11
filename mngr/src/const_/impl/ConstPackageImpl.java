/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package const_.impl;

import const_.ConstFactory;
import const_.ConstPackage;
import const_.Constraint;

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

import owner.OwnerPackage;

import owner.impl.OwnerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstPackageImpl extends EPackageImpl implements ConstPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

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
	 * @see const_.ConstPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstPackageImpl() {
		super(eNS_URI, ConstFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstPackage init() {
		if (isInited) return (ConstPackage)EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI);

		// Obtain or create and register package
		ConstPackageImpl theConstPackage = (ConstPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MngrPackageImpl theMngrPackage = (MngrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) instanceof MngrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) : MngrPackage.eINSTANCE);
		NamedPackageImpl theNamedPackage = (NamedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) instanceof NamedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) : NamedPackage.eINSTANCE);
		OwnerPackageImpl theOwnerPackage = (OwnerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) instanceof OwnerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) : OwnerPackage.eINSTANCE);
		ElemPackageImpl theElemPackage = (ElemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) instanceof ElemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) : ElemPackage.eINSTANCE);
		ExpPackageImpl theExpPackage = (ExpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) instanceof ExpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) : ExpPackage.eINSTANCE);

		// Create package meta-data objects
		theConstPackage.createPackageContents();
		theMngrPackage.createPackageContents();
		theNamedPackage.createPackageContents();
		theOwnerPackage.createPackageContents();
		theElemPackage.createPackageContents();
		theExpPackage.createPackageContents();

		// Initialize created meta-data
		theConstPackage.initializePackageContents();
		theMngrPackage.initializePackageContents();
		theNamedPackage.initializePackageContents();
		theOwnerPackage.initializePackageContents();
		theElemPackage.initializePackageContents();
		theExpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstPackage.eNS_URI, theConstPackage);
		return theConstPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstrainedElement() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Specification() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstFactory getConstFactory() {
		return (ConstFactory)getEFactoryInstance();
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
		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINED_ELEMENT);
		createEReference(constraintEClass, CONSTRAINT__SPECIFICATION);
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
		NamedPackage theNamedPackage = (NamedPackage)EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI);
		OwnerPackage theOwnerPackage = (OwnerPackage)EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI);
		ExpPackage theExpPackage = (ExpPackage)EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constraintEClass.getESuperTypes().add(theNamedPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_ConstrainedElement(), theOwnerPackage.getElement(), null, "constrainedElement", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Specification(), theExpPackage.getValueSpecification(), null, "specification", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConstPackageImpl
