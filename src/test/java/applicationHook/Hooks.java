package applicationHook;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import DriverFactory.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private static WebDriver driver;
	private BasePage base;
	private Properties p;
	private Scenario sce;

	public Hooks(BasePage base) throws IOException {
		this.base = base;
		// base.InitializePageObject(driver, sce);
		// PageFactory.initElements(base.getDriver(),this);
	}

	@Before
	public void setup(Scenario scenario) throws IOException {
		this.sce = scenario;

		if (driver == null) {
			driver = base.initilizeBrowser();
			p = base.getProperties();
			driver.get(p.getProperty("appURLlogin"));
			base.InitializePageObject(driver, sce);
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	/*
	 * @AfterStep public void tearDown(Scenario scenario) {
	 * 
	 * // this is for cucumber junit report //if(scenario.isFailed()) {
	 * 
	 * // TakesScreenshot ts=(TakesScreenshot) base.getDriver(); byte[] //
	 * screenshot=ts.getScreenshotAs(OutputType.BYTES);
	 * scenario.attach(screenshot,"image/png",scenario.getName());
	 * 
	 * 
	 * 
	 * }
	 */
}
