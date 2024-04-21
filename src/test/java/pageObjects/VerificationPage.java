package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class VerificationPage extends BasePage {

	public VerificationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@role='alert']")
	WebElement msgLogin;

	@FindBy(id = "id_username")
	@CacheLookup
	WebElement loginusername;

	@FindBy(id = "id_password")
	WebElement loginpwd;

	@FindBy(id = "output")
	WebElement runOutPut;
	
	String errormsgverify;
	String output;

	@FindBy(linkText = "Sign out")
	WebElement lnkSignout;

	String messageStr;

	public void popup() {
		WebElement activeElement = driver.switchTo().activeElement();
		messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	public boolean isLoginPageExists(String expMsg) {
		try {

			if (msgLogin.isDisplayed()) {
				errormsgverify = msgLogin.getText();
				if (errormsgverify.trim().equalsIgnoreCase(expMsg.trim())) {
					return (true);
				}

				return (false);
			}

		} catch (Exception e) {
			popup();
			if (messageStr.trim().equalsIgnoreCase("Please fill out this field.")) {
				System.out.println("Please fill out field");
				return (true);
			}
		}
		return false;

	}

	public boolean isRunEditorValid(String expMsg) throws InterruptedException {
		try {
			boolean alertMsg = isAlertPresent();
			if (alertMsg) {
				System.out.println(alertMsg
						+ "INSIDE ALERTTTTTTTTTTTTTTTTTTTTTTTTTTTTT*****************************############################");
				return alertMsg;
			} else {
				output = runOutPut.getText();
				if (null != output && !output.equalsIgnoreCase("") && expMsg.contains(output.trim()))
					return (true);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean isAlertPresent() {

		boolean presentFlag = false;

		try {

			System.out.println(driver.switchTo().alert().getText());
			// Check the presence of alert
			driver.switchTo().alert().accept();
			// Alert present; set the flag
			presentFlag = true;
			// if present consume the alert

		} catch (NoAlertPresentException ex) {
			// Alert not present
			presentFlag = false;

		}

		return presentFlag;

	}

	public void clickLogout() {
		lnkSignout.click();
	}

}
