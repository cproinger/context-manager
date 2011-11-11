/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr.util;

import ctxmngr.*;

import elem.Element;

import named.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ctxmngr.CtxmngrPackage
 * @generated
 */
public class CtxmngrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CtxmngrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxmngrSwitch() {
		if (modelPackage == null) {
			modelPackage = CtxmngrPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CtxmngrPackage.CONTEXT_MANAGER: {
				ContextManager contextManager = (ContextManager)theEObject;
				T result = caseContextManager(contextManager);
				if (result == null) result = caseNamedElement(contextManager);
				if (result == null) result = caseOwner_Element(contextManager);
				if (result == null) result = caseElement(contextManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxmngrPackage.CTX_STATE: {
				CtxState ctxState = (CtxState)theEObject;
				T result = caseCtxState(ctxState);
				if (result == null) result = caseNamedElement(ctxState);
				if (result == null) result = caseOwner_Element(ctxState);
				if (result == null) result = caseElement(ctxState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxmngrPackage.CTX_TRANSITION: {
				CtxTransition ctxTransition = (CtxTransition)theEObject;
				T result = caseCtxTransition(ctxTransition);
				if (result == null) result = caseNamedElement(ctxTransition);
				if (result == null) result = caseOwner_Element(ctxTransition);
				if (result == null) result = caseElement(ctxTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxmngrPackage.CONTEXT_PARAMETER: {
				ContextParameter contextParameter = (ContextParameter)theEObject;
				T result = caseContextParameter(contextParameter);
				if (result == null) result = caseNamedElement(contextParameter);
				if (result == null) result = caseOwner_Element(contextParameter);
				if (result == null) result = caseElement(contextParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY: {
				RemoteFiringDependency remoteFiringDependency = (RemoteFiringDependency)theEObject;
				T result = caseRemoteFiringDependency(remoteFiringDependency);
				if (result == null) result = caseNamedElement(remoteFiringDependency);
				if (result == null) result = caseOwner_Element(remoteFiringDependency);
				if (result == null) result = caseElement(remoteFiringDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextManager(ContextManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctx State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctx State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtxState(CtxState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctx Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctx Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtxTransition(CtxTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextParameter(ContextParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Firing Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Firing Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteFiringDependency(RemoteFiringDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwner_Element(owner.Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CtxmngrSwitch
