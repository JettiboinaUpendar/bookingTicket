package stepDefinition;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions( features="src\\test\\resources\\feature",
glue={"stepDefinition"},
plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-report/cucumber.html"})

public class runnerClass extends AbstractTestNGCucumberTests {

}





