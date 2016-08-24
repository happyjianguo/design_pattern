package operations.strategy.good;

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

import operations.strategy.bad.Customer;
import interfaces.adapter.object.eg.Firework;

/**
 * Defines a standard service for recommending a purchasable item to a customer.
 */
public interface Advisor {
    Firework recommend(Customer c);
}