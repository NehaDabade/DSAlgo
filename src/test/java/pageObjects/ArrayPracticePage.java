package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class ArrayPracticePage  extends BasePage {

	@FindBy(xpath = "//a[normalize-space()='Search the array']")
	public WebElement searchTheArray;
	@FindBy(xpath = "//a[normalize-space()='Max Consecutive Ones']")
	public WebElement maxConsecutiveOnes;
	@FindBy(xpath = "//a[normalize-space()='Find Numbers with Even Number of Digits']")
	public WebElement findNumbersWithEvenNumberOfDigits;
	@FindBy(xpath = "//a[normalize-space()='Squares of a Sorted Array']")
	public WebElement squaresOfASortedArray;

	public ArrayPracticePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
