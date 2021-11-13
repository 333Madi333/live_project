package steps;

import impl.MainNavImpl;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.WebDriverUtils;

public class MainNavSteps {

    MainNavImpl impl = new MainNavImpl();

    @Then("I click on {string} button")
    public void iClickOnButton(String button) {

        impl.clickButton(button);
    }

    @Then("I should be able to see Homeworks button is displayed")
    public void iShouldBeAbleToSeeHomeworksButtonIsDisplayed() {

        Assert.assertTrue(impl.getPage().homeworksBtn.isDisplayed());
    }

    @Then("I should be able to see Meeting Links button is displayed")
    public void iShouldBeAbleToSeeMeetingLinksButtonIsDisplayed() {

        Assert.assertTrue(impl.getPage().meetingLinksBtn.isDisplayed());
    }

    @Then("I should be able to see Manage Access button is displayed")
    public void iShouldBeAbleToSeeManageAccessButtonIsDisplayed() {

        Assert.assertTrue(impl.getPage().accessManagementBtn.isDisplayed());
    }

    @Then("Title of the page should be {string}")
    public void titleOfThePageShouldBe(String expectedTitle) {

        Assert.assertEquals(expectedTitle, impl.getTitle());
        System.out.println(impl.getTitle());

        WebDriverUtils.closeDriver();
    }
}

