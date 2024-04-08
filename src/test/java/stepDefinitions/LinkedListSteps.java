package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjects.LinkedListPage;

public class LinkedListSteps extends BasePage {

	//private final BasePage base;
	Scenario sce;

	public LinkedListPage linklist;
	Logger logger = LogManager.getLogger();

	public LinkedListSteps(BasePage base) {
		this.driver = Hooks.getDriver();
		linklist = base.getLinkedListPage();
		//this.base = base;
		
	}
	
	@Then("Page URL should be {string}")
	public void page_url_should_be(String string) {

		Assert.assertEquals(driver.getCurrentUrl(), string);
		logger.info("****User entred URL*****");
	}

//	@When("User clicks on Get Started under LinkedList menu")
//	public void user_clicks_on_get_started_under_linked_list_menu() {
//
//		linklist.clickongetstarted();
//		
//		logger.info("****User entred Link List get started button*****");
//	}

	@Then("User is redirected to {string}")
	public void user_is_redirected_to(String urlToRedirect) throws InterruptedException {

		//driver.get(urlToRedirect);
		Assert.assertEquals(driver.getCurrentUrl(), urlToRedirect);
		Thread.sleep(2000);
		logger.info("****User redirected to https://dsportalapp.herokuapp.com/linked-list/*****");
	}

	@And("User see {string} options")
	public void user_see_options(String textToFind) throws InterruptedException {

		boolean isTextPresentInPageSource = driver.getPageSource().contains(textToFind);
		if (isTextPresentInPageSource == true) {
			Assert.assertTrue(true);
		} else 
		{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		logger.info("****User see Topic Covered option*****");
	}

	@Given("User go on {string} link")
	public void user_click_on_link(String linkText) {
	   
		linklist.clickLink(linkText);
		
//		switch(linkText)
//	   {
//		   case "Introduction":
//			   linklist.clickintrolink();
//			   break;
//		   case "Creating Linked List":
//			   linklist.clicklinklistlink();
//			   break;
//		   case "Types of Linked List":
//			   linklist.clicktypesoflinkedlist();
//			  break;
//		   case "Implementation of linked list in python":
//			   linklist.clickimplementlinklist();
//			   break;
//		   case "Traversal":
//			   linklist.clicktraversal();
//			   break;
//		   case "Insertion":
//			   linklist.clickinsertion();
//			   break;
//		   case "Deletion":
//			   linklist.clickdeletion();
//			   break;
//	   }
	   logger.info("****User can select respective options*****");
	}
	
	@Then("User scroll down the page")
	public void user_scroll_down_the_page() throws InterruptedException {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	   Thread.sleep(2000);
	   logger.info("****User can scroll down the page*****");
	}

	@Given("User click on {string} button")
	public void user_click_on_button(String tryherebtn) {
		//if (tryherebtn == "Try here") 
		{
			linklist.clicktryherebtn();
		}
		logger.info("****User can click try here button*****");
	}

//	@When("User type python code {string}")
//	public void user_type_python_code(String string) throws InterruptedException {
//		System.out.println(this.driver.getCurrentUrl());
//		
//		ep = new EditorPage(this.driver);
//		
//		ep.codetextbox();
//	   Thread.sleep(2000);
//	   logger.info("****User write Python code*****");
//	}
//
//	@When("click on {string} button")
//	public void click_on_button(String string) {
//	  
//		ep.clickrun();
//		logger.info("****User click on Run button*****");
//	}
//
//	@When("validate code is working as per expected {string}")
//	public void validate_code_is_working_as_per_expected(String string) {
//	 
//		ep.validatetext();
//		logger.info("****User can see code is working*****");
//	}
	
//	@Then("User press back button")
//	public void user_press_back_button() throws InterruptedException {
//		driver.navigate().back();
//		Thread.sleep(2000);
//		logger.info("****User click on back button*****");
//	}
//
//	@Then("goto Practice Question")
//	public void goto_practice_question() throws InterruptedException {
//	   linklist.clickpracticeq();
//	   Thread.sleep(2000);
//	   logger.info("****User select practice question link*****");
//	}
	
}
	
	

