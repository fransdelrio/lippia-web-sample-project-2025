package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;

public class LoginService extends ActionManager {

    public static void enterEmail(String mail, String textbox) {
        switch (textbox) {
            case "Username or email address":
                setInput(LoginConstants.LOGIN_TB_USERNAME_OR_EMAIL_ID, mail);
                break;
            case "Email address":
                setInput(LoginConstants.LOGIN_TB_REG_EMAIL_ID, mail);
                break;
            default:
                System.out.println("Textbox %s not found!" + textbox);
                break;
        }

    }

    public static void enterPass(String pwd) {
        setInput(LoginConstants.LOGIN_TB_PASSWORD_ID, pwd);
    }

    public static void clickButton(String b) {

        switch (b) {
            case "login":
                click(LoginConstants.LOGIN_LOGIN_BUTTON_XPATH);
                break;

            default:
                System.out.println("Button not found!");
                break;
        }
    }

    public static boolean checkUserLogged() {
        return isPresent(LoginConstants.MY_ACCOUNT_PROFILE_PAGE_ID);
    }




//    public static void clickBotonContinuarConCorreo() {
//        click(ClockifyLoginConstants.LOGIN_CONTINUE_BUTTON_XPATH);
//    }
//
//    public static void ingresarCodVerifEmailIncorrecto() {
//        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[1]/div/input", "0");
//        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[2]/div/input", "0");
//        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[3]/div/input", "0");
//        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[4]/div/input", "0");
//        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[5]/div/input", "0");
//        setInput("/html/body/app-root/app-auth-login-layout/div/div/div[2]/app-auth-otp-code-input/div/div/div[2]/div[2]/verification-code-input/form/div/div[6]/div/input", "0");
//    }


}
