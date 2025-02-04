package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice {

    WebDriver driver;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.saucedemo.com/");
    }

    @Then("user click on login button")
    public void userClickOnLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("user should see logout link")
    public void userShouldSeeLogoutLink() {
    }

    @When("user entered valid {string} and {string}")
    public void userEnteredValidAnd(String arg0, String arg1) {
        driver.findElement(By.id("user-name")).sendKeys(arg0);
        driver.findElement(By.id("password")).sendKeys(arg1);
    }
}
