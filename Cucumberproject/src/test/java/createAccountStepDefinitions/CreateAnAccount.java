package createAccountStepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import foundation.SeleniumTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAnAccount extends SeleniumTestBase {
	
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
	@Given("User enters a valid email address")
	public void user_enters_a_valid_email_address() {
		this.getDriver().findElement(By.id("email_create")).sendKeys("kepe@gmail.com");; 
	}
	@When("User clicks on create an account button")
	public void user_clicks_on_create_an_account_button() {
		this.getDriver().findElement(By.name("SubmitCreate")).click();
	}
	@When("User enters personnal information")
	public void user_enters_personnal_information() {
		this.getDriver().findElement(By.name("id_gender")).click();
		this.getDriver().findElement(By.id("customer_firstname")).sendKeys("Rene");
		this.getDriver().findElement(By.id("customer_lastname")).sendKeys("Kounkou");
		this.getDriver().findElement(By.id("passwd")).sendKeys("Quintrix2022");
	}
	@When("User cliks on Register button")
	public void user_cliks_on_register_button() {
		this.getDriver().findElement(By.id("submitAccount")).click();
	}
	@Then("User is redirected to My Account page")
	public void user_is_redirected_to_my_account_page() {
		WebElement element = this.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p[2]"));
		assertEquals(element.getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
		this.cleanup();
	}
}
