package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature\\tagdemo.feature", glue= {"SteoDef"} , plugin={"html:target/cuc.html"},tags = {"@SmokeTest" , "~@RegressionTest"})
public class runnerclass {

}
