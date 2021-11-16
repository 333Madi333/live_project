package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        //---------------------
        // Kai adds these lines of codes for screenshot
        LogUtil.initScenario(scenario);
        //---------------------
    }

    @After ("@end")
    public void tearDown(Scenario scenario){

        //---------------------
        // Kai adds these lines of codes for screenshot
        // should take screenshot when failed but for the proving evident we will take successfully pass scenario as well
        if(scenario.isFailed()) {
            LogUtil.logFail("message", true);
        }
        //---------------------

        WebDriverUtils.quitDriver();
    }
}
