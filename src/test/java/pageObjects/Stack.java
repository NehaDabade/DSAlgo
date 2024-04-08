package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;


public class Stack extends BasePage {

   // private WebDriver driver;
    
	public Stack(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}


    //By locators : Object Repository

   // private By Stackele = By.xpath("(//a[@href='stack'])[1]");
   // private By OperInStackLink = By.xpath("//a[normalize-space()='Operations in Stack']");
    private By ImplementEle = By.linkText("Implementation");
    private By AppliElem = By.linkText("Applications");
   // private By PracQuesEle = By.linkText("Practice Questions");
  //  private By tryherebtn = By.linkText("Try here>>>");
   // private By textboxelem = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
   // private By RunBtn = By.xpath("//button[text()='Run']");
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
	
	
	@FindBy(xpath="//button[text()='Run']")
	WebElement runBtn;
	
	@FindBy(linkText = "Sign out") 
	WebElement lnkSignout;
	
	
    //private By codeMirror = By.xpath("//form[@id='answer_form']/div/div/div/textarea");

    //Constructor of the page class

      //  Page Actions


		/*
		 * public void selectStack() { driver.findElement(Stackele).click(); }
		 */

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

