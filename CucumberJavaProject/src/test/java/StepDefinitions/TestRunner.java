package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/GoogleSearch.feature", glue = {
		"StepDefinitions" }, monochrome = true, plugin = { "pretty", "junit:target/JUnitReports/report.xml",
				"json:target/JsonReports/report.json", "html:target/Html/reports" }, tags = "@smoketest")
public class TestRunner {

}
