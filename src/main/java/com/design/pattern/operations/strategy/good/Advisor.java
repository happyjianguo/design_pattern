package com.design.pattern.operations.strategy.good;

import com.design.pattern.interfaces.adapter.object.eg.Firework;
import com.design.pattern.operations.strategy.bad.Customer;

/**
 * Defines a standard service for recommending a purchasable item to a customer.
 */
public interface Advisor {
    Firework recommend(Customer c);
}