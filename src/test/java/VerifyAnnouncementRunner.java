import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/Runner.html", "rerun:target/failed-scenarios/AnnouncementRunner.txt"},
        features = "src/main/resources/features/VerifyAnnouncement.feature"

)

public class VerifyAnnouncementRunner {

}