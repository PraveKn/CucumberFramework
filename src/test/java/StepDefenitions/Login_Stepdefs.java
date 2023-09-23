package StepDefenitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Stepdefs {
    LoginPage lp=new LoginPage();
    @Given("User is on the login page of the application")
    public void userIsOnTheLoginPageOfTheApplication() {
        lp.InitializeDriverandCallUrl();
    }

    @When("User tries to login the application with username as {string} and password as {string}")
    public void userTriesToLoginTheApplicationWithUsernameAsAndPasswordAs(String username, String password) {
        lp.LoginCredens(username,password);
    }

    @Then("User should be succesfully login to the application")
    public void userShouldBeSuccesfullyLoginToTheApplication() {
        lp.VerifyPageURL();
    }


}
