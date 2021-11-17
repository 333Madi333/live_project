import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/VerifyAnnouncementRunner.html", "rerun:target/failed-scenarios/VerifyAnnouncementRunner.txt"},
        features = "src/main/resources/features/VerifyAnnouncement.feature"

)

public class VerifyAnnouncementRunner {

}