/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr.impl;

import java.util.Collection;

import mngr.ManagedElement;
import mngr.Manager;
import mngr.ManagerParameter;
import mngr.ManagerState;
import mngr.ManagerTransition;
import mngr.MngrPackage;

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
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mngr.impl.ManagerImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link mngr.impl.ManagerImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link mngr.impl.ManagerImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link mngr.impl.ManagerImpl#getContextParameters <em>Context Parameters</em>}</li>
 *   <li>{@link mngr.impl.ManagerImpl#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link mngr.impl.ManagerImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerImpl extends NamedElementImpl implements Manager {
	/**
	 * The cached value of the '{@link #getOwnedState() <em>Owned State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedState()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerState> ownedState;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected ManagerState initialState;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerState> finalState;

	/**
	 * The cached value of the '{@link #getContextParameters() <em>Context Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerParameter> contextParameters;

	/**
	 * The cached value of the '{@link #getManagedElement() <em>Managed Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagedElement> managedElement;

	/**
	 * The cached value of the '{@link #getOwnedTransition() <em>Owned Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerTransition> ownedTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MngrPackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerState> getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentWithInverseEList<ManagerState>(ManagerState.class, this, MngrPackage.MANAGER__OWNED_STATE, MngrPackage.MANAGER_STATE__OWNING_MANAGER);
		}
		return ownedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerState getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (ManagerState)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MngrPackage.MANAGER__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerState basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(ManagerState newInitialState) {
		ManagerState oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerState> getFinalState() {
		if (finalState == null) {
			finalState = new EObjectResolvingEList<ManagerState>(ManagerState.class, this, MngrPackage.MANAGER__FINAL_STATE);
		}
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerParameter> getContextParameters() {
		if (contextParameters == null) {
			contextParameters = new EObjectContainmentWithInverseEList<ManagerParameter>(ManagerParameter.class, this, MngrPackage.MANAGER__CONTEXT_PARAMETERS, MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER);
		}
		return contextParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagedElement> getManagedElement() {
		if (managedElement == null) {
			managedElement = new EObjectContainmentWithInverseEList<ManagedElement>(ManagedElement.class, this, MngrPackage.MANAGER__MANAGED_ELEMENT, MngrPackage.MANAGED_ELEMENT__OWNING_MANAGER);
		}
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerTransition> getOwnedTransition() {
		if (ownedTransition == null) {
			ownedTransition = new EObjectContainmentWithInverseEList<ManagerTransition>(ManagerTransition.class, this, MngrPackage.MANAGER__OWNED_TRANSITION, MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER);
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
			case MngrPackage.MANAGER__OWNED_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedState()).basicAdd(otherEnd, msgs);
			case MngrPackage.MANAGER__CONTEXT_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextParameters()).basicAdd(otherEnd, msgs);
			case MngrPackage.MANAGER__MANAGED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManagedElement()).basicAdd(otherEnd, msgs);
			case MngrPackage.MANAGER__OWNED_TRANSITION:
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
			case MngrPackage.MANAGER__OWNED_STATE:
				return ((InternalEList<?>)getOwnedState()).basicRemove(otherEnd, msgs);
			case MngrPackage.MANAGER__CONTEXT_PARAMETERS:
				return ((InternalEList<?>)getContextParameters()).basicRemove(otherEnd, msgs);
			case MngrPackage.MANAGER__MANAGED_ELEMENT:
				return ((InternalEList<?>)getManagedElement()).basicRemove(otherEnd, msgs);
			case MngrPackage.MANAGER__OWNED_TRANSITION:
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
			case MngrPackage.MANAGER__OWNED_STATE:
				return getOwnedState();
			case MngrPackage.MANAGER__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case MngrPackage.MANAGER__FINAL_STATE:
				return getFinalState();
			case MngrPackage.MANAGER__CONTEXT_PARAMETERS:
				return getContextParameters();
			case MngrPackage.MANAGER__MANAGED_ELEMENT:
				return getManagedElement();
			case MngrPackage.MANAGER__OWNED_TRANSITION:
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
			case MngrPackage.MANAGER__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends ManagerState>)newValue);
				return;
			case MngrPackage.MANAGER__INITIAL_STATE:
				setInitialState((ManagerState)newValue);
				return;
			case MngrPackage.MANAGER__FINAL_STATE:
				getFinalState().clear();
				getFinalState().addAll((Collection<? extends ManagerState>)newValue);
				return;
			case MngrPackage.MANAGER__CONTEXT_PARAMETERS:
				getContextParameters().clear();
				getContextParameters().addAll((Collection<? extends ManagerParameter>)newValue);
				return;
			case MngrPackage.MANAGER__MANAGED_ELEMENT:
				getManagedElement().clear();
				getManagedElement().addAll((Collection<? extends ManagedElement>)newValue);
				return;
			case MngrPackage.MANAGER__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends ManagerTransition>)newValue);
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
			case MngrPackage.MANAGER__OWNED_STATE:
				getOwnedState().clear();
				return;
			case MngrPackage.MANAGER__INITIAL_STATE:
				setInitialState((ManagerState)null);
				return;
			case MngrPackage.MANAGER__FINAL_STATE:
				getFinalState().clear();
				return;
			case MngrPackage.MANAGER__CONTEXT_PARAMETERS:
				getContextParameters().clear();
				return;
			case MngrPackage.MANAGER__MANAGED_ELEMENT:
				getManagedElement().clear();
				return;
			case MngrPackage.MANAGER__OWNED_TRANSITION:
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
			case MngrPackage.MANAGER__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case MngrPackage.MANAGER__INITIAL_STATE:
				return initialState != null;
			case MngrPackage.MANAGER__FINAL_STATE:
				return finalState != null && !finalState.isEmpty();
			case MngrPackage.MANAGER__CONTEXT_PARAMETERS:
				return contextParameters != null && !contextParameters.isEmpty();
			case MngrPackage.MANAGER__MANAGED_ELEMENT:
				return managedElement != null && !managedElement.isEmpty();
			case MngrPackage.MANAGER__OWNED_TRANSITION:
				return ownedTransition != null && !ownedTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManagerImpl
