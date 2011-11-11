/*
 * 
 */
package mngr.diagram.edit.policies;

import mngr.diagram.providers.MngrElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ManagerTransitionItemSemanticEditPolicy extends
		MngrBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ManagerTransitionItemSemanticEditPolicy() {
		super(MngrElementTypes.ManagerTransition_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
