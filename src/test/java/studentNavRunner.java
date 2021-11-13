import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/studenNav.html",
                "rerun:target/failed-scenarios/studenNav.txt"},
        features = "src/main/resources/features/studenNav.feature"
)


public class studentNavRunner {
}
