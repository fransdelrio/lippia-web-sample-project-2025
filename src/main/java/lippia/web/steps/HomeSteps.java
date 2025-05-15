package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import lippia.web.services.HomeServices;
import java.util.Objects;

public class HomeSteps extends PageSteps {

    @Given("^User is on home page$")
    public void home() {
        HomeServices.goToHome();
    }

    @When("User clic {string} menu")
    public void userClicMenu(String menu) {
        HomeServices.clickButton(menu);
    }

    @Then("Home page contains only {string} {string}")
    public void homePageContainsOnly(String q, String element) {
        System.out.println(q + " of " + element + "?"); ////

        boolean ok = false;
        switch (element) {
            case "slides":
                ok = HomeServices.checkSlidesQuantity(q);
                break;
            case "new arrivals":
                ok = HomeServices.checkArrivalsQuantity(q);
                break;
            default:
                System.out.println("default unexpected value..."); ////
                throw new IllegalStateException("Unexpected value: " + element);
        }

        System.out.printf("_"); ////
        System.out.printf("Ok value -----> %s%n", ok); ////

        Assert.assertTrue(ok);
    }


/*
    @When("El usuario ingresa email {string}")
    public void elUsuarioIngresaEmail(String mail) {
        ClockifyLoginService.ingresarEmail(mail);
    }

    @And("El usuario presiona el botón {string}")
    public void elUsuarioPresionaElBotón(String button) {
        ClockifyLoginService.clickBotonContinuarConCorreo();
    }

    @And("El usuario ingresa código de verificación de email incorrecto")
    public void elUsuarioIngresaCódigoDeVerificaciónDeEmailIncorrecto() {
        ClockifyLoginService.ingresarCodVerifEmailIncorrecto();
    }

    @Then("El usuario visualiza el mensaje {string}")
    public void elUsuarioVisualizaElMensaje(String msg) {
        ///...
    }
*/
}
