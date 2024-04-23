package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VerificationPage;
import utilities.DataReader;

public class PracticeQuestionSteps extends BasePage {

	Scenario sce;
	VerificationPage verify;
	Properties p;
	public BasePage base;
	public WebDriver driver;
	Logger logger = LogManager.getLogger();
	List<HashMap<String, String>> excelDataPythonCode;

	public PracticeQuestionSteps(BasePage base) {
		this.base = base;
		this.driver = Hooks.getDriver();
		excelDataPythonCode = DataReader.data(System.getProperty("user.dir") + "\\testData\\ExcelData.xlsx", "Pythoncode");
		logger.info("****User read data from excel*****");
	}
	


	@Given("The user is on the  {string} page")
	public void the_user_is_on_the_page(String string) throws IOException {
		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/" + string);
		logger.info("****User is on desired page*****");
	}

	
	@When("The user clicks on to the Practice Questions link")
	public void the_user_clicks_on_to_the_practice_questions_link() throws InterruptedException {
		Thread.sleep(1000);
		base.getHpc().Practicequestions();
		logger.info("****User clicks on practice question*****");
	}
	
	
	@Then("The user clear code text area")
	public void the_user_clear_code_text_area() throws IOException {
		base.InitializePageObject(driver, sce);
		base.getHpc().clearText();
		logger.info("****User can clear the code*****");
	}

	@Then("The user will be directed to practice questions of {string} Page")
	public void the_user_will_be_directed_to_practice_questions_of_page(String string) throws IOException {
		// make this common step which dynamically generates URL, can be used in all StepDefs.
		assertEquals("https://dsportalapp.herokuapp.com/" + string + "/practice", driver.getCurrentUrl(),
				"TEST PASS: EXPECTED PAGE OPEN");
		logger.info("****User verify the practice question page*****");
	}
	
	@Then("The user will be redirected to tryEditor page with a Run button to test")
	public void the_user_will_be_redirected_to_try_editor_page_with_a_run_button_to_test() throws InterruptedException {
		base.getLogger().info("check for tryeditor page....");
		String act_url = driver.getCurrentUrl();
		String exp_url = "https://dsportalapp.herokuapp.com/tryEditor";
		Assert.assertEquals(exp_url, act_url);
	}

	@And("The user enters {int} in tryEditor page and user clicks Run button")
	public void the_user_enters_in_try_editor_and_user_clicks_run_button(Integer index) throws InterruptedException, IOException {
		HashMap<String, String> rowData = excelDataPythonCode.get(index);
		// Read data from excel
		String formattedText = rowData.get("pCode");
		// To add and make sure backspace is properly getting set.
		formattedText = formattedText.replace("\\b", "\b");
		base.getHpc().enterText(formattedText);
		base.getHpc().ClickRun();
		logger.info("****User clicks run button*****");
	}

	@Then("^The user will be presented with the run output (.*) and status is (.*)$")
	public void the_user_will_be_presented_with_the_run_output(Integer index, String status) throws IOException {
		// Add code to verify the Run output

		HashMap<String, String> rowData = excelDataPythonCode.get(index);

		verify = new VerificationPage(driver);
		try {
			boolean targetpage = verify.isRunEditorValid(rowData.get("Result"));

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
		logger.info("****User can see expected result*****");
	}
	
}
