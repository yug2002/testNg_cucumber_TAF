package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
//        plugin = {"pretty", "html:target/cucumber-reports"
//                , "json:target/cucumber-reports/TestRunners.json"
//                , "testng:target/cucumber-reports/TestRunners.xml"},
        monochrome = true,
        //tags = "@smoke",
        glue = "com.cucumber.testng.test",
        features = "src\\test\\java\\features\\"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}