
package stepDefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import DriverFactory.BasePage;
import applicationHook.Hooks;

import java.io.IOException;

public class StackStepDef extends BasePage {
	private final BasePage base;
	Scenario sce;

	public StackStepDef(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
	}

	@Given("The user is in {string} page")
	public void the_user_is_on_the_page(String string) throws IOException {
		driver.get("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
		base.InitializePageObject(driver, sce);

	}

	@Given("The user is in implementation {string} page")
	public void the_user_is_in_implementation_page(String string) throws IOException {
		driver.get("https://dsportalapp.herokuapp.com/stack/implementation/");
		base.InitializePageObject(driver, sce);

	}

	@Given("The user is in Application {string} page")
	public void the_user_is_Application_page(String string) throws IOException {
		driver.get("https://dsportalapp.herokuapp.com/stack/stack-applications/");
		base.InitializePageObject(driver, sce);

	}

	@Given("The user is on the {string} page")
	public void the_user_is_in_the_page(String string) throws IOException {
		driver.get("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
		base.InitializePageObject(driver, sce);

	}

}
