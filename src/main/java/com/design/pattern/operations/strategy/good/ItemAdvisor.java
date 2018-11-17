package com.design.pattern.operations.strategy.good;

import com.design.pattern.interfaces.adapter.object.eg.Firework;
import com.design.pattern.operations.strategy.bad.Customer;
import com.design.pattern.operations.strategy.bad.LikeMyStuff;

/**
 * Implement the Advisor interface by relying on the LikeMyStuff engine that
 * models a customer's preferences on his or her eariler purchases.
 */
public class ItemAdvisor implements Advisor {
    /**
     * @return Recommend a nice item for this customer, based on a model of the
     *         customer's recent spending with us.
     * @param c the customer to cross-sell
     */
    public Firework recommend(Customer c) {
        return (Firework) LikeMyStuff.suggest(c);
    }
}