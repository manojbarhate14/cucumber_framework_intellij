package stepDefinations;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseClass;
import utils.ConfigData;

import java.io.IOException;

public class StepDefFeature1 {
    WebDriver driver;
    BaseClass baseClass;
    String WebTest = ConfigData.redProp().getProperty("WebTest");


    public StepDefFeature1() throws IOException {
    }

    @Before
    public void invokeBrowser() throws IOException
    {
     driver = ConfigData.invokeBrowser();
     baseClass = new BaseClass(driver);
     driver.get(WebTest);

    }
    @Given("user navigate to home page")
    public void user_navigate_to_home_page() {
        driver.get(WebTest);
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
    @After
    public void tear_down()
    {
        driver.quit();
    }

}
