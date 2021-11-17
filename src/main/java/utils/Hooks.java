package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        CucumberLogUtils.initScenario(scenario);
    }

    @After ("@end")
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            CucumberLogUtils.logFail("Scenario: " + scenario.getName() + " FAILED", true);}
        WebDriverUtils.quitDriver();
    }

}
