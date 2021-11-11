package steps;

import impl.AccesMngImpl;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccesMngSteps {
    AccesMngImpl impl = new AccesMngImpl();

    @When("I input {string} to the {string} field")
    public void i_input_to_the_field(String value, String inputField) {
        impl.InputField(value, inputField);
    }

    @Then("I click Manage Access button")
    public void iClickManageAccessButton() {

    }
}
