/*
 * 
 */
package mngr.diagram.edit.policies;

import mngr.diagram.providers.MngrElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ManagerStateContextParametersItemSemanticEditPolicy extends
		MngrBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ManagerStateContextParametersItemSemanticEditPolicy() {
		super(MngrElementTypes.ManagerStateContextParameters_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
