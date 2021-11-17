package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LogUtil;
import utils.WebDriverUtils;

public class HomePageSteps {
    HomeImpl impl = new HomeImpl();
    WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 10);

    @Then("The display should say Welcome {string} !")
    public void theDisplayShouldSayWelcome(String userFName) {
        // should take screenshot when failed but for the proving evident we will take successfully pass scenario as well
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().welcomeMSG));
        Assert.assertEquals("Welcome " + userFName + "!", impl.getPage().welcomeMSG.getText());
        LogUtil.logInfo("Welcome Display", true);
        WebDriverUtils.closeDriver();
    }


    @Then("The the title should be {string}")
    public void theTheTitleShouldBe(String titleName) {
        wait.until(ExpectedConditions.titleContains(titleName));
        Assert.assertEquals(titleName, WebDriverUtils.getDriver().getTitle());
        WebDriverUtils.closeDriver();
    }
}
