import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/Runner.html", "rerun:target/failed-scenarios/accessGMTRunner.txt"},
        features = "src/main/resources/features/accessMGT.feature",
        glue = {"steps"},
        stepNotifications = true
)

public class accessGMTRunner {

}