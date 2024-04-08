package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;

public class LinkedListPage extends BasePage {

	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div/a")
	WebElement getstartebtn;

	@FindBy(xpath = "//a[text()='Introduction']")
	WebElement introlink;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	WebElement tryherebtn;

	@FindBy(xpath = "/html/body/div[2]/ul[2]/a")
	WebElement creatinglinklistlink;

	@FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	WebElement typeslinkedlist;

	@FindBy(xpath = "/html/body/div[2]/ul[4]/a")
	WebElement implementlinklist;

	@FindBy(xpath = "/html/body/div[2]/ul[5]/a")
	WebElement traversal;

	@FindBy(xpath = "/html/body/div[2]/ul[6]/a")
	WebElement insertion;

	@FindBy(xpath = "/html/body/div[2]/ul[7]/a")
	WebElement deletion;

	@FindBy(xpath = "//*[@id=\"content\"]/a")
	WebElement practiceq;

	public void clickLink(String linkHavingText) {

		WebElement element = driver.findElement(By.xpath("//a[@href='" + linkHavingText + "']"));
		element.click();
	}

	public void clickongetstarted() {
		getstartebtn.click();
	}

	public void clickintrolink() {
		introlink.click();
	}

	public void clicktryherebtn() {
		tryherebtn.click();
	}

	public void clicklinklistlink() {
		creatinglinklistlink.click();
	}

	public void clicktypesoflinkedlist() {
		typeslinkedlist.click();
	}

	public void clickimplementlinklist() {
		implementlinklist.click();
	}

	public void clicktraversal() {
		traversal.click();
	}

	public void clickinsertion() {
		insertion.click();
	}

	public void clickdeletion() {
		deletion.click();
	}

	public void clickpracticeq() {
		practiceq.click();
	}
}
