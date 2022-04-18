package com.garage;

public abstract class MotorizedVehicle {
	public String color;
	private IEngine engine;
	private String model;
	private IIgnition ignitionSystem;
	private String lowerTop;
	private String raiseTop;
	
	public MotorizedVehicle(String model, IEngine engine, IIgnition ignitionSystem, String lowerTop, String raiseTop) {
		this.engine = engine;
		this.model = model;
		this.ignitionSystem = ignitionSystem;

	}
		
	public String getLowerTop() {
		return lowerTop;
	}

	public void setLowerTop(String lowerTop) {
		this.lowerTop = lowerTop;
	}

	public String getRaiseTop() {
		return raiseTop;
	}

	public void setRaiseTop(String raiseTop) {
		this.raiseTop = raiseTop;
	}

	public void start() {
		this.ignitionSystem.turnOn();
		this.engine.start();
	}

	public boolean getIsStarted() {
		return this.ignitionSystem.getIsOn() && this.engine.getIsStarted();
	}

	public String getModel() {
		return this.model;
	}
}
