package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccountService;
import lippia.web.services.RegistrationService;

public class MyAccountSteps {

    @And("User click on {string} link")
    public void userClickOnLink(String lnk) {
        switch (lnk) {
            case "addresses":
            case "address-shipping-edit":
            case "logout":
            case "save-address":
                MyAccountService.clickButtonOrLink(lnk);
                break;

            default:
                System.out.println("Button %s not defined!");
        }
    }


    @And("User enter name {string} lastname {string} street {string} city {string} and zipcode {string}")
    public void userEnterAddressData(String fname, String lname, String street, String city, String zip) {
        MyAccountService.enterAddressData(fname, lname, street, city, zip);
    }


    @Then("User receives message {string}")
    public void userReceivesMessage(String msg) {
        Assert.assertTrue(MyAccountService.checkMsg(msg));
    }

    @Then("User successfully comes out from the site")
    public void userSuccessfullyComesOutFromTheSite() {
        Assert.assertTrue(MyAccountService.checkLogout());
    }
}