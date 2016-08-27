package responsibility.chain_of_responsibility.design_pattern;

import responsibility.chain_of_responsibility.design_pattern.domain.machine.Engineer;
import responsibility.chain_of_responsibility.design_pattern.domain.machine.MachineComponent;
import responsibility.chain_of_responsibility.design_pattern.domain.machine.Tool;
import responsibility.chain_of_responsibility.design_pattern.domain.machine.ToolCart;
import responsibility.chain_of_responsibility.design_pattern.domain.machine.VisualizationItem;

/**
 * This (dysfunctional) class shows a method from an overly ambitious menu that
 * figures out who the responsible engineer is for a piece of equipment. In the
 * "Chain of Responsibility" chapter of "Design Patterns in Java," this code is
 * refactored so that the domain objects determine who is the responsible
 * engineer.
 * 
 * before using Chain of Responsibility
 * The intend of Chain of Responsibility is to relieve callers from knowing which
 * object can handle a request.
 * In this example , the caller is a menu, and the request is to find a responsible 
 * engineer. In the current design, the caller has to know which items have a 
 * getResponible() method.
 * 
 */
public class AmbitiousMenu {
	/**
	 * @param item
	 *            The interesting item
	 * @return The engineer who is responsible for item
	 */
	public Engineer getResponsible(VisualizationItem item) {
		if (item instanceof Tool) {
			Tool t = (Tool) item;
			return t.getToolCart().getResponsible();
		}
		if (item instanceof ToolCart) {
			ToolCart tc = (ToolCart) item;
			return tc.getResponsible();
		}
		if (item instanceof MachineComponent) {
			MachineComponent c = (MachineComponent) item;
			if (c.getResponsible() != null)
				return c.getResponsible();

			if (c.getParent() != null)
				return c.getParent().getResponsible();
		}
		return null;
	}
}
