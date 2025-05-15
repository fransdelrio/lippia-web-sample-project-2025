package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeServices extends ActionManager {

    public static void clickButton(String menu) {
        ///System.out.println("Click on button: " + menu);

        switch (menu) {
            case "Home":
                click("id:site-logo");
                break;
            case "MyAccount":
                click("id:menu-item-50");
                break;
            case "Shop":
                click("id:menu-item-40");
                break;
            default:
                System.out.println("Menu not found");
                break;
        }

    }

    public static void goToHome() {
        navigateTo(HomeConstants.HOME_URL);
    }

    public static boolean checkSlidesQuantity(String q) {
        List<WebElement> elementList = DriverManager.getDriverInstance().findElements(new By.ByXPath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div"));//  //*[@id=\"n2-ss-6\"]/div[1]/div/div"));

        System.out.println("Slides List size: " + elementList.size()); ////
        for (WebElement element : elementList) { ///////////////////////////////////////////////////
            System.out.print(element.getText() + " "); // Imprime el texto de cada elemento
        }

        return Integer.parseInt(q) == elementList.size();
    }

    public static boolean checkArrivalsQuantity(String q) {
        List<WebElement> elementList = DriverManager.getDriverInstance().findElements(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]"));

        System.out.println("Arrivals List size: " + elementList.size()); ////
        for (WebElement element : elementList) { ///////////////////////////////////////////////////
            System.out.print(element.getText() + " "); // Imprime el texto de cada elemento
        }

        return Integer.parseInt(q) == elementList.size();
    }

   /* public static void ingresarEmail(String mail) {
        setInput(ClockifyLoginConstants.LOGIN_EMAIL_ID, mail);
    }

    public static void clickBotonContinuarConCorreo() {
        click(ClockifyLoginConstants.LOGIN_CONTINUE_BUTTON_XPATH);
    }

    public static void ingresarCodVerifEmailIncorrecto() {
        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[1]/div/input", "0");
        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[2]/div/input", "0");
        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[3]/div/input", "0");
        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[4]/div/input", "0");
        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[5]/div/input", "0");
        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[6]/div/input", "0");
    }
*/

}
