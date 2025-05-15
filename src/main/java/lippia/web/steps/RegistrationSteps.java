package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import lippia.web.services.LoginService;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {

    @And("User enter {string} in reg-password textbox")
    public void userEnterPasswordInRegPasswordTextbox(String pwd) {
        RegistrationService.enterPass(pwd);
    }

    @Then("Registration fails with {string} message")
    public void registrationFailsWithMsgMessage(String msg) {

        Assert.assertTrue( RegistrationService.checkRegFailMsg(msg) );
    }

}
