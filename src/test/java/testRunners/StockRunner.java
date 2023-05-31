package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features= "features/AddCategory.feature",
		glue = {"stepDefinations","pageObjects","testRunners"},
		monochrome = true,
		plugin = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-output/cucumber.xml"},
		dryRun =false
		)
public class StockRunner 
{

}
