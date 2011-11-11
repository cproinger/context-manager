/*
 * 
 */
package mngr.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import mngr.ManagedElement;
import mngr.Manager;
import mngr.ManagerParameter;
import mngr.ManagerState;
import mngr.ManagerTransition;
import mngr.MngrPackage;
import mngr.diagram.edit.parts.ManagedElementEditPart;
import mngr.diagram.edit.parts.ManagerEditPart;
import mngr.diagram.edit.parts.ManagerParameterEditPart;
import mngr.diagram.edit.parts.ManagerParameterOpaqueExpressionsEditPart;
import mngr.diagram.edit.parts.ManagerStateContextParametersEditPart;
import mngr.diagram.edit.parts.ManagerStateEditPart;
import mngr.diagram.edit.parts.ManagerTransitionEditPart;
import mngr.diagram.edit.parts.OpaqueExpressionEditPart;
import mngr.diagram.providers.MngrElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import exp.OpaqueExpression;

/**
 * @generated
 */
public class MngrDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<MngrNodeDescriptor> getSemanticChildren(View view) {
		switch (MngrVisualIDRegistry.getVisualID(view)) {
		case ManagerEditPart.VISUAL_ID:
			return getManager_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrNodeDescriptor> getManager_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Manager modelElement = (Manager) view.getElement();
		LinkedList<MngrNodeDescriptor> result = new LinkedList<MngrNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedState().iterator(); it
				.hasNext();) {
			ManagerState childElement = (ManagerState) it.next();
			int visualID = MngrVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ManagerStateEditPart.VISUAL_ID) {
				result.add(new MngrNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContextParameters().iterator(); it
				.hasNext();) {
			ManagerParameter childElement = (ManagerParameter) it.next();
			int visualID = MngrVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ManagerParameterEditPart.VISUAL_ID) {
				result.add(new MngrNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getManagedElement().iterator(); it
				.hasNext();) {
			ManagedElement childElement = (ManagedElement) it.next();
			int visualID = MngrVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ManagedElementEditPart.VISUAL_ID) {
				result.add(new MngrNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it
				.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (MngrVisualIDRegistry.getNodeVisualID(view, childElement) == OpaqueExpressionEditPart.VISUAL_ID) {
				result.add(new MngrNodeDescriptor(childElement,
						OpaqueExpressionEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getContainedLinks(View view) {
		switch (MngrVisualIDRegistry.getVisualID(view)) {
		case ManagerEditPart.VISUAL_ID:
			return getManager_1000ContainedLinks(view);
		case ManagerStateEditPart.VISUAL_ID:
			return getManagerState_2001ContainedLinks(view);
		case ManagerParameterEditPart.VISUAL_ID:
			return getManagerParameter_2002ContainedLinks(view);
		case ManagedElementEditPart.VISUAL_ID:
			return getManagedElement_2003ContainedLinks(view);
		case OpaqueExpressionEditPart.VISUAL_ID:
			return getOpaqueExpression_2004ContainedLinks(view);
		case ManagerTransitionEditPart.VISUAL_ID:
			return getManagerTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getIncomingLinks(View view) {
		switch (MngrVisualIDRegistry.getVisualID(view)) {
		case ManagerStateEditPart.VISUAL_ID:
			return getManagerState_2001IncomingLinks(view);
		case ManagerParameterEditPart.VISUAL_ID:
			return getManagerParameter_2002IncomingLinks(view);
		case ManagedElementEditPart.VISUAL_ID:
			return getManagedElement_2003IncomingLinks(view);
		case OpaqueExpressionEditPart.VISUAL_ID:
			return getOpaqueExpression_2004IncomingLinks(view);
		case ManagerTransitionEditPart.VISUAL_ID:
			return getManagerTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getOutgoingLinks(View view) {
		switch (MngrVisualIDRegistry.getVisualID(view)) {
		case ManagerStateEditPart.VISUAL_ID:
			return getManagerState_2001OutgoingLinks(view);
		case ManagerParameterEditPart.VISUAL_ID:
			return getManagerParameter_2002OutgoingLinks(view);
		case ManagedElementEditPart.VISUAL_ID:
			return getManagedElement_2003OutgoingLinks(view);
		case OpaqueExpressionEditPart.VISUAL_ID:
			return getOpaqueExpression_2004OutgoingLinks(view);
		case ManagerTransitionEditPart.VISUAL_ID:
			return getManagerTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManager_1000ContainedLinks(
			View view) {
		Manager modelElement = (Manager) view.getElement();
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ManagerTransition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerState_2001ContainedLinks(
			View view) {
		ManagerState modelElement = (ManagerState) view.getElement();
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ManagerState_ContextParameters_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerParameter_2002ContainedLinks(
			View view) {
		ManagerParameter modelElement = (ManagerParameter) view.getElement();
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ManagerParameter_OpaqueExpressions_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagedElement_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getOpaqueExpression_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerState_2001IncomingLinks(
			View view) {
		ManagerState modelElement = (ManagerState) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ManagerTransition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerParameter_2002IncomingLinks(
			View view) {
		ManagerParameter modelElement = (ManagerParameter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ManagerState_ContextParameters_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagedElement_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getOpaqueExpression_2004IncomingLinks(
			View view) {
		OpaqueExpression modelElement = (OpaqueExpression) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ManagerParameter_OpaqueExpressions_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerState_2001OutgoingLinks(
			View view) {
		ManagerState modelElement = (ManagerState) view.getElement();
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ManagerTransition_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ManagerState_ContextParameters_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerParameter_2002OutgoingLinks(
			View view) {
		ManagerParameter modelElement = (ManagerParameter) view.getElement();
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ManagerParameter_OpaqueExpressions_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagedElement_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getOpaqueExpression_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MngrLinkDescriptor> getManagerTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MngrLinkDescriptor> getContainedTypeModelFacetLinks_ManagerTransition_4001(
			Manager container) {
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedTransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ManagerTransition) {
				continue;
			}
			ManagerTransition link = (ManagerTransition) linkObject;
			if (ManagerTransitionEditPart.VISUAL_ID != MngrVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ManagerState dst = link.getTarget();
			ManagerState src = link.getSource();
			result.add(new MngrLinkDescriptor(src, dst, link,
					MngrElementTypes.ManagerTransition_4001,
					ManagerTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MngrLinkDescriptor> getIncomingTypeModelFacetLinks_ManagerTransition_4001(
			ManagerState target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MngrPackage.eINSTANCE
					.getManagerTransition_Target()
					|| false == setting.getEObject() instanceof ManagerTransition) {
				continue;
			}
			ManagerTransition link = (ManagerTransition) setting.getEObject();
			if (ManagerTransitionEditPart.VISUAL_ID != MngrVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ManagerState src = link.getSource();
			result.add(new MngrLinkDescriptor(src, target, link,
					MngrElementTypes.ManagerTransition_4001,
					ManagerTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MngrLinkDescriptor> getIncomingFeatureModelFacetLinks_ManagerState_ContextParameters_4002(
			ManagerParameter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MngrPackage.eINSTANCE
					.getManagerState_ContextParameters()) {
				result.add(new MngrLinkDescriptor(setting.getEObject(), target,
						MngrElementTypes.ManagerStateContextParameters_4002,
						ManagerStateContextParametersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MngrLinkDescriptor> getIncomingFeatureModelFacetLinks_ManagerParameter_OpaqueExpressions_4003(
			OpaqueExpression target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MngrPackage.eINSTANCE
					.getManagerParameter_OpaqueExpressions()) {
				result.add(new MngrLinkDescriptor(
						setting.getEObject(),
						target,
						MngrElementTypes.ManagerParameterOpaqueExpressions_4003,
						ManagerParameterOpaqueExpressionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MngrLinkDescriptor> getOutgoingTypeModelFacetLinks_ManagerTransition_4001(
			ManagerState source) {
		Manager container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Manager) {
				container = (Manager) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedTransition().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ManagerTransition) {
				continue;
			}
			ManagerTransition link = (ManagerTransition) linkObject;
			if (ManagerTransitionEditPart.VISUAL_ID != MngrVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ManagerState dst = link.getTarget();
			ManagerState src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MngrLinkDescriptor(src, dst, link,
					MngrElementTypes.ManagerTransition_4001,
					ManagerTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MngrLinkDescriptor> getOutgoingFeatureModelFacetLinks_ManagerState_ContextParameters_4002(
			ManagerState source) {
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		for (Iterator<?> destinations = source.getContextParameters()
				.iterator(); destinations.hasNext();) {
			ManagerParameter destination = (ManagerParameter) destinations
					.next();
			result.add(new MngrLinkDescriptor(source, destination,
					MngrElementTypes.ManagerStateContextParameters_4002,
					ManagerStateContextParametersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MngrLinkDescriptor> getOutgoingFeatureModelFacetLinks_ManagerParameter_OpaqueExpressions_4003(
			ManagerParameter source) {
		LinkedList<MngrLinkDescriptor> result = new LinkedList<MngrLinkDescriptor>();
		for (Iterator<?> destinations = source.getOpaqueExpressions()
				.iterator(); destinations.hasNext();) {
			OpaqueExpression destination = (OpaqueExpression) destinations
					.next();
			result.add(new MngrLinkDescriptor(source, destination,
					MngrElementTypes.ManagerParameterOpaqueExpressions_4003,
					ManagerParameterOpaqueExpressionsEditPart.VISUAL_ID));
		}
		return result;
	}

}
