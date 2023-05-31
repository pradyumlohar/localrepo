package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = { "src\\test\\resources\\features\\ActitimeLogin2.feature" }, // feature file or folder name
glue = {"stepdefinitions"}
,plugin = {"pretty","html:target/cucumber-reports.html"}
,monochrome = true
,publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
