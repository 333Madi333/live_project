package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        CucumberLogUtils_ScreenShot.initScenario(scenario);
    }


    @After ("@end")
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            CucumberLogUtils_ScreenShot.logFail("Scenario: " + scenario.getName() + " FAILED", true);}
        WebDriverUtils.quitDriver();
    }

}
