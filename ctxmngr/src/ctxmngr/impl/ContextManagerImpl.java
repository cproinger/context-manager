/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr.impl;

import ctxmngr.ContextManager;
import ctxmngr.ContextParameter;
import ctxmngr.CtxState;
import ctxmngr.CtxTransition;
import ctxmngr.CtxmngrPackage;
import ctxmngr.RemoteFiringDependency;

import java.util.Collection;

import mngr.Manager;

import named.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ctxmngr.impl.ContextManagerImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextManagerImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextManagerImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextManagerImpl#getContextParameters <em>Context Parameters</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextManagerImpl#getCombinedManager <em>Combined Manager</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextManagerImpl#getRemoteFirings <em>Remote Firings</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextManagerImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextManagerImpl extends NamedElementImpl implements ContextManager {
	/**
	 * The cached value of the '{@link #getOwnedState() <em>Owned State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedState()
	 * @generated
	 * @ordered
	 */
	protected EList<CtxState> ownedState;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected CtxState initialState;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected EList<CtxState> finalState;

	/**
	 * The cached value of the '{@link #getContextParameters() <em>Context Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextParameter> contextParameters;

	/**
	 * The cached value of the '{@link #getCombinedManager() <em>Combined Manager</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedManager()
	 * @generated
	 * @ordered
	 */
	protected EList<Manager> combinedManager;

	/**
	 * The cached value of the '{@link #getRemoteFirings() <em>Remote Firings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteFirings()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteFiringDependency> remoteFirings;

	/**
	 * The cached value of the '{@link #getOwnedTransition() <em>Owned Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<CtxTransition> ownedTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxmngrPackage.Literals.CONTEXT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CtxState> getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentWithInverseEList<CtxState>(CtxState.class, this, CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE, CtxmngrPackage.CTX_STATE__OWNING_MANAGER);
		}
		return ownedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxState getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (CtxState)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxmngrPackage.CONTEXT_MANAGER__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxState basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(CtxState newInitialState) {
		CtxState oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CONTEXT_MANAGER__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CtxState> getFinalState() {
		if (finalState == null) {
			finalState = new EObjectResolvingEList<CtxState>(CtxState.class, this, CtxmngrPackage.CONTEXT_MANAGER__FINAL_STATE);
		}
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextParameter> getContextParameters() {
		if (contextParameters == null) {
			contextParameters = new EObjectContainmentWithInverseEList<ContextParameter>(ContextParameter.class, this, CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS, CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER);
		}
		return contextParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manager> getCombinedManager() {
		if (combinedManager == null) {
			combinedManager = new EObjectResolvingEList<Manager>(Manager.class, this, CtxmngrPackage.CONTEXT_MANAGER__COMBINED_MANAGER);
		}
		return combinedManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoteFiringDependency> getRemoteFirings() {
		if (remoteFirings == null) {
			remoteFirings = new EObjectContainmentWithInverseEList<RemoteFiringDependency>(RemoteFiringDependency.class, this, CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS, CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER);
		}
		return remoteFirings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CtxTransition> getOwnedTransition() {
		if (ownedTransition == null) {
			ownedTransition = new EObjectContainmentWithInverseEList<CtxTransition>(CtxTransition.class, this, CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION, CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER);
		}
		return ownedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedState()).basicAdd(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextParameters()).basicAdd(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemoteFirings()).basicAdd(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTransition()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE:
				return ((InternalEList<?>)getOwnedState()).basicRemove(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS:
				return ((InternalEList<?>)getContextParameters()).basicRemove(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS:
				return ((InternalEList<?>)getRemoteFirings()).basicRemove(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION:
				return ((InternalEList<?>)getOwnedTransition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE:
				return getOwnedState();
			case CtxmngrPackage.CONTEXT_MANAGER__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case CtxmngrPackage.CONTEXT_MANAGER__FINAL_STATE:
				return getFinalState();
			case CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS:
				return getContextParameters();
			case CtxmngrPackage.CONTEXT_MANAGER__COMBINED_MANAGER:
				return getCombinedManager();
			case CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS:
				return getRemoteFirings();
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION:
				return getOwnedTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends CtxState>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__INITIAL_STATE:
				setInitialState((CtxState)newValue);
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__FINAL_STATE:
				getFinalState().clear();
				getFinalState().addAll((Collection<? extends CtxState>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS:
				getContextParameters().clear();
				getContextParameters().addAll((Collection<? extends ContextParameter>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__COMBINED_MANAGER:
				getCombinedManager().clear();
				getCombinedManager().addAll((Collection<? extends Manager>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS:
				getRemoteFirings().clear();
				getRemoteFirings().addAll((Collection<? extends RemoteFiringDependency>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends CtxTransition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE:
				getOwnedState().clear();
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__INITIAL_STATE:
				setInitialState((CtxState)null);
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__FINAL_STATE:
				getFinalState().clear();
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS:
				getContextParameters().clear();
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__COMBINED_MANAGER:
				getCombinedManager().clear();
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS:
				getRemoteFirings().clear();
				return;
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION:
				getOwnedTransition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case CtxmngrPackage.CONTEXT_MANAGER__INITIAL_STATE:
				return initialState != null;
			case CtxmngrPackage.CONTEXT_MANAGER__FINAL_STATE:
				return finalState != null && !finalState.isEmpty();
			case CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS:
				return contextParameters != null && !contextParameters.isEmpty();
			case CtxmngrPackage.CONTEXT_MANAGER__COMBINED_MANAGER:
				return combinedManager != null && !combinedManager.isEmpty();
			case CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS:
				return remoteFirings != null && !remoteFirings.isEmpty();
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION:
				return ownedTransition != null && !ownedTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextManagerImpl
