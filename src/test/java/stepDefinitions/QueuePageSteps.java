package stepDefinitions;

import java.io.IOException;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class QueuePageSteps extends BasePage {

	private final BasePage base;
	Scenario sce;

	public QueuePageSteps(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
	}
	@When("The user clicks on Implementation of Queue in Python page")
	public void the_user_clicks_on_implementation_of_queue_in_python_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getQueuePage().implementationofqinpython, 5);
	}
	
	@When("The user clicks on Implementation using collections.deque page")
	public void the_user_clicks_on_implementation_using_collections_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getQueuePage().implementationusingcollectionsdq, 5);
	}
	
	@When("The user clicks on Implementation using array page")
	public void the_user_clicks_on_implementation_using_array_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getQueuePage().implementationusingarray, 5);
	}
	@When("The user clicks on Queue Operations page")
	public void the_user_clicks_on_queue_operations_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getQueuePage().queueoperations, 5);
	}
}


