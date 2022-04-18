package com.garage;

public interface ICar {
	void start();
	int getOdometer();
	boolean getIsStarted();
	public String getModel();
	void lowerTop();
	void raiseTop();
}
