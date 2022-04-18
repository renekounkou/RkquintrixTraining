package com.garage;

public class ConvertibleCar extends Car implements ICar {

	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem, String lowerTop, String raiseTop) {
		super(model, engine, ignitionSystem, lowerTop, raiseTop);
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

	public void lowerTop() {
		
	}

	public void raiseTop() {
		
	}
}
