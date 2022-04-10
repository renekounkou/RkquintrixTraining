package com.garage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTests {
  @Test
  public void canBuildCar() {
	  Car newCar = new Car("Corvette");
	  newCar.start();
	  String model = newCar.model;
	  String expectedModel = "Corvette";
	  Assert.assertEquals(model, expectedModel);
  }
}
