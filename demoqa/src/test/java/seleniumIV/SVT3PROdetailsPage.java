package seleniumIV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.PageObjectBase;

public class SVT3PROdetailsPage extends PageObjectBase {

	public SVT3PROdetailsPage(WebDriver driver) {
		super(driver);
	}
	public SVT3PROdetailsPage clickonHomeBreadCrumbLink() {
		this.getDriver().findElement(By.xpath("//*[@id=\"navLinks\"]/a[1]")).click();
		return this;
	}
	public String getHomePageUrl() {
		String homePageUrl = this.getDriver().getCurrentUrl();
		System.out.println(homePageUrl);
		return homePageUrl;
	}
}
