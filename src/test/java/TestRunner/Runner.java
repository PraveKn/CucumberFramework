package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = {"StepDefenitions","Hooks"},plugin = {"json:target/jsonReports/cucumber-report.json", "html:target/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner extends AbstractTestNGCucumberTests {

}
