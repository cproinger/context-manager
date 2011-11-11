/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr.util;

import java.util.Map;

import mngr.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mngr.MngrPackage
 * @generated
 */
public class MngrValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MngrValidator INSTANCE = new MngrValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mngr";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MngrValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MngrPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MngrPackage.MANAGER:
				return validateManager((Manager)value, diagnostics, context);
			case MngrPackage.MANAGER_STATE:
				return validateManagerState((ManagerState)value, diagnostics, context);
			case MngrPackage.MANAGER_TRANSITION:
				return validateManagerTransition((ManagerTransition)value, diagnostics, context);
			case MngrPackage.MANAGER_PARAMETER:
				return validateManagerParameter((ManagerParameter)value, diagnostics, context);
			case MngrPackage.MANAGED_ELEMENT:
				return validateManagedElement((ManagedElement)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_DuplicateTransition(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_ManagerStateNameUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_InitialStateNoIncomingTransitions(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_ManagedElementNameUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_InitialStateNoFinalState(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_finalStateMustHaveIncomingTransition(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_FinalStatesNoOutgoingTransitions(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_ManagerTransitionNameUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_InitialStateMustBeStart(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_ManagerParameterNameUnique(manager, diagnostics, context);
		if (result || diagnostics != null) result &= validateManager_FinalStateMustBeEnd(manager, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DuplicateTransition constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__DUPLICATE_TRANSITION__EEXPRESSION = "ManagerTransition.allInstances()->forAll(t1 : ManagerTransition, t2 : ManagerTransition | t1 <> t2 implies t1.target <> t2.target or t1.source <> t2.source)";

	/**
	 * Validates the DuplicateTransition constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_DuplicateTransition(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DuplicateTransition",
				 MANAGER__DUPLICATE_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ManagerStateNameUnique constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__MANAGER_STATE_NAME_UNIQUE__EEXPRESSION = "ManagerState.allInstances()->forAll(m1 : ManagerState, m2 : ManagerState | m1 <> m2 implies m1.name <> m2.name)";

	/**
	 * Validates the ManagerStateNameUnique constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_ManagerStateNameUnique(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ManagerStateNameUnique",
				 MANAGER__MANAGER_STATE_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InitialStateNoIncomingTransitions constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__INITIAL_STATE_NO_INCOMING_TRANSITIONS__EEXPRESSION = "initialState.incomingTransition->size() = 0";

	/**
	 * Validates the InitialStateNoIncomingTransitions constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_InitialStateNoIncomingTransitions(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InitialStateNoIncomingTransitions",
				 MANAGER__INITIAL_STATE_NO_INCOMING_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ManagedElementNameUnique constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__MANAGED_ELEMENT_NAME_UNIQUE__EEXPRESSION = "ManagedElement.allInstances()->forAll(m1 : ManagedElement, m2 : ManagedElement | m1 <> m2 implies m1.name <> m2.name)";

	/**
	 * Validates the ManagedElementNameUnique constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_ManagedElementNameUnique(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ManagedElementNameUnique",
				 MANAGER__MANAGED_ELEMENT_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InitialStateNoFinalState constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__INITIAL_STATE_NO_FINAL_STATE__EEXPRESSION = "finalState->forAll(s : ManagerState | s <> initialState)";

	/**
	 * Validates the InitialStateNoFinalState constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_InitialStateNoFinalState(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InitialStateNoFinalState",
				 MANAGER__INITIAL_STATE_NO_FINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the finalStateMustHaveIncomingTransition constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__FINAL_STATE_MUST_HAVE_INCOMING_TRANSITION__EEXPRESSION = "finalState->forAll(s : ManagerState | s.incomingTransition->size() > 0)";

	/**
	 * Validates the finalStateMustHaveIncomingTransition constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_finalStateMustHaveIncomingTransition(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "finalStateMustHaveIncomingTransition",
				 MANAGER__FINAL_STATE_MUST_HAVE_INCOMING_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FinalStatesNoOutgoingTransitions constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__FINAL_STATES_NO_OUTGOING_TRANSITIONS__EEXPRESSION = "finalState->forAll(s : ManagerState | s.outgoingTransition->size() = 0)";

	/**
	 * Validates the FinalStatesNoOutgoingTransitions constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_FinalStatesNoOutgoingTransitions(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FinalStatesNoOutgoingTransitions",
				 MANAGER__FINAL_STATES_NO_OUTGOING_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ManagerTransitionNameUnique constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__MANAGER_TRANSITION_NAME_UNIQUE__EEXPRESSION = "ManagerTransition.allInstances()->forAll(m1 : ManagerTransition, m2 : ManagerTransition | m1 <> m2 implies m1.name <> m2.name)";

	/**
	 * Validates the ManagerTransitionNameUnique constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_ManagerTransitionNameUnique(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ManagerTransitionNameUnique",
				 MANAGER__MANAGER_TRANSITION_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InitialStateMustBeStart constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__INITIAL_STATE_MUST_BE_START__EEXPRESSION = "initialState.isStart and not initialState.isEnd";

	/**
	 * Validates the InitialStateMustBeStart constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_InitialStateMustBeStart(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InitialStateMustBeStart",
				 MANAGER__INITIAL_STATE_MUST_BE_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ManagerParameterNameUnique constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__MANAGER_PARAMETER_NAME_UNIQUE__EEXPRESSION = "ManagerParameter.allInstances()->forAll(m1 : ManagerParameter, m2 : ManagerParameter | m1 <> m2 implies m1.name <> m2.name)";

	/**
	 * Validates the ManagerParameterNameUnique constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_ManagerParameterNameUnique(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ManagerParameterNameUnique",
				 MANAGER__MANAGER_PARAMETER_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FinalStateMustBeEnd constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER__FINAL_STATE_MUST_BE_END__EEXPRESSION = "finalState->forAll(s : ManagerState | s.isEnd and not s.isStart)";

	/**
	 * Validates the FinalStateMustBeEnd constraint of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManager_FinalStateMustBeEnd(Manager manager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER,
				 manager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FinalStateMustBeEnd",
				 MANAGER__FINAL_STATE_MUST_BE_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerState(ManagerState managerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(managerState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerState_EndStateNofinalState(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerState_UndefinedTransitions(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerState_InitialStateNoFinalState(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerState_StartStateNoInitialState(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerState_OutgoingTransitionsProbabilitySumMustBe1(managerState, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerState_ManagerStateNameUndefined(managerState, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EndStateNofinalState constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_STATE__END_STATE_NOFINAL_STATE__EEXPRESSION = "if isEnd then owningManager.finalState->includes(self) else true endif";

	/**
	 * Validates the EndStateNofinalState constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerState_EndStateNofinalState(ManagerState managerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_STATE,
				 managerState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EndStateNofinalState",
				 MANAGER_STATE__END_STATE_NOFINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UndefinedTransitions constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_STATE__UNDEFINED_TRANSITIONS__EEXPRESSION = "if not owningManager.initialState.oclAsSet()->includes(self) and not owningManager.finalState->includes(self) then outgoingTransition->size() > 0 and incomingTransition->size() > 0 else true endif";

	/**
	 * Validates the UndefinedTransitions constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerState_UndefinedTransitions(ManagerState managerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_STATE,
				 managerState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UndefinedTransitions",
				 MANAGER_STATE__UNDEFINED_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InitialStateNoFinalState constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_STATE__INITIAL_STATE_NO_FINAL_STATE__EEXPRESSION = "not (isStart and isEnd)";

	/**
	 * Validates the InitialStateNoFinalState constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerState_InitialStateNoFinalState(ManagerState managerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_STATE,
				 managerState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InitialStateNoFinalState",
				 MANAGER_STATE__INITIAL_STATE_NO_FINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the StartStateNoInitialState constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_STATE__START_STATE_NO_INITIAL_STATE__EEXPRESSION = "if isStart then owningManager.initialState.oclAsSet()->includes(self) else true endif";

	/**
	 * Validates the StartStateNoInitialState constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerState_StartStateNoInitialState(ManagerState managerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_STATE,
				 managerState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StartStateNoInitialState",
				 MANAGER_STATE__START_STATE_NO_INITIAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OutgoingTransitionsProbabilitySumMustBe1 constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_STATE__OUTGOING_TRANSITIONS_PROBABILITY_SUM_MUST_BE1__EEXPRESSION = "if not owningManager.finalState->includes(self) then outgoingTransition->collect(transProb)->iterate(p : Real ; res : Real = 0 | res + p) = 1.0 else true endif";

	/**
	 * Validates the OutgoingTransitionsProbabilitySumMustBe1 constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerState_OutgoingTransitionsProbabilitySumMustBe1(ManagerState managerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_STATE,
				 managerState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OutgoingTransitionsProbabilitySumMustBe1",
				 MANAGER_STATE__OUTGOING_TRANSITIONS_PROBABILITY_SUM_MUST_BE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ManagerStateNameUndefined constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_STATE__MANAGER_STATE_NAME_UNDEFINED__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the ManagerStateNameUndefined constraint of '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerState_ManagerStateNameUndefined(ManagerState managerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_STATE,
				 managerState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ManagerStateNameUndefined",
				 MANAGER_STATE__MANAGER_STATE_NAME_UNDEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerTransition(ManagerTransition managerTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(managerTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerTransition_TransProbMax1(managerTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerTransition_ManagerTransitionUndefinedName(managerTransition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TransProbMax1 constraint of '<em>Manager Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_TRANSITION__TRANS_PROB_MAX1__EEXPRESSION = "transProb <= 1.0 and not transProb.oclIsUndefined()";

	/**
	 * Validates the TransProbMax1 constraint of '<em>Manager Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerTransition_TransProbMax1(ManagerTransition managerTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_TRANSITION,
				 managerTransition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TransProbMax1",
				 MANAGER_TRANSITION__TRANS_PROB_MAX1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ManagerTransitionUndefinedName constraint of '<em>Manager Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_TRANSITION__MANAGER_TRANSITION_UNDEFINED_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the ManagerTransitionUndefinedName constraint of '<em>Manager Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerTransition_ManagerTransitionUndefinedName(ManagerTransition managerTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_TRANSITION,
				 managerTransition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ManagerTransitionUndefinedName",
				 MANAGER_TRANSITION__MANAGER_TRANSITION_UNDEFINED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerParameter(ManagerParameter managerParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(managerParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(managerParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(managerParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(managerParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(managerParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(managerParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(managerParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(managerParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(managerParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagerParameter_ManagerParameterUndefinedName(managerParameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ManagerParameterUndefinedName constraint of '<em>Manager Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGER_PARAMETER__MANAGER_PARAMETER_UNDEFINED_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the ManagerParameterUndefinedName constraint of '<em>Manager Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerParameter_ManagerParameterUndefinedName(ManagerParameter managerParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGER_PARAMETER,
				 managerParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ManagerParameterUndefinedName",
				 MANAGER_PARAMETER__MANAGER_PARAMETER_UNDEFINED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagedElement(ManagedElement managedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(managedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(managedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(managedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(managedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(managedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(managedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(managedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(managedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(managedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagedElement_ManagedElementUndefinedName(managedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ManagedElementUndefinedName constraint of '<em>Managed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGED_ELEMENT__MANAGED_ELEMENT_UNDEFINED_NAME__EEXPRESSION = "not name.oclIsUndefined()";

	/**
	 * Validates the ManagedElementUndefinedName constraint of '<em>Managed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagedElement_ManagedElementUndefinedName(ManagedElement managedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MngrPackage.Literals.MANAGED_ELEMENT,
				 managedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ManagedElementUndefinedName",
				 MANAGED_ELEMENT__MANAGED_ELEMENT_UNDEFINED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MngrValidator
