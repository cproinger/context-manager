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
import ctxmngr.CtxmngrPackage;

import exp.OpaqueExpression;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Context Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ctxmngr.impl.ContextParameterImpl#getState <em>State</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextParameterImpl#getOpaqueExpressions <em>Opaque Expressions</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextParameterImpl#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextParameterImpl#getLitteralInteger <em>Litteral Integer</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextParameterImpl#getLitteralString <em>Litteral String</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextParameterImpl#getLitteralBoolean <em>Litteral Boolean</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextParameterImpl#getLitteralUnlimitedNatural <em>Litteral Unlimited Natural</em>}</li>
 *   <li>{@link ctxmngr.impl.ContextParameterImpl#isIsInput <em>Is Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextParameterImpl extends NamedElementImpl implements ContextParameter {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<CtxState> state;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxmngrPackage.Literals.CONTEXT_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CtxState> getState() {
		if (state == null) {
			state = new EObjectWithInverseResolvingEList.ManyInverse<CtxState>(CtxState.class, this, CtxmngrPackage.CONTEXT_PARAMETER__STATE, CtxmngrPackage.CTX_STATE__CONTEXT_PARAMETERS);
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
			opaqueExpressions = new EObjectContainmentEList<OpaqueExpression>(OpaqueExpression.class, this, CtxmngrPackage.CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS);
		}
		return opaqueExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager getOwningManager() {
		if (eContainerFeatureID() != CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER) return null;
		return (ContextManager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningManager(ContextManager newOwningManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningManager, CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningManager(ContextManager newOwningManager) {
		if (newOwningManager != eInternalContainer() || (eContainerFeatureID() != CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER && newOwningManager != null)) {
			if (EcoreUtil.isAncestor(this, newOwningManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningManager != null)
				msgs = ((InternalEObject)newOwningManager).eInverseAdd(this, CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS, ContextManager.class, msgs);
			msgs = basicSetOwningManager(newOwningManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER, newOwningManager, newOwningManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getLitteralInteger() {
		if (litteralInteger == null) {
			litteralInteger = new EDataTypeUniqueEList<Integer>(Integer.class, this, CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_INTEGER);
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
			litteralString = new EDataTypeUniqueEList<String>(String.class, this, CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_STRING);
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
			litteralBoolean = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_BOOLEAN);
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
			litteralUnlimitedNatural = new EDataTypeUniqueEList<Double>(Double.class, this, CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_UNLIMITED_NATURAL);
		}
		return litteralUnlimitedNatural;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CtxmngrPackage.CONTEXT_PARAMETER__IS_INPUT, oldIsInput, isInput));
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
			case CtxmngrPackage.CONTEXT_PARAMETER__STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getState()).basicAdd(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER:
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
			case CtxmngrPackage.CONTEXT_PARAMETER__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS:
				return ((InternalEList<?>)getOpaqueExpressions()).basicRemove(otherEnd, msgs);
			case CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER:
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
			case CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER:
				return eInternalContainer().eInverseRemove(this, CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS, ContextManager.class, msgs);
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
			case CtxmngrPackage.CONTEXT_PARAMETER__STATE:
				return getState();
			case CtxmngrPackage.CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS:
				return getOpaqueExpressions();
			case CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER:
				return getOwningManager();
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_INTEGER:
				return getLitteralInteger();
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_STRING:
				return getLitteralString();
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_BOOLEAN:
				return getLitteralBoolean();
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_UNLIMITED_NATURAL:
				return getLitteralUnlimitedNatural();
			case CtxmngrPackage.CONTEXT_PARAMETER__IS_INPUT:
				return isIsInput();
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
			case CtxmngrPackage.CONTEXT_PARAMETER__STATE:
				getState().clear();
				getState().addAll((Collection<? extends CtxState>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS:
				getOpaqueExpressions().clear();
				getOpaqueExpressions().addAll((Collection<? extends OpaqueExpression>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER:
				setOwningManager((ContextManager)newValue);
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_INTEGER:
				getLitteralInteger().clear();
				getLitteralInteger().addAll((Collection<? extends Integer>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_STRING:
				getLitteralString().clear();
				getLitteralString().addAll((Collection<? extends String>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_BOOLEAN:
				getLitteralBoolean().clear();
				getLitteralBoolean().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_UNLIMITED_NATURAL:
				getLitteralUnlimitedNatural().clear();
				getLitteralUnlimitedNatural().addAll((Collection<? extends Double>)newValue);
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__IS_INPUT:
				setIsInput((Boolean)newValue);
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
			case CtxmngrPackage.CONTEXT_PARAMETER__STATE:
				getState().clear();
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS:
				getOpaqueExpressions().clear();
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER:
				setOwningManager((ContextManager)null);
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_INTEGER:
				getLitteralInteger().clear();
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_STRING:
				getLitteralString().clear();
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_BOOLEAN:
				getLitteralBoolean().clear();
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_UNLIMITED_NATURAL:
				getLitteralUnlimitedNatural().clear();
				return;
			case CtxmngrPackage.CONTEXT_PARAMETER__IS_INPUT:
				setIsInput(IS_INPUT_EDEFAULT);
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
			case CtxmngrPackage.CONTEXT_PARAMETER__STATE:
				return state != null && !state.isEmpty();
			case CtxmngrPackage.CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS:
				return opaqueExpressions != null && !opaqueExpressions.isEmpty();
			case CtxmngrPackage.CONTEXT_PARAMETER__OWNING_MANAGER:
				return getOwningManager() != null;
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_INTEGER:
				return litteralInteger != null && !litteralInteger.isEmpty();
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_STRING:
				return litteralString != null && !litteralString.isEmpty();
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_BOOLEAN:
				return litteralBoolean != null && !litteralBoolean.isEmpty();
			case CtxmngrPackage.CONTEXT_PARAMETER__LITTERAL_UNLIMITED_NATURAL:
				return litteralUnlimitedNatural != null && !litteralUnlimitedNatural.isEmpty();
			case CtxmngrPackage.CONTEXT_PARAMETER__IS_INPUT:
				return isInput != IS_INPUT_EDEFAULT;
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
		result.append(" (LitteralInteger: ");
		result.append(litteralInteger);
		result.append(", LitteralString: ");
		result.append(litteralString);
		result.append(", LitteralBoolean: ");
		result.append(litteralBoolean);
		result.append(", LitteralUnlimitedNatural: ");
		result.append(litteralUnlimitedNatural);
		result.append(", isInput: ");
		result.append(isInput);
		result.append(')');
		return result.toString();
	}

} //ContextParameterImpl
