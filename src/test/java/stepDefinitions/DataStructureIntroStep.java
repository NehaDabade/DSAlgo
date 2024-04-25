package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructureIntro;

public class DataStructureIntroStep extends BasePage {
	private final BasePage base;
	//private final WebDriver base;
	Scenario sce;
	Properties p;
	DataStructureIntro dataStructureIntro;
	Actions action;
	

	public DataStructureIntroStep(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		dataStructureIntro=base.getDsiPageObj();
		action =base.getAction();
	}
	@Given("The user is in data-structures-introduction {string} page")
	public void The_user_is_in_data_structures_introduction_page(String string) throws IOException, InterruptedException {
		base.getLogger().info("On the Data Structures IntroUrl page");
		base.InitializePageObject(driver, sce);
		p = base.getProperties();
		driver.get(p.getProperty("dataStructureURL"));

	}
	
	@When("the user clicks on data-structures-introduction page")
	public void the_user_clicks_on_data_structures_introduction_page() throws IOException {
		base.getLogger().info("On the data-structures-introduction  page");
		action.moveToElement(dataStructureIntro.dsiGetStared).click().perform();

	}
	
	@When("the user clicks on Time Complexity page")
	public void the_user_clicks_on_time_complexity_page() throws IOException, InterruptedException {
		base.getLogger().info("On the time complexity page");
		action.moveToElement(dataStructureIntro.tcomp).click().perform();
		
	}

	@Then("The user will be directed to practice questions of the Page {string}")
	public void the_user_will_be_directed_to_practice_questions_of_the_page(String string) {
		base.getLogger().info("the_user_will_be_directed_to_practice_questions_of_page");
		String baseUrl = "https://dsportalapp.herokuapp.com/";
		String url = baseUrl.concat(string.toLowerCase() + "/" + "practice"); // Concatenate base URL with section and
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(url, act_url);
	}

	
}