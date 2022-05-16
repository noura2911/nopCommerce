package testrunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = {"stepDefinitions"},
        tags = "@AllFeatures"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
