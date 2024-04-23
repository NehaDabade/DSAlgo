package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class LinkedListPage extends BasePage{
	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Introduction']")
	public WebElement introduction;
	
	@FindBy(xpath = "//a[@href='creating-linked-list']")
	public WebElement creatingLinkedList;
	
	@FindBy(xpath = "//a[normalize-space()='Types of Linked List']")
	public WebElement typesofLinkedList;
	
	@FindBy(xpath = "//a[normalize-space()='Implement Linked List in Python']")
	public WebElement implementLinkedListinPython;
	
	@FindBy(xpath = "//a[normalize-space()='Traversal']")
	public WebElement traversal;
	
	@FindBy(xpath = "//a[normalize-space()='Insertion']")
	public WebElement insertion;
	
	@FindBy(xpath = "//a[normalize-space()='Deletion']")
	public WebElement deletion;
	
	
}
