/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr.impl;

import const_.ConstPackage;

import const_.impl.ConstPackageImpl;

import elem.ElemPackage;

import elem.impl.ElemPackageImpl;

import exp.ExpPackage;

import exp.impl.ExpPackageImpl;

import mngr.ManagedElement;
import mngr.Manager;
import mngr.ManagerParameter;
import mngr.ManagerState;
import mngr.ManagerTransition;
import mngr.MngrFactory;
import mngr.MngrPackage;

import mngr.util.MngrValidator;

import named.NamedPackage;

import named.impl.NamedPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owner.OwnerPackage;

import owner.impl.OwnerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MngrPackageImpl extends EPackageImpl implements MngrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedElementEClass = null;

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
	 * @see mngr.MngrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MngrPackageImpl() {
		super(eNS_URI, MngrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MngrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MngrPackage init() {
		if (isInited) return (MngrPackage)EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI);

		// Obtain or create and register package
		MngrPackageImpl theMngrPackage = (MngrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MngrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MngrPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		NamedPackageImpl theNamedPackage = (NamedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) instanceof NamedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) : NamedPackage.eINSTANCE);
		OwnerPackageImpl theOwnerPackage = (OwnerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) instanceof OwnerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) : OwnerPackage.eINSTANCE);
		ElemPackageImpl theElemPackage = (ElemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) instanceof ElemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) : ElemPackage.eINSTANCE);
		ExpPackageImpl theExpPackage = (ExpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) instanceof ExpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI) : ExpPackage.eINSTANCE);
		ConstPackageImpl theConstPackage = (ConstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) instanceof ConstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) : ConstPackage.eINSTANCE);

		// Create package meta-data objects
		theMngrPackage.createPackageContents();
		theNamedPackage.createPackageContents();
		theOwnerPackage.createPackageContents();
		theElemPackage.createPackageContents();
		theExpPackage.createPackageContents();
		theConstPackage.createPackageContents();

		// Initialize created meta-data
		theMngrPackage.initializePackageContents();
		theNamedPackage.initializePackageContents();
		theOwnerPackage.initializePackageContents();
		theElemPackage.initializePackageContents();
		theExpPackage.initializePackageContents();
		theConstPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMngrPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MngrValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMngrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MngrPackage.eNS_URI, theMngrPackage);
		return theMngrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_OwnedState() {
		return (EReference)managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_InitialState() {
		return (EReference)managerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_FinalState() {
		return (EReference)managerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_ContextParameters() {
		return (EReference)managerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_ManagedElement() {
		return (EReference)managerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_OwnedTransition() {
		return (EReference)managerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagerState() {
		return managerStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerState_OwningManager() {
		return (EReference)managerStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerState_OutgoingTransition() {
		return (EReference)managerStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerState_IncomingTransition() {
		return (EReference)managerStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerState_IsStart() {
		return (EAttribute)managerStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerState_IsEnd() {
		return (EAttribute)managerStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerState_Prob() {
		return (EAttribute)managerStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerState_ContextParameters() {
		return (EReference)managerStateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagerTransition() {
		return managerTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerTransition_OwningManager() {
		return (EReference)managerTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerTransition_Source() {
		return (EReference)managerTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerTransition_Target() {
		return (EReference)managerTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerTransition_Input() {
		return (EAttribute)managerTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerTransition_Output() {
		return (EAttribute)managerTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerTransition_TransProb() {
		return (EAttribute)managerTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerTransition_TransRate() {
		return (EAttribute)managerTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerTransition_Event() {
		return (EAttribute)managerTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerTransition_Condition() {
		return (EAttribute)managerTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerTransition_Action() {
		return (EAttribute)managerTransitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagerParameter() {
		return managerParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerParameter_State() {
		return (EReference)managerParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerParameter_OpaqueExpressions() {
		return (EReference)managerParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagerParameter_OwningManager() {
		return (EReference)managerParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerParameter_IsInput() {
		return (EAttribute)managerParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerParameter_LitteralInteger() {
		return (EAttribute)managerParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerParameter_LitteralString() {
		return (EAttribute)managerParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerParameter_LitteralBoolean() {
		return (EAttribute)managerParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagerParameter_LitteralUnlimitedNatural() {
		return (EAttribute)managerParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagedElement() {
		return managedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagedElement_OwningManager() {
		return (EReference)managedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedElement_Description() {
		return (EAttribute)managedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MngrFactory getMngrFactory() {
		return (MngrFactory)getEFactoryInstance();
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
		managerEClass = createEClass(MANAGER);
		createEReference(managerEClass, MANAGER__OWNED_STATE);
		createEReference(managerEClass, MANAGER__INITIAL_STATE);
		createEReference(managerEClass, MANAGER__FINAL_STATE);
		createEReference(managerEClass, MANAGER__CONTEXT_PARAMETERS);
		createEReference(managerEClass, MANAGER__MANAGED_ELEMENT);
		createEReference(managerEClass, MANAGER__OWNED_TRANSITION);

		managerStateEClass = createEClass(MANAGER_STATE);
		createEReference(managerStateEClass, MANAGER_STATE__OWNING_MANAGER);
		createEReference(managerStateEClass, MANAGER_STATE__OUTGOING_TRANSITION);
		createEReference(managerStateEClass, MANAGER_STATE__INCOMING_TRANSITION);
		createEAttribute(managerStateEClass, MANAGER_STATE__IS_START);
		createEAttribute(managerStateEClass, MANAGER_STATE__IS_END);
		createEAttribute(managerStateEClass, MANAGER_STATE__PROB);
		createEReference(managerStateEClass, MANAGER_STATE__CONTEXT_PARAMETERS);

		managerTransitionEClass = createEClass(MANAGER_TRANSITION);
		createEReference(managerTransitionEClass, MANAGER_TRANSITION__OWNING_MANAGER);
		createEReference(managerTransitionEClass, MANAGER_TRANSITION__SOURCE);
		createEReference(managerTransitionEClass, MANAGER_TRANSITION__TARGET);
		createEAttribute(managerTransitionEClass, MANAGER_TRANSITION__INPUT);
		createEAttribute(managerTransitionEClass, MANAGER_TRANSITION__OUTPUT);
		createEAttribute(managerTransitionEClass, MANAGER_TRANSITION__TRANS_PROB);
		createEAttribute(managerTransitionEClass, MANAGER_TRANSITION__TRANS_RATE);
		createEAttribute(managerTransitionEClass, MANAGER_TRANSITION__EVENT);
		createEAttribute(managerTransitionEClass, MANAGER_TRANSITION__CONDITION);
		createEAttribute(managerTransitionEClass, MANAGER_TRANSITION__ACTION);

		managerParameterEClass = createEClass(MANAGER_PARAMETER);
		createEReference(managerParameterEClass, MANAGER_PARAMETER__STATE);
		createEReference(managerParameterEClass, MANAGER_PARAMETER__OPAQUE_EXPRESSIONS);
		createEReference(managerParameterEClass, MANAGER_PARAMETER__OWNING_MANAGER);
		createEAttribute(managerParameterEClass, MANAGER_PARAMETER__IS_INPUT);
		createEAttribute(managerParameterEClass, MANAGER_PARAMETER__LITTERAL_INTEGER);
		createEAttribute(managerParameterEClass, MANAGER_PARAMETER__LITTERAL_STRING);
		createEAttribute(managerParameterEClass, MANAGER_PARAMETER__LITTERAL_BOOLEAN);
		createEAttribute(managerParameterEClass, MANAGER_PARAMETER__LITTERAL_UNLIMITED_NATURAL);

		managedElementEClass = createEClass(MANAGED_ELEMENT);
		createEReference(managedElementEClass, MANAGED_ELEMENT__OWNING_MANAGER);
		createEAttribute(managedElementEClass, MANAGED_ELEMENT__DESCRIPTION);
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
		ExpPackage theExpPackage = (ExpPackage)EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		managerEClass.getESuperTypes().add(theNamedPackage.getNamedElement());
		managerStateEClass.getESuperTypes().add(theNamedPackage.getNamedElement());
		managerTransitionEClass.getESuperTypes().add(theNamedPackage.getNamedElement());
		managerParameterEClass.getESuperTypes().add(theNamedPackage.getNamedElement());
		managedElementEClass.getESuperTypes().add(theNamedPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManager_OwnedState(), this.getManagerState(), this.getManagerState_OwningManager(), "ownedState", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_InitialState(), this.getManagerState(), null, "initialState", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_FinalState(), this.getManagerState(), null, "finalState", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ContextParameters(), this.getManagerParameter(), this.getManagerParameter_OwningManager(), "contextParameters", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ManagedElement(), this.getManagedElement(), this.getManagedElement_OwningManager(), "managedElement", null, 1, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_OwnedTransition(), this.getManagerTransition(), this.getManagerTransition_OwningManager(), "ownedTransition", null, 0, -1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerStateEClass, ManagerState.class, "ManagerState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagerState_OwningManager(), this.getManager(), this.getManager_OwnedState(), "owningManager", null, 1, 1, ManagerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerState_OutgoingTransition(), this.getManagerTransition(), this.getManagerTransition_Source(), "outgoingTransition", null, 0, -1, ManagerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerState_IncomingTransition(), this.getManagerTransition(), this.getManagerTransition_Target(), "incomingTransition", null, 0, -1, ManagerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerState_IsStart(), ecorePackage.getEBoolean(), "isStart", null, 0, 1, ManagerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerState_IsEnd(), ecorePackage.getEBoolean(), "isEnd", null, 0, 1, ManagerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerState_Prob(), ecorePackage.getEDouble(), "Prob", null, 0, 1, ManagerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerState_ContextParameters(), this.getManagerParameter(), this.getManagerParameter_State(), "contextParameters", null, 0, -1, ManagerState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerTransitionEClass, ManagerTransition.class, "ManagerTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagerTransition_OwningManager(), this.getManager(), this.getManager_OwnedTransition(), "owningManager", null, 1, 1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerTransition_Source(), this.getManagerState(), this.getManagerState_OutgoingTransition(), "source", null, 1, 1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerTransition_Target(), this.getManagerState(), this.getManagerState_IncomingTransition(), "target", null, 1, 1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerTransition_Input(), ecorePackage.getEString(), "input", null, 0, 1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerTransition_Output(), ecorePackage.getEString(), "output", null, 0, 1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerTransition_TransProb(), ecorePackage.getEDouble(), "transProb", null, 0, 1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerTransition_TransRate(), ecorePackage.getEDouble(), "transRate", null, 0, 1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerTransition_Event(), ecorePackage.getEString(), "Event", null, 0, -1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerTransition_Condition(), ecorePackage.getEString(), "Condition", null, 0, -1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerTransition_Action(), ecorePackage.getEString(), "Action", null, 0, -1, ManagerTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managerParameterEClass, ManagerParameter.class, "ManagerParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagerParameter_State(), this.getManagerState(), this.getManagerState_ContextParameters(), "state", null, 0, -1, ManagerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerParameter_OpaqueExpressions(), theExpPackage.getOpaqueExpression(), null, "opaqueExpressions", null, 0, -1, ManagerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagerParameter_OwningManager(), this.getManager(), this.getManager_ContextParameters(), "owningManager", null, 1, 1, ManagerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerParameter_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 1, 1, ManagerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerParameter_LitteralInteger(), ecorePackage.getEInt(), "LitteralInteger", null, 0, -1, ManagerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerParameter_LitteralString(), ecorePackage.getEString(), "LitteralString", null, 0, -1, ManagerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerParameter_LitteralBoolean(), ecorePackage.getEBoolean(), "LitteralBoolean", null, 0, -1, ManagerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagerParameter_LitteralUnlimitedNatural(), ecorePackage.getEDouble(), "LitteralUnlimitedNatural", null, 0, -1, ManagerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managedElementEClass, ManagedElement.class, "ManagedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagedElement_OwningManager(), this.getManager(), this.getManager_ManagedElement(), "owningManager", null, 1, 1, ManagedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ManagedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf.diagram
		createGmfAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (managerEClass, 
		   source, 
		   new String[] {
			 "constraints", "DuplicateTransition ManagerStateNameUnique InitialStateNoIncomingTransitions ManagedElementNameUnique InitialStateNoFinalState finalStateMustHaveIncomingTransition FinalStatesNoOutgoingTransitions ManagerTransitionNameUnique InitialStateMustBeStart ManagerParameterNameUnique FinalStateMustBeEnd"
		   });				
		addAnnotation
		  (managerStateEClass, 
		   source, 
		   new String[] {
			 "constraints", "EndStateNofinalState UndefinedTransitions InitialStateNoFinalState StartStateNoInitialState OutgoingTransitionsProbabilitySumMustBe1 ManagerStateNameUndefined"
		   });					
		addAnnotation
		  (managerTransitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "TransProbMax1 ManagerTransitionUndefinedName"
		   });				
		addAnnotation
		  (managerParameterEClass, 
		   source, 
		   new String[] {
			 "constraints", "ManagerParameterUndefinedName"
		   });					
		addAnnotation
		  (managedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ManagedElementUndefinedName"
		   });		
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";				
		addAnnotation
		  (managerEClass, 
		   source, 
		   new String[] {
			 "model.extension", "mngr",
			 "diagram.extension", "mngr_diagram"
		   });															
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (managerEClass, 
		   source, 
		   new String[] {
			 "DuplicateTransition", "ManagerTransition.allInstances()->forAll(t1 : ManagerTransition, t2 : ManagerTransition | t1 <> t2 implies t1.target <> t2.target or t1.source <> t2.source)",
			 "ManagerStateNameUnique", "ManagerState.allInstances()->forAll(m1 : ManagerState, m2 : ManagerState | m1 <> m2 implies m1.name <> m2.name)",
			 "InitialStateNoIncomingTransitions", "initialState.incomingTransition->size() = 0",
			 "ManagedElementNameUnique", "ManagedElement.allInstances()->forAll(m1 : ManagedElement, m2 : ManagedElement | m1 <> m2 implies m1.name <> m2.name)",
			 "InitialStateNoFinalState", "finalState->forAll(s : ManagerState | s <> initialState)",
			 "finalStateMustHaveIncomingTransition", "finalState->forAll(s : ManagerState | s.incomingTransition->size() > 0)",
			 "FinalStatesNoOutgoingTransitions", "finalState->forAll(s : ManagerState | s.outgoingTransition->size() = 0)",
			 "ManagerTransitionNameUnique", "ManagerTransition.allInstances()->forAll(m1 : ManagerTransition, m2 : ManagerTransition | m1 <> m2 implies m1.name <> m2.name)",
			 "InitialStateMustBeStart", "initialState.isStart and not initialState.isEnd",
			 "ManagerParameterNameUnique", "ManagerParameter.allInstances()->forAll(m1 : ManagerParameter, m2 : ManagerParameter | m1 <> m2 implies m1.name <> m2.name)",
			 "FinalStateMustBeEnd", "finalState->forAll(s : ManagerState | s.isEnd and not s.isStart)"
		   });				
		addAnnotation
		  (managerStateEClass, 
		   source, 
		   new String[] {
			 "EndStateNofinalState", "if isEnd then owningManager.finalState->includes(self) else true endif",
			 "UndefinedTransitions", "if not owningManager.initialState.oclAsSet()->includes(self) and not owningManager.finalState->includes(self) then outgoingTransition->size() > 0 and incomingTransition->size() > 0 else true endif",
			 "InitialStateNoFinalState", "not (isStart and isEnd)",
			 "StartStateNoInitialState", "if isStart then owningManager.initialState.oclAsSet()->includes(self) else true endif",
			 "OutgoingTransitionsProbabilitySumMustBe1", "if not owningManager.finalState->includes(self) then outgoingTransition->collect(transProb)->iterate(p : Real ; res : Real = 0 | res + p) = 1.0 else true endif",
			 "ManagerStateNameUndefined", "not name.oclIsUndefined()"
		   });					
		addAnnotation
		  (managerTransitionEClass, 
		   source, 
		   new String[] {
			 "TransProbMax1", "transProb <= 1.0 and not transProb.oclIsUndefined()",
			 "ManagerTransitionUndefinedName", "not name.oclIsUndefined()"
		   });				
		addAnnotation
		  (managerParameterEClass, 
		   source, 
		   new String[] {
			 "ManagerParameterUndefinedName", "not name.oclIsUndefined()"
		   });					
		addAnnotation
		  (managedElementEClass, 
		   source, 
		   new String[] {
			 "ManagedElementUndefinedName", "not name.oclIsUndefined()"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";							
		addAnnotation
		  (managerStateEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ManagerStateFigure",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "tool.name", "ManagerState",
			 "tool.description", "Create a new ManagerState",
			 "tool.small.bundle", "mngr.figures",
			 "tool.small.path", "icons/ManagerStateS.png"
		   });								
		addAnnotation
		  (managerParameterEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ManagerParameterFigure",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "tool.name", "ManagerParameter",
			 "tool.description", "Create a new ManagerParameter",
			 "tool.small.bundle", "mngr.figures",
			 "tool.small.path", "icons/ManagerParameterS.png"
		   });					
		addAnnotation
		  (managedElementEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.ManagedElementFigure",
			 "label", "name",
			 "label.icon", "false",
			 "label.placement", "external",
			 "tool.name", "ManagedElement",
			 "tool.description", "Create a new ManagedElement",
			 "tool.small.bundle", "mngr.figures",
			 "tool.small.path", "icons/ManagedElementS.png"
		   });	
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";									
		addAnnotation
		  (getManagerState_ContextParameters(), 
		   source, 
		   new String[] {
			 "style", "dot",
			 "width", "2",
			 "color", "190,190,190",
			 "tool.name", "ManagerParameter",
			 "tool.description", "Create a new link form a ManagerState and a ManagerParameter",
			 "tool.small.bundle", "mngr.figures",
			 "tool.small.path", "icons/ParameterLinkS.png"
		   });			
		addAnnotation
		  (managerTransitionEClass, 
		   source, 
		   new String[] {
			 "label", "transProb, Event, Action, Condition",
			 "label.pattern", "{0}:{1}:{2}:{3}",
			 "target.decoration", "closedarrow",
			 "width", "2",
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "color", "0,0,0",
			 "tool.name", "ManagerTransition",
			 "tool.description", "Create a new transition from source state to target state",
			 "tool.small.bundle", "mngr.figures",
			 "tool.small.path", "icons/transitionS.png"
		   });						
		addAnnotation
		  (getManagerParameter_OpaqueExpressions(), 
		   source, 
		   new String[] {
			 "style", "dot",
			 "width", "2",
			 "color", "97,94,63",
			 "tool.name", "OpaqueExpression",
			 "tool.description", "Create a new link form an OpaqueExpression and a ManagerParameter",
			 "tool.small.bundle", "mngr.figures",
			 "tool.small.path", "icons/OpaqueExpressionS.png"
		   });			
	}

} //MngrPackageImpl
