/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr.impl;

import const_.ConstPackage;

import ctxmngr.ContextManager;
import ctxmngr.ContextParameter;
import ctxmngr.CtxState;
import ctxmngr.CtxTransition;
import ctxmngr.CtxmngrFactory;
import ctxmngr.CtxmngrPackage;
import ctxmngr.RemoteFiringDependency;

import elem.ElemPackage;

import exp.ExpPackage;

import mngr.MngrPackage;

import named.NamedPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owner.OwnerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtxmngrPackageImpl extends EPackageImpl implements CtxmngrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctxStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctxTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteFiringDependencyEClass = null;

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
	 * @see ctxmngr.CtxmngrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CtxmngrPackageImpl() {
		super(eNS_URI, CtxmngrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CtxmngrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CtxmngrPackage init() {
		if (isInited) return (CtxmngrPackage)EPackage.Registry.INSTANCE.getEPackage(CtxmngrPackage.eNS_URI);

		// Obtain or create and register package
		CtxmngrPackageImpl theCtxmngrPackage = (CtxmngrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CtxmngrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CtxmngrPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MngrPackage.eINSTANCE.eClass();
		NamedPackage.eINSTANCE.eClass();
		OwnerPackage.eINSTANCE.eClass();
		ElemPackage.eINSTANCE.eClass();
		ExpPackage.eINSTANCE.eClass();
		ConstPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCtxmngrPackage.createPackageContents();

		// Initialize created meta-data
		theCtxmngrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCtxmngrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CtxmngrPackage.eNS_URI, theCtxmngrPackage);
		return theCtxmngrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextManager() {
		return contextManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_OwnedState() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_InitialState() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_FinalState() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_ContextParameters() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_CombinedManager() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_RemoteFirings() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_OwnedTransition() {
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtxState() {
		return ctxStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxState_OwningManager() {
		return (EReference)ctxStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxState_OutgoingTransition() {
		return (EReference)ctxStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxState_IncomingTransition() {
		return (EReference)ctxStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxState_IsStart() {
		return (EAttribute)ctxStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxState_IsEnd() {
		return (EAttribute)ctxStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxState_ContextParameters() {
		return (EReference)ctxStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxState_ManagerStates() {
		return (EReference)ctxStateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtxTransition() {
		return ctxTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxTransition_OwningManager() {
		return (EReference)ctxTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxTransition_Source() {
		return (EReference)ctxTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxTransition_Target() {
		return (EReference)ctxTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxTransition_Input() {
		return (EAttribute)ctxTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxTransition_Output() {
		return (EAttribute)ctxTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxTransition_TransProb() {
		return (EAttribute)ctxTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtxTransition_ManagerTransition() {
		return (EReference)ctxTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxTransition_Action() {
		return (EAttribute)ctxTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxTransition_Event() {
		return (EAttribute)ctxTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxTransition_Condition() {
		return (EAttribute)ctxTransitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxTransition_TransRate() {
		return (EAttribute)ctxTransitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtxTransition_IsRemote() {
		return (EAttribute)ctxTransitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextParameter() {
		return contextParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextParameter_State() {
		return (EReference)contextParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextParameter_OpaqueExpressions() {
		return (EReference)contextParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextParameter_OwningManager() {
		return (EReference)contextParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextParameter_LitteralInteger() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextParameter_LitteralString() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextParameter_LitteralBoolean() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextParameter_LitteralUnlimitedNatural() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextParameter_IsInput() {
		return (EAttribute)contextParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteFiringDependency() {
		return remoteFiringDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoteFiringDependency_Fired() {
		return (EReference)remoteFiringDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoteFiringDependency_Firing() {
		return (EReference)remoteFiringDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoteFiringDependency_OwningManager() {
		return (EReference)remoteFiringDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoteFiringDependency_Represents() {
		return (EReference)remoteFiringDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxmngrFactory getCtxmngrFactory() {
		return (CtxmngrFactory)getEFactoryInstance();
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
		contextManagerEClass = createEClass(CONTEXT_MANAGER);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__OWNED_STATE);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__INITIAL_STATE);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__FINAL_STATE);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__CONTEXT_PARAMETERS);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__COMBINED_MANAGER);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__REMOTE_FIRINGS);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__OWNED_TRANSITION);

		ctxStateEClass = createEClass(CTX_STATE);
		createEReference(ctxStateEClass, CTX_STATE__OWNING_MANAGER);
		createEReference(ctxStateEClass, CTX_STATE__OUTGOING_TRANSITION);
		createEReference(ctxStateEClass, CTX_STATE__INCOMING_TRANSITION);
		createEAttribute(ctxStateEClass, CTX_STATE__IS_START);
		createEAttribute(ctxStateEClass, CTX_STATE__IS_END);
		createEReference(ctxStateEClass, CTX_STATE__CONTEXT_PARAMETERS);
		createEReference(ctxStateEClass, CTX_STATE__MANAGER_STATES);

		ctxTransitionEClass = createEClass(CTX_TRANSITION);
		createEReference(ctxTransitionEClass, CTX_TRANSITION__OWNING_MANAGER);
		createEReference(ctxTransitionEClass, CTX_TRANSITION__SOURCE);
		createEReference(ctxTransitionEClass, CTX_TRANSITION__TARGET);
		createEAttribute(ctxTransitionEClass, CTX_TRANSITION__INPUT);
		createEAttribute(ctxTransitionEClass, CTX_TRANSITION__OUTPUT);
		createEAttribute(ctxTransitionEClass, CTX_TRANSITION__TRANS_PROB);
		createEReference(ctxTransitionEClass, CTX_TRANSITION__MANAGER_TRANSITION);
		createEAttribute(ctxTransitionEClass, CTX_TRANSITION__ACTION);
		createEAttribute(ctxTransitionEClass, CTX_TRANSITION__EVENT);
		createEAttribute(ctxTransitionEClass, CTX_TRANSITION__CONDITION);
		createEAttribute(ctxTransitionEClass, CTX_TRANSITION__TRANS_RATE);
		createEAttribute(ctxTransitionEClass, CTX_TRANSITION__IS_REMOTE);

		contextParameterEClass = createEClass(CONTEXT_PARAMETER);
		createEReference(contextParameterEClass, CONTEXT_PARAMETER__STATE);
		createEReference(contextParameterEClass, CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS);
		createEReference(contextParameterEClass, CONTEXT_PARAMETER__OWNING_MANAGER);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__LITTERAL_INTEGER);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__LITTERAL_STRING);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__LITTERAL_BOOLEAN);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__LITTERAL_UNLIMITED_NATURAL);
		createEAttribute(contextParameterEClass, CONTEXT_PARAMETER__IS_INPUT);

		remoteFiringDependencyEClass = createEClass(REMOTE_FIRING_DEPENDENCY);
		createEReference(remoteFiringDependencyEClass, REMOTE_FIRING_DEPENDENCY__FIRED);
		createEReference(remoteFiringDependencyEClass, REMOTE_FIRING_DEPENDENCY__FIRING);
		createEReference(remoteFiringDependencyEClass, REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER);
		createEReference(remoteFiringDependencyEClass, REMOTE_FIRING_DEPENDENCY__REPRESENTS);
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
		MngrPackage theMngrPackage = (MngrPackage)EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI);
		ExpPackage theExpPackage = (ExpPackage)EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contextManagerEClass.getESuperTypes().add(theNamedPackage.getNamedElement());
		ctxStateEClass.getESuperTypes().add(theNamedPackage.getNamedElement());
		ctxTransitionEClass.getESuperTypes().add(theNamedPackage.getNamedElement());
		contextParameterEClass.getESuperTypes().add(theNamedPackage.getNamedElement());
		remoteFiringDependencyEClass.getESuperTypes().add(theNamedPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(contextManagerEClass, ContextManager.class, "ContextManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextManager_OwnedState(), this.getCtxState(), this.getCtxState_OwningManager(), "ownedState", null, 0, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_InitialState(), this.getCtxState(), null, "initialState", null, 1, 1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_FinalState(), this.getCtxState(), null, "finalState", null, 0, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_ContextParameters(), this.getContextParameter(), this.getContextParameter_OwningManager(), "contextParameters", null, 0, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_CombinedManager(), theMngrPackage.getManager(), null, "combinedManager", null, 0, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_RemoteFirings(), this.getRemoteFiringDependency(), this.getRemoteFiringDependency_OwningManager(), "remoteFirings", null, 0, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_OwnedTransition(), this.getCtxTransition(), this.getCtxTransition_OwningManager(), "ownedTransition", null, 0, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctxStateEClass, CtxState.class, "CtxState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtxState_OwningManager(), this.getContextManager(), this.getContextManager_OwnedState(), "owningManager", null, 1, 1, CtxState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtxState_OutgoingTransition(), this.getCtxTransition(), this.getCtxTransition_Source(), "outgoingTransition", null, 0, -1, CtxState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtxState_IncomingTransition(), this.getCtxTransition(), this.getCtxTransition_Target(), "incomingTransition", null, 0, -1, CtxState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxState_IsStart(), ecorePackage.getEBoolean(), "isStart", null, 0, 1, CtxState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxState_IsEnd(), ecorePackage.getEBoolean(), "isEnd", null, 0, 1, CtxState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtxState_ContextParameters(), this.getContextParameter(), this.getContextParameter_State(), "contextParameters", null, 0, -1, CtxState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtxState_ManagerStates(), theMngrPackage.getManagerState(), null, "managerStates", null, 0, -1, CtxState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctxTransitionEClass, CtxTransition.class, "CtxTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtxTransition_OwningManager(), this.getContextManager(), this.getContextManager_OwnedTransition(), "owningManager", null, 1, 1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtxTransition_Source(), this.getCtxState(), this.getCtxState_OutgoingTransition(), "source", null, 1, 1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtxTransition_Target(), this.getCtxState(), this.getCtxState_IncomingTransition(), "target", null, 1, 1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxTransition_Input(), ecorePackage.getEString(), "input", null, 0, 1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxTransition_Output(), ecorePackage.getEString(), "output", null, 0, 1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxTransition_TransProb(), ecorePackage.getEDouble(), "transProb", null, 0, 1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtxTransition_ManagerTransition(), theMngrPackage.getManagerTransition(), null, "managerTransition", null, 0, -1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxTransition_Action(), ecorePackage.getEString(), "Action", null, 0, -1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxTransition_Event(), ecorePackage.getEString(), "Event", null, 0, -1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxTransition_Condition(), ecorePackage.getEString(), "Condition", null, 0, -1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxTransition_TransRate(), ecorePackage.getEDouble(), "transRate", null, 0, 1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtxTransition_IsRemote(), ecorePackage.getEBoolean(), "isRemote", "false", 1, 1, CtxTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextParameterEClass, ContextParameter.class, "ContextParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextParameter_State(), this.getCtxState(), this.getCtxState_ContextParameters(), "state", null, 0, -1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextParameter_OpaqueExpressions(), theExpPackage.getOpaqueExpression(), null, "opaqueExpressions", null, 0, -1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextParameter_OwningManager(), this.getContextManager(), this.getContextManager_ContextParameters(), "owningManager", null, 1, 1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextParameter_LitteralInteger(), ecorePackage.getEInt(), "LitteralInteger", null, 0, -1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextParameter_LitteralString(), ecorePackage.getEString(), "LitteralString", null, 0, -1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextParameter_LitteralBoolean(), ecorePackage.getEBoolean(), "LitteralBoolean", null, 0, -1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextParameter_LitteralUnlimitedNatural(), ecorePackage.getEDouble(), "LitteralUnlimitedNatural", null, 0, -1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextParameter_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 0, 1, ContextParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteFiringDependencyEClass, RemoteFiringDependency.class, "RemoteFiringDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoteFiringDependency_Fired(), theMngrPackage.getManagerTransition(), null, "fired", null, 1, -1, RemoteFiringDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoteFiringDependency_Firing(), theMngrPackage.getManagerTransition(), null, "firing", null, 1, -1, RemoteFiringDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoteFiringDependency_OwningManager(), this.getContextManager(), this.getContextManager_RemoteFirings(), "owningManager", null, 1, 1, RemoteFiringDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoteFiringDependency_Represents(), this.getCtxTransition(), null, "represents", null, 1, -1, RemoteFiringDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CtxmngrPackageImpl
