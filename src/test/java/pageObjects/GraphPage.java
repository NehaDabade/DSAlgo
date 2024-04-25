package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class GraphPage extends BasePage {
	
		public GraphPage(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver,this);
			
		}
		
		@FindBy(xpath="//h5[contains(text(),'Graph')]/..//a")
		public WebElement graphGetStared;
		
		@FindBy(linkText ="Graph Representations")
		public WebElement graphRepLink;
		
		@FindBy(linkText="Graph")
		public WebElement graphLink;
		
		@FindBy(linkText="Sign out")
		public WebElement signOutlink;
		

}