package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDatatableWithHeader {
	WebDriver driver;
	@Given("You are in login page")
	public void you_are_in_login_page() {
		driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	@When("you are providing the username and password as")
	public void you_are_providing_the_username_and_password_as(DataTable dataTable) {
		List<Map<String,String>>cred=dataTable.asMaps(String.class, String.class);
		String uname=cred.get(1).get("username");
		String pwd=cred.get(1).get("password");
		driver.findElement(By.id("input-email")).sendKeys(uname);
	    driver.findElement(By.id("input-password")).sendKeys(pwd);
	}
	@When("clickig enters")
	public void clickig_enters() {
		driver.findElement(By.id("input-password")).sendKeys(Keys.RETURN);
	}
	@Then("he must be taken to the home page")
	public void he_must_be_taken_to_the_home_page() {
		Boolean status= driver.findElement(By.linkText("Edit your account information")).isDisplayed();
		   if(status)
		   {
			   System.out.println("Login Success");
		   }
	}

}
