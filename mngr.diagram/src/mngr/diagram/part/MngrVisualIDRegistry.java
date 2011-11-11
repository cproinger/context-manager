/*
 * 
 */
package mngr.diagram.part;

import mngr.Manager;
import mngr.MngrPackage;
import mngr.diagram.edit.parts.ManagedElementEditPart;
import mngr.diagram.edit.parts.ManagedElementNameEditPart;
import mngr.diagram.edit.parts.ManagerEditPart;
import mngr.diagram.edit.parts.ManagerParameterEditPart;
import mngr.diagram.edit.parts.ManagerParameterNameEditPart;
import mngr.diagram.edit.parts.ManagerParameterOpaqueExpressionsEditPart;
import mngr.diagram.edit.parts.ManagerStateContextParametersEditPart;
import mngr.diagram.edit.parts.ManagerStateEditPart;
import mngr.diagram.edit.parts.ManagerStateNameEditPart;
import mngr.diagram.edit.parts.ManagerTransitionActionEditPart;
import mngr.diagram.edit.parts.ManagerTransitionConditionEditPart;
import mngr.diagram.edit.parts.ManagerTransitionEditPart;
import mngr.diagram.edit.parts.ManagerTransitionEventEditPart;
import mngr.diagram.edit.parts.ManagerTransitionTransProbEditPart;
import mngr.diagram.edit.parts.OpaqueExpressionBodyEditPart;
import mngr.diagram.edit.parts.OpaqueExpressionEditPart;
import mngr.diagram.edit.parts.WrappingLabel2EditPart;
import mngr.diagram.edit.parts.WrappingLabelEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import exp.ExpPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MngrVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "mngr.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ManagerEditPart.MODEL_ID.equals(view.getType())) {
				return ManagerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mngr.diagram.part.MngrVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MngrDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MngrPackage.eINSTANCE.getManager().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Manager) domainElement)) {
			return ManagerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = mngr.diagram.part.MngrVisualIDRegistry
				.getModelID(containerView);
		if (!ManagerEditPart.MODEL_ID.equals(containerModelID)
				&& !"mngr".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ManagerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mngr.diagram.part.MngrVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ManagerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ManagerEditPart.VISUAL_ID:
			if (MngrPackage.eINSTANCE.getManagerState().isSuperTypeOf(
					domainElement.eClass())) {
				return ManagerStateEditPart.VISUAL_ID;
			}
			if (MngrPackage.eINSTANCE.getManagerParameter().isSuperTypeOf(
					domainElement.eClass())) {
				return ManagerParameterEditPart.VISUAL_ID;
			}
			if (MngrPackage.eINSTANCE.getManagedElement().isSuperTypeOf(
					domainElement.eClass())) {
				return ManagedElementEditPart.VISUAL_ID;
			}
			if (ExpPackage.eINSTANCE.getOpaqueExpression().isSuperTypeOf(
					domainElement.eClass())) {
				return OpaqueExpressionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mngr.diagram.part.MngrVisualIDRegistry
				.getModelID(containerView);
		if (!ManagerEditPart.MODEL_ID.equals(containerModelID)
				&& !"mngr".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ManagerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mngr.diagram.part.MngrVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ManagerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ManagerEditPart.VISUAL_ID:
			if (ManagerStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ManagerParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ManagedElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagerStateEditPart.VISUAL_ID:
			if (ManagerStateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagerParameterEditPart.VISUAL_ID:
			if (ManagerParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagedElementEditPart.VISUAL_ID:
			if (ManagedElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueExpressionEditPart.VISUAL_ID:
			if (OpaqueExpressionBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagerTransitionEditPart.VISUAL_ID:
			if (ManagerTransitionTransProbEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ManagerTransitionActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ManagerTransitionConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ManagerTransitionEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagerStateContextParametersEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManagerParameterOpaqueExpressionsEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MngrPackage.eINSTANCE.getManagerTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return ManagerTransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Manager element) {
		return true;
	}

}
