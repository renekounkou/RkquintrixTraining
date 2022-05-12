package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import framework.PageObjectBase;

public class SelectMenuPage extends PageObjectBase {
	private static final String URL = "https://demoqa.com/select-menu";
	
	@FindBy(id="oldSelectMenu")
	private WebElement oldSelectMenuElement;

	public SelectMenuPage(WebDriver driver) {
		super(driver);
	
	}
	public void navigate() {
		this.getDriver().navigate().to(URL);
	}
	
	public String setTheValue(String value) {
		ControlExtensionFactory.setTheValue(oldSelectMenuElement).getValue();
		Select select = new Select(oldSelectMenuElement);
		select.selectByValue("2");
		return value;
		
	}

}
