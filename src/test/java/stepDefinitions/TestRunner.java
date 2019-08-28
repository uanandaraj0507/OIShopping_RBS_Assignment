package stepDefinitions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"src/test/resources/shoppingList.feature"},
				dryRun=false,
				//tags={" @First_scenario"},
				//tags={"@Second_Scenario"},
				tags={"@Shopping_Sanity"},
				plugin = {"pretty", "html:target/cucumber-reports" },
				monochrome = true
				
			)
	public class TestRunner {

}

 
 