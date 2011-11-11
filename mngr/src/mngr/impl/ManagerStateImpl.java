/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr.impl;

import java.util.Collection;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mngr.impl.ManagerStateImpl#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link mngr.impl.ManagerStateImpl#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link mngr.impl.ManagerStateImpl#getIncomingTransition <em>Incoming Transition</em>}</li>
 *   <li>{@link mngr.impl.ManagerStateImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link mngr.impl.ManagerStateImpl#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link mngr.impl.ManagerStateImpl#getProb <em>Prob</em>}</li>
 *   <li>{@link mngr.impl.ManagerStateImpl#getContextParameters <em>Context Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerStateImpl extends NamedElementImpl implements ManagerState {
	/**
	 * The cached value of the '{@link #getOutgoingTransition() <em>Outgoing Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerTransition> outgoingTransition;

	/**
	 * The cached value of the '{@link #getIncomingTransition() <em>Incoming Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerTransition> incomingTransition;

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
	 * The default value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected static final double PROB_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected double prob = PROB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContextParameters() <em>Context Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerParameter> contextParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MngrPackage.Literals.MANAGER_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getOwningManager() {
		if (eContainerFeatureID() != MngrPackage.MANAGER_STATE__OWNING_MANAGER) return null;
		return (Manager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningManager(Manager newOwningManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningManager, MngrPackage.MANAGER_STATE__OWNING_MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningManager(Manager newOwningManager) {
		if (newOwningManager != eInternalContainer() || (eContainerFeatureID() != MngrPackage.MANAGER_STATE__OWNING_MANAGER && newOwningManager != null)) {
			if (EcoreUtil.isAncestor(this, newOwningManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningManager != null)
				msgs = ((InternalEObject)newOwningManager).eInverseAdd(this, MngrPackage.MANAGER__OWNED_STATE, Manager.class, msgs);
			msgs = basicSetOwningManager(newOwningManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_STATE__OWNING_MANAGER, newOwningManager, newOwningManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerTransition> getOutgoingTransition() {
		if (outgoingTransition == null) {
			outgoingTransition = new EObjectWithInverseResolvingEList<ManagerTransition>(ManagerTransition.class, this, MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION, MngrPackage.MANAGER_TRANSITION__SOURCE);
		}
		return outgoingTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerTransition> getIncomingTransition() {
		if (incomingTransition == null) {
			incomingTransition = new EObjectWithInverseResolvingEList<ManagerTransition>(ManagerTransition.class, this, MngrPackage.MANAGER_STATE__INCOMING_TRANSITION, MngrPackage.MANAGER_TRANSITION__TARGET);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_STATE__IS_START, oldIsStart, isStart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_STATE__IS_END, oldIsEnd, isEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProb() {
		return prob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProb(double newProb) {
		double oldProb = prob;
		prob = newProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_STATE__PROB, oldProb, prob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerParameter> getContextParameters() {
		if (contextParameters == null) {
			contextParameters = new EObjectWithInverseResolvingEList.ManyInverse<ManagerParameter>(ManagerParameter.class, this, MngrPackage.MANAGER_STATE__CONTEXT_PARAMETERS, MngrPackage.MANAGER_PARAMETER__STATE);
		}
		return contextParameters;
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
			case MngrPackage.MANAGER_STATE__OWNING_MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningManager((Manager)otherEnd, msgs);
			case MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransition()).basicAdd(otherEnd, msgs);
			case MngrPackage.MANAGER_STATE__INCOMING_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransition()).basicAdd(otherEnd, msgs);
			case MngrPackage.MANAGER_STATE__CONTEXT_PARAMETERS:
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
			case MngrPackage.MANAGER_STATE__OWNING_MANAGER:
				return basicSetOwningManager(null, msgs);
			case MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION:
				return ((InternalEList<?>)getOutgoingTransition()).basicRemove(otherEnd, msgs);
			case MngrPackage.MANAGER_STATE__INCOMING_TRANSITION:
				return ((InternalEList<?>)getIncomingTransition()).basicRemove(otherEnd, msgs);
			case MngrPackage.MANAGER_STATE__CONTEXT_PARAMETERS:
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
			case MngrPackage.MANAGER_STATE__OWNING_MANAGER:
				return eInternalContainer().eInverseRemove(this, MngrPackage.MANAGER__OWNED_STATE, Manager.class, msgs);
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
			case MngrPackage.MANAGER_STATE__OWNING_MANAGER:
				return getOwningManager();
			case MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION:
				return getOutgoingTransition();
			case MngrPackage.MANAGER_STATE__INCOMING_TRANSITION:
				return getIncomingTransition();
			case MngrPackage.MANAGER_STATE__IS_START:
				return isIsStart();
			case MngrPackage.MANAGER_STATE__IS_END:
				return isIsEnd();
			case MngrPackage.MANAGER_STATE__PROB:
				return getProb();
			case MngrPackage.MANAGER_STATE__CONTEXT_PARAMETERS:
				return getContextParameters();
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
			case MngrPackage.MANAGER_STATE__OWNING_MANAGER:
				setOwningManager((Manager)newValue);
				return;
			case MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				getOutgoingTransition().addAll((Collection<? extends ManagerTransition>)newValue);
				return;
			case MngrPackage.MANAGER_STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
				getIncomingTransition().addAll((Collection<? extends ManagerTransition>)newValue);
				return;
			case MngrPackage.MANAGER_STATE__IS_START:
				setIsStart((Boolean)newValue);
				return;
			case MngrPackage.MANAGER_STATE__IS_END:
				setIsEnd((Boolean)newValue);
				return;
			case MngrPackage.MANAGER_STATE__PROB:
				setProb((Double)newValue);
				return;
			case MngrPackage.MANAGER_STATE__CONTEXT_PARAMETERS:
				getContextParameters().clear();
				getContextParameters().addAll((Collection<? extends ManagerParameter>)newValue);
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
			case MngrPackage.MANAGER_STATE__OWNING_MANAGER:
				setOwningManager((Manager)null);
				return;
			case MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION:
				getOutgoingTransition().clear();
				return;
			case MngrPackage.MANAGER_STATE__INCOMING_TRANSITION:
				getIncomingTransition().clear();
				return;
			case MngrPackage.MANAGER_STATE__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case MngrPackage.MANAGER_STATE__IS_END:
				setIsEnd(IS_END_EDEFAULT);
				return;
			case MngrPackage.MANAGER_STATE__PROB:
				setProb(PROB_EDEFAULT);
				return;
			case MngrPackage.MANAGER_STATE__CONTEXT_PARAMETERS:
				getContextParameters().clear();
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
			case MngrPackage.MANAGER_STATE__OWNING_MANAGER:
				return getOwningManager() != null;
			case MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION:
				return outgoingTransition != null && !outgoingTransition.isEmpty();
			case MngrPackage.MANAGER_STATE__INCOMING_TRANSITION:
				return incomingTransition != null && !incomingTransition.isEmpty();
			case MngrPackage.MANAGER_STATE__IS_START:
				return isStart != IS_START_EDEFAULT;
			case MngrPackage.MANAGER_STATE__IS_END:
				return isEnd != IS_END_EDEFAULT;
			case MngrPackage.MANAGER_STATE__PROB:
				return prob != PROB_EDEFAULT;
			case MngrPackage.MANAGER_STATE__CONTEXT_PARAMETERS:
				return contextParameters != null && !contextParameters.isEmpty();
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
		result.append(", Prob: ");
		result.append(prob);
		result.append(')');
		return result.toString();
	}

} //ManagerStateImpl
