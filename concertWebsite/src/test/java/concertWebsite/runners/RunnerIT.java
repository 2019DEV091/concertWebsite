package concertWebsite.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/concertWebsite/features")
public class RunnerIT extends AbstractTestNGCucumberTests {

}
