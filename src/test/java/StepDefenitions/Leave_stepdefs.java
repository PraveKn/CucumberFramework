package StepDefenitions;

import Pages.LeavePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Leave_stepdefs {
    LeavePage LV = new LeavePage();

    @Given("User is leave page of the application")
    public void userIsLeavePageOfTheApplication() {
        LeavePage.InitializeDriverandCallURL1();
    }

    @And("user  clicking on leave button")
    public void userClickingOnLeaveButton() throws InterruptedException {

        LV.navigateleave();

    }



//    @And("user search for leave role")
//    public void userSearchForLeaveRole() {
//        SearchLeave SL = new SearchLeave();
//        SL.
//    }
}
