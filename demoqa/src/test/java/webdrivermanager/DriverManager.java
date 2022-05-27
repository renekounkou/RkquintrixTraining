package webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class DriverManager {
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	protected void setDriver(WebDriver driver) {
		this.driver = driver;
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\FireFoxDriver\\geckodriver.exe");
	}
	public void createChromeDriver() {
		driver = new ChromeDriver();
	}
	public void createFirefoxDriver() {
		driver = new FirefoxDriver();
	}
	public void quitDriver() {
		if(this.driver != null) {
			this.driver.quit();
		}
	}
}

