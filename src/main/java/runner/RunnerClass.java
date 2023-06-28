package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun = true,
		features="featureFiles/LoginWithExamplesKeyword.feature",
		glue={"stepDefinitions","hooks"},
		plugin = "html:report/htmlreportt.html")
public class RunnerClass{
	
}