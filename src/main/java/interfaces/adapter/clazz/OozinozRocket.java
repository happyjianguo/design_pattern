package interfaces.adapter.clazz;

/**
 * 
 * acted as adatper
 * to adapt the PhysicalRocket and meet the simulator¡¯s need,
 * an OozinozRocket object can maintain a time instance variable that it can pass
 * to the methods of the PhysicalRocket class as needed.
 */
public class OozinozRocket extends PhysicalRocket implements RocketSim {

	private double time;

	public OozinozRocket(double burnArea, double burnRate, double fuelMass,
			double totalMass) {
		super(burnArea, burnRate, fuelMass, totalMass);
	}

	public double getBurnTime() {
		return super.getBurnTime();
	}

	public double getMass() {
		return super.getMass();
	}

	public double getThrust() {
		return super.getThrust();
	}

	@Override
	public void setSimTime(double time) {
		this.time = time;
	}

}
