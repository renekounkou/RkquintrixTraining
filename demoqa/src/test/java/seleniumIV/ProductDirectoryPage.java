package seleniumIV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.PageObjectBase;

public class ProductDirectoryPage extends PageObjectBase {

	public ProductDirectoryPage(WebDriver driver) {
		super(driver);
	}
	public AmpegProSeriesPage clickonSVTProSeriesBassHeads() {
		this.getDriver().findElement(By.xpath("//*[@id=\"productIndex\"]/table/tbody/tr[2]/td[4]/p/a/img")).click();
		return new AmpegProSeriesPage(super.getDriver());
	}
	public AmpegClassicSeries clickonCLASSICSeriesBassHeadsandEnclosures() {
		this.getDriver().findElement(By.xpath("//*[@id=\"productIndex\"]/table/tbody/tr[2]/td[2]/p/a/img")).click();
		return new AmpegClassicSeries(super.getDriver());
	}

}
