package com.design.parttern.interfaces.adapter.object;

public class OozinozSkyRocket extends SkyRocket {

	private PhysicalRocket rocket;

	public OozinozSkyRocket(PhysicalRocket rocket) {
		super(rocket.getMass(), rocket.getThrust(), rocket.getBurnTime());
		this.rocket = rocket;
	}

	public double getMass() {
		return rocket.getMass();
	}

	public double getThrust() {
		return rocket.getThrust();
	}

	public double getBurnTime() {
		return rocket.getBurnTime();
	}

}
