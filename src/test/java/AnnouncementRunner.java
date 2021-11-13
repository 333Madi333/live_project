import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/AnnouncementRunner.html",
                "rerun:target/failed-scenarios/AnnouncementRunner.txt"},
        features = "src/main/resources/features/AddAnnouncement.feature",
        glue = {"steps"},
        stepNotifications = true,
        dryRun = false
)

public class AnnouncementRunner {
}
