package applicationHook;

import java.io.IOException;
import java.time.Duration;

import org.junit.rules.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DriverFactory.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends TestWatcher {

	private static WebDriver driver;
	private BasePage base;
	private Scenario sce;

	public Hooks(BasePage base) throws IOException {
		this.base = base;
	}

	@Before(order = 0)
	public void setup(Scenario scenario) throws IOException {
		this.sce = scenario;

		if (driver == null) {
			driver = base.initilizeBrowser();
			base.InitializePageObject(driver, sce);
			driver.manage().window().maximize();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
       
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {

		// this is for cucumber junit report
		if (scenario.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) getDriver();
			final byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
	
	@After("@GraphPageLogout")
	public void browserquit() {
		if(driver!= null) {
		driver.quit();
		}
	}

}
