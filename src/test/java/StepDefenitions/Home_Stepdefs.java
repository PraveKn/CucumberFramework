package StepDefenitions;

import Pages.HomePage;
import io.cucumber.java.en.And;

public class Home_Stepdefs {
    @And("User click on the admin link")
    public void userClickOnTheAdminLink() {
        HomePage hp=new HomePage();
        hp.clickAdmin();

    }


}
