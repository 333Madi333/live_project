import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/EditUserRunner.html",
                "rerun:target/failed-scenarios/EditUser.txt"},
        features = "src/main/resources/features/EditUser.feature",
        glue = {"steps"},
        stepNotifications = true,
        dryRun = false
)

public class EditUserRunner {
}
