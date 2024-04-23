package stepDefinitions;

import java.io.IOException;

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
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getLinkedListPage().introduction, 2);
	}
	@When("The user clicks on Creating Linked List page")
	public void the_user_clicks_on_creating_linked_list_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getLinkedListPage().creatingLinkedList, 5);
	}
	@When("The user clicks on Types of Linked List page")
	public void the_user_clicks_on_types_of_linked_list_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getLinkedListPage().typesofLinkedList, 5);
	}
	@When("The user clicks on Implement Linked List in Python page")
	public void the_user_clicks_on_implement_linked_list_in_python_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getLinkedListPage().implementLinkedListinPython, 5);
	}
	@When("The user clicks on Traversal page")
	public void the_user_clicks_on_traversal_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getLinkedListPage().traversal, 5);
	}
	@When("The user clicks on Insertion page")
	public void the_user_clicks_on_insertion_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getLinkedListPage().insertion, 5);
	}
	@When("The user clicks on Deletion page")
	public void the_user_clicks_on_deletion_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getLinkedListPage().deletion, 5);
	}
}
