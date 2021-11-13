import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/studentNav.html",
                "rerun:target/failed-scenarios/studentNav.txt"},
        features = "src/main/resources/features/studentNav.feature",
        glue = {"steps"},
        stepNotifications = true,
        dryRun = false
)


public class studentNavRunner {
}
