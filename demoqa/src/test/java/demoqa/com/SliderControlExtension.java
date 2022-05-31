package demoqa.com;

import org.openqa.selenium.WebElement;

public class SliderControlExtension extends ControlExtensionBase {

	public SliderControlExtension(WebElement element) {
		super(element);
	}
	public String getValue() {
		 return this.wrappedElement.getAttribute("value");
	}
}
