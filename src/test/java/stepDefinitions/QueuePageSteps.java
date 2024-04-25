package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;

public class QueuePageSteps extends BasePage {

	private final BasePage base;
	Scenario sce;
	QueuePage queuePage;
	Actions action;

	public QueuePageSteps(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		queuePage =base.getQueuePage();
		action = base.getAction();
	}
	@When("The user clicks on Implementation of Queue in Python page")
	public void the_user_clicks_on_implementation_of_queue_in_python_page() throws IOException {
		base.getLogger().info("On the implementation page");
		
		action.moveToElement(queuePage.implementationofqinpython).click().perform();
	}
	
	@When("The user clicks on Implementation using collections.deque page")
	public void the_user_clicks_on_implementation_using_collections_page() throws IOException {
		base.getLogger().info("The user clicks on Implementation using collections.deque page");
		action.moveToElement(queuePage.implementationusingcollectionsdq).click().perform();
	}
	
	@When("The user clicks on Implementation using array page")
	public void the_user_clicks_on_implementation_using_array_page() throws IOException {
		base.getLogger().info("The user clicks on Implementation using array page");
		action.moveToElement(queuePage.implementationusingarray).click().perform();
	}
	@When("The user clicks on Queue Operations page")
	public void the_user_clicks_on_queue_operations_page() throws IOException {
		base.getLogger().info("The user clicks on Queue Operations page");
		action.moveToElement(queuePage.queueoperations).click().perform();
	}
}


