package demoqa.com;

import org.openqa.selenium.WebElement;

public class RadioGroupControlExtension {
	private WebElement wrappedElement;

	public RadioGroupControlExtension(WebElement element) {
		this.wrappedElement = element;
	}

	public String getValue() {
		return this.wrappedElement.getText();
		
	}
}
