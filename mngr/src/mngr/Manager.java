/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr;

import named.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mngr.Manager#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link mngr.Manager#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link mngr.Manager#getFinalState <em>Final State</em>}</li>
 *   <li>{@link mngr.Manager#getContextParameters <em>Context Parameters</em>}</li>
 *   <li>{@link mngr.Manager#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link mngr.Manager#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mngr.MngrPackage#getManager()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DuplicateTransition ManagerStateNameUnique InitialStateNoIncomingTransitions ManagedElementNameUnique InitialStateNoFinalState finalStateMustHaveIncomingTransition FinalStatesNoOutgoingTransitions ManagerTransitionNameUnique InitialStateMustBeStart ManagerParameterNameUnique FinalStateMustBeEnd'"
 *        annotation="gmf.diagram model.extension='mngr' diagram.extension='mngr_diagram'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DuplicateTransition='ManagerTransition.allInstances()->forAll(t1 : ManagerTransition, t2 : ManagerTransition | t1 <> t2 implies t1.target <> t2.target or t1.source <> t2.source)' ManagerStateNameUnique='ManagerState.allInstances()->forAll(m1 : ManagerState, m2 : ManagerState | m1 <> m2 implies m1.name <> m2.name)' InitialStateNoIncomingTransitions='initialState.incomingTransition->size() = 0' ManagedElementNameUnique='ManagedElement.allInstances()->forAll(m1 : ManagedElement, m2 : ManagedElement | m1 <> m2 implies m1.name <> m2.name)' InitialStateNoFinalState='finalState->forAll(s : ManagerState | s <> initialState)' finalStateMustHaveIncomingTransition='finalState->forAll(s : ManagerState | s.incomingTransition->size() > 0)' FinalStatesNoOutgoingTransitions='finalState->forAll(s : ManagerState | s.outgoingTransition->size() = 0)' ManagerTransitionNameUnique='ManagerTransition.allInstances()->forAll(m1 : ManagerTransition, m2 : ManagerTransition | m1 <> m2 implies m1.name <> m2.name)' InitialStateMustBeStart='initialState.isStart and not initialState.isEnd' ManagerParameterNameUnique='ManagerParameter.allInstances()->forAll(m1 : ManagerParameter, m2 : ManagerParameter | m1 <> m2 implies m1.name <> m2.name)' FinalStateMustBeEnd='finalState->forAll(s : ManagerState | s.isEnd and not s.isStart)'"
 * @generated
 */
public interface Manager extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link mngr.ManagerState}.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerState#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see mngr.MngrPackage#getManager_OwnedState()
	 * @see mngr.ManagerState#getOwningManager
	 * @model opposite="owningManager" containment="true"
	 * @generated
	 */
	EList<ManagerState> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(ManagerState)
	 * @see mngr.MngrPackage#getManager_InitialState()
	 * @model required="true"
	 * @generated
	 */
	ManagerState getInitialState();

	/**
	 * Sets the value of the '{@link mngr.Manager#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(ManagerState value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference list.
	 * @see mngr.MngrPackage#getManager_FinalState()
	 * @model
	 * @generated
	 */
	EList<ManagerState> getFinalState();

	/**
	 * Returns the value of the '<em><b>Context Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link mngr.ManagerParameter}.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerParameter#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Parameters</em>' containment reference list.
	 * @see mngr.MngrPackage#getManager_ContextParameters()
	 * @see mngr.ManagerParameter#getOwningManager
	 * @model opposite="owningManager" containment="true"
	 * @generated
	 */
	EList<ManagerParameter> getContextParameters();

	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' containment reference list.
	 * The list contents are of type {@link mngr.ManagedElement}.
	 * It is bidirectional and its opposite is '{@link mngr.ManagedElement#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Element</em>' containment reference list.
	 * @see mngr.MngrPackage#getManager_ManagedElement()
	 * @see mngr.ManagedElement#getOwningManager
	 * @model opposite="owningManager" containment="true" required="true"
	 * @generated
	 */
	EList<ManagedElement> getManagedElement();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' containment reference list.
	 * The list contents are of type {@link mngr.ManagerTransition}.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerTransition#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' containment reference list.
	 * @see mngr.MngrPackage#getManager_OwnedTransition()
	 * @see mngr.ManagerTransition#getOwningManager
	 * @model opposite="owningManager" containment="true"
	 * @generated
	 */
	EList<ManagerTransition> getOwnedTransition();

} // Manager
