package stepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignIn;
import pageObjects.helperClass;
import pageObjects.verifyUtil;

public class helperClassStepDefi extends BasePage {
	Scenario sce;
	private final BasePage base;
	Properties p;
	verifyUtil verify;
	public Actions action;

	public SignIn login;
	public helperClass helperclass;

	public helperClassStepDefi(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		action = base.getAction();
		login = base.getLoginObj();
		helperclass = base.getHpc();
	}

	@Given("The user navigates to login page")
	public void the_user_navigates_to_login_page() throws IOException {
		base.getLogger().info("the_user_navigates_to_login_page.. ");
		base.InitializePageObject(driver, sce);
		p = base.getProperties();
		driver.get(p.getProperty("appURLlogin"));

	}

	@When("the user gives username and password")
	public void the_user_gives_username_and_password() throws IOException {
		base.getLogger().info("Entering username and password.. ");
		Actions action = new Actions(driver);
		action.moveToElement(login.loginusername).click().sendKeys(p.getProperty("username").trim()).build().perform();
		action.moveToElement(login.loginpwd).click().sendKeys(p.getProperty("password").trim()).build().perform();
	}

	@Then("The user logsin")
	public void the_user_logsin() {
		base.getLogger().info("User Clicks on Login");
		Actions action = new Actions(driver);
		action.moveToElement(login.btnLogin).click().perform();

	}

	@Given("User is on {string} page")
	public void user_is_on_page(String string) throws IOException {

		base.getLogger().info("the_user_navigates_to_login_page.. ");
		base.InitializePageObject(driver, sce);
		p = base.getProperties();
		driver.get(p.getProperty("appurlHome"));

	}

	@When("The user clicks on {string} get started button")
	public void the_user_clicks_on_get_started_button(String string) throws InterruptedException {
		base.getLogger().info("the_user_clicks_on_get_started_button");
		String locatorString = "(//a[@href='" + string + "'])[1]";
		driver.findElement(By.xpath(locatorString)).click();
	}

	@Then("The user will be directed to {string} Page")
	public void the_user_will_be_directed_to_page(String string) {
		base.getLogger().info("the_user_will_be_directed_to_page");
		String baseUrl = "https://dsportalapp.herokuapp.com/";
		String url = baseUrl.concat(string.toLowerCase() + "/"); // Concatenate base URL with section and slash
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(url, act_url);
	}

	@Then("The user clicks on Practice Questions link")
	public void the_user_clicks_on_to_the_practice_questions_link() throws InterruptedException {
		base.getLogger().info("the_user_clicks_on_to_the_practice_questions_link");
		Actions action = new Actions(driver);
		action.moveToElement(base.getHpc().practicequestions).click().perform();
	}

	@Then("The user will be directed to practice questions of the Page {string}")
	public void the_user_will_be_directed_to_practice_questions_of_the_page(String string) throws IOException {
		base.getLogger().info("the_user_will_be_directed_to_practice_questions_of_page");
		String baseUrl = "https://dsportalapp.herokuapp.com/";
		String url = baseUrl.concat(string.toLowerCase() + "/" + "practice"); // Concatenate base URL with section and
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(url, act_url);
	}

	@And("The user clicks Try Here button on the page")
	public void the_user_clicks_try_here_button_on_the_page() throws InterruptedException {

		base.getLogger().info("the user clicks on the Try here button");
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(base.getHpc().tryherebtn));
		action.moveToElement(webElement).click().perform();

	}

	@When("^The user enters (.*) in tryEditor and user clicks Run button$")
	public void the_user_enters_println_in_try_editor_and_user_clicks_run_button(String string)
			throws InterruptedException {
		base.getHpc().enterText(string);
		base.getLogger().info("the user clicks on the run button");
		Actions action = new Actions(driver);
		action.moveToElement(base.getHpc().runBtn).click().perform();
	}

	@Given("The user is in {string} page")
	public void the_user_is_on_the_page(String string) throws IOException {

		base.getLogger().info("On the Start page");
		p = base.getProperties();
		base.InitializePageObject(driver, sce);
		String baseUrl = "https://dsportalapp.herokuapp.com/";
		String url = baseUrl.concat(string.toLowerCase() + "/"); // Concatenate base URL with section and slash
		driver.get(url);
	}

	@Given("The user is in TryEditor page")
	public void the_user_is_in_try_editor_page() throws IOException {
		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}

	@Then("^The user will be presented with the Run output (.*) (.*)$")
	public void the_user_will_be_presented_with_the_run_output(String text, String status)
			throws IOException, InterruptedException {
		base.getLogger().info("Python code is checked .....");
		verify = new verifyUtil(driver);
		try {
			boolean targetpage = verify.isRunEditorValid(text);

			if (status.equalsIgnoreCase("valid"))

			{
				if (targetpage == true) {

					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (status.equalsIgnoreCase("Invalid")) {
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

	@When("The user clicks Try Here button on the {string} page")
	public void the_user_clicks_try_here_button_on_the_page(String string) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(base.getHpc().tryherebtn).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(base.getHpc().tryherebtn));
		webElement.click();
		//action.moveToElement(webElement).click().perform();
		base.getLogger().info("****User click try here button*****");
	}

	@Then("Page URL should be {string}")
	public void page_url_should_be(String string) {

		Assert.assertEquals(driver.getCurrentUrl(), string);
		base.getLogger().info("****User verify URL*****");
	}

	@Then("User is redirected to {string}")
	public void user_is_redirected_to(String urlToRedirect) throws InterruptedException, IOException {
		base.InitializePageObject(driver, sce);
		driver.get(urlToRedirect);
		Assert.assertEquals(driver.getCurrentUrl(), urlToRedirect);
		base.getLogger().info("****User redirected to desire option*****");
	}

	@And("User see {string} options")
	public void user_see_options(String textToFind) throws InterruptedException {

		boolean isTextPresentInPageSource = driver.getPageSource().contains(textToFind);
		if (isTextPresentInPageSource == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
		//Thread.sleep(1000);
		base.getLogger().info("****User see Topic Covered option*****");
	}

//	@Given("User go on {string} link")
//	public void user_click_on_link(String linkText) throws IOException {
//		InitializePageObject(driver, sce);
//		base.getHpc().clickLink(linkText);
//		logger.info("****User can select respective options*****");
//	}

	@Then("User scroll down the page")
	public void user_scroll_down_the_page() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		base.getLogger().info("****User can scroll down the page*****");
	}

	@Then("the user navigates to the {string}")
	public void the_user_navigates_to_the(String string) throws IOException {

		p = base.getProperties();
		driver.get(p.getProperty("appurlHome"));
		driver.get(string);
		Assert.assertEquals(driver.getCurrentUrl(), string);
		base.getLogger().info("****User redirected to desire option*****");
		// driver.get("https://dsportalapp.herokuapp.com/home");
		base.getLogger().info("****User navigates to home page*****");
	}
}
