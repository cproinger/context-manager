/*
 * 
 */
package mngr.diagram.edit.commands;

import mngr.Manager;
import mngr.ManagerState;
import mngr.ManagerTransition;
import mngr.diagram.edit.policies.MngrBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ManagerTransitionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ManagerTransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ManagerTransition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ManagerState && newEnd instanceof ManagerState)) {
			return false;
		}
		ManagerState target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Manager)) {
			return false;
		}
		Manager container = (Manager) getLink().eContainer();
		return MngrBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistManagerTransition_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ManagerState && newEnd instanceof ManagerState)) {
			return false;
		}
		ManagerState source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Manager)) {
			return false;
		}
		Manager container = (Manager) getLink().eContainer();
		return MngrBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistManagerTransition_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ManagerTransition getLink() {
		return (ManagerTransition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ManagerState getOldSource() {
		return (ManagerState) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ManagerState getNewSource() {
		return (ManagerState) newEnd;
	}

	/**
	 * @generated
	 */
	protected ManagerState getOldTarget() {
		return (ManagerState) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ManagerState getNewTarget() {
		return (ManagerState) newEnd;
	}
}
