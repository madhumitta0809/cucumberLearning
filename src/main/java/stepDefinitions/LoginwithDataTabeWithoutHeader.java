package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginwithDataTabeWithoutHeader {
	WebDriver driver;
	@Given("You are in the login page")
	public void you_are_in_the_login_page() {
		driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@When("you are providesing the username and password as")
	public void you_are_providesing_the_username_and_password_as(DataTable dataTable) {
		
	List<String> credentials=dataTable.transpose().asList(String.class);
	String uname=credentials.get(0);
	String pwd=credentials.get(1);
		driver.findElement(By.id("input-email")).sendKeys(uname);
	    driver.findElement(By.id("input-password")).sendKeys(pwd);
	
	}
	@When("clicks enters")
	public void clicks_enters() {
		driver.findElement(By.id("input-password")).sendKeys(Keys.RETURN);
	}
	@Then("he must be taken to home page")
	public void he_must_be_taken_to_home_page() {
		 Boolean status= driver.findElement(By.linkText("Edit your account information")).isDisplayed();
		   if(status)
		   {
			   System.out.println("Login Success");
		   }
	}


}
