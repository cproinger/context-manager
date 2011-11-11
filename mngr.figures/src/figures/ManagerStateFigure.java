package figures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;


public class ManagerStateFigure extends ImageFigure {

	public ManagerStateFigure() { 
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/ManagerState.png").createImage(), 0);
	}

}
