package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "id_username")
	@CacheLookup
	WebElement loginusername;
	
	@FindBy(id = "id_password")
	WebElement loginpwd;
	
	@FindBy(linkText = "Sign out") 
	WebElement lnkSignout;
	
	
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public void sendUserName(String uname) {
		loginusername.sendKeys(uname);
	}
	public void sendPwdName(String password) {
		loginpwd.sendKeys(password);
	}
	
	//Clicking Logging Button
	public void clickLogin() {
		btnLogin.click();
		
	}
	  public void clickLogout() 
	  { lnkSignout.click(); 
	  }
	

}

