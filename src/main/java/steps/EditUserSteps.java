package steps;

import impl.EditUserImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.util.Map;

public class EditUserSteps {
    EditUserImpl impl = new EditUserImpl();

    @Given("I create new user")
    public void iCreateNewUser(Map<String, String> map) {
        for(String key: map.keySet()) {
            impl.fillCreateNewUser(key, map.get(key));
        }
    }

    @And("I click Add User button")
    public void iClickAddUserButton() {
        impl.getPage().addUserBtn.click();
    }

    @When("I click on Action dropdown menu")
    public void iClickOnActionDropdownMenu() throws InterruptedException {
        Thread.sleep(500);
        impl.getPage().actionBtn.click();
    }

    @And("I click on Edit option")
    public void iClickOnEditOption() {
        impl.getPage().editBtn.click();
    }

    @Then("I should see a popup window with Update User displayed")
    public void iShouldSeeAPopupWindowWithUpdateUserDisplayed() {
        Assert.assertEquals("Update User", impl.getPage().updateUserPopUpHeader.getText());
    }


    @When("I input new firstname as {string}")
    public void iInputNewFirstnameAs(String value) {
        WebDriverUtils.clearWebFill(impl.getPage().upFNameFillBox);
        impl.getPage().upFNameFillBox.sendKeys(value);
    }

    @And("I input new lastname as {string}")
    public void iInputNewLastnameAs(String value) {
        WebDriverUtils.clearWebFill(impl.getPage().upLNameFillBox);
        impl.getPage().upLNameFillBox.sendKeys(value);
    }

    @And("I input new e-mail {string}")
    public void iInputNewEMail(String value) {
        WebDriverUtils.clearWebFill(impl.getPage().upEmailFillBox);
        impl.getPage().upEmailFillBox.sendKeys(value);
    }

    @And("I change new role to {string}")
    public void iChangeNewRoleTo(String value) {
        SeleniumUtils.selectByVisibleText(impl.getPage().upRoleSelectOpt, value);
    }


    @And("I change new batch to {string}")
    public void iChangeNewBatchTo(String value) {
        SeleniumUtils.selectByVisibleText(impl.getPage().upBatchSelectOpt, value);
    }

    @Then("I click on Update ser button")
    public void iClickOnUpdateSerButton() {
        impl.getPage().upUserBtn.click();
    }

    @Then("I should see the new update information")
    public void iShouldSeeTheNewUpdateInformation() {
    }


}
