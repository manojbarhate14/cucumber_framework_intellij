package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/featureFiles/practice.feature",
        glue = "stepDefinations",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:src/test/reports/HTMLReport"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}