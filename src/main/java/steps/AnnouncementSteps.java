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
    public void iInputAnnouncement(){
        impl.getPage().announcementInput.sendKeys("Put on GitLab");
    }

    @Then("I click Post button")
    public void i_click_post_button() {
        impl.getPage().postBtn.click();
    }

    @Then("I should see Update announcement")
    public void ishouldseeUpdate() throws InterruptedException {
        System.out.println(impl.getPage().announcementList.getText());
           Assert.assertEquals("Update test", impl.getPage().announcementList.getText());
    }

    @Then("I click delete button")
    public void i_click_delete_button() {
        impl.getPage().deleteBtn.click();

    }



}
