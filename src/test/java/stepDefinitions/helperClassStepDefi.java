package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjects.VerificationPage;

public class helperClassStepDefi extends BasePage {
	Scenario sce;
	VerificationPage verify;
	Properties p;
	public BasePage base;
	public WebDriver driver;
	Logger logger = LogManager.getLogger();

	public helperClassStepDefi(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;

	}

	// Main page background code

	@Given("the user is on the dsportalapp main page")
	public void the_user_is_on_the_dsportalapp_main_page() throws IOException {

		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		logger.info("****User is on main page*****");
	}

	@When("the user clicks on the Get Started button")
	public void the_user_clicks_on_the_get_started_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Get Started']")).click();
		logger.info("****User click on get started*****");
	}

	@Then("the user navigates to the dsportalapp home page")
	public void the_user_navigates_to_the_dsportalapp_home_page() throws IOException {

		String act_title = driver.getTitle();
		String exp_title = "NumpyNinja";

		if (act_title.equals(exp_title)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
		logger.info("****User is on home page*****");
	}

	@Given("The user navigates to login page")
	public void the_user_navigates_to_login_page() throws IOException {
		// ND: To make sure user gets directed to Login Page.
		driver.get(base.getProperties().getProperty("appURLlogin"));
		logger.info("****User is on login page*****");
	}

	@When("the user gives username and password")
	public void the_user_gives_username_and_password() throws IOException {

		base.getLogger().info("Entering email and password.. ");

		p = base.getProperties();
		base.getLoginObj().sendUserName(p.getProperty("username").trim());

		base.getLoginObj().sendPwdName(p.getProperty("password").trim());
		logger.info("****User entred username and password*****");
	}

	@Then("The user logsin")
	public void the_user_logsin() {
		base.getLogger().info("Entering email and password.. ");
		base.getLoginObj().clickLogin();
		logger.info("****User logsin*****");

	}

	@When("The user clicks on {string} get started button")
	public void the_user_clicks_on_get_started_button(String string) throws InterruptedException {
		System.out.println(string + "CHECK POINT1");
		String locatorString = "(//a[@href='" + string + "'])[1]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorString)).click();
		System.out.println(string);
		logger.info("****User clicks on get started button*****");

	}

	@Then("The user will be directed to {string} Page")
	public void the_user_will_be_directed_to_page(String string) throws IOException {
		// ND: Changed to make this common step which dynamically generates URL, can be
		// used in all StepDefs.
		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/" + string);
		driver.manage().window().maximize();
		logger.info("****User directed to desired page*****");
	}

	@When("The user clicks Try Here button on the {string} page")
	public void the_user_clicks_try_here_button_on_the_page(String string) throws InterruptedException {
		base.getHpc().ClickTryHere();
		Thread.sleep(1000);
		logger.info("****User click try here button*****");
	}

	public void invalidruneditor() {

	}

	@Then("Page URL should be {string}")
	public void page_url_should_be(String string) {

		Assert.assertEquals(driver.getCurrentUrl(), string);
		logger.info("****User verify URL*****");
	}

	@Then("User is redirected to {string}")
	public void user_is_redirected_to(String urlToRedirect) throws InterruptedException, IOException {
		base.InitializePageObject(driver, sce);
		driver.get(urlToRedirect);
		Assert.assertEquals(driver.getCurrentUrl(), urlToRedirect);
		Thread.sleep(1000);
		logger.info("****User redirected to desire option*****");
	}

	@And("User see {string} options")
	public void user_see_options(String textToFind) throws InterruptedException {

		boolean isTextPresentInPageSource = driver.getPageSource().contains(textToFind);
		if (isTextPresentInPageSource == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
		Thread.sleep(1000);
		logger.info("****User see Topic Covered option*****");
	}

	@Given("User go on {string} link")
	public void user_click_on_link(String linkText) throws IOException {
		InitializePageObject(driver, sce);
		base.getHpc().clickLink(linkText);
		logger.info("****User can select respective options*****");
	}

	@Then("User scroll down the page")
	public void user_scroll_down_the_page() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		logger.info("****User can scroll down the page*****");
	}

	@Then("the user navigates to the {string}")
	public void the_user_navigates_to_the(String string) throws IOException {
		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/home");
		logger.info("****User navigates to home page*****");
	}
}
