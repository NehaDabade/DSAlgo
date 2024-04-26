package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DSRegistration;

public class DSRegistrationStep extends BasePage {
	private final BasePage base;
	Scenario sce;
	DSRegistration registrationpage;
	Actions action;

	public DSRegistrationStep(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		registrationpage = base.getRegistrationObj();
		action = base.getAction();
	}

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() throws IOException {
		base.getLogger().info("Initialize Page object");
		base.InitializePageObject(driver, sce);
		p = base.getProperties();
		driver.get(p.getProperty("appURLRegistration"));
		base.getLogger().info("Clicked on Registration Link");

	}

	@When("^The user fill in the registration form with given data (.*), (.*), and (.*)$")
	public void the_user_fill_in_the_RegistrationFormWithInvalidData(String username1, String password,
			String confirmpwd1) {

		base.getLogger().info("The user fill in the registration form with given data");
		Actions action = new Actions(driver);
		action.moveToElement(registrationpage.username).click().sendKeys(username1).build().perform();
		action.moveToElement(registrationpage.pwd).click().sendKeys(password).build().perform();
		action.moveToElement(registrationpage.confpwd).click().sendKeys(confirmpwd1).build().perform();

		base.getLogger().info("Clicked on Registration Button");
		action.moveToElement(registrationpage.btnRegister).click().perform();

	}

	@Then("^User should see an error\\/success message(.*),(.*)$")
	public void user_should_see_an_error_success_message(String message, String status) {
		base.getLogger().info("Check for error message or popup message...");
		try {
			boolean targetpage = base.getVerifyObj().isLoginPageExists(message);
			if (status.trim().equalsIgnoreCase("valid"))

			{
				if (targetpage == true) {

					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (status.trim().equalsIgnoreCase("Invalid")) {
				if (targetpage == true) {

					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

		} catch (Exception e) {

			Assert.assertTrue(false);
		}
	}

}
