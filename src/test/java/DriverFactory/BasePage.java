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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Scenario;
import pageObjects.HomePage;
import pageObjects.LinkedListPage;
import pageObjects.LoginPage;
import pageObjects.Stack;
import pageObjects.VerificationPage;
import pageObjects.helperClass;

public class BasePage {

	public WebDriver driver;
	public Properties p;
	public Logger logger;
	LoginPage loginObj;
	Stack stack;
	HomePage homeObj;
	VerificationPage verifyPage;
	public helperClass hpc;
	LinkedListPage linkedListPage;
	
	public LinkedListPage getLinkedListPage() {
		return linkedListPage;
	}
	
	public VerificationPage getVerifyPage() {
		return verifyPage;
	}

	public Properties getP() {
		return p;
	}

	public helperClass getHpc() {
		return hpc;
	}

	public Stack getStack() {
		return stack;
	}

	// WaitHelper waithelper;

	public LoginPage getLoginObj() {
		return loginObj;
	}

	public HomePage getHomeObj() {
		return homeObj;
	}

	public void InitializePageObject(WebDriver driver, Scenario scenario) throws IOException {
		homeObj = new HomePage(driver);
		loginObj = new LoginPage(driver);
		stack = new Stack(driver);
		hpc = new helperClass(driver);
		linkedListPage = new LinkedListPage(driver);
		// waithelper = new WaitHelper(driver);
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
