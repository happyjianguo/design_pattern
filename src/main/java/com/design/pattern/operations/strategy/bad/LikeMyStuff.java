package com.design.pattern.operations.strategy.bad;

import com.design.pattern.interfaces.adapter.object.eg.Firework;

/**
 * This class is just a mock-up, acting as if it were a recommendation engine
 * that relies on customer purchasing history for its suggestions.
 */
public class LikeMyStuff {
    /**
     * @return Recommend a nice item for this customer, based on his or her
     *         previous purchases.
     * @param c the customer
     */
    public static Object suggest(Customer c) {
        return new Firework();
    }
}