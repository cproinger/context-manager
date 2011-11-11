/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package elem.impl;

import const_.ConstPackage;

import const_.impl.ConstPackageImpl;

import elem.ElemFactory;
import elem.ElemPackage;
import elem.Element;

import exp.ExpPackage;

import exp.impl.ExpPackageImpl;

import mngr.MngrPackage;

import mngr.impl.MngrPackageImpl;

import named.NamedPackage;

import named.impl.NamedPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owner.OwnerPackage;

import owner.impl.OwnerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElemPackageImpl extends EPackageImpl implements ElemPackage {
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
	 * @see elem.ElemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElemPackageImpl() {
		super(eNS_URI, ElemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ElemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElemPackage init() {
		if (isInited) return (ElemPackage)EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI);

		// Obtain or create and register package
		ElemPackageImpl theElemPackage = (ElemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElemPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MngrPackageImpl theMngrPackage = (MngrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) instanceof MngrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) : MngrPackage.eINSTANCE);
		NamedPackageImpl theNamedPackage = (NamedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) instanceof NamedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) : NamedPackage.eINSTANCE);
		OwnerPackageImpl theOwnerPackage = (OwnerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) instanceof OwnerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) : OwnerPackage.eINSTANCE);
		ExpPackageImpl theExpPackage = (ExpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) instanceof ExpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) : ExpPackage.eINSTANCE);
		ConstPackageImpl theConstPackage = (ConstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) instanceof ConstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) : ConstPackage.eINSTANCE);

		// Create package meta-data objects
		theElemPackage.createPackageContents();
		theMngrPackage.createPackageContents();
		theNamedPackage.createPackageContents();
		theOwnerPackage.createPackageContents();
		theExpPackage.createPackageContents();
		theConstPackage.createPackageContents();

		// Initialize created meta-data
		theElemPackage.initializePackageContents();
		theMngrPackage.initializePackageContents();
		theNamedPackage.initializePackageContents();
		theOwnerPackage.initializePackageContents();
		theExpPackage.initializePackageContents();
		theConstPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theElemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElemPackage.eNS_URI, theElemPackage);
		return theElemPackage;
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
	public ElemFactory getElemFactory() {
		return (ElemFactory)getEFactoryInstance();
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ElemPackageImpl
