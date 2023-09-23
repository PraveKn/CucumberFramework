package StepDefenitions;

import Pages.SearchAdminRoles;
import io.cucumber.java.en.And;

public class SearchAdminRoles_Stepdefs {
    @And("User search for the admin roles {string}")
    public void userSearchForTheAdminRoles(String arg0) throws InterruptedException {
        SearchAdminRoles sar=new SearchAdminRoles();
        sar.AdminSearch();
    }
}
