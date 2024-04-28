package DriverFactory;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Scenario;
import pageObjects.ArrayPage;
import pageObjects.ArrayPracticePage;
import pageObjects.DSRegistration;
import pageObjects.DataStructureIntro;
import pageObjects.DsIntroduction;
import pageObjects.GraphPage;
import pageObjects.LinkedListPage;
import pageObjects.QueuePage;
import pageObjects.SignIn;
import pageObjects.StackPage;
import pageObjects.Tree;
import pageObjects.helperClass;
import pageObjects.verifyUtil;

public class BasePage {

	public WebDriver driver;
	public Properties p;
	public Logger logger;

	public helperClass hpc;
	public SignIn loginObj;
	public StackPage stackObj;
	public DsIntroduction DsintroObj;
	public DSRegistration registrationObj;
	public verifyUtil verifyObj;
	public GraphPage graphPageObj;
	public Tree treePageObj;
	private ArrayPage arrayPage;
	private ArrayPracticePage arrayPracticePage;
	private LinkedListPage linkedlistPage;
	private QueuePage queuepage;
	public DataStructureIntro dsiPageObj;
	public Actions action;
	
	
	public Actions getAction() {
		return action;
	}

	public void setAction(Actions action) {
		this.action = action;
	}

	public DataStructureIntro getDsiPageObj() {
		return dsiPageObj;
	}

	public QueuePage getQueuePage() {
		return queuepage;
	}
	
	public LinkedListPage getLinkedListPage() {
		return linkedlistPage;
	}
	
	public ArrayPracticePage getArrayPracticePageObject() {
		return arrayPracticePage;
	}
	
	public ArrayPage getArrayPageObject() {
		return arrayPage;
	}

	public Tree getTreePageObj() {
		return treePageObj;
	}

	public void setTreePageObj(Tree treePageObj) {
		this.treePageObj = treePageObj;
	}

	public GraphPage getGraphPageObj() {
		return graphPageObj;
	}

	public verifyUtil getVerifyObj() {
		return verifyObj;
	}

	public DSRegistration getRegistrationObj() {
		return registrationObj;
	}

	public DsIntroduction getDsintroObj() {
		return DsintroObj;
	}

	public StackPage getStackObj() {
		return stackObj;
	}

	public Properties getP() {
		return p;
	}

	public helperClass getHpc() {
		return hpc;
	}



	public SignIn getLoginObj() {
		return loginObj;
	}

	public void InitializePageObject(WebDriver driver, Scenario scenario) {
		loginObj = new SignIn(driver);
		stackObj = new StackPage(driver);
		hpc = new helperClass(driver);
		//elements = new ElementsUtils(driver);
		DsintroObj = new DsIntroduction(driver);
		registrationObj = new DSRegistration(driver);
		verifyObj = new verifyUtil(driver);
		graphPageObj = new GraphPage(driver);
		treePageObj = new Tree(driver);
		arrayPage = new ArrayPage(driver);
		arrayPracticePage = new ArrayPracticePage(driver);
		linkedlistPage = new LinkedListPage(driver);
		queuepage = new QueuePage(driver);
		dsiPageObj = new DataStructureIntro(driver);
		action = new Actions(driver);
	}

	public WebDriver initilizeBrowser() throws IOException {
		if (getProperties().getProperty("execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();

			// os
			if (getProperties().getProperty("os").equalsIgnoreCase("windows")) {
				capabilities.setPlatform(Platform.WIN11);
			} else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) {
				capabilities.setPlatform(Platform.MAC);
			} else {
				System.out.println("No matching OS..");
			}
			// browser
			switch (getProperties().getProperty("browser").toLowerCase()) {
			case "chrome":
				capabilities.setBrowserName("chrome");
				break;
			case "edge":
				capabilities.setBrowserName("MicrosoftEdge");
				break;
			default:
				System.out.println("No matching browser");
			}

			this.driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

		} else if (getProperties().getProperty("execution_env").equalsIgnoreCase("local")) {
			switch (getProperties().getProperty("browser").toLowerCase()) {
			case "chrome":
				this.driver = new ChromeDriver();
				break;
			case "edge":
				this.driver = new EdgeDriver();
				break;
			default:
				System.out.println("No matching browser");
				this.driver = null;
			}
		}
		this.driver.manage().deleteAllCookies();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		return driver;

	}

	public WebDriver getDriver() {
		return driver;
	}

	public Properties getProperties() throws IOException {
		FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");

		p = new Properties();
		p.load(file);
		return p;
	}

	public Logger getLogger() {
		logger = LogManager.getLogger(); // Log4j
		return logger;
	}

	public static String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public static String randomeNumber() {
		String generatedString = RandomStringUtils.randomNumeric(10);
		return generatedString;
	}

	public static String randomAlphaNumeric() {
		String str = RandomStringUtils.randomAlphabetic(5);
		String num = RandomStringUtils.randomNumeric(10);
		return str + num;
	}

}