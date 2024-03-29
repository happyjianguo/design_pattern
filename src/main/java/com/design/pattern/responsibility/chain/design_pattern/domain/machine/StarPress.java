package com.design.pattern.responsibility.chain.design_pattern.domain.machine;

import com.design.pattern.responsibility.chain.design_pattern.domain.planning.MachinePlanner;
import com.design.pattern.responsibility.chain.design_pattern.domain.planning.StarPressPlanner;

/**
 * A star press takes a chemical mixture and extrudes explosive pellets or
 * "stars".
 * 
 * @author Steven J. Metsker
 *  
 */
public class StarPress extends Machine {
    /**
     * Create a press with the given id and with the supplied parent machine.
     * 
     * @param id
     *            the identity of this star press
     * @param parent
     *            the composite this machine belongs to
     */
    public StarPress(int id, MachineComponent parent) {
        super(id, parent);
    }

    /**
     * Create a press with the given id.
     * 
     * @param id
     *            the identity of this star press
     */
    public StarPress(int id) {
        super(id);
    }

    /**
     * Create a press with the given id and with access to the mediator that
     * will control bin/machine relations.
     * 
     * @param id
     *            the identity of this star press
     * @param Mediator
     *            the mediator that controls this machine's relation to bins
     */
    protected StarPress(int id, TubMediator mediator) {
        this(id, mediator, null);
    }

    /**
     * Create a press with the given id, with access to the mediator that will
     * control bin/machine relations, and with the supplied parent machine.
     * 
     * @param id
     *            the identity of this star press
     * @param Mediator
     *            the mediator that controls this machine's relation to bins
     * @param parent
     *            the composite this machine belongs to
     */
    public StarPress(int id, TubMediator mediator, MachineComponent parent) {
        super(id, mediator, parent);
    }
    
    /**
     * @return a planner that knows how star presses operate
     */
    public MachinePlanner createPlanner() {
        return new StarPressPlanner(this); 
    }
}