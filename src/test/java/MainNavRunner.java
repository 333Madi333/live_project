import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/MainNavRunner.html",
                "rerun:target/failed-scenarios/MainNav.txt"},
        features = "src/main/resources/features/MainNav.feature"
)

public class MainNavRunner {
}