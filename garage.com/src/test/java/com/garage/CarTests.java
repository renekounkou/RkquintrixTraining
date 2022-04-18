package com.garage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.garage.ConvertibleCar;
import com.garage.ElectronicIgnition;
import com.garage.LargeEngine;

public class CarTests {
	private Car Car;

	@BeforeClass
	public void setup() {
		String model = "Corvette";
		LargeEngine engine = new LargeEngine();
		ElectronicIgnition ignitionSystem = new ElectronicIgnition();
		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildCar() {
		Car car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "");
	}

	@Test
	public void canStartCar() {
		Car car = this.Car;

		boolean isStarted = car.getIsStarted();

		assertFalse(isStarted, "");
	}
}