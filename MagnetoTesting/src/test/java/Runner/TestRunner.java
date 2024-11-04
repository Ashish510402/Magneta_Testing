package Runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\insph\\Downloads\\MagnetoTesting\\MagnetoTesting\\src\\test\\java\\Steps\\Signupsteps.feature",
        glue = "Feature",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
//        C:\Users\HP\IdeaProjects\MagnetoTesting\src\test\java\Steps\Signupsteps.feature
)
public class TestRunner {
}
