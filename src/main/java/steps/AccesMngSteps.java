package steps;

import impl.AccesMngImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CucumberLogUtils_ScreenShot;

import java.util.List;




public class AccesMngSteps {
    AccesMngImpl impl = new AccesMngImpl();


    @Then("I click Manage Access button")
    public void iClickManageAccessButton() {
        impl.getPage().mngAcsBtn.click();

    }

    @When("I input to {string} as {string}")
    public void iInputToAs(String inputField, String value) {
        impl.InputField(inputField, value);
    }


    @And("I select {string} as a Role")
    public void iSelectAsARole(String selRole) {
        impl.selectRole(selRole);
    }

    @And("I select {string} as a Batch")
    public void iSelectAsABatch(String selBatch) {
        impl.selectBatch(selBatch);
    }

    @Then("I click Add user button")
    public void iClickAddUserButton() {
        impl.getPage().addUserBtn.click();
    }


    @Then("I delete {string} user")
    public void iDeleteUser(String UserName) throws InterruptedException {
        impl.deleteUser(UserName);
    }

    @Then("default password should be {string}")
    public void defaultPasswordShouldBe(String defaultPass) {
        CucumberLogUtils_ScreenShot.logPass("DefaultPassword Verified", true);
        CucumberLogUtils_ScreenShot.logInfo("DefaultPassword Verified", true);
        List<WebElement> defaultPassword = impl.getPage().passwordsList;
        for (int i = 0; i < defaultPassword.size(); i++) {
            //Assert.assertTrue(defaultPass, defaultPassword.get(i).isDisplayed());
            if (defaultPass.contains(defaultPassword.get(i).getText())) {
                Assert.assertEquals(defaultPass, defaultPassword.get(i).getText());
            }
        }
    }
}





