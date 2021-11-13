package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){



        WebDriverUtils.quitDriver();

    }



}
