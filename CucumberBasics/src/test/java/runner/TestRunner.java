package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\SeleniumMastery\\CucumberBasics\\src\\test\\resources\\features\\login.feature",glue ="Steps")
public class TestRunner {
	
	

	
}
