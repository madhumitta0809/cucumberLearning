package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginExample {
	
	WebDriver driver;
	@Given("the user is in the login page")
	public void the_user_is_in_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@When("the user provides the username as {string} and password as {string}")
	public void the_user_provides_the_username_as_and_password_as(String string, String string2)  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("input-email")).sendKeys(string);
	    driver.findElement(By.id("input-password")).sendKeys(string2);
	}
	@When("clicks enter")
	public void clicks_enter() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("input-password")).sendKeys(Keys.RETURN);
	}
	@Then("he must be loggedin and taken to home page")
	public void he_must_be_loggedin_and_taken_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   Boolean status= driver.findElement(By.linkText("Edit your account information")).isDisplayed();
	   if(status)
	   {
		   System.out.println("Login Success");
	   }
	}

}
