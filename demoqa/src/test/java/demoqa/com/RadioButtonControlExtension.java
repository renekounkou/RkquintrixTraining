package demoqa.com;

import org.openqa.selenium.WebElement;

public class RadioButtonControlExtension extends ControlExtensionBase {

	public RadioButtonControlExtension(WebElement element) {
		this.wrappedElement = element;
	}

	public void setValue() {
		this.wrappedElement.click();
	
	}

}
