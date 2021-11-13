package steps;

import impl.HomeImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.util.List;


public class HomeSteps {
    HomeImpl impl = new HomeImpl();


    @Then("Verify Announcement title should be Display")
    public void verify_announcement_title_should_be_display() {
        List<WebElement> announcementTitle = impl.getPage().Title;
        for (int i = 0; i < announcementTitle.size(); i++) {
            Assert.assertTrue(announcementTitle.get(i).isDisplayed());
        }

    }

    @Then("Verify Announcement message should be Display")
    public void verify_announcement_message_should_be_display() {
        List<WebElement> announcementMessage = impl.getPage().Message;
        for (int i = 0; i < announcementMessage.size(); i++) {
            Assert.assertTrue(announcementMessage.get(i).isDisplayed());

        }
    }

    @Then("Verify Announcement timestamp should be Display")
    public void verify_announcement_timestamp_should_be_display() {
        List<WebElement> announcementTimeStamp = impl.getPage().TimeStamp;
        for (int i = 0; i < announcementTimeStamp.size(); i++) {
            Assert.assertTrue(announcementTimeStamp.get(i).isDisplayed());
        }
    }
}