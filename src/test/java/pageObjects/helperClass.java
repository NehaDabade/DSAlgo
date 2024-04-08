package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class helperClass extends BasePage {

	public helperClass(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Practice Questions']")
	@CacheLookup
	WebElement practicequestions;
	
	@FindBy(linkText = "Try here>>>")
	WebElement tryherebtn;
	
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement textArea;
	
	
	@FindBy(xpath="//button[normalize-space()='Run']")
	WebElement runBtn;
	
	@FindBy(linkText = "Sign out") 
	WebElement lnkSignout;
	

	
	 public void ClickTryHere() {
		 tryherebtn.click();
	    }
	 
	 public void ClickRun() {
		 runBtn.click();
	    }
	 
	 public void Practicequestions() {
		 practicequestions.click();
	    }
	 
	 public void enterText(String text) {
		 textArea.sendKeys(text);
		}
	 
	 public void clickLogout() 
	  { lnkSignout.click(); 
	  }

	 
			
	}
	
