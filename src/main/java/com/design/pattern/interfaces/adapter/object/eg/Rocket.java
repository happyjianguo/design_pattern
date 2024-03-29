package com.design.pattern.interfaces.adapter.object.eg;

public class Rocket extends Firework{
	private double apogee;

	private double thrust;

	/**
	 * Allow creation of empty objects to support reconstruction from persistent
	 * store.
	 */
	public Rocket() {
	}

	/**
	 * Create a rocket with all its expected properties. See the superclass for
	 * descriptions of other parameters
	 * 
	 * @param apogee
	 *            The height (in meters) that the rocket is expected to reach
	 * @param thrust
	 *            The rated thrust (or force, in newtons) of this rocket
	 */
	public Rocket(String name, double mass, Dollars price, double apogee,
			double thrust) {
		super(name, mass, price);
		setApogee(apogee);
		setThrust(thrust);
	}

	/**
	 * The height (in meters) that the rocket is expected to reach.
	 */
	public double getApogee() {
		return apogee;
	}

	public void setApogee(double value) {
		apogee = value;
	}

	/**
	 * The rated thrust (or force, in newtons) of this rocket.
	 */
	public double getThrust() {
		return thrust;
	}

	public void setThrust(double value) {
		thrust = value;
	}
}
