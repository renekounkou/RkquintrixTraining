package seleniumIV;

import framework.SeleniumTestBase;

public class WebDriverFactory extends SeleniumTestBase {
	public String getManager(String browserType) {
		if(browserType.equals("firefox")) {
			this.setup();
		}else if(browserType.equals("chrome")) {
			this.setup();
		}else {
			throw new RuntimeException("Does not support browser" + browserType);
		}
		this.cleanup();
		return null;
	}
}
