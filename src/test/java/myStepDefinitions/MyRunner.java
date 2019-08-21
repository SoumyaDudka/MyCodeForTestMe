package myStepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium_WS\\Cucumber_demo1\\My_features\\demotours_login.feature",
                 glue = "myStepDefinitions",plugin = {"json:target/cucumber.json"})


public class MyRunner {

}
