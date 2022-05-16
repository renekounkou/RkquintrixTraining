package demoqa.com;

import org.openqa.selenium.WebElement;

public class HyperlinkControlExtension extends ControlExtensionBase {
	
	public HyperlinkControlExtension(WebElement element) {
		this.wrappedElement = element;
	}
	
	public void setValue() {
		this.wrappedElement.click();
	}
	
	public String getValue() {
		return this.wrappedElement.getText();
	}
}
