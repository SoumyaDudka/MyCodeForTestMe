package myStepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Mercury_Login {
	WebDriver driver;
	
	@Given("User has launched the application")
	public void user_has_launched_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	    driver = new ChromeDriver();
		  
		driver.get("http://newtours.demoaut.com/");
		Dimension d = new Dimension(300,600);
		driver.manage().window().setSize(d);
		//Point p = new Point(300,400);
		//driver.manage().window().setPosition(p);
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
		driver.findElement(By .name("userName")).sendKeys("demo");
		driver.findElement(By .name("password")).sendKeys("demo");
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("login")).click();
	}

	@Then("User verifies the login status")
	public void user_verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 String actual = "SIGN-OFF";
         String expected= driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).getText();
         System.out.println(expected);
         Assert.assertEquals(actual,expected);
         
         driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
         driver.close();
      }

	@Given("User launched the app of mercury tours")
	public void user_launched_the_appa_of_mercury_tours() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	    driver = new ChromeDriver();
		  
		driver.get("http://newtours.demoaut.com/");
		
	}

	@Then("User clicks on signup link")
	public void user_clicks_on_signup_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}
	

	@When("User enters the valid data in the form")
	public void user_enters_the_valid_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("firstName")).sendKeys("abcd");
		driver.findElement(By .name("lastName")).sendKeys("efgh");
		driver.findElement(By .name("phone")).sendKeys("0123456789");
		driver.findElement(By .name("userName")).sendKeys("usernm@gmail.com");
		driver.findElement(By .name("address1")).sendKeys("1-2,sriram colony");
		driver.findElement(By .name("city")).sendKeys("Hyderabad");
		driver.findElement(By .name("state")).sendKeys("Telangana");
		driver.findElement(By .name("postalCode")).sendKeys("503123");
		Select s=new Select(driver.findElement(By .name("country")));
		s.selectByValue("92");
		driver.findElement(By .name("email")).sendKeys("sairaj");
		driver.findElement(By .name("password")).sendKeys("sairaj1");
		driver.findElement(By .name("confirmPassword")).sendKeys("sairaj1");
		
		
	}

	@When("User clicks on submit button available")
	public void user_clicks_on_submit_button_available() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("register")).click();
	} 

	@Then("User verifies the registration status")
	public void user_verifies_the_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 String actual = "sign-in";
		 String expected= driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")).getText();
         System.out.println(expected);
         Assert.assertEquals(actual,expected);
         
         driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
         driver.close();

	}

}
