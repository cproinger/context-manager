/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr.impl;

import java.util.Collection;

import mngr.Manager;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getTransProb <em>Trans Prob</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getTransRate <em>Trans Rate</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link mngr.impl.ManagerTransitionImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerTransitionImpl extends NamedElementImpl implements ManagerTransition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ManagerState source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ManagerState target;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<String> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MngrPackage.Literals.MANAGER_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getOwningManager() {
		if (eContainerFeatureID() != MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER) return null;
		return (Manager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningManager(Manager newOwningManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningManager, MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningManager(Manager newOwningManager) {
		if (newOwningManager != eInternalContainer() || (eContainerFeatureID() != MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER && newOwningManager != null)) {
			if (EcoreUtil.isAncestor(this, newOwningManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningManager != null)
				msgs = ((InternalEObject)newOwningManager).eInverseAdd(this, MngrPackage.MANAGER__OWNED_TRANSITION, Manager.class, msgs);
			msgs = basicSetOwningManager(newOwningManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER, newOwningManager, newOwningManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerState getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ManagerState)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MngrPackage.MANAGER_TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerState basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ManagerState newSource, NotificationChain msgs) {
		ManagerState oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ManagerState newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION, ManagerState.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION, ManagerState.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerState getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ManagerState)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MngrPackage.MANAGER_TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerState basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ManagerState newTarget, NotificationChain msgs) {
		ManagerState oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ManagerState newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, MngrPackage.MANAGER_STATE__INCOMING_TRANSITION, ManagerState.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, MngrPackage.MANAGER_STATE__INCOMING_TRANSITION, ManagerState.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__TARGET, newTarget, newTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__INPUT, oldInput, input));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__OUTPUT, oldOutput, output));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__TRANS_PROB, oldTransProb, transProb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_TRANSITION__TRANS_RATE, oldTransRate, transRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEvent() {
		if (event == null) {
			event = new EDataTypeUniqueEList<String>(String.class, this, MngrPackage.MANAGER_TRANSITION__EVENT);
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
			condition = new EDataTypeUniqueEList<String>(String.class, this, MngrPackage.MANAGER_TRANSITION__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAction() {
		if (action == null) {
			action = new EDataTypeUniqueEList<String>(String.class, this, MngrPackage.MANAGER_TRANSITION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningManager((Manager)otherEnd, msgs);
			case MngrPackage.MANAGER_TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, MngrPackage.MANAGER_STATE__OUTGOING_TRANSITION, ManagerState.class, msgs);
				return basicSetSource((ManagerState)otherEnd, msgs);
			case MngrPackage.MANAGER_TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, MngrPackage.MANAGER_STATE__INCOMING_TRANSITION, ManagerState.class, msgs);
				return basicSetTarget((ManagerState)otherEnd, msgs);
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
			case MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER:
				return basicSetOwningManager(null, msgs);
			case MngrPackage.MANAGER_TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case MngrPackage.MANAGER_TRANSITION__TARGET:
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
			case MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER:
				return eInternalContainer().eInverseRemove(this, MngrPackage.MANAGER__OWNED_TRANSITION, Manager.class, msgs);
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
			case MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER:
				return getOwningManager();
			case MngrPackage.MANAGER_TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case MngrPackage.MANAGER_TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MngrPackage.MANAGER_TRANSITION__INPUT:
				return getInput();
			case MngrPackage.MANAGER_TRANSITION__OUTPUT:
				return getOutput();
			case MngrPackage.MANAGER_TRANSITION__TRANS_PROB:
				return getTransProb();
			case MngrPackage.MANAGER_TRANSITION__TRANS_RATE:
				return getTransRate();
			case MngrPackage.MANAGER_TRANSITION__EVENT:
				return getEvent();
			case MngrPackage.MANAGER_TRANSITION__CONDITION:
				return getCondition();
			case MngrPackage.MANAGER_TRANSITION__ACTION:
				return getAction();
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
			case MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER:
				setOwningManager((Manager)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__SOURCE:
				setSource((ManagerState)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__TARGET:
				setTarget((ManagerState)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__INPUT:
				setInput((String)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__OUTPUT:
				setOutput((String)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__TRANS_PROB:
				setTransProb((Double)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__TRANS_RATE:
				setTransRate((Double)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends String>)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends String>)newValue);
				return;
			case MngrPackage.MANAGER_TRANSITION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends String>)newValue);
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
			case MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER:
				setOwningManager((Manager)null);
				return;
			case MngrPackage.MANAGER_TRANSITION__SOURCE:
				setSource((ManagerState)null);
				return;
			case MngrPackage.MANAGER_TRANSITION__TARGET:
				setTarget((ManagerState)null);
				return;
			case MngrPackage.MANAGER_TRANSITION__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case MngrPackage.MANAGER_TRANSITION__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case MngrPackage.MANAGER_TRANSITION__TRANS_PROB:
				setTransProb(TRANS_PROB_EDEFAULT);
				return;
			case MngrPackage.MANAGER_TRANSITION__TRANS_RATE:
				setTransRate(TRANS_RATE_EDEFAULT);
				return;
			case MngrPackage.MANAGER_TRANSITION__EVENT:
				getEvent().clear();
				return;
			case MngrPackage.MANAGER_TRANSITION__CONDITION:
				getCondition().clear();
				return;
			case MngrPackage.MANAGER_TRANSITION__ACTION:
				getAction().clear();
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
			case MngrPackage.MANAGER_TRANSITION__OWNING_MANAGER:
				return getOwningManager() != null;
			case MngrPackage.MANAGER_TRANSITION__SOURCE:
				return source != null;
			case MngrPackage.MANAGER_TRANSITION__TARGET:
				return target != null;
			case MngrPackage.MANAGER_TRANSITION__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
			case MngrPackage.MANAGER_TRANSITION__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
			case MngrPackage.MANAGER_TRANSITION__TRANS_PROB:
				return transProb != TRANS_PROB_EDEFAULT;
			case MngrPackage.MANAGER_TRANSITION__TRANS_RATE:
				return transRate != TRANS_RATE_EDEFAULT;
			case MngrPackage.MANAGER_TRANSITION__EVENT:
				return event != null && !event.isEmpty();
			case MngrPackage.MANAGER_TRANSITION__CONDITION:
				return condition != null && !condition.isEmpty();
			case MngrPackage.MANAGER_TRANSITION__ACTION:
				return action != null && !action.isEmpty();
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
		result.append(", transRate: ");
		result.append(transRate);
		result.append(", Event: ");
		result.append(event);
		result.append(", Condition: ");
		result.append(condition);
		result.append(", Action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //ManagerTransitionImpl
