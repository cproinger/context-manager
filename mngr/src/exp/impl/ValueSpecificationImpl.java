/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package exp.impl;

import const_.Constraint;

import exp.ExpPackage;
import exp.Expression;
import exp.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import owner.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link exp.impl.ValueSpecificationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link exp.impl.ValueSpecificationImpl#getOwningConstraint <em>Owning Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueSpecificationImpl extends ElementImpl implements ValueSpecification {
	/**
	 * The cached value of the '{@link #getOwningConstraint() <em>Owning Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint owningConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpPackage.Literals.VALUE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		if (eContainerFeatureID() != ExpPackage.VALUE_SPECIFICATION__EXPRESSION) return null;
		return (Expression)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExpression, ExpPackage.VALUE_SPECIFICATION__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != eInternalContainer() || (eContainerFeatureID() != ExpPackage.VALUE_SPECIFICATION__EXPRESSION && newExpression != null)) {
			if (EcoreUtil.isAncestor(this, newExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, ExpPackage.EXPRESSION__OPERAND, Expression.class, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.VALUE_SPECIFICATION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwningConstraint() {
		if (owningConstraint != null && owningConstraint.eIsProxy()) {
			InternalEObject oldOwningConstraint = (InternalEObject)owningConstraint;
			owningConstraint = (Constraint)eResolveProxy(oldOwningConstraint);
			if (owningConstraint != oldOwningConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT, oldOwningConstraint, owningConstraint));
			}
		}
		return owningConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetOwningConstraint() {
		return owningConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningConstraint(Constraint newOwningConstraint) {
		Constraint oldOwningConstraint = owningConstraint;
		owningConstraint = newOwningConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT, oldOwningConstraint, owningConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpPackage.VALUE_SPECIFICATION__EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExpression((Expression)otherEnd, msgs);
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
			case ExpPackage.VALUE_SPECIFICATION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case ExpPackage.VALUE_SPECIFICATION__EXPRESSION:
				return eInternalContainer().eInverseRemove(this, ExpPackage.EXPRESSION__OPERAND, Expression.class, msgs);
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
			case ExpPackage.VALUE_SPECIFICATION__EXPRESSION:
				return getExpression();
			case ExpPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				if (resolve) return getOwningConstraint();
				return basicGetOwningConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpPackage.VALUE_SPECIFICATION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case ExpPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				setOwningConstraint((Constraint)newValue);
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
			case ExpPackage.VALUE_SPECIFICATION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case ExpPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				setOwningConstraint((Constraint)null);
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
			case ExpPackage.VALUE_SPECIFICATION__EXPRESSION:
				return getExpression() != null;
			case ExpPackage.VALUE_SPECIFICATION__OWNING_CONSTRAINT:
				return owningConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueSpecificationImpl
