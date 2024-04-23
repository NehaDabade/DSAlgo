package stepDefinitions;

import java.io.IOException;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class ArrayPageSteps extends BasePage {

	private final BasePage base;
	Scenario sce;

	public ArrayPageSteps(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
	}

	@When("The user clicks on Arrays in Python page")
	public void the_user_clicks_on_arrays_in_python_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getArrayPageObject().arraysInPython, 5);
	}
	
	@When("The user clicks on Arrays using list page")
	public void the_user_clicks_on_arrays_using_list_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getArrayPageObject().arraysUsingList, 5);
	}
	
	@When("The user clicks on Basic Operations In Lists page")
	public void the_user_clicks_on_basic_operations_in_lists_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getArrayPageObject().basicOperationsInLists, 5);
	}
	
	@When("The user clicks on Applications of Arrays page")
	public void the_user_clicks_on_applications_of_arrays_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getArrayPageObject().applicationsOfArray, 5);
	}
}
