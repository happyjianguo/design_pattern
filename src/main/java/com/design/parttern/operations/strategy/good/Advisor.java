package com.design.parttern.operations.strategy.good;

import com.design.parttern.interfaces.adapter.object.eg.Firework;
import com.design.parttern.operations.strategy.bad.Customer;

/**
 * Defines a standard service for recommending a purchasable item to a customer.
 */
public interface Advisor {
    Firework recommend(Customer c);
}