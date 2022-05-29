package forgotPasswordStepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import foundation.SeleniumTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPassword extends SeleniumTestBase {
	
	@Given("User navigates to the website")
	public void user_navigates_to_the_website() {
		this.setup();
		this.getDriver();
		this.getDriver().navigate().to("https://invenauto.tech/index.php");
	}
	@Given("User clicks on Sign In button")
	public void user_clicks_on_sign_in_button() {
		this.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}
	@When("User clicks on Forgot you Password link")
	public void user_clicks_on_forgot_you_password_link() {
		this.getDriver().findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a")).click();
	}
	@When("User enters a valid email address")
	public void user_enters_a_valid_email_address() {
		this.getDriver().findElement(By.id("email")).sendKeys("renekounkou@gmail.com");
	}
	@Then("User receives an email to retrieve password")
	public void user_receives_an_email_to_retrieve_password() {
		this.getDriver().findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button")).click();
		WebElement element = this.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div/p"));
		assertEquals(element.getText(), "A confirmation email has been sent to your address: renekounkou@gmail.com");
		this.cleanup();
	}
}
