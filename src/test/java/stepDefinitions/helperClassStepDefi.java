package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	private final BasePage base;
	private final WebDriver driver;

	// helperClass hp = new helperClass(driver);
	public helperClassStepDefi(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		// PageFactory.initElements(base.getDriver(),this);

	}

	// Main page background code

	@Given("the user is on the dsportalapp main page")
	public void the_user_is_on_the_dsportalapp_main_page() throws IOException {

		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@When("the user clicks on the Get Started button")
	public void the_user_clicks_on_the_get_started_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Get Started']")).click();
		;
	}

	@Then("the user navigates to the dsportalapp home page")
	public void the_user_navigates_to_the_dsportalapp_home_page() {

		String act_title = driver.getTitle();
		String exp_title = "NumpyNinja";

		if (act_title.equals(exp_title)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}

	}

	@Given("The user navigates to login page")
	public void the_user_navigates_to_login_page() throws IOException {
		// base.initilizeBrowser();
		// driver=base.getDriver();

		// base.InitializePageObject(driver, sce);
		// ND: To make sure user gets directed to Login Page.
		driver.get(base.getProperties().getProperty("appURLlogin"));
	}

	@When("the user gives username and password")
	public void the_user_gives_username_and_password() throws IOException {

		base.getLogger().info("Entering email and password.. ");

		p = base.getProperties();
		base.getLoginObj().sendUserName(p.getProperty("username").trim());

		base.getLoginObj().sendPwdName(p.getProperty("password").trim());

	}

	@Then("The user logsin")
	public void the_user_logsin() {
		base.getLogger().info("Entering email and password.. ");
		base.getLoginObj().clickLogin();

	}

	@Given("User is on {string} page")
	public void user_is_on_page(String string) throws IOException {
		base.InitializePageObject(driver, sce);

	}

	@When("The user clicks on {string} get started button")
	public void the_user_clicks_on_get_started_button(String string) throws InterruptedException {
		System.out.println(string + "CHECK POINT1");
		String locatorString = "(//a[@href='" + string + "'])[1]";
		Thread.sleep(3000);
		driver.findElement(By.xpath(locatorString)).click();
		// base.getLoginObj().clickLogout();
		System.out.println(string);

	}

	@Then("The user will be directed to {string} Page")
	public void the_user_will_be_directed_to_page(String string) {
		// ND: Changed to make this common step which dynamically generates URL, can be used in all StepDefs.
		//driver.get("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
		driver.get("https://dsportalapp.herokuapp.com/" + string );
	}

	@When("The user clicks on to the Practice Questions link")
	public void the_user_clicks_on_to_the_practice_questions_link() throws InterruptedException {
		Thread.sleep(3000);
		// base.hpc.clickLogout();
		base.getHpc().Practicequestions();

	}

	@Then("The user will be directed to practice questions of {string} Page")
	public void the_user_will_be_directed_to_practice_questions_of_page(String string) throws IOException {
		// ND: Changed to make this common step which dynamically generates URL, can be used in all StepDefs.
		assertEquals("https://dsportalapp.herokuapp.com/" + string + "/practice", driver.getCurrentUrl(),
				"TEST PASS: EXPECTED PAGE OPEN");
	}

	/*
	 * @Given("The user is in {string} page")
	 * 
	 * public void the_user_is_in_page(String string) throws IOException {
	 * driver.get("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
	 * base.InitializePageObject(driver, sce);
	 * 
	 * 
	 * }
	 */

	@When("The user clicks Try Here button on the {string} page")
	public void the_user_clicks_try_here_button_on_the_page(String string) throws InterruptedException {
		base.getHpc().ClickTryHere();
		Thread.sleep(1000);
	}

	@And("The user will be redirected to tryEditor page with a Run button to test")
	public void the_user_will_be_redirected_to_try_editor_page_with_a_run_button_to_test() throws InterruptedException {
		assertEquals("https://dsportalapp.herokuapp.com/tryEditor", driver.getCurrentUrl(),
				"TEST PASS: EXPECTED PAGE OPEN");
		Thread.sleep(1000);
	}

//	  @Given("^the user is directed to \"([^\"]*)\" page$") 
//	  public void the_user_is_directed_to_page(String page) throws IOException {
//	 // driver.get("https://dsportalapp.herokuapp.com/tryEditor");
//	 base.InitializePageObject(driver, sce);
//	  
//	  
//	  }

	@And("^The user enters (.*) in tryEditor and user clicks Run button$")
	public void the_user_enters_in_try_editor_and_user_clicks_run_button(String text) throws InterruptedException {
		base.getHpc().enterText(text.trim());
		base.getHpc().ClickRun();
//		Alert alert = driver.switchTo().alert();
//		String popupmsg = alert.getText();
//		System.out.println(popupmsg);
//		alert.accept();
//		Thread.sleep(1000);
	}

	@Then("^The user will be presented with the Run output (.*) (.*)$")
	public void the_user_will_be_presented_with_the_run_output(String text, String status) throws IOException {
		// base.getHpc().enterText(text.trim());
		// Add code to verify the Run output

		verify = new VerificationPage(driver);
		try {
			boolean targetpage = verify.isRunEditorValid(text);
			if (status.equalsIgnoreCase("valid")) {
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

					
					public void invalidruneditor() {
						
						
					}
}
