package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//we want to create pretty, json and junit report in the mentioned location
@CucumberOptions( plugin= {"pretty", "json:target/MyReports/report.json", 
		"junit:target/MyReports/report.xml"},
features = {"src/test/resources/AppFeatures/Uber.feature" }, 
tags = "@All",
glue = { "StepDefinitions", "MyHooks"},
monochrome=false,
dryRun =false,
strict=true
)

//tags cannot be applied to given, when, then etc etc.
//tags can be applied at feature level. by default it will be applied on all scenarios.
//tags can be applied at scenario level.
//tags can be applied at scenario outline level.
//we can run with multiple tags.

public class UberBookingTest {

}
