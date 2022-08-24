package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/main/resources/features",
		glue = "stepdefinition",
		plugin = {"pretty", "html:target/myreport.html"},
		monochrome = true,
		tags = "@smoke"
		
	)
public class TestRunner {

}
