package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, features = { "src/test/resources/AppFeatures/Search.feature" },
		// glue = {"/src/test/java/StepDefinitions/"} //this will also work
		glue = { "StepDefinitions", "MyHooks" }, // this way of defining also works
		tags = "@Smoke or @Regression")

//in features we can give path till the feature file itself but tomorrow if n number of files are there and we want to run them
//then give the path till the package name
//glue tells where the step definitions are available.
//plugin = pretty means colorful and nice output.

public class AmazonSearchRunnerTest {

}
