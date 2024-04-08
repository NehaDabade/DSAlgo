package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class GraphPage extends BasePage {
	public GraphPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "/html/body/div[2]/div[7]/div/div/a")
	WebElement getstarted;
	
	@FindBy (xpath = "/html/body/div[2]/ul[2]/aa")
	WebElement graph;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	WebElement tryherebtn;
	
	@FindBy (xpath = "/html/body/div[2]/ul[3]/aa")
	WebElement graphrepresentation;

public void clickLink(String linkHavingText) {

	WebElement element = driver.findElement(By.xpath("//a[text()='" + linkHavingText + "']"));
	element.click();
	}
	
public void clickgetstarted() {
		getstarted.click();
	}
public void clickgraph() {
	graph.click();

	}

public void clicktryherebtn() {
	tryherebtn.click();
	}
public void clickgraphrepresentation() {
	graphrepresentation.click();
	}




}