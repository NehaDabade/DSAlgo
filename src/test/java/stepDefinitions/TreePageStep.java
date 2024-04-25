package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import DriverFactory.BasePage;
import applicationHook.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Tree;

public class TreePageStep extends BasePage {
	private final BasePage base;
	Scenario sce;
	Actions action;
	Tree treePage;
	
	public TreePageStep(BasePage base) {
		this.driver = Hooks.getDriver();
		this.base = base;
		treePage =base.getTreePageObj();
		action =base.getAction();
		
	}
	
	@When("the user clicks on overview-of-trees link")
	public void the_user_clicks_on_overview_of_trees_link() throws IOException {
		base.getLogger().info("On the implementation page");
		action.moveToElement(treePage.overviewTree).click().perform();

	}

	@When("the user clicks on terminologies link")
	public void the_user_clicks_on_terminologies_link() throws IOException {
		base.getLogger().info("On the implementation page");
		action.moveToElement(treePage.terminologies).click().perform();
		
	}
	
	@When("the user clicks on types-of-trees link")
	public void the_user_clicks_on_types_of_trees_link() throws IOException, InterruptedException {
		base.getLogger().info("On the types-of-trees page");
		action.moveToElement(treePage.typesTrees).click().perform();
	    
	}
	
	@When("the user clicks on Tree Traversals link")
	public void the_user_clicks_on_tree_traversals_link() throws IOException, InterruptedException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.Traversals).click().perform();
		
	}


	@When("the user clicks on traversals-illustration link")
	public void the_user_clicks_on_traversals_illustration_link() throws IOException, InterruptedException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.traversalIllustration).click().perform();
	   
	}

	
	@When("the user clicks on binary-trees link")
	public void the_user_clicks_on_binary_trees_link() throws IOException, InterruptedException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.Binarytree).click().perform();
	   
	}
	@When("the user clicks on types-of-binary-trees link")
	public void the_user_clicks_on_types_of_binary_trees_link() throws IOException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.typesOfBinaryLink).click().perform();
	}
	
	@When("the user clicks on implementation-in-python link")
	public void the_user_clicks_on_implementation_in_python_link() throws IOException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.implementationInPythonLink).click().perform();
		
	}

	@When("the user clicks on binary-tree-traversals link")
	public void the_user_clicks_on_binary_tree_traversals_link() throws IOException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.binaryTreeTraversalsLink).click().perform();
	}

	@When("the user clicks on implementation-of-binary-trees link")
	public void the_user_clicks_on_implementation_of_binary_trees_link() throws IOException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.implementationOfBinaryLink).click().perform();
	}
	
	@When("the user clicks on applications-of-binary-trees link")
	public void the_user_clicks_on_applications_of_binary_trees_link() throws IOException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.applicationsLink).click().perform();
	}

	
	@When("the user clicks on Binary Search Trees link")
	public void the_user_clicks_on_Binary_Search_Trees_trees_link() throws IOException {
		base.getLogger().info("On the Traversals page");
		action.moveToElement(treePage.binarySearchLink).click().perform();
		
	}
	
	  @When("the user clicks on implementation-of-bst link") 
	  public void the_user_clicks_on_implementation_of_bst_link() throws IOException {
	  base.getLogger().info("On the Traversals page");
	  action.moveToElement(treePage.implementationOfBstLink).click().perform();
	  
	  }
	  
	  @Then("The user will be directed to practice questions of the Page {string}")
	  public void the_user_will_be_directed_to_practice_questions_of_the_page(String string) {
		  base.getLogger().info("the_user_will_be_directed_to_practice_questions_of_page");
			String baseUrl = "https://dsportalapp.herokuapp.com/";
			String url = baseUrl.concat(string.toLowerCase() + "/" + "practice"); // Concatenate base URL with section and
																					// slash
			String act_url = driver.getCurrentUrl();
			Assert.assertEquals(url, act_url);
			
	  }
	  

}