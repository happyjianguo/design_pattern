package com.design.parttern.operations.strategy.good;

import com.design.parttern.interfaces.adapter.object.eg.Firework;
import com.design.parttern.operations.strategy.bad.Customer;
import com.design.parttern.operations.strategy.bad.Rel8;

/**
 * Implement the Advisor interface by relying on the Rel8 engine that relates a
 * customer's preferences to other customers' tastes.
 */
public class GroupAdvisor implements Advisor {
    /**
     * @return Recommend a nice item for this customer, based on how this
     *         customer's taste in music and extreme sports correlates with
     *         other customers and with their fireworks preferences.
     * @param c
     *            the customer to cross-sell
     */
    public Firework recommend(Customer c) {
        return (Firework) Rel8.advise(c);
    }
}