package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class _01_LoginSteps {

    WebDriver driver;
    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {

        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button() {

        DialogContent dialogContent = new DialogContent();


        dialogContent.findElementAndSendKeysFunction("username", "**********");

        dialogContent.findElementAndSendKeysFunction("password", "**********");


        //dialogContent.loginButton.click();
        dialogContent.findElementAndClickFunction("loginButton");

        //dialogContent.gotItBtn.click();
        dialogContent.findElementAndClickFunction("gotItBtn");

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

}
