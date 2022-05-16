package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class LinksPage extends PageObjectBase {
	private static final String URL = "https://demoqa.com/links";
	
	@FindBy(xpath="//*[@id=\"created\"]")
	private WebElement clickLinkElement;
	
	@FindBy(xpath="//*[@id=\"linkResponse\"]")
	private WebElement checkTheResultElement;

	public LinksPage(WebDriver driver) {
		super(driver);
	}
	public LinksPage navigate() {
		this.getDriver().navigate().to(URL);
		return this;
}
	public LinksPage clickLink() {
		ControlExtensionFactory.clickLink(clickLinkElement).setValue();
		return this;
	}
	public String checkTheResult() {
		return ControlExtensionFactory.checkTheResult(checkTheResultElement).getValue();
	}
}
