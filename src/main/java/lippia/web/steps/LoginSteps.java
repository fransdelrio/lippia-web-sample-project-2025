package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccountService;
import lippia.web.services.RegistrationService;

public class LoginSteps extends PageSteps {

    @When("User enter email {string} in {string} textbox")
    public void userEnterEmail(String mail, String textbox) {
        LoginService.enterEmail(mail, textbox);
    }

    @And("User enter {string} in password textbox")
    public void userEnterPasswordInPasswordTextbox(String pwd) {
        LoginService.enterPass(pwd);
    }

    @And("User click on {string} button")
    public void userClickOnButton(String button) {
        switch (button){
            case "login":
                LoginService.clickButton(button);
                break;
            case "register":
                RegistrationService.clickButton(button);
                break;
            default:
                System.out.println("Button %s not defined!");
        }

    }

    @Then("User is successfully logged")
    public void userIsSuccessfullyLogged() {
        Assert.assertTrue(LoginService.checkUserLogged());
    }

    @Then("User is unsuccessfully logued")
    public void userIsUnsuccessfullyLogued() {
        Assert.assertTrue(LoginService.checkUserLogged());
    }




//    @And("El usuario presiona el botón {string}")
//    public void elUsuarioPresionaElBotón(String button) {
//        ClockifyLoginService.clickBotonContinuarConCorreo();
//    }
//
//    @And("El usuario ingresa código de verificación de email incorrecto")
//    public void elUsuarioIngresaCódigoDeVerificaciónDeEmailIncorrecto() {
//        ClockifyLoginService.ingresarCodVerifEmailIncorrecto();
//    }
//
//    @Then("El usuario visualiza el mensaje {string}")
//    public void elUsuarioVisualizaElMensaje(String msg) {
//        ///...
//    }
//
//    @When("User enter email {string}")
//    public void userEnterEmail(String arg0) {
//    }
//
//    @When("User enter email <mail> on Username or email address textbox")
//    public void userEnterEmailMailOnUsernameOrEmailAddressTextbox() {
//    }

}
