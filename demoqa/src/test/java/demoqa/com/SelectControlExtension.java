package demoqa.com;

import org.openqa.selenium.WebElement;

public class SelectControlExtension extends ControlExtensionBase {

	public SelectControlExtension(WebElement element) {
		super(element);
	}
	public String getValue() {
		return this.wrappedElement.getAttribute("value");
	}
}
