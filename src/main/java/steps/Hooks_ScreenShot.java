package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import utils.CucumberLogUtils_ScreenShot;

public class Hooks_ScreenShot {
    //public CucumberLogUtils_ScreenShot CucumberLogUtils;

    @Before
    public void setUp(Scenario scenario){
        CucumberLogUtils_ScreenShot.initScenario(scenario);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed())
            CucumberLogUtils_ScreenShot.logFail("Scenario: " + scenario.getName() + " FAILED", true);
//        WebDriverUtils.quitDriver();
    }
}