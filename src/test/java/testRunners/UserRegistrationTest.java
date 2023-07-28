package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions( plugin= {"pretty", "json:target/MyReports/report.json", 
		"junit:target/MyReports/report.xml"},
features = {"src/test/resources/AppFeatures/UserRegistration.feature" }, 
glue = { "StepDefinitions"},
monochrome=false,
dryRun =false
)

public class UserRegistrationTest {

}
