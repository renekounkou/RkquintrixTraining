package webdrivermanager;

public class DriverManagerFactory extends DriverManager {
	
	public String getManager(String browserType) {
		if(browserType.equals("chrome")) {
			this.setDriver(getDriver());
			this.createChromeDriver();
			
		}else if(browserType.equals("firefox")) {
			this.setDriver(getDriver());
			this.createFirefoxDriver();
		}else {
			throw new RuntimeException("Does not support browser" + browserType);
		}
		this.getDriver().get("http://invenauto.tech/index.php");
		this.quitDriver();
		
		return null;
	}
}
