package com.design.parttern.operations.strategy.bad;

import com.design.parttern.interfaces.adapter.object.eg.Firework;

/**
 * This class is just a mock-up, acting as if it were a recommendation engine
 * that relies on customer profiling for its suggestions.
 */
public class Rel8 {
    /**
     * Recommend a nice item for this customer, based on how this customer's
     * taste in music and extreme sports correlates with other customers and
     * with their fireworks preferences.
     * @param c the customer
     * @return a suggested firework
     */
    public static Object advise(Customer c) {
        return new Firework();
    }
}