package com.garage;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class JavaExercisesTest {
  
  @Test
  public void compareTwoValues() {
	  int price1 = 45;
	  int price2 = 45;
	  
	  boolean compare = price1==price2;
	  boolean expectedResult = true;
	  
	  assertEquals(compare, expectedResult, "The value of price1 is equal to the value of price2");
  }
  @Test
  public void compareTwoReference() {
	  String lastName = new String("Kounkou");
	  String familyName = new String("Kounkou");
	  
	  boolean result = lastName == familyName;
	  boolean expectedResult = false;
	  
	  
	  assertEquals(result, expectedResult, "firstName is not equal to lastName using == operator");
  }
  @Test
  public void compareTwoReferenceWithEqual() {
	  String lastName = new String("Kounkou");
	  String familyName = new String("Kounkou");
	  
	  boolean result = lastName.equals(familyName);
	  boolean expectedResult = true;
	  
	  
	  assertEquals(result, expectedResult, "firstName is equal to lastName using .equals operator");  
  }
  @Test
  public void demonstrateLogicalANDoperator() {
	  int age1 = 30;
	  int age2 = 45;
	  int totalAge = 75; 
	  if(age1==age2 && age2==age1) {
	  }
	  int expectedResult = 75;
	  assertEquals(totalAge, expectedResult, "total age is equal to 75");
  }
  @Test
  public void demonstrateLogicalORoperator() {
	  int age1 = 30;
	  int age2 = 45;
	  int totalAge = 75; 
	  if(age1==age2 || age2==age1) {
	  
	  }
	  int expectedResult = 75;
	  assertEquals(totalAge, expectedResult, "total age is equal to 75");
}
  @Test
  public void demonstrateUnaryOperators() {
	  int x = 3;
	  int y = x++;
	  int z = x + y;
	  
	  int expectedResult = 7;
	  
	  assertEquals(z, expectedResult, "The incremented value is 7");
	  
  }
  @Test
  public void changeaBooleanVariable() {
	  int day1 = 7;
	  int day2 = 7;
	  
	  boolean result = day1 == day2;
	  boolean result1 = day1 != day2;
	  boolean expectedResult = false;
	  
	 assertEquals(result1, expectedResult, "day1 is equal to day2");
  }
  @Test
  public void usingTwoIfStatementsWithnoElse() {
	  int morningHour = 10;
	  int afternoonHour = 14;
	  if(morningHour == 11) {
		  System.out.println("Good Morning");
	  }
	  if(afternoonHour == 14) {
	  System.out.println("Good Afternoon");  
	  boolean compareHour = morningHour != afternoonHour;
	  boolean expectedResult = true;
	  System.out.println(compareHour);
	  assertEquals(afternoonHour, expectedResult, "The Morning hour is different to the Afternoon hour");
	  }
  }
  @Test
  public void usingIfandElseStatements() {
	  int passGrade = 80;
	  if(passGrade >= 80) {
		  System.out.println("Good job. You passed. ");
		  
	  } else {
		  System.out.println("You failed.");
		  int expectedResult = passGrade;
		  assertEquals(passGrade, expectedResult, "If grade is grade is greater than or equal to 80, "
		  		+ "you passed");
	  }
  }
  @Test
  public void usingaNestedForLoop() {
  int[] myArray = {2, 1, 6, 10, 5, 7, 9, 4, 8, 3};
	  for(int i = 0; i<= 10; i++) {
		  for(int i1 = 0; i1<myArray.length; i1++) {
			  System.out.println(i);
			  System.out.println(i1);
			  int[] expectedResult = myArray;
			  assertEquals(myArray, expectedResult);
		  }
	  }
  }
  @Test
  public void demonstrateaTryCatchBlock() {
	  int numb1 = 12;
	  int numb2 = 0;
	  try{
		  int divnumbs = numb1/numb2;
          int expectedResult = divnumbs;
		  assertEquals(divnumbs, expectedResult);
		  System.out.println(divnumbs);
	  
	  }catch (ArithmeticException e) {
		  System.out.println("Done");
	  }  
  }
  @Test
  public void demonstrateaForeachLoop() {
	  String[] colors = {"red", "blue", "yellow", "purple", "green", "black"};
	  for(String myColors: colors) {
		  System.out.println(myColors);
	  }
	  String[] expectedResult = colors;
	  assertEquals(colors, expectedResult);
  }
}
