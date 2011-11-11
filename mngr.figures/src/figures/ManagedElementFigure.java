package figures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;


public class ManagedElementFigure extends ImageFigure {

	public ManagedElementFigure() { 
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/ManagedElement.png").createImage(), 0);
	}

}
