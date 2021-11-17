package steps;

import impl.AnnouncementImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CucumberLogUtils_ScreenShot;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.util.List;

public class AnnouncementSteps {
    AnnouncementImpl impl = new AnnouncementImpl();
    WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 10);


    @When("I click Add announcement")
    public void i_click_add_announcement() {
        impl.getPage().AddBtn.click();
    }

    @Then("I input title")
    public void iInputTitle() {
        impl.getPage().titleInput.sendKeys("Update test");
    }

    @Then("I input announcement")
    public void iInputAnnouncement() {
        impl.getPage().announcementInput.sendKeys("Put on GitLab");
    }

    @Then("I click Post button")
    public void i_click_post_button() throws InterruptedException {
        impl.getPage().postBtn.click();

        Thread.sleep(3000);

    }

    @Then("I should see Update announcement title")
    public void ishouldseeUpdate() throws InterruptedException {
        Thread.sleep(500);
        System.out.println(impl.getPage().announcementList.getText());
        Assert.assertEquals("Update test", impl.getPage().announcementList.getText());
        Thread.sleep(2000);
    }

    @Then("I should be able to delete announcement")
    public void iShouldBeAbleToDeleteAnnouncement() throws InterruptedException {
        impl.getPage().deleteBtn.click();
        Thread.sleep(2000);
    }


    @And("I should see Update announcement description")
    public void iShouldSeeUpdateAnnouncementDescription() {
        System.out.println(impl.getPage().descriptionList.getText());
        Assert.assertEquals("Put on GitLab Delete", impl.getPage().descriptionList.getText());
    }

    @Then("I click delete button")
    public void i_click_delete_button() throws InterruptedException {
        impl.getPage().deleteBtn.click();
        Thread.sleep(3000);
        WebDriverUtils.quitDriver();
    }

    @And("I should not be able to click Post button")
    public void iShouldNotBeAbleToClickPostButton() {
        impl.getPage().deleteBtn.isEnabled();
    }


    // Jack Testing
    @Then("Verify Announcement title should be Display")
    public void verify_announcement_title_should_be_display () throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().Title2));
        SeleniumUtils.moveElement(impl.getPage().Title2);
        SeleniumUtils.highlightElement(impl.getPage().Title2);
        CucumberLogUtils_ScreenShot.logPass("title is display", true);
        //CucumberLogUtils_ScreenShot.logInfo("title is display", true);
        List<WebElement> announcementTitle = impl.getPage().Title;
        for (int i = 0; i < announcementTitle.size(); i++) {
            Assert.assertTrue(announcementTitle.get(i).isDisplayed());
            System.out.println(announcementTitle.get(i).getText());
            Thread.sleep(2000);
        }

    }

    @Then("Verify Announcement message should be Display")
    public void verify_announcement_message_should_be_display () throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().Message2));
        SeleniumUtils.moveElement(impl.getPage().Message2);
        SeleniumUtils.highlightElement(impl.getPage().Message2);
        CucumberLogUtils_ScreenShot.logPass("message is display", true);
        List<WebElement> announcementMessage = impl.getPage().Message;
        for (int i = 0; i < announcementMessage.size(); i++) {
            Assert.assertTrue(announcementMessage.get(i).isDisplayed());
            System.out.println(announcementMessage.get(i).getText());
            Thread.sleep(2000);
        }
    }

    @Then("Verify Announcement timestamp should be Display")
    public void verify_announcement_timestamp_should_be_display () throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(impl.getPage().TimeStamp2));
        SeleniumUtils.moveElement(impl.getPage().TimeStamp2);
        SeleniumUtils.highlightElement(impl.getPage().TimeStamp2);
        CucumberLogUtils_ScreenShot.logPass("timestamp is display", true);
        List<WebElement> announcementTimeStamp = impl.getPage().TimeStamp;
        for (int i = 0; i < announcementTimeStamp.size(); i++) {
            Assert.assertTrue(announcementTimeStamp.get(i).isDisplayed());
            System.out.println(announcementTimeStamp.get(i).getText());
            Thread.sleep(2000);
        }
    }

    @When("I should see announcement list")
    public void iShouldSeeAnnouncementList () {
        impl.getPage().announcementList.getText();
    }

    @Then("I should not see Update announcement title")
    public void iShouldNotSeeUpdateAnnouncementTitle () {
        Assert.assertNotEquals("Update test", impl.getPage().announcementList.getText());
        WebDriverUtils.quitDriver();
    }


}


