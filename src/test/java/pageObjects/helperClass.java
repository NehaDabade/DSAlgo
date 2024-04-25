package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class helperClass extends BasePage {

	public helperClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='Practice Questions']")
	public WebElement practicequestions;

	@FindBy(linkText = "Try here>>>")
	public WebElement tryherebtn;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	public WebElement textArea;

	@FindBy(xpath = "//button[normalize-space()='Run']")
	public WebElement runBtn;

	@FindBy(linkText = "Sign out")
	public WebElement lnkSignout;

	public void ClickTryHere() {
		tryherebtn.click();
	}

	public void ClickRun() {
		runBtn.click();
	}

	public void Practicequestions() {
		practicequestions.click();
	}

	public void enterText(String text) throws InterruptedException {

		textArea.sendKeys(text);
	}

	public void clickLogout() {
		lnkSignout.click();
	}

	public boolean urlVerify(String string) {
		try {
			String exp_url = string;
			String curUrl = driver.getCurrentUrl();
			if (curUrl.equalsIgnoreCase(exp_url)) {
				return (true);
			}
			return (false);
		} catch (Exception e) {
			return (false);
		}

	}

	public void clearText() {
		// Need to clear text which is already present in the textArea.
		TextIndentation(driver, 1, 45, true);
	}

	public static void TextIndentation(WebDriver driver, int row, int space, boolean flag) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.END).perform();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				if (i == 1 && flag)
					action.sendKeys(Keys.BACK_SPACE).perform();
				else
					action.sendKeys(Keys.DELETE).perform();
			}
		}
	}

}
