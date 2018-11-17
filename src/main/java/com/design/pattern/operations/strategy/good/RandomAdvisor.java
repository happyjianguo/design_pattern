package com.design.pattern.operations.strategy.good;

import com.design.pattern.interfaces.adapter.object.eg.Firework;
import com.design.pattern.operations.strategy.bad.Customer;

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