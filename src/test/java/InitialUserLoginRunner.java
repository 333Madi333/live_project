import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/InitialUserLogin.html",
                "rerun:target/failed-scenarios/InitialUserLogin.txt"},
        features = "src/main/resources/features/initialUserLogin.feature"//,
//        glue = {"steps"},
//        stepNotifications = true,
//        dryRun = false

)
public class InitialUserLoginRunner {
}
