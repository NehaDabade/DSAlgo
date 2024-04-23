package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class GraphPage extends BasePage {
	@FindBy(xpath = "//a[@href='graph']")
	public WebElement graph;
	
	@FindBy(xpath = "//a[@href='graph-representations']")
	public WebElement graphrepresentation;
	
	public GraphPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}