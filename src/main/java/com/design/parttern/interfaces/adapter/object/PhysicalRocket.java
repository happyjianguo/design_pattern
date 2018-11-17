package com.design.parttern.interfaces.adapter.object;

/**
 * 
 * an Exsiting class that have some function useful 
 * and you can't modify it
 * the PhysicalRocket class has the information that the simulator (client) need ,
 * but its method do not exactly math those RocketSim interface.
 * 
 */
public class PhysicalRocket {
	private double burnArea;
	private double burnRate;
	private double fuelMass;
	private double totalMass;

	public PhysicalRocket(double burnArea, double burnRate, double fuelMass,
			double totalMass) {
		super();
		this.burnArea = burnArea;
		this.burnRate = burnRate;
		this.fuelMass = fuelMass;
		this.totalMass = totalMass;
	}

	public double getBurnTime() {
		return burnArea / burnRate;
	}

	public double getMass() {
		return totalMass + fuelMass;
	}

	public double getThrust() {
		return burnRate;
	}

}
