package steps;

import impl.LoginImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CucumberLogUtils;
import utils.WebDriverUtils;

public class LoginSteps {
    LoginImpl impl = new LoginImpl();
    WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 10);

    @Given("I navigate to LoginPage")
    public void i_navigate_to_login_page() {
      impl.navigateToLoginPage();
    }

    @When("I input {string} as {string}")
    public void i_input_as(String inputFieldName, String value) {
       impl.fillInputField(inputFieldName, value);
    }

    @When("I click Login button")
    public void i_click_login_button() {
       impl.getPage().loginBtn.click();
    }


    @Then("I should see error message")
    public void iShouldSeeErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().errorMsg));
        Assert.assertEquals("Incorrect username/password" , impl.getPage().errorMsg.getText());
        CucumberLogUtils.logInfo("error msg", true);
        WebDriverUtils.quitDriver();
    }


//    @Then("Title of the page should be Student Portal")
//    public void titleOfThePageShouldBeStudentPortal() {
//        CucumberLogUtils.scenarioID(true);
//        Assert.assertEquals("Student Portal" , WebDriverUtils.getDriver().getTitle());
//        System.out.println(WebDriverUtils.getDriver().getTitle());
//        WebDriverUtils.quitDriver();
//    }

    @Then("I should see the Welcome message")
    public void iShouldSeeTheWelcomeKuba() {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().welcomeMsg));
        CucumberLogUtils.logInfo("Welcome Display", true);
//        Assert.assertEquals("Welcome Kuba!", impl.getPage().welcomeMsg.getText());
        Assert.assertTrue(impl.getPage().welcomeMsg.isDisplayed());
        WebDriverUtils.quitDriver();
    }


}
