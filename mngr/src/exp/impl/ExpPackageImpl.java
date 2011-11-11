/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package exp.impl;

import const_.ConstPackage;

import const_.impl.ConstPackageImpl;

import elem.ElemPackage;

import elem.impl.ElemPackageImpl;

import exp.ExpFactory;
import exp.ExpPackage;
import exp.Expression;
import exp.OpaqueExpression;
import exp.ValueSpecification;

import mngr.MngrPackage;

import mngr.impl.MngrPackageImpl;

import named.NamedPackage;

import named.impl.NamedPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import owner.OwnerPackage;

import owner.impl.OwnerPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpPackageImpl extends EPackageImpl implements ExpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see exp.ExpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpPackageImpl() {
		super(eNS_URI, ExpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpPackage init() {
		if (isInited) return (ExpPackage)EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI);

		// Obtain or create and register package
		ExpPackageImpl theExpPackage = (ExpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MngrPackageImpl theMngrPackage = (MngrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) instanceof MngrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MngrPackage.eNS_URI) : MngrPackage.eINSTANCE);
		NamedPackageImpl theNamedPackage = (NamedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) instanceof NamedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamedPackage.eNS_URI) : NamedPackage.eINSTANCE);
		OwnerPackageImpl theOwnerPackage = (OwnerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) instanceof OwnerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI) : OwnerPackage.eINSTANCE);
		ElemPackageImpl theElemPackage = (ElemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) instanceof ElemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ElemPackage.eNS_URI) : ElemPackage.eINSTANCE);
		ConstPackageImpl theConstPackage = (ConstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) instanceof ConstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI) : ConstPackage.eINSTANCE);

		// Create package meta-data objects
		theExpPackage.createPackageContents();
		theMngrPackage.createPackageContents();
		theNamedPackage.createPackageContents();
		theOwnerPackage.createPackageContents();
		theElemPackage.createPackageContents();
		theConstPackage.createPackageContents();

		// Initialize created meta-data
		theExpPackage.initializePackageContents();
		theMngrPackage.initializePackageContents();
		theNamedPackage.initializePackageContents();
		theOwnerPackage.initializePackageContents();
		theElemPackage.initializePackageContents();
		theConstPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpPackage.eNS_URI, theExpPackage);
		return theExpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecification_Expression() {
		return (EReference)valueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecification_OwningConstraint() {
		return (EReference)valueSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operand() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Symbol() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpFactory getExpFactory() {
		return (ExpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);
		createEReference(valueSpecificationEClass, VALUE_SPECIFICATION__EXPRESSION);
		createEReference(valueSpecificationEClass, VALUE_SPECIFICATION__OWNING_CONSTRAINT);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__OPERAND);
		createEAttribute(expressionEClass, EXPRESSION__SYMBOL);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OwnerPackage theOwnerPackage = (OwnerPackage)EPackage.Registry.INSTANCE.getEPackage(OwnerPackage.eNS_URI);
		ConstPackage theConstPackage = (ConstPackage)EPackage.Registry.INSTANCE.getEPackage(ConstPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		valueSpecificationEClass.getESuperTypes().add(theOwnerPackage.getElement());
		expressionEClass.getESuperTypes().add(this.getValueSpecification());
		opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());

		// Initialize classes and features; add operations and parameters
		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSpecification_Expression(), this.getExpression(), this.getExpression_Operand(), "expression", null, 0, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueSpecification_OwningConstraint(), theConstPackage.getConstraint(), null, "owningConstraint", null, 0, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Operand(), this.getValueSpecification(), this.getValueSpecification_Expression(), "operand", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueExpression_Body(), ecorePackage.getEString(), "body", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueExpression_Language(), ecorePackage.getEString(), "language", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.node
		createGmfAnnotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.node";		
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
			 "figure", "figures.OpaqueExpressionFigure",
			 "label", "body",
			 "label.icon", "false",
			 "label.placement", "external",
			 "tool.name", "OpaqueExpression",
			 "tool.description", "Create a new OpaqueExpression",
			 "tool.small.bundle", "mngr.figures",
			 "tool.small.path", "icons/OpaqueExpressionS.png",
			 "phantom", "true"
		   });
	}

} //ExpPackageImpl
