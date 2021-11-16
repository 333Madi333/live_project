package steps;

import impl.EditUserImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LogUtil;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.util.Map;

public class EditUserSteps {
    EditUserImpl impl = new EditUserImpl();
    WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 10);

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

    //-----------------------------  edit user information  -----------------------------
    @When("I search for the user email {string} so I can work with his or her info")
    public void iSearchForTheUserEmailSoICanWorkWithHisOrHerInfo(String value) {
        impl.getPage().searchFillBox.sendKeys(value);
        impl.getPage().searchSubmitBtn.click();
    }

    @When("I click on Action dropdown menu")
    public void iClickOnActionDropdownMenu() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().actionBtn));
        impl.getPage().actionBtn.click();
    }

    @And("I click on Edit option")
    public void iClickOnEditOption() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().editBtn));
        impl.getPage().editBtn.click();
    }

    @Then("I should see a popup window with Update User displayed")
    public void iShouldSeeAPopupWindowWithUpdateUserDisplayed() {
//        wait.until(ExpectedConditions.visibilityOf(impl.getPage().updateUserPopUpHeader));
//        LogUtil.logInfo("Edit User Info Window", true);
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


    @Then("I click on Update user button")
    public void iClickOnUpdateUserButton() {
        impl.getPage().upUserBtn.click();
    }

    @Then("I should see the new update information")
    public void iShouldSeeTheNewUpdateInformation() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().actionBtn));
        LogUtil.logInfo("Newly update user information", true);
        Assert.assertEquals("success", impl.verifyUserInformationIsUpdated());
    }

    //-----------------------------  Reset user password  -----------------------------
    @When("I click on Reset Password button")
    public void iClickOnResetPasswordButton() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().resetPassBtn));
        impl.getPage().resetPassBtn.click();
    }

    @Then("Password should be {string}")
    public void passwordShouldBe(String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(impl.getPage().uPWord, value));
        LogUtil.logInfo("password should be default", true);
        Assert.assertEquals(value, impl.getPage().uPWord.getText());
    }


    //-----------------------------  delete user information  -----------------------------
    @And("I click on Delete option")
    public void iClickOnDeleteOption() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().deleteBtn));
        impl.getPage().deleteBtn.click();
    }

    @Then("I should see Delete popup window")
    public void iShouldSeeDeletePopupWindow() {
        Assert.assertEquals("Are you sure to delete:", impl.getPage().deleteUserPopUpHeader.getText());
    }

    @When("I click on Delete button")
    public void iClickOnDeleteButton() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().confirmDeleteBtn));
        impl.getPage().confirmDeleteBtn.click();
    }

    @Then("I should not see the newest user information I just added")
    public void iShouldNotSeeTheNewestUserInformationIJustAdded() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().actionBtn));
        LogUtil.logInfo("there should no longer visible of newly add user", true);
        Assert.assertEquals("success", impl.verifyDeleteUserInformation());
        WebDriverUtils.quitDriver();
    }

}
