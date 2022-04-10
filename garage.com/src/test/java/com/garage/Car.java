package com.garage;
import garage.com.IEngine;
import garage.com.LargeEngine;
public class Car {
	private int odometer;
	public IEngine engine;
	public String model;
	public  Car(String model) {
		this.model = model;
		LargeEngine newEngine = new LargeEngine();
		this.engine = engine;
	}
	public void start() {
	}
	public int getOdometer() {
		return this.odometer;
	}
}
