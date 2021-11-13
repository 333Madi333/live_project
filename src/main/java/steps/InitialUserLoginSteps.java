package steps;

import impl.InitialUserLoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.SeleniumUtils;


public class InitialUserLoginSteps {
    InitialUserLoginImpl impl = new InitialUserLoginImpl();

    @Then("I should see Please change the default password")
    public void i_should_see_please_change_the_default_password() throws InterruptedException {
        SeleniumUtils.switchToNextWindow();
        Thread.sleep(500);
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
        Assert.assertEquals(pass,impl.CheckPassword(userName,pass));
    }


    @Then("The display message should say Welcome {string}")
    public void theDisplayMessageShouldSayWelcome(String msg) {
        Assert.assertEquals(msg, impl.getPage().welcomeM.getText());
    }
}
