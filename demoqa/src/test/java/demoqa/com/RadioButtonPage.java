package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class RadioButtonPage extends PageObjectBase {
	
	private static final String URL = "https://demoqa.com/radio-button";
	
	@FindBy(xpath="//label[@for='yesRadio']")
	private WebElement yesRadioElement;
	
	@FindBy(xpath="//label[@for='impressiveRadio']")
	private WebElement impressiveRadioElement;
	
	@FindBy(xpath="//label[@for='noRadio']")
	private WebElement noRadioElement;
	
	@FindBy(xpath="//label[@for='yesRadio']")
	private WebElement yesButtonElement;
	
	@FindBy(xpath="//label[@for='impressiveRadio']")
	private WebElement impressiveButtonElement;
	
	@FindBy(xpath="//label[@for='noRadio']")
	private WebElement noButtonElement;

	public RadioButtonPage(WebDriver driver) {
		super(driver);
		
	}
	
	public RadioButtonPage navigate() {
		this.getDriver().navigate().to(URL);
		return this;
	}
	
	public RadioButtonPage selectYesRadio() {
		ControlExtensionFactory.selectRadioButton(yesRadioElement).setValue();
		return this;
	}
	
	public RadioButtonPage selectImpressiveRadio() {
		ControlExtensionFactory.selectRadioButton(impressiveRadioElement).setValue();
		return this;
		
	}
	
	public RadioButtonPage selecNoRadio() {
		ControlExtensionFactory.selectRadioButton(noRadioElement).setValue();
		return this;
	}
	
	public String getYesButton() {
		return ControlExtensionFactory.getRadioButton(yesButtonElement).getValue();
	}
	
	public String getImpressiveButton() {
		return ControlExtensionFactory.getRadioButton(impressiveButtonElement).getValue();
}
	public String getNoButton() {
		return ControlExtensionFactory.getRadioButton(noButtonElement).getValue(); 
	}
}
