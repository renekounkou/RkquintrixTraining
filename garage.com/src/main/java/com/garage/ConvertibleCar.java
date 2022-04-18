package com.garage;

public class ConvertibleCar extends Car implements ICar {

	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}

	public void start() {
		
	}

	public int getOdometer() {
		return 0;
	}

	public boolean getIsStarted() {
		return false;
	}

	public String getModel() {
		return null;
	}
}
