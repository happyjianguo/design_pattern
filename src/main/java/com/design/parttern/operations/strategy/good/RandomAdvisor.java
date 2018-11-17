package com.design.parttern.operations.strategy.good;

import com.design.parttern.interfaces.adapter.object.eg.Firework;
import com.design.parttern.operations.strategy.bad.Customer;

/**
 * Implement the Advisor interface, recommending a random firework.
 */
public class RandomAdvisor implements Advisor {
    /**
     * @param c the customer
     * @return any firework, chosen at random
     */
    public Firework recommend(Customer c) {
        return Firework.getRandom();
    }
}