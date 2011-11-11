/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr.impl;

import exp.OpaqueExpression;

import java.util.Collection;

import mngr.Manager;
import mngr.ManagerParameter;
import mngr.ManagerState;
import mngr.MngrPackage;

import named.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mngr.impl.ManagerParameterImpl#getState <em>State</em>}</li>
 *   <li>{@link mngr.impl.ManagerParameterImpl#getOpaqueExpressions <em>Opaque Expressions</em>}</li>
 *   <li>{@link mngr.impl.ManagerParameterImpl#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link mngr.impl.ManagerParameterImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link mngr.impl.ManagerParameterImpl#getLitteralInteger <em>Litteral Integer</em>}</li>
 *   <li>{@link mngr.impl.ManagerParameterImpl#getLitteralString <em>Litteral String</em>}</li>
 *   <li>{@link mngr.impl.ManagerParameterImpl#getLitteralBoolean <em>Litteral Boolean</em>}</li>
 *   <li>{@link mngr.impl.ManagerParameterImpl#getLitteralUnlimitedNatural <em>Litteral Unlimited Natural</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerParameterImpl extends NamedElementImpl implements ManagerParameter {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerState> state;

	/**
	 * The cached value of the '{@link #getOpaqueExpressions() <em>Opaque Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpaqueExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<OpaqueExpression> opaqueExpressions;

	/**
	 * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected boolean isInput = IS_INPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLitteralInteger() <em>Litteral Integer</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitteralInteger()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> litteralInteger;

	/**
	 * The cached value of the '{@link #getLitteralString() <em>Litteral String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitteralString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> litteralString;

	/**
	 * The cached value of the '{@link #getLitteralBoolean() <em>Litteral Boolean</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitteralBoolean()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> litteralBoolean;

	/**
	 * The cached value of the '{@link #getLitteralUnlimitedNatural() <em>Litteral Unlimited Natural</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLitteralUnlimitedNatural()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> litteralUnlimitedNatural;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MngrPackage.Literals.MANAGER_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerState> getState() {
		if (state == null) {
			state = new EObjectWithInverseResolvingEList.ManyInverse<ManagerState>(ManagerState.class, this, MngrPackage.MANAGER_PARAMETER__STATE, MngrPackage.MANAGER_STATE__CONTEXT_PARAMETERS);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpaqueExpression> getOpaqueExpressions() {
		if (opaqueExpressions == null) {
			opaqueExpressions = new EObjectContainmentEList<OpaqueExpression>(OpaqueExpression.class, this, MngrPackage.MANAGER_PARAMETER__OPAQUE_EXPRESSIONS);
		}
		return opaqueExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getOwningManager() {
		if (eContainerFeatureID() != MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER) return null;
		return (Manager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningManager(Manager newOwningManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningManager, MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningManager(Manager newOwningManager) {
		if (newOwningManager != eInternalContainer() || (eContainerFeatureID() != MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER && newOwningManager != null)) {
			if (EcoreUtil.isAncestor(this, newOwningManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningManager != null)
				msgs = ((InternalEObject)newOwningManager).eInverseAdd(this, MngrPackage.MANAGER__CONTEXT_PARAMETERS, Manager.class, msgs);
			msgs = basicSetOwningManager(newOwningManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER, newOwningManager, newOwningManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInput() {
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInput(boolean newIsInput) {
		boolean oldIsInput = isInput;
		isInput = newIsInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MngrPackage.MANAGER_PARAMETER__IS_INPUT, oldIsInput, isInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getLitteralInteger() {
		if (litteralInteger == null) {
			litteralInteger = new EDataTypeUniqueEList<Integer>(Integer.class, this, MngrPackage.MANAGER_PARAMETER__LITTERAL_INTEGER);
		}
		return litteralInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLitteralString() {
		if (litteralString == null) {
			litteralString = new EDataTypeUniqueEList<String>(String.class, this, MngrPackage.MANAGER_PARAMETER__LITTERAL_STRING);
		}
		return litteralString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getLitteralBoolean() {
		if (litteralBoolean == null) {
			litteralBoolean = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, MngrPackage.MANAGER_PARAMETER__LITTERAL_BOOLEAN);
		}
		return litteralBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getLitteralUnlimitedNatural() {
		if (litteralUnlimitedNatural == null) {
			litteralUnlimitedNatural = new EDataTypeUniqueEList<Double>(Double.class, this, MngrPackage.MANAGER_PARAMETER__LITTERAL_UNLIMITED_NATURAL);
		}
		return litteralUnlimitedNatural;
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
			case MngrPackage.MANAGER_PARAMETER__STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getState()).basicAdd(otherEnd, msgs);
			case MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningManager((Manager)otherEnd, msgs);
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
			case MngrPackage.MANAGER_PARAMETER__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case MngrPackage.MANAGER_PARAMETER__OPAQUE_EXPRESSIONS:
				return ((InternalEList<?>)getOpaqueExpressions()).basicRemove(otherEnd, msgs);
			case MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER:
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
			case MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER:
				return eInternalContainer().eInverseRemove(this, MngrPackage.MANAGER__CONTEXT_PARAMETERS, Manager.class, msgs);
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
			case MngrPackage.MANAGER_PARAMETER__STATE:
				return getState();
			case MngrPackage.MANAGER_PARAMETER__OPAQUE_EXPRESSIONS:
				return getOpaqueExpressions();
			case MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER:
				return getOwningManager();
			case MngrPackage.MANAGER_PARAMETER__IS_INPUT:
				return isIsInput();
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_INTEGER:
				return getLitteralInteger();
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_STRING:
				return getLitteralString();
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_BOOLEAN:
				return getLitteralBoolean();
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_UNLIMITED_NATURAL:
				return getLitteralUnlimitedNatural();
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
			case MngrPackage.MANAGER_PARAMETER__STATE:
				getState().clear();
				getState().addAll((Collection<? extends ManagerState>)newValue);
				return;
			case MngrPackage.MANAGER_PARAMETER__OPAQUE_EXPRESSIONS:
				getOpaqueExpressions().clear();
				getOpaqueExpressions().addAll((Collection<? extends OpaqueExpression>)newValue);
				return;
			case MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER:
				setOwningManager((Manager)newValue);
				return;
			case MngrPackage.MANAGER_PARAMETER__IS_INPUT:
				setIsInput((Boolean)newValue);
				return;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_INTEGER:
				getLitteralInteger().clear();
				getLitteralInteger().addAll((Collection<? extends Integer>)newValue);
				return;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_STRING:
				getLitteralString().clear();
				getLitteralString().addAll((Collection<? extends String>)newValue);
				return;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_BOOLEAN:
				getLitteralBoolean().clear();
				getLitteralBoolean().addAll((Collection<? extends Boolean>)newValue);
				return;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_UNLIMITED_NATURAL:
				getLitteralUnlimitedNatural().clear();
				getLitteralUnlimitedNatural().addAll((Collection<? extends Double>)newValue);
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
			case MngrPackage.MANAGER_PARAMETER__STATE:
				getState().clear();
				return;
			case MngrPackage.MANAGER_PARAMETER__OPAQUE_EXPRESSIONS:
				getOpaqueExpressions().clear();
				return;
			case MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER:
				setOwningManager((Manager)null);
				return;
			case MngrPackage.MANAGER_PARAMETER__IS_INPUT:
				setIsInput(IS_INPUT_EDEFAULT);
				return;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_INTEGER:
				getLitteralInteger().clear();
				return;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_STRING:
				getLitteralString().clear();
				return;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_BOOLEAN:
				getLitteralBoolean().clear();
				return;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_UNLIMITED_NATURAL:
				getLitteralUnlimitedNatural().clear();
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
			case MngrPackage.MANAGER_PARAMETER__STATE:
				return state != null && !state.isEmpty();
			case MngrPackage.MANAGER_PARAMETER__OPAQUE_EXPRESSIONS:
				return opaqueExpressions != null && !opaqueExpressions.isEmpty();
			case MngrPackage.MANAGER_PARAMETER__OWNING_MANAGER:
				return getOwningManager() != null;
			case MngrPackage.MANAGER_PARAMETER__IS_INPUT:
				return isInput != IS_INPUT_EDEFAULT;
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_INTEGER:
				return litteralInteger != null && !litteralInteger.isEmpty();
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_STRING:
				return litteralString != null && !litteralString.isEmpty();
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_BOOLEAN:
				return litteralBoolean != null && !litteralBoolean.isEmpty();
			case MngrPackage.MANAGER_PARAMETER__LITTERAL_UNLIMITED_NATURAL:
				return litteralUnlimitedNatural != null && !litteralUnlimitedNatural.isEmpty();
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
		result.append(" (isInput: ");
		result.append(isInput);
		result.append(", LitteralInteger: ");
		result.append(litteralInteger);
		result.append(", LitteralString: ");
		result.append(litteralString);
		result.append(", LitteralBoolean: ");
		result.append(litteralBoolean);
		result.append(", LitteralUnlimitedNatural: ");
		result.append(litteralUnlimitedNatural);
		result.append(')');
		return result.toString();
	}

} //ManagerParameterImpl
