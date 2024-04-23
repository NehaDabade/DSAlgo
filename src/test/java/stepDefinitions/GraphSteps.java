package stepDefinitions;

import java.io.IOException;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class GraphSteps extends BasePage {

	private final BasePage base;
	Scenario sce;

	public GraphSteps(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
	} 
	
	@When("The user clicks on Graph page")
	public void the_user_clicks_on_graph_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getGraphPageObj().graph, 5);
	}
	
	@When("The user clicks on Graph Representation page")
	public void the_user_clicks_on_graph_representation_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getGraphPageObj().graphrepresentation, 5);
	}

}
