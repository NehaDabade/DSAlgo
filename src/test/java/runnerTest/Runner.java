package runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { ".\\src\\test\\resources\\FeatureFiles\\LinkedListFeature.feature" }, 
		glue = { "stepDefinitions", "applicationHook" },
		plugin = { "pretty", "html:reports/myreport.html", "rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
		dryRun = false, // checks mapping between scenario steps and step definition methods
		monochrome = true, // to avoid junk characters in output
		publish = false // to publish report in cucumber server
		//tags = "@Login or @LinkedListPage"
)
public class Runner {

}
