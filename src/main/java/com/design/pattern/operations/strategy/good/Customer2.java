package com.design.pattern.operations.strategy.good;

import java.util.Calendar;
import java.util.Date;

import com.design.pattern.interfaces.adapter.object.eg.Firework;
import com.design.pattern.operations.strategy.bad.Customer;

/**
 * Represents a customer. This class is the refactored strategy class. It
 * extends Customer only so it can be passed in to Rel8 and LikeMyStuff. In
 * reality, you would replace the Customer class with this one.
 */
public class Customer2 extends Customer {
    // An advisor attribute of a Customer object
    // holds the current choice of the strategy to apply
    private Advisor advisor;

    private static PromotionAdvisor promotionAdvisor = new PromotionAdvisor();
    private static GroupAdvisor groupAdvisor = new GroupAdvisor();
    private static ItemAdvisor itemAdvisor = new ItemAdvisor();
    private static RandomAdvisor randomAdvisor = new RandomAdvisor();

    public static final int BIG_SPENDER_DOLLARS = 1000;

    /**
     * @return true if this customer has registered (or entered) his or her
     *         preference profile. This method is not actually implemented
     */
    public boolean isRegistered() {
        return false;
    }

    /**
     * This method demonstrates that the object actually finds the properties
     * file that lists a strategic promotion. If you set your classpath to
     * include the "oozinoz" directory that you can download from oozinoz.com,
     * this program will find the strategy.dat file that lists a promoted
     * firework. In short it's an example of finding and reading from a
     * properties file.
     */
    public static void main(String[] args) {
        Firework recommendation = new Customer2().getRecommended();
        System.out.println("Customer2 recommendation: " + recommendation.toString());
    }

    /**
     * @return a firework to recommend to this customer. This method is
     *         refactored to employ the Strategy pattern. The refactoring of
     *         Customer separates the selection of a strategy from the use of
     *         the strategy
     */
    public Firework getRecommended() {
        //use the strategy
        Firework recommend = getAdvisor().recommend(this);
        return recommend;
    }

    /**
     * selection of a strategy
     * 
     * The refactored Customer2 class lazy-initializes this attribute with logic
     * that reflects Oozinoz’s advertising policies
     * 
     * @return
     */
    private Advisor getAdvisor() {
        if (advisor == null) {
            if (promotionAdvisor.hasItem())
                advisor = promotionAdvisor;
            else if (isRegistered())
                advisor = groupAdvisor;
            else if (isBigSpender())
                advisor = itemAdvisor;
            else
                advisor = randomAdvisor;
        }
        return advisor;
    }

    /**
     * @return the amount of money this customer has spent with us since the
     *         provided date.
     * @param date
     *            Since when?
     */
    public double spendingSince(Date date) {
        return 1000;
    }

    private boolean isBigSpender() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        return (spendingSince(cal.getTime()) > BIG_SPENDER_DOLLARS);
    }
}