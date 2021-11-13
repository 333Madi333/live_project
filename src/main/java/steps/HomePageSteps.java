package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.WebDriverUtils;

public class HomePageSteps {
    HomeImpl impl = new HomeImpl();

    @Then("The display should say Welcome {string} !")
    public void theDisplayShouldSayWelcome(String userFName) {
        Assert.assertEquals("Welcome " + userFName + "!", impl.getPage().welcomeMSG.getText());

        WebDriverUtils.quitDriver();
    }


    // expect Failed..!!!
    @Then("The the title should be {string}")
    public void theTheTitleShouldBe(String titleName) {
        Assert.assertEquals(titleName, WebDriverUtils.getDriver().getTitle());
        WebDriverUtils.quitDriver();
    }
}
