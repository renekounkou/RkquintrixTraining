package seleniumIV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.PageObjectBase;

public class AmpegClassicSeries extends PageObjectBase {

	public AmpegClassicSeries(WebDriver driver) {
		super(driver);
	}
	public SVT410HLFdetailsPage clickonSVT410HLFlink() {
		this.getDriver().findElement(By.xpath("//*[@id=\"seriesHome\"]/table/tbody/tr[3]/td[4]/a/img")).click();
		return new SVT410HLFdetailsPage(super.getDriver());
	}
}
