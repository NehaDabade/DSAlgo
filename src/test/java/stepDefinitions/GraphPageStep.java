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
import pageObjects.GraphPage;
import pageObjects.StackPage;

public class GraphPageStep extends BasePage {
	private final BasePage base;
	Scenario sce;
	Properties p;
	GraphPage graphPage;
	Actions action;

	public GraphPageStep(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		graphPage =base.getGraphPageObj();
		action =base.getAction();
	}

	@Given("The user is in graph {string} page")
	public void The_user_is_in_graph_page(String string) throws IOException, InterruptedException {
		base.getLogger().info("On the graphUrl page");
		p = base.getProperties();
		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/graph/");
	}

	@When("the user clicks on graph page")
	public void the_user_is_in_graph_page() throws IOException {
		base.getLogger().info("On the graph page");
		action.moveToElement(graphPage.graphLink).click().perform();
	}

	@When("the user clicks on graphRepresentation page")
	public void the_user_clicks_on_graph_representation_page() throws IOException, InterruptedException {
		System.out.println("GRAPH REPRESTATION 123");
		base.getLogger().info("On the GraphRepresentation page");
		action.moveToElement(graphPage.graphRepLink).click().perform();
	}
	
	
	
	
	// Logout
	
	@Given("The user is on  practice questions of the Page")
	public void the_user_is_on_practice_questions_of_the_page() throws IOException {
		base.InitializePageObject(driver, sce);
		driver.get("https://dsportalapp.herokuapp.com/graph/practice");
	}

	@When("the user clicks signout")
	public void the_user_clicks_signout() {
		base.getLogger().info("click logout ");
		Actions action = new Actions(driver);
		
		//graphPage =base.getGraphPageObj();
		//GraphPage graphPage = new GraphPage(driver);
		action.moveToElement(base.getGraphPageObj().signOutlink).click().perform();
	}

	@Then("The user will be on home page")
	public void the_user_will_be_on_home_page() throws IOException {
		base.getLogger().info("Check Registration URL ....");
		p=base.getProperties();
		boolean urlcheck = base.hpc.urlVerify(p.getProperty("appurlHome"));
		try {

			if (urlcheck == true) {
				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);
			}
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
	}



}