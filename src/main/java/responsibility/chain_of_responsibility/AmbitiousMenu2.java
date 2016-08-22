package responsibility.chain_of_responsibility;

import responsibility.chain_of_responsibility.domain.machine.Engineer;
import responsibility.chain_of_responsibility.domain.machine.MachineComponent;
import responsibility.chain_of_responsibility.domain.machine.StarPress;
import responsibility.chain_of_responsibility.domain.machine.Tool;
import responsibility.chain_of_responsibility.domain.machine.ToolCart;
import responsibility.chain_of_responsibility.domain.machine.VisualizationItem;

/*
 * Copyright (c) 2001, 2005. Steven J. Metsker.
 * 
 * Steve Metsker makes no representations or warranties about
 * the fitness of this software for any particular purpose, 
 * including the implied warranty of merchantability.
 *
 * Please use this software as you wish with the sole
 * restriction that you may not claim that you wrote it.
 */

/**
 * This class shows the value of refactoring the AmbitiousMenu class using Chain
 * of Responsibility.
 */
public class AmbitiousMenu2 {
    /**
     * @param item The interesting item
     * @return The engineer who is responsible for the item
     */
    public Engineer getResponsible(VisualizationItem item) {
        return item.getResponsible();
    }
    
    public Engineer getResponsible(MachineComponent machine) {
        return machine.getResponsible();
    }
    
    
    public static void main(String[] args) {
        AmbitiousMenu2 menu = new AmbitiousMenu2();
        
        Tool tool = new Tool();
        ToolCart cart = new ToolCart(new Engineer(1));
        tool.setToolCart(cart);
        
        menu.getResponsible(tool);
        
        menu.getResponsible(cart);
        
        MachineComponent machine = new StarPress(1);
        menu.getResponsible(machine);
        
    }
}