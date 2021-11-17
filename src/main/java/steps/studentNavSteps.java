package steps;

import impl.HomeImpl;
import impl.studentNavImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class studentNavSteps {
    studentNavImpl impl = new studentNavImpl();

    @Then("I click {string} button")
    public void i_click_button(String button) {
       impl.clickButton(button);
    }

   @Then("I should be able to see Homework button is displayed")
   public void i_should_be_able_to_see_homeworks_button() {
       Assert.assertTrue(impl.getPage().HomeworkLink.isDisplayed());
   }



    @Then("I should be able to see title of the page as {string}")
   public void i_should_be_able_to_see_title_of_the_page_as(String expectedTitle) {
        Assert.assertEquals(expectedTitle, impl.getTitle());
        System.out.println(impl.getTitle());

    }

   @Then("I should be able to see Meeting Links  button is displayed")
    public void i_should_be_able_to_see_meetings_links_button() throws InterruptedException {
       Assert.assertTrue(impl.getPage().MeetingsLink.isDisplayed());
    }

    @Then("i click homework")
    public void iClickHomework() {
        impl.getPage().HomeworkLink.click();
    }
}
