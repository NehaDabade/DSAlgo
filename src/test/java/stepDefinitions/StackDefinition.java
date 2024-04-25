package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import pageObjects.StackPage;

public class StackDefinition extends BasePage {
	private final BasePage base;
	Scenario sce;
	StackPage stackPage;
	Actions action;

	public StackDefinition(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		stackPage =base.getStackObj();
		action =base.getAction();
	}
	
	@When("the user clicks on Operation page")
	public void the_user_is_in_operation_page() throws IOException {
		base.getLogger().info("On the Operation page");
		base.InitializePageObject(driver, sce);
		//Actions action = new Actions(driver);
		action.moveToElement(stackPage.OperInStackLink).click().perform();
		//base.getElements().clickOnElement(base.getStackObj().OperInStackLink,0);
	}

	@When("the user clicks on Implementation page")
	public void the_user_is_in_implementation_page() throws IOException {
		base.getLogger().info("On the implementation page");
		action.moveToElement(stackPage.ImplementEle).click().perform();
		//base.getElements().clickOnElement(base.getStackObj().ImplementEle,0);
	}

	@When("the user clicks on Application page")
	public void the_user_is_Application_page() throws IOException {
		base.getLogger().info("On the Application page");
		action.moveToElement(stackPage.AppliElem).click().perform();
		//base.getElements().clickOnElement(base.getStackObj().AppliElem,0);
	}
	
	
	


}
