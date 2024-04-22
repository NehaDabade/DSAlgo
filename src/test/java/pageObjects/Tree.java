package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class Tree extends BasePage{
	public Tree(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(linkText="Overview of Trees")
	public WebElement overviewTree;

	@FindBy(linkText="Terminologies")
	public WebElement terminologies;

	@FindBy(linkText="Types of Trees")
	public WebElement typesTrees;

	@FindBy(linkText="Tree Traversals")
	public WebElement Traversals;
	
	
	
	
	
	@FindBy(linkText="Traversals-Illustration")
	public WebElement traversalIllustration;
	
	@FindBy(linkText="Binary Trees")
	public WebElement Binarytree;
	
	/*
	 * @FindBy(linkText="Tree Traversals") public WebElement Traversals;
	 */

	
}