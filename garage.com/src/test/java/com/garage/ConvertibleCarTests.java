package com.garage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.garage.ConvertibleCar;
import com.garage.ElectronicIgnition;
import com.garage.IEngine;
import com.garage.IIgnition;
import com.garage.SmallEngine;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();
		String lowerTop = null;
		String raiseTop = null;

		this.Car = new ConvertibleCar(model, engine, ignitionSystem, lowerTop, raiseTop);
		
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "Cannot build a Miata Model.");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		
		boolean isStarted = car.getIsStarted();

		assertFalse(isStarted, "Can start a convertible car.");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.Car;
		String lowerTop = car.getLowerTop();
		assertEquals(lowerTop, car.getLowerTop(), "The Top cannot be lowered.");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car = this.Car;
		String raiseTop = car.getRaiseTop();
		assertEquals(raiseTop, car.getRaiseTop(), "The Top cannot be raised.");
	}
}
