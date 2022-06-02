package seleniumIV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.PageObjectBase;

public class AmpegProSeriesPage extends PageObjectBase {

	public AmpegProSeriesPage(WebDriver driver) {
		super(driver);
	}
	public SVT3PROdetailsPage clickonSVT3PROLink(){
		this.getDriver().findElement(By.xpath("//*[@id=\"seriesHome\"]/table/tbody/tr[1]/td[1]/a/img")).click();
		return new SVT3PROdetailsPage(super.getDriver());
	}
}
