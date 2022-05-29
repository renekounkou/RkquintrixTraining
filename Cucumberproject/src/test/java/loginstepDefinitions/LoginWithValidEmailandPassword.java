package loginstepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import foundation.SeleniumTestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithValidEmailandPassword extends SeleniumTestBase {
	
	@Given("User navigates to the website")
	public void user_navigates_to_the_website() {
		this.setup();
		this.getDriver();
		this.getDriver().navigate().to("https://invenauto.tech/index.php");
	}
	@And("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		this.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}
	@When("User enters a valid email address and a valid password")
	public void user_enters_a_valid_email_address_and_a_valid_password() {
		this.getDriver().findElement(By.id("email")).sendKeys("renekounkou@gmail.com");
		this.getDriver().findElement(By.id("passwd")).sendKeys("Training2022");
		this.getDriver().findElement(By.id("SubmitLogin")).click();
	}
	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		WebElement element = this.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p"));
		assertEquals(element.getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
		this.cleanup();
	}
}
