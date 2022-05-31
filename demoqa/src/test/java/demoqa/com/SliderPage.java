package demoqa.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class SliderPage extends PageObjectBase {
	private static final String URL = "https://demoqa.com/slider";
	
	@FindBy(xpath="//*[@id=\"sliderContainer\"]/div[1]/span/input")
	private WebElement setTheValueto80Element;
	@FindBy(xpath="//*[@id=\"sliderContainer\"]/div[1]/span/input")
	private WebElement setTheValueto17Element;
	@FindBy(xpath="//*[@id=\"sliderContainer\"]/div[1]/span/input")
	private WebElement setTheValueto0Element;
	@FindBy(xpath="//*[@id=\"sliderContainer\"]/div[1]/span/input")
	private WebElement setTheValueto100Element;

	public SliderPage(WebDriver driver) {
		super(driver);
	}
	public void navigate() {
		this.getDriver().navigate().to(URL);
	}
	public int setTheValueto80(int value) {
		ControlExtensionFactory.setTheValueto80(setTheValueto80Element).getValue();
		Actions actions = new Actions(this.getDriver());
		actions
		.dragAndDropBy(setTheValueto80Element, 155, 0)
		.perform();
		return value;
	}
	public int setTheValueto17(int value) {
		ControlExtensionFactory.setTheValueto17(setTheValueto17Element).getValue();
		Actions actions = new Actions(this.getDriver());
		actions
		.dragAndDropBy(setTheValueto17Element, -165, 0)
		.perform();
		return value;
	}
	public int setTheValueto0(int value) {
		ControlExtensionFactory.setTheValueto0(setTheValueto0Element).getValue();
		Actions actions = new Actions(this.getDriver());
		actions
		.dragAndDropBy(setTheValueto0Element, -300, 0)
		.perform();
		return value;
}
	public int setTheValueto100(int value) {
		ControlExtensionFactory.setTheValueto100(setTheValueto100Element).getValue();
		Actions actions = new Actions(this.getDriver());
		actions
		.dragAndDropBy(setTheValueto100Element, 300, 0)
		.perform();
		return value;
}
}
