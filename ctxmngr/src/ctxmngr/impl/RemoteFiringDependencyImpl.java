/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr.impl;

import ctxmngr.ContextManager;
import ctxmngr.CtxTransition;
import ctxmngr.CtxmngrPackage;
import ctxmngr.RemoteFiringDependency;

import java.util.Collection;

import mngr.ManagerTransition;

import named.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Firing Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ctxmngr.impl.RemoteFiringDependencyImpl#getFired <em>Fired</em>}</li>
 *   <li>{@link ctxmngr.impl.RemoteFiringDependencyImpl#getFiring <em>Firing</em>}</li>
 *   <li>{@link ctxmngr.impl.RemoteFiringDependencyImpl#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link ctxmngr.impl.RemoteFiringDependencyImpl#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteFiringDependencyImpl extends NamedElementImpl implements RemoteFiringDependency {
	/**
	 * The cached value of the '{@link #getFired() <em>Fired</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFired()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerTransition> fired;

	/**
	 * The cached value of the '{@link #getFiring() <em>Firing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiring()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerTransition> firing;

	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected EList<CtxTransition> represents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteFiringDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxmngrPackage.Literals.REMOTE_FIRING_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerTransition> getFired() {
		if (fired == null) {
			fired = new EObjectResolvingEList<ManagerTransition>(ManagerTransition.class, this, CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRED);
		}
		return fired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerTransition> getFiring() {
		if (firing == null) {
			firing = new EObjectResolvingEList<ManagerTransition>(ManagerTransition.class, this, CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRING);
		}
		return firing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager getOwningManager() {
		if (eContainerFeatureID() != CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER) return null;
		return (ContextManager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningManager(ContextManager newOwningManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningManager, CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningManager(ContextManager newOwningManager) {
		if (newOwningManager != eInternalContainer() || (eContainerFeatureID() != CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER && newOwningManager != null)) {
			if (EcoreUtil.isAncestor(this, newOwningManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningManager != null)
				msgs = ((InternalEObject)newOwningManager).eInverseAdd(this, CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS, ContextManager.class, msgs);
			msgs = basicSetOwningManager(newOwningManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER, newOwningManager, newOwningManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CtxTransition> getRepresents() {
		if (represents == null) {
			represents = new EObjectResolvingEList<CtxTransition>(CtxTransition.class, this, CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__REPRESENTS);
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningManager((ContextManager)otherEnd, msgs);
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
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER:
				return basicSetOwningManager(null, msgs);
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
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER:
				return eInternalContainer().eInverseRemove(this, CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS, ContextManager.class, msgs);
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
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRED:
				return getFired();
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRING:
				return getFiring();
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER:
				return getOwningManager();
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__REPRESENTS:
				return getRepresents();
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
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRED:
				getFired().clear();
				getFired().addAll((Collection<? extends ManagerTransition>)newValue);
				return;
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRING:
				getFiring().clear();
				getFiring().addAll((Collection<? extends ManagerTransition>)newValue);
				return;
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER:
				setOwningManager((ContextManager)newValue);
				return;
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__REPRESENTS:
				getRepresents().clear();
				getRepresents().addAll((Collection<? extends CtxTransition>)newValue);
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
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRED:
				getFired().clear();
				return;
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRING:
				getFiring().clear();
				return;
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER:
				setOwningManager((ContextManager)null);
				return;
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__REPRESENTS:
				getRepresents().clear();
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
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRED:
				return fired != null && !fired.isEmpty();
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__FIRING:
				return firing != null && !firing.isEmpty();
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER:
				return getOwningManager() != null;
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY__REPRESENTS:
				return represents != null && !represents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RemoteFiringDependencyImpl
