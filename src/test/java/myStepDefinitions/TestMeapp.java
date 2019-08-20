package myStepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeapp {
	WebDriver driver;
	
	@Given("testme is launched user")
	public void testme_is_launched_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	    driver = new ChromeDriver();
		  
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	}

	@When("user clicks on signin link in landing page")
	public void user_clicks_on_signin_link_in_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("SignIn")).click();
	}

	@Then("user provides the valid username {string}")
	public void user_provides_the_valid_username(String usname) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys(usname);
		
	}

	@Then("user provides the valid password {string}")
	public void user_provides_the_valid_password(String passwrd) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(passwrd);
	}

	@Then("user clicks for the submission of tha data")
	public void user_clicks_for_the_submission_of_tha_data() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();
	}

	@Then("verifies the login status for the account")
	public void verifies_the_login_status_for_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//String actual = " SignOut";
	//	String expected = driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
      //  Assert.assertEquals(expected, actual);
      //  driver.findElement(By .xpath("//*[@id=\\\"header\\\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	}
}
