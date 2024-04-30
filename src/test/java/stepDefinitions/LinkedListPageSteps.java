package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class LinkedListPageSteps extends BasePage {

	private final BasePage base;
	Scenario sce;

	public LinkedListPageSteps(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
	}

	@When("The user clicks on Introduction page")
	public void the_user_clicks_on_introduction_page() throws IOException {
		base.getLogger().info("The user clicks on Introduction page");
		Actions action = new Actions(driver);
		action.moveToElement(base.getLinkedListPage().introduction).click().perform();
	}

	@When("The user clicks on Creating Linked List page")
	public void the_user_clicks_on_creating_linked_list_page() throws IOException {
		base.getLogger().info("The user clicks on Creating Linked List page");
		Actions action = new Actions(driver);
		action.moveToElement(base.getLinkedListPage().creatingLinkedList).click().perform();
	}

	@When("The user clicks on Types of Linked List page")
	public void the_user_clicks_on_types_of_linked_list_page() throws IOException {
		base.getLogger().info("The user clicks on Types of Linked List page");
		Actions action = new Actions(driver);
		action.moveToElement(base.getLinkedListPage().typesofLinkedList).click().perform();
	}

	@When("The user clicks on Implement Linked List in Python page")
	public void the_user_clicks_on_implement_linked_list_in_python_page() throws IOException {
		base.getLogger().info("The user clicks on Implement Linked List in Python page");
		Actions action = new Actions(driver);
		action.moveToElement(base.getLinkedListPage().implementLinkedListinPython).click().perform();
	}

	@When("The user clicks on Traversal page")
	public void the_user_clicks_on_traversal_page() throws IOException, InterruptedException {
		base.getLogger().info("The user clicks on Traversal page");
		Actions action = new Actions(driver);
		action.moveToElement(base.getLinkedListPage().traversal).click().perform();
		//Thread.sleep(2000);
	}

	@When("The user clicks on Insertion page")
	public void the_user_clicks_on_insertion_page() throws IOException, InterruptedException {
		base.getLogger().info("The user clicks on Insertion page");
		Actions action = new Actions(driver);
		action.moveToElement(base.getLinkedListPage().insertion).click().perform();
		//Thread.sleep(2000);
	}

	@When("The user clicks on Deletion page")
	public void the_user_clicks_on_deletion_page() throws IOException {
		base.getLogger().info("The user clicks on Deletion page");
		Actions action = new Actions(driver);
		action.moveToElement(base.getLinkedListPage().deletion).click().perform();
	}
}
