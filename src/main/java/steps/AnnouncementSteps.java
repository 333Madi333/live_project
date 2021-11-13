package steps;

import impl.AnnouncementImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class AnnouncementSteps {
    AnnouncementImpl impl = new AnnouncementImpl();

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
    }

    @Then("I should see Update announcement description")
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


    @When("I should see announcement list")
    public void iShouldSeeAnnouncementList() {
        impl.getPage().announcementList.getText();
    }

    @Then("I should not see Update announcement title")
    public void iShouldNotSeeUpdateAnnouncementTitle() {
        Assert.assertNotEquals("Update test", impl.getPage().announcementList.getText());
        WebDriverUtils.quitDriver();
    }
}
