package steps;

import impl.InitialUserLoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CucumberLogUtils_ScreenShot;
import utils.SeleniumUtils;
import utils.WebDriverUtils;


public class InitialUserLoginSteps {

    InitialUserLoginImpl impl = new InitialUserLoginImpl();
    WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 10);

    @Then("I should see Please change the default password")
    public void i_should_see_please_change_the_default_password() throws InterruptedException {
        SeleniumUtils.switchToNextWindow();
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().msg));
        SeleniumUtils.highlightElement(impl.getPage().msg);
        CucumberLogUtils_ScreenShot.scenarioID(true);
        Assert.assertEquals("Please change the default password" , impl.getPage().msg.getText());

    }


    @When("I input new password  as {string}")
    public void iInputNewPasswordAs(String newPass) {
        impl.getPage().newPassInput.sendKeys(newPass);
        impl.getPage().newPassInput2.sendKeys(newPass);
    }

    @And("I click on Submit button")
    public void iClickOnSubmitButton() {
        impl.getPage().submitBtn.click();

    }

    @Then("Password for user {string} should be {string}")
    public void passwordForUserShouldBe(String userName, String pass) throws InterruptedException {
        Thread.sleep(1000);
        impl.CheckPassword(userName,pass);
        CucumberLogUtils_ScreenShot.scenarioID(true);
        Assert.assertEquals(pass,impl.CheckPassword(userName,pass));
    }


    @Then("The display message should say Welcome {string}")
    public void theDisplayMessageShouldSayWelcome(String msg) {
        Assert.assertEquals(msg, impl.getPage().welcomeM.getText());
        SeleniumUtils.highlightElement(impl.getPage().welcomeM);
        CucumberLogUtils_ScreenShot.scenarioID(true);
    }
}
