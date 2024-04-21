package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class Stack extends BasePage {

	public Stack(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private By ImplementEle = By.linkText("Implementation");
	private By AppliElem = By.linkText("Applications");
	private By OutputElem = By.id("output");

	@FindBy(xpath = "//a[normalize-space()='Practice Questions']")
	@CacheLookup

	WebElement practicequestions;

	@FindBy(xpath = "//a[normalize-space()='Operations in Stack']")
	WebElement OperInStackLink;

	@FindBy(linkText = "Try here>>>")
	WebElement tryherebtn;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement textArea;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement runBtn;

	@FindBy(linkText = "Sign out")
	WebElement lnkSignout;

	public void clickOperationsLink() {
		OperInStackLink.click();
	}

	public void clickApplicationsLink() {
		driver.findElement(AppliElem).click();
	}

	public void clickPracticeQuesLink() {
		practicequestions.click();
	}

}
