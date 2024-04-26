package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class DataStructureIntro extends BasePage {
	
		public DataStructureIntro(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="/html/body/div[2]/div[1]/div/div/a")
		public WebElement dsiGetStared;
		
		@FindBy(linkText ="Time Complexity")
		public WebElement tcomp;

		
	
}