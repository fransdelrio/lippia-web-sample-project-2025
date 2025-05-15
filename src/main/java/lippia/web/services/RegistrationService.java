package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.RegistrationConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationService extends ActionManager {

    public static void clickButton(String b) {
        switch (b){
            case "register":
                // Esperar hasta que el botón sea clickeable
                WebElement button = ActionManager.waitClickable(RegistrationConstants.REGISTRATION_REGISTER_BUTTON_XPATH);
                button.click(); // click(RegistrationConstants.REGISTRATION_REGISTER_BUTTON_XPATH);
                break;
            default:
                System.out.println("Button %s%n not defined!" + b);
        }

    }

    public static void enterPass(String pwd) {
        setInput(RegistrationConstants.REGISTRATION_TB_PASSWORD_ID, pwd);
    }

    public static boolean checkRegFailMsg(String msg) {
        WebElement element = DriverManager.getDriverInstance().findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li"));
        System.out.println("The element:  %s%n"+ element.getText());

        return true;
    }
}
