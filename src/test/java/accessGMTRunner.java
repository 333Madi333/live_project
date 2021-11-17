import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/accessGMTRunner.html", "rerun:target/failed-scenarios/accessGMTRunner.txt"},
        features = "src/main/resources/features/accessMGT.feature"
)

public class accessGMTRunner {

}