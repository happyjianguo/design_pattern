package com.design.parttern.interfaces.adapter.clazz;

public class Test {
	/**
	 * In a class Adapter design , the new adapter class implements the 
	 * desired interface and subclasses an existing class.
	 * 
	 * This approach will not always work , notably when the set of 
	 * methods that you need to adapt is not specified in an interface.
	 * 
	 */
	public static void main(String[] args) {
		RocketSim rocket = new OozinozRocket(1,1,1,1);
		
		System.out.println(rocket.getMass());
		System.out.println(rocket.getThrust());
		rocket.setSimTime(1.0);
		
	}
}
