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

import java.util.Collection;

import mngr.ManagerState;

import named.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctx State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ctxmngr.impl.CtxStateImpl#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxStateImpl#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxStateImpl#getIncomingTransition <em>Incoming Transition</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxStateImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxStateImpl#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxStateImpl#getContextParameters <em>Context Parameters</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxStateImpl#getManagerStates <em>Manager States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtxStateImpl extends NamedElementImpl implements CtxState {
	/**
	 * The cached value of the '{@link #getOutgoingTransition() <em>Outgoing Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<CtxTransition> outgoingTransition;

	/**
	 * The cached value of the '{@link #getIncomingTransition() <em>Incoming Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<CtxTransition> incomingTransition;

	/**
	 * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected boolean isStart = IS_START_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnd = IS_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContextParameters() <em>Context Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextParameter> contextParameters;

	/**
	 * The cached value of the '{@link #getManagerStates() <em>Manager States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerStates()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerState> managerStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtxStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxmngrPackage.Literals.CTX_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager getOwningManager() {
		if (eContainerFeatureID() != CtxmngrPackage.CTX_STATE__OWNING_MANAGER) return null;
		return (ContextManager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningManager(ContextManager newOwningManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningManager, CtxmngrPackage.CTX_STATE__OWNING_MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningManager(ContextManager newOwningManager) {
		if (newOwningManager != eInternalContainer() || (eContainerFeatureID() != CtxmngrPackage.CTX_STATE__OWNING_MANAGER && newOwningManager != null)) {
			if (EcoreUtil.isAncestor(this, newOwningManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningManager != null)
				msgs = ((InternalEObject)newOwningManager).eInverseAdd(this, CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE, ContextManager.class, msgs);
			msgs = basicSetOwningManager(newOwningManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_STATE__OWNING_MANAGER, newOwningManager, newOwningManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CtxTransition> getOutgoingTransition() {
		if (outgoingTransition == null) {
			outgoingTransition = new EObjectWithInverseResolvingEList<CtxTransition>(CtxTransition.class, this, CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION, CtxmngrPackage.CTX_TRANSITION__SOURCE);
		}
		return outgoingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CtxTransition> getIncomingTransition() {
		if (incomingTransition == null) {
			incomingTransition = new EObjectWithInverseResolvingEList<CtxTransition>(CtxTransition.class, this, CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION, CtxmngrPackage.CTX_TRANSITION__TARGET);
		}
		return incomingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStart() {
		return isStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStart(boolean newIsStart) {
		boolean oldIsStart = isStart;
		isStart = newIsStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_STATE__IS_START, oldIsStart, isStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnd() {
		return isEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnd(boolean newIsEnd) {
		boolean oldIsEnd = isEnd;
		isEnd = newIsEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_STATE__IS_END, oldIsEnd, isEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextParameter> getContextParameters() {
		if (contextParameters == null) {
			contextParameters = new EObjectWithInverseResolvingEList.ManyInverse<ContextParameter>(ContextParameter.class, this, CtxmngrPackage.CTX_STATE__CONTEXT_PARAMETERS, CtxmngrPackage.CONTEXT_PARAMETER__STATE);
		}
		return contextParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerState> getManagerStates() {
		if (managerStates == null) {
			managerStates = new EObjectResolvingEList<ManagerState>(ManagerState.class, this, CtxmngrPackage.CTX_STATE__MANAGER_STATES);
		}
		return managerStates;
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
			case CtxmngrPackage.CTX_STATE__OWNING_MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningManager((ContextManager)otherEnd, msgs);
			case CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransition()).basicAdd(otherEnd, msgs);
			case CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransition()).basicAdd(otherEnd, msgs);
			case CtxmngrPackage.CTX_STATE__CONTEXT_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextParameters()).basicAdd(otherEnd, msgs);
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
			case CtxmngrPackage.CTX_STATE__OWNING_MANAGER:
				return basicSetOwningManager(null, msgs);
			case CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION:
				return ((InternalEList<?>)getOutgoingTransition()).basicRemove(otherEnd, msgs);
			case CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION:
				return ((InternalEList<?>)getIncomingTransition()).basicRemove(otherEnd, msgs);
			case CtxmngrPackage.CTX_STATE__CONTEXT_PARAMETERS:
				return ((InternalEList<?>)getContextParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CtxmngrPackage.CTX_STATE__OWNING_MANAGER:
				return eInternalContainer().eInverseRemove(this, CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE, ContextManager.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxmngrPackage.CTX_STATE__OWNING_MANAGER:
				return getOwningManager();
			case CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION:
				return getOutgoingTransition();
			case CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION:
				return getIncomingTransition();
			case CtxmngrPackage.CTX_STATE__IS_START:
				return isIsStart();
			case CtxmngrPackage.CTX_STATE__IS_END:
				return isIsEnd();
			case CtxmngrPackage.CTX_STATE__CONTEXT_PARAMETERS:
				return getContextParameters();
			case CtxmngrPackage.CTX_STATE__MANAGER_STATES:
				return getManagerStates();
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
			case CtxmngrPackage.CTX_STATE__OWNING_MANAGER:
				setOwningManager((ContextManager)newValue);
				return;
			case CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				getOutgoingTransition().addAll((Collection<? extends CtxTransition>)newValue);
				return;
			case CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
				getIncomingTransition().addAll((Collection<? extends CtxTransition>)newValue);
				return;
			case CtxmngrPackage.CTX_STATE__IS_START:
				setIsStart((Boolean)newValue);
				return;
			case CtxmngrPackage.CTX_STATE__IS_END:
				setIsEnd((Boolean)newValue);
				return;
			case CtxmngrPackage.CTX_STATE__CONTEXT_PARAMETERS:
				getContextParameters().clear();
				getContextParameters().addAll((Collection<? extends ContextParameter>)newValue);
				return;
			case CtxmngrPackage.CTX_STATE__MANAGER_STATES:
				getManagerStates().clear();
				getManagerStates().addAll((Collection<? extends ManagerState>)newValue);
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
			case CtxmngrPackage.CTX_STATE__OWNING_MANAGER:
				setOwningManager((ContextManager)null);
				return;
			case CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				return;
			case CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
				return;
			case CtxmngrPackage.CTX_STATE__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case CtxmngrPackage.CTX_STATE__IS_END:
				setIsEnd(IS_END_EDEFAULT);
				return;
			case CtxmngrPackage.CTX_STATE__CONTEXT_PARAMETERS:
				getContextParameters().clear();
				return;
			case CtxmngrPackage.CTX_STATE__MANAGER_STATES:
				getManagerStates().clear();
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
			case CtxmngrPackage.CTX_STATE__OWNING_MANAGER:
				return getOwningManager() != null;
			case CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION:
				return outgoingTransition != null && !outgoingTransition.isEmpty();
			case CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION:
				return incomingTransition != null && !incomingTransition.isEmpty();
			case CtxmngrPackage.CTX_STATE__IS_START:
				return isStart != IS_START_EDEFAULT;
			case CtxmngrPackage.CTX_STATE__IS_END:
				return isEnd != IS_END_EDEFAULT;
			case CtxmngrPackage.CTX_STATE__CONTEXT_PARAMETERS:
				return contextParameters != null && !contextParameters.isEmpty();
			case CtxmngrPackage.CTX_STATE__MANAGER_STATES:
				return managerStates != null && !managerStates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isStart: ");
		result.append(isStart);
		result.append(", isEnd: ");
		result.append(isEnd);
		result.append(')');
		return result.toString();
	}

} //CtxStateImpl
