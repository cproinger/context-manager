/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr.impl;

import ctxmngr.ContextManager;
import ctxmngr.CtxState;
import ctxmngr.CtxTransition;
import ctxmngr.CtxmngrPackage;

import java.util.Collection;

import mngr.ManagerTransition;

import named.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctx Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getTransProb <em>Trans Prob</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getManagerTransition <em>Manager Transition</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#getTransRate <em>Trans Rate</em>}</li>
 *   <li>{@link ctxmngr.impl.CtxTransitionImpl#isIsRemote <em>Is Remote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtxTransitionImpl extends NamedElementImpl implements CtxTransition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected CtxState source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CtxState target;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected String output = OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransProb() <em>Trans Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransProb()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANS_PROB_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransProb() <em>Trans Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransProb()
	 * @generated
	 * @ordered
	 */
	protected double transProb = TRANS_PROB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManagerTransition() <em>Manager Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerTransition> managerTransition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<String> action;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<String> event;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> condition;

	/**
	 * The default value of the '{@link #getTransRate() <em>Trans Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransRate()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANS_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransRate() <em>Trans Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransRate()
	 * @generated
	 * @ordered
	 */
	protected double transRate = TRANS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRemote() <em>Is Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REMOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRemote() <em>Is Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemote()
	 * @generated
	 * @ordered
	 */
	protected boolean isRemote = IS_REMOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtxTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxmngrPackage.Literals.CTX_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager getOwningManager() {
		if (eContainerFeatureID() != CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER) return null;
		return (ContextManager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningManager(ContextManager newOwningManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningManager, CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningManager(ContextManager newOwningManager) {
		if (newOwningManager != eInternalContainer() || (eContainerFeatureID() != CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER && newOwningManager != null)) {
			if (EcoreUtil.isAncestor(this, newOwningManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningManager != null)
				msgs = ((InternalEObject)newOwningManager).eInverseAdd(this, CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION, ContextManager.class, msgs);
			msgs = basicSetOwningManager(newOwningManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER, newOwningManager, newOwningManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxState getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (CtxState)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxmngrPackage.CTX_TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxState basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(CtxState newSource, NotificationChain msgs) {
		CtxState oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(CtxState newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION, CtxState.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION, CtxState.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxState getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (CtxState)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxmngrPackage.CTX_TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxState basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(CtxState newTarget, NotificationChain msgs) {
		CtxState oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(CtxState newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION, CtxState.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION, CtxState.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(String newOutput) {
		String oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransProb() {
		return transProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransProb(double newTransProb) {
		double oldTransProb = transProb;
		transProb = newTransProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__TRANS_PROB, oldTransProb, transProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerTransition> getManagerTransition() {
		if (managerTransition == null) {
			managerTransition = new EObjectResolvingEList<ManagerTransition>(ManagerTransition.class, this, CtxmngrPackage.CTX_TRANSITION__MANAGER_TRANSITION);
		}
		return managerTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAction() {
		if (action == null) {
			action = new EDataTypeUniqueEList<String>(String.class, this, CtxmngrPackage.CTX_TRANSITION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEvent() {
		if (event == null) {
			event = new EDataTypeUniqueEList<String>(String.class, this, CtxmngrPackage.CTX_TRANSITION__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCondition() {
		if (condition == null) {
			condition = new EDataTypeUniqueEList<String>(String.class, this, CtxmngrPackage.CTX_TRANSITION__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransRate() {
		return transRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransRate(double newTransRate) {
		double oldTransRate = transRate;
		transRate = newTransRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__TRANS_RATE, oldTransRate, transRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRemote() {
		return isRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRemote(boolean newIsRemote) {
		boolean oldIsRemote = isRemote;
		isRemote = newIsRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CTX_TRANSITION__IS_REMOTE, oldIsRemote, isRemote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningManager((ContextManager)otherEnd, msgs);
			case CtxmngrPackage.CTX_TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, CtxmngrPackage.CTX_STATE__OUTGOING_TRANSITION, CtxState.class, msgs);
				return basicSetSource((CtxState)otherEnd, msgs);
			case CtxmngrPackage.CTX_TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, CtxmngrPackage.CTX_STATE__INCOMING_TRANSITION, CtxState.class, msgs);
				return basicSetTarget((CtxState)otherEnd, msgs);
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
			case CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER:
				return basicSetOwningManager(null, msgs);
			case CtxmngrPackage.CTX_TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case CtxmngrPackage.CTX_TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
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
			case CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER:
				return eInternalContainer().eInverseRemove(this, CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION, ContextManager.class, msgs);
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
			case CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER:
				return getOwningManager();
			case CtxmngrPackage.CTX_TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CtxmngrPackage.CTX_TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CtxmngrPackage.CTX_TRANSITION__INPUT:
				return getInput();
			case CtxmngrPackage.CTX_TRANSITION__OUTPUT:
				return getOutput();
			case CtxmngrPackage.CTX_TRANSITION__TRANS_PROB:
				return getTransProb();
			case CtxmngrPackage.CTX_TRANSITION__MANAGER_TRANSITION:
				return getManagerTransition();
			case CtxmngrPackage.CTX_TRANSITION__ACTION:
				return getAction();
			case CtxmngrPackage.CTX_TRANSITION__EVENT:
				return getEvent();
			case CtxmngrPackage.CTX_TRANSITION__CONDITION:
				return getCondition();
			case CtxmngrPackage.CTX_TRANSITION__TRANS_RATE:
				return getTransRate();
			case CtxmngrPackage.CTX_TRANSITION__IS_REMOTE:
				return isIsRemote();
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
			case CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER:
				setOwningManager((ContextManager)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__SOURCE:
				setSource((CtxState)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__TARGET:
				setTarget((CtxState)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__INPUT:
				setInput((String)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__OUTPUT:
				setOutput((String)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__TRANS_PROB:
				setTransProb((Double)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__MANAGER_TRANSITION:
				getManagerTransition().clear();
				getManagerTransition().addAll((Collection<? extends ManagerTransition>)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends String>)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends String>)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends String>)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__TRANS_RATE:
				setTransRate((Double)newValue);
				return;
			case CtxmngrPackage.CTX_TRANSITION__IS_REMOTE:
				setIsRemote((Boolean)newValue);
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
			case CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER:
				setOwningManager((ContextManager)null);
				return;
			case CtxmngrPackage.CTX_TRANSITION__SOURCE:
				setSource((CtxState)null);
				return;
			case CtxmngrPackage.CTX_TRANSITION__TARGET:
				setTarget((CtxState)null);
				return;
			case CtxmngrPackage.CTX_TRANSITION__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case CtxmngrPackage.CTX_TRANSITION__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case CtxmngrPackage.CTX_TRANSITION__TRANS_PROB:
				setTransProb(TRANS_PROB_EDEFAULT);
				return;
			case CtxmngrPackage.CTX_TRANSITION__MANAGER_TRANSITION:
				getManagerTransition().clear();
				return;
			case CtxmngrPackage.CTX_TRANSITION__ACTION:
				getAction().clear();
				return;
			case CtxmngrPackage.CTX_TRANSITION__EVENT:
				getEvent().clear();
				return;
			case CtxmngrPackage.CTX_TRANSITION__CONDITION:
				getCondition().clear();
				return;
			case CtxmngrPackage.CTX_TRANSITION__TRANS_RATE:
				setTransRate(TRANS_RATE_EDEFAULT);
				return;
			case CtxmngrPackage.CTX_TRANSITION__IS_REMOTE:
				setIsRemote(IS_REMOTE_EDEFAULT);
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
			case CtxmngrPackage.CTX_TRANSITION__OWNING_MANAGER:
				return getOwningManager() != null;
			case CtxmngrPackage.CTX_TRANSITION__SOURCE:
				return source != null;
			case CtxmngrPackage.CTX_TRANSITION__TARGET:
				return target != null;
			case CtxmngrPackage.CTX_TRANSITION__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
			case CtxmngrPackage.CTX_TRANSITION__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
			case CtxmngrPackage.CTX_TRANSITION__TRANS_PROB:
				return transProb != TRANS_PROB_EDEFAULT;
			case CtxmngrPackage.CTX_TRANSITION__MANAGER_TRANSITION:
				return managerTransition != null && !managerTransition.isEmpty();
			case CtxmngrPackage.CTX_TRANSITION__ACTION:
				return action != null && !action.isEmpty();
			case CtxmngrPackage.CTX_TRANSITION__EVENT:
				return event != null && !event.isEmpty();
			case CtxmngrPackage.CTX_TRANSITION__CONDITION:
				return condition != null && !condition.isEmpty();
			case CtxmngrPackage.CTX_TRANSITION__TRANS_RATE:
				return transRate != TRANS_RATE_EDEFAULT;
			case CtxmngrPackage.CTX_TRANSITION__IS_REMOTE:
				return isRemote != IS_REMOTE_EDEFAULT;
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
		result.append(" (input: ");
		result.append(input);
		result.append(", output: ");
		result.append(output);
		result.append(", transProb: ");
		result.append(transProb);
		result.append(", Action: ");
		result.append(action);
		result.append(", Event: ");
		result.append(event);
		result.append(", Condition: ");
		result.append(condition);
		result.append(", transRate: ");
		result.append(transRate);
		result.append(", isRemote: ");
		result.append(isRemote);
		result.append(')');
		return result.toString();
	}

} //CtxTransitionImpl
