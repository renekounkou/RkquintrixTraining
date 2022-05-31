package demoqa.com;

import org.openqa.selenium.WebElement;

public class RadioGroupControlExtension extends ControlExtensionBase {

	public RadioGroupControlExtension(WebElement element) {
		super(element);
	}
	public String getValue() {
		return this.wrappedElement.getText();
	}
}
