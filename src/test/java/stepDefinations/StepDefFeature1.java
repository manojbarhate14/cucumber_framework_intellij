package stepDefinations;
import io.cucumber.java.en.*;

public class StepDefFeature1 {

    @Given("user navigate to home page")
    public void user_navigate_to_home_page() {
        System.out.println("first line");
    }
    @When("enter the deatils in form")
    public void enter_the_deatils_in_form() {
        System.out.println("second line");
    }
    @Then("click on submit button")
    public void click_on_submit_button() {
        System.out.println("Third line");
    }
    @Then("verify the successfully {string} message and close the window")
    public void verify_the_successfully_message_and_close_the_window(String string) {

    }
}
