package webdrivermanager;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase extends DriverManagerFactory {
  
	@Parameters("browserType")
	@Test
  public void CrossBrowsers(@Optional("firefox")String browserType) {
	  DriverManagerFactory driverManagerFactory = new DriverManagerFactory();
	  driverManagerFactory.getManager(browserType);
  }
}
