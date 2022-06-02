package seleniumIV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.PageObjectBase;

public class HomePage extends PageObjectBase {
	private static final String URL = "https://ampeg.com/index.html";

	public HomePage(WebDriver driver) {
		super(driver);
	}
	public HomePage navigate() {
		this.getDriver().navigate().to(URL);
		return this;
	}
	public ProductDirectoryPage clickProductLink() {
		this.getDriver().findElement(By.xpath("//*[@id=\"global-topnav\"]/ul/li[1]/a")).click();
		return new ProductDirectoryPage(super.getDriver());
	}
}
