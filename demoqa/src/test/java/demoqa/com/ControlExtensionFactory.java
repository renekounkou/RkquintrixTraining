package demoqa.com;

import org.openqa.selenium.WebElement;

public class ControlExtensionFactory {

	public static RadioButtonControlExtension selectRadioButton(WebElement element) {
		 return new RadioButtonControlExtension(element);
	}
	public static RadioGroupControlExtension getRadioButton(WebElement element) {
		 return new RadioGroupControlExtension(element);
}
	public static HyperlinkControlExtension clickLink(WebElement element) {
		return new HyperlinkControlExtension(element);
	}
	public static HyperlinkControlExtension checkTheResult(WebElement element) {
		return new HyperlinkControlExtension(element);
	}
	public static SliderControlExtension setTheValueto80(WebElement element) {
		return new SliderControlExtension(element);
	}
	public static SliderControlExtension setTheValueto17(WebElement element) {
		return new SliderControlExtension(element);
	}
	public static SliderControlExtension setTheValueto0(WebElement element) {
		return new SliderControlExtension(element);
	}
	public static SliderControlExtension setTheValueto100(WebElement element) {
		return new SliderControlExtension(element);
	}
}