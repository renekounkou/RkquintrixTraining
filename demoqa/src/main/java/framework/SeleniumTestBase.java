package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class SeleniumTestBase {
	private WebDriver driver;
	
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	
	this.driver =  new ChromeDriver();
	
	setOptions();
	}

	@AfterTest
	public void cleanup() {
		if(this.driver != null) {
			this.driver.quit();
		}
		
	}
		protected WebDriver getDriver() {
			return this.driver;
	}

		private void setOptions() {
	    this.driver.manage().window().maximize();
	    this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

}
