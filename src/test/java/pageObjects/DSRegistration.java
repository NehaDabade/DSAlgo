package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class DSRegistration extends BasePage {
WebDriver driver;

	
	public DSRegistration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	  @FindBy(id = "id_username")
	  public static WebElement username;
	 
	
	@FindBy(id = "id_password1")
	public static WebElement pwd;
	
	@FindBy(id = "id_password2")
	public static WebElement confpwd;
	
	@FindBy(xpath="//input[@value = 'Register']")
	public static WebElement btnRegister;
	
	@FindBy(linkText ="Register")
	public static WebElement lnkRegister;
	
	 public void clickRegistrationLink() {
		 lnkRegister.click();
		}
	
}
