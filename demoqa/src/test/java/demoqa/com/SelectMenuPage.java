package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import framework.PageObjectBase;

public class SelectMenuPage extends PageObjectBase {
	private static final String URL = "https://demoqa.com/select-menu";

	public SelectMenuPage(WebDriver driver) {
		super(driver);
	
	}
	public void navigate() {
		this.getDriver().navigate().to(URL);
	}
	
	public SelectMenuPage setTheValue() {
		WebElement element = this.getDriver().findElement(By.id("oldSelectMenu"));
		Select select = new Select(element);
		select.selectByValue("2");
		return this;
	}
	public String getTheValue(String value) {
		WebElement element = this.getDriver().findElement(By.id("oldSelectMenu"));
		Select select = new Select(element);
		select.selectByValue("2");
		System.out.println(element.getAttribute(value));
		return element.getAttribute(value);
	}

}
