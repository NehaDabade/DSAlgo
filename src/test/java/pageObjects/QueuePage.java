package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class QueuePage extends BasePage{
	public QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Implementation of Queue in Python']")
	public WebElement implementationofqinpython;
	
	@FindBy(xpath = "//a[normalize-space()='Implementation using collections.deque']")
	public WebElement implementationusingcollectionsdq;
	
	@FindBy(xpath = "//a[normalize-space()='Implementation using array']")
	public WebElement implementationusingarray;
	
	@FindBy(xpath = "//a[normalize-space()='Queue Operations']")
	public WebElement queueoperations;
}
