package mngr.diagram.providers;

import mngr.MngrPackage;
import mngr.diagram.edit.parts.ManagedElementNameEditPart;
import mngr.diagram.edit.parts.ManagerParameterNameEditPart;
import mngr.diagram.edit.parts.ManagerStateNameEditPart;
import mngr.diagram.edit.parts.ManagerTransitionActionEditPart;
import mngr.diagram.edit.parts.ManagerTransitionConditionEditPart;
import mngr.diagram.edit.parts.ManagerTransitionEventEditPart;
import mngr.diagram.edit.parts.ManagerTransitionTransProbEditPart;
import mngr.diagram.edit.parts.OpaqueExpressionBodyEditPart;
import mngr.diagram.parsers.MessageFormatParser;
import mngr.diagram.part.MngrVisualIDRegistry;
import named.NamedPackage;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import exp.ExpPackage;

/**
 * @generated
 */
public class MngrParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser managerStateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getManagerStateName_5001Parser() {
		if (managerStateName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { NamedPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			managerStateName_5001Parser = parser;
		}
		return managerStateName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser managerParameterName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getManagerParameterName_5002Parser() {
		if (managerParameterName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { NamedPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			managerParameterName_5002Parser = parser;
		}
		return managerParameterName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser managedElementName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getManagedElementName_5003Parser() {
		if (managedElementName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { NamedPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			managedElementName_5003Parser = parser;
		}
		return managedElementName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueExpressionBody_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueExpressionBody_5004Parser() {
		if (opaqueExpressionBody_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ExpPackage.eINSTANCE
					.getOpaqueExpression_Body() };
			MessageFormatParser parser = new MessageFormatParser(features);
			opaqueExpressionBody_5004Parser = parser;
		}
		return opaqueExpressionBody_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser managerTransitionTransProb_6001Parser;

	/**
	 * @generated
	 */
	private IParser getManagerTransitionTransProb_6001Parser() {
		if (managerTransitionTransProb_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { MngrPackage.eINSTANCE
					.getManagerTransition_TransProb() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("TransProb: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("TransProb: {0}"); //$NON-NLS-1$
			parser.setEditPattern("TransProb: {0}"); //$NON-NLS-1$
			managerTransitionTransProb_6001Parser = parser;
		}
		return managerTransitionTransProb_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser managerTransitionAction_6002Parser;

	/**
	 * @generated
	 */
	private IParser getManagerTransitionAction_6002Parser() {
		if (managerTransitionAction_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { MngrPackage.eINSTANCE
					.getManagerTransition_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Actions: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Actions: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Actions: {0}"); //$NON-NLS-1$
			managerTransitionAction_6002Parser = parser;
		}
		return managerTransitionAction_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser managerTransitionCondition_6003Parser;

	/**
	 * @generated
	 */
	private IParser getManagerTransitionCondition_6003Parser() {
		if (managerTransitionCondition_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { MngrPackage.eINSTANCE
					.getManagerTransition_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Conditions: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Conditions: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Conditions: {0}"); //$NON-NLS-1$
			managerTransitionCondition_6003Parser = parser;
		}
		return managerTransitionCondition_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser managerTransitionEvent_6004Parser;

	/**
	 * @generated
	 */
	private IParser getManagerTransitionEvent_6004Parser() {
		if (managerTransitionEvent_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { MngrPackage.eINSTANCE
					.getManagerTransition_Event() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Events: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Events: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Events: {0}"); //$NON-NLS-1$
			managerTransitionEvent_6004Parser = parser;
		}
		return managerTransitionEvent_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ManagerStateNameEditPart.VISUAL_ID:
			return getManagerStateName_5001Parser();
		case ManagerParameterNameEditPart.VISUAL_ID:
			return getManagerParameterName_5002Parser();
		case ManagedElementNameEditPart.VISUAL_ID:
			return getManagedElementName_5003Parser();
		case OpaqueExpressionBodyEditPart.VISUAL_ID:
			return getOpaqueExpressionBody_5004Parser();
		case ManagerTransitionTransProbEditPart.VISUAL_ID:
			return getManagerTransitionTransProb_6001Parser();
		case ManagerTransitionActionEditPart.VISUAL_ID:
			return getManagerTransitionAction_6002Parser();
		case ManagerTransitionConditionEditPart.VISUAL_ID:
			return getManagerTransitionCondition_6003Parser();
		case ManagerTransitionEventEditPart.VISUAL_ID:
			return getManagerTransitionEvent_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MngrVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MngrVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MngrElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
