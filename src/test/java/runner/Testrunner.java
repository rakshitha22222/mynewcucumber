package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature//parameterization.feature", glue= {"SteoDef"} , plugin={"html:target/para.html"}, tags= {"@SmokeTest", "@RegressionTest"})

public class Testrunner {
	
    

}
