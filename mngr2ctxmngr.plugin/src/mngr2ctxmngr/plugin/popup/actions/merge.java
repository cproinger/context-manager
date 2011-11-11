package mngr2ctxmngr.plugin.popup.actions;

import java.io.IOException;
import java.util.Iterator;

import mngr2ctxmngr.atl.wizard.files.Mngr2ctxmngr;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class merge implements IObjectActionDelegate {

	private Shell shell;
	private ISelection currentSelection;
	private String[] managers = new String[2];
	private String[] managers_name = new String[2];
	private String outctxmngr;
	private IFile file;
	private Mngr2ctxmngr m2c;
	
	public merge() {
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		int i = 0;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			file = (IFile)iterator.next();
			managers[i] = file.getFullPath().toString();
			managers_name[i] = file.getName().toString().replace(".mngr", "");
			i++;
		}
		outctxmngr = file.getProject().getFullPath().toString()
				     +"/"+managers_name[0]+"-"+managers_name[1]+".ctxmngr";
		try {
				m2c = new Mngr2ctxmngr();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		m2c.doTrasformation(managers[0], managers[1], outctxmngr);
	}

	
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

}
