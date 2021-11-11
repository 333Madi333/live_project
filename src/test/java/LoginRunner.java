import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/LoginRunner.html",
                "rerun:target/failed-scenarios/LoginRunner.txt"},
        features = "src/main/resources/features/login.feature",
        glue = {"steps"},
        stepNotifications = true,
        dryRun = false
)
public class LoginRunner {
}
