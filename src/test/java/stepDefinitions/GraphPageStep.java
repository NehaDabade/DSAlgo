package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GraphPageStep extends BasePage {
	private final BasePage base;
	Scenario sce;
	Properties p;

	public GraphPageStep(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
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
		base.getElements().clickOnElement(base.getGraphPageObj().graphLink, 0);

	}

	@When("the user clicks on graphRepresentation page")
	public void the_user_clicks_on_graph_representation_page() throws IOException, InterruptedException {
		System.out.println("GRAPH REPRESTATION 123");
		base.getLogger().info("On the GraphRepresentation page");
		base.getElements().clickOnElement(base.getGraphPageObj().graphRepLink, 0);
	}

}