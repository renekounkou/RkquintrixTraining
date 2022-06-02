package seleniumIV;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumIVTest extends WebDriverFactory {
  @Parameters("browserType")
  @Test
  public void navigateTotheHomePageFromtheProductDetailsPage(@Optional("chrome")String browserType) {
	  WebDriverFactory webDriverFactory = new WebDriverFactory();
	  webDriverFactory.getManager(browserType);
	  String getTheHomePageUrl = new HomePage(this.getDriver())
	    .navigate()
	  	.clickProductLink()
	  	.clickonSVTProSeriesBassHeads()
	  	.clickonSVT3PROLink()
	  	.clickonHomeBreadCrumbLink()
	  	.getHomePageUrl();
	  
	  assertEquals(getTheHomePageUrl, "https://ampeg.com/index.html");		  
  }
  @Parameters("browserType")
  @Test
  public void getTheArtistNameWhoEndorsesTheSVT410HLF(@Optional("chrome")String browserType) {
	  WebDriverFactory webDriverFactory = new WebDriverFactory();
	  webDriverFactory.getManager(browserType);
	  String getTheArtistName = new HomePage(this.getDriver())
			  .navigate()
			  .clickProductLink()
			  .clickonCLASSICSeriesBassHeadsandEnclosures()
			  .clickonSVT410HLFlink()
			  .assertTheArtistName();
	  assertEquals(getTheArtistName, "Bootsy Collins");	
  }
}
