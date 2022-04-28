package com.garage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssProjectTest {
  @Test
  public void MyCssSelectorProject() {
	  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.navigate().to("http://demoqa.com/buttons");
	  
	//WebElement element = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
	
	  
	 //JavascriptExecutor js = (JavascriptExecutor)driver;
	// js.executeScript("return document.getElementById('userName')");
	     
  }
}
