package stepDefinitions;

import java.io.IOException;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class ArrayPracticePageSteps  extends BasePage {

	private final BasePage base;
	Scenario sce;

	public ArrayPracticePageSteps(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
	}

	@When("User go on Search the array link")
	public void the_user_clicks_on_search_the_array_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getArrayPracticePageObject().searchTheArray, 5);
	}
	
	@When("User go on Max Consecutive Ones link")
	public void the_user_clicks_on_max_consecutive_ones_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getArrayPracticePageObject().maxConsecutiveOnes, 5);
	}
	
	@When("User go on Find Numbers with Even Number of Digits link")
	public void the_user_clicks_on_find_numbers_with_even_number_of_digits_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getArrayPracticePageObject().findNumbersWithEvenNumberOfDigits, 5);
	}
	
	@When("User go on Squares of a Sorted Array link")
	public void the_user_clicks_on_squares_of_a_sorted_array_page() throws IOException {
		// base.getLogger().info("On the implementation page");
		base.InitializePageObject(driver, sce);
		base.getElements().clickOnElement(base.getArrayPracticePageObject().squaresOfASortedArray, 5);
	}
}
