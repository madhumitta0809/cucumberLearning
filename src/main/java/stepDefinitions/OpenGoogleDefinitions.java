package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OpenGoogleDefinitions {
	
	 WebDriver driver;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in()  {
	    // Write code here that turns the phrase above into concrete actions
		  driver=new ChromeDriver();
	   // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("http://www.google.co.in");
	}

	@When("^user is typing the seach term \"([^\"]*)\"$")
	public void user_is_typing_the_seach_term(String searchTerm)  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@And("^press enter key$")
	public void press_enter_key()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^user should see search results$")
	public void user_should_see_search_results()  {
	    // Write code here that turns the phrase above into concrete actions
	    Boolean status=driver.findElement(By.partialLinkText("cricket")).isDisplayed();
	    if(status)
	    {
	    	System.out.println("search result displayed");
	    }
	}
}
