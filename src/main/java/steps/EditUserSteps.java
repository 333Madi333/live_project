package steps;

import impl.EditUserImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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



}
