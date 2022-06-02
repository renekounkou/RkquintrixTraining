package seleniumIV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.PageObjectBase;

public class SVT410HLFdetailsPage extends PageObjectBase {

	public SVT410HLFdetailsPage(WebDriver driver) {
		super(driver);
	}
	
	public String assertTheArtistName() {
		String element = this.getDriver().findElement(By.xpath("//*[@id=\"artist\"]/p/b")).getText();
		System.out.println(element);
		return element;
	}
	
}
