package demoqa.com;

import org.openqa.selenium.WebElement;

public abstract class ControlExtensionBase {
	protected WebElement wrappedElement;

	public ControlExtensionBase(WebElement element) {
		this.wrappedElement = element;
	}
}
