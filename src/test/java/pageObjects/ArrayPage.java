package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class ArrayPage extends BasePage {
	
	@FindBy(xpath = "//a[normalize-space()='Arrays in Python']")
	public WebElement arraysInPython;
	@FindBy(xpath = "//a[normalize-space()='Arrays Using List']")
	public WebElement arraysUsingList;
	@FindBy(xpath = "//a[normalize-space()='Basic Operations in Lists']")
	public WebElement basicOperationsInLists;
	@FindBy(xpath = "//a[normalize-space()='Applications of Array']")
	public WebElement applicationsOfArray;

	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
