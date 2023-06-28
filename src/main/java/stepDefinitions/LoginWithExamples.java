
  package stepDefinitions;
  
  import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
  org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver;

import driverInstances.Instances;
import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
  io.cucumber.java.en.When;
  
  public class LoginWithExamples extends Instances{ //WebDriver driver;
  
  @Given("You are in  the login page") public void you_are_in_the_login_page()
  { driver=new ChromeDriver();
  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
  }
  
  @When("you are providing the username and password as mentioned in {string}{string}"
  ) public void
  you_are_providing_the_username_and_password_as_mentioned_in(String string,
  String string2) { String uname=string; String pwd=string2;
  driver.findElement(By.id("input-email")).sendKeys(uname);
  driver.findElement(By.id("input-password")).sendKeys(pwd);
  
  
  }
  
  @When("clicking enter") public void clicking_enter() {
  driver.findElement(By.id("input-password")).sendKeys(Keys.RETURN);
  
  }
  
  @Then("he must be taken to the home page if credentials are valid") public
  void he_must_be_taken_to_the_home_page_if_credentials_are_valid() { Boolean
  status=
  driver.findElement(By.linkText("Edit your account information")).isDisplayed(
  ); if(status) { System.out.println("Login Success"); }
  
  }
  
  
  
  
  }
 