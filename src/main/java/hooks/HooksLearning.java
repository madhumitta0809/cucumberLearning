package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import driverInstances.Instances;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HooksLearning extends Instances {
	

	@Before
	public void beforeScenario(Scenario scenario)
	{
		System.out.println("before scenario");
	}
	@After
	public void afterScenario(Scenario scenario)
	{
		System.out.println("After scenario");
		byte[] ss=driver.getScreenshotAs(OutputType.BYTES);
		scenario.attach(ss, "image/png", null);
		driver.quit();
		
	}
	@AfterStep
	public void afterSteps(Scenario scenario)
	{
		System.out.println("After step");
		byte[] ss=driver.getScreenshotAs(OutputType.BYTES);
		scenario.attach(ss, "image/png", null);
	}
	@BeforeStep
	public void beforeSteps(Scenario scenario)
	{
		System.out.println("After step");
	}
	
}
