package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, features = {
		"src/test/resources/AppFeatures/AmazonOrderPage.feature" }, glue = { "StepDefinitions" })

public class AmazonOrdersPageTest {

}
