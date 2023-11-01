package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"./src/test/resources/Feature/Login.feature"},
		
		glue={"Stepdef"},
		monochrome = true,
		//dryRun = true, 
		tags ="@title_date", 
		plugin = {
						"pretty",
						"html: test-report"
						}
		)
public class runnerfile {
	 

}
