import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/AddAnnouncement.feature.html",
                "rerun:target/failed-scenarios/AddAnnouncement.txt"},
        features = "src/main/resources/features/AddAnnouncement.feature",
        glue = {"steps"},
        stepNotifications = true,
        dryRun = false
)

public class AddAnnouncmentRunner {
}
