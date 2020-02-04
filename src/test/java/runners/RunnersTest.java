package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features= {"src/test/resources"},
		        format = {"pretty" ,"json:target/Destination/cucumber.json"},
		        glue = {"stepDefinition"}
		
		
		        )

public class RunnersTest {

}
