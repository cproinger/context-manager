package mngr.diagram.edit.policies;

import mngr.diagram.edit.commands.ManagedElementCreateCommand;
import mngr.diagram.edit.commands.ManagerParameterCreateCommand;
import mngr.diagram.edit.commands.ManagerStateCreateCommand;
import mngr.diagram.edit.commands.OpaqueExpressionCreateCommand;
import mngr.diagram.providers.MngrElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ManagerItemSemanticEditPolicy extends
		MngrBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ManagerItemSemanticEditPolicy() {
		super(MngrElementTypes.Manager_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MngrElementTypes.ManagerState_2001 == req.getElementType()) {
			return getGEFWrapper(new ManagerStateCreateCommand(req));
		}
		if (MngrElementTypes.ManagerParameter_2002 == req.getElementType()) {
			return getGEFWrapper(new ManagerParameterCreateCommand(req));
		}
		if (MngrElementTypes.ManagedElement_2003 == req.getElementType()) {
			return getGEFWrapper(new ManagedElementCreateCommand(req));
		}
		if (MngrElementTypes.OpaqueExpression_2004 == req.getElementType()) {
			return getGEFWrapper(new OpaqueExpressionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
