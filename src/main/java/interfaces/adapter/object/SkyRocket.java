package interfaces.adapter.object;

public class SkyRocket {
	private double mass;
	private double thrust;
	private double burnTime;

	public SkyRocket(double mass, double thrust, double burnTime) {
		this.mass = mass;
		this.thrust = thrust;
		this.burnTime = burnTime;
	}

	public double getMass() {
		return mass;
	}

	public double getThrust() {
		return thrust;
	}

	protected void setSimTime(double t) {
		this.burnTime = t;
	}

}
