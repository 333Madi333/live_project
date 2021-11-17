package steps;

import impl.AccesMngImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CucumberLogUtils_ScreenShot;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.util.List;




public class AccesMngSteps {
    AccesMngImpl impl = new AccesMngImpl();
    WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 10);

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
    public void iClickAddUserButton() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(impl.getPage().addUserBtn));
        impl.getPage().addUserBtn.click();


        wait.until(ExpectedConditions.visibilityOf(impl.getPage().usersList.get(10)));
        List <WebElement> users = impl.getPage().usersList;
        int x= 0;

        for (int i = 0; i< users.size(); i ++){
            if(users.get(i).equals("testuser@gmail.com")){
                x=i;
            }
        }
        SeleniumUtils.highlightElement(impl.getPage().nameList.get(x));
        SeleniumUtils.highlightElement(impl.getPage().lastNameList.get(x));
        SeleniumUtils.highlightElement(impl.getPage().usersList.get(x));
        SeleniumUtils.highlightElement(impl.getPage().passwordsList.get(x));
        SeleniumUtils.highlightElement(impl.getPage().roleList.get(x));
        SeleniumUtils.highlightElement(impl.getPage().batchList.get(x));
        SeleniumUtils.highlightElement(impl.getPage().dropDownList.get(x));

        CucumberLogUtils_ScreenShot.scenarioID(true);
    }


    @Then("I delete {string} user")
    public void iDeleteUser(String UserName) throws InterruptedException {
        impl.deleteUser(UserName);

        Thread.sleep(300);CucumberLogUtils_ScreenShot.scenarioID(true);
    }

    @Then("default password should be {string}")
    public void defaultPasswordShouldBe(String defaultPass) {
        List<WebElement> defaultPassword = impl.getPage().passwordsList;
        for (int i = 0; i < defaultPassword.size(); i++) {
            if (defaultPass.contains(defaultPassword.get(i).getText())) {
                Assert.assertEquals(defaultPass, defaultPassword.get(i).getText());
            }
        }
    }
}





