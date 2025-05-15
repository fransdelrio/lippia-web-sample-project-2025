package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.MyAccountConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;

public class MyAccountService {

    public static void clickButtonOrLink(String b) {

        switch (b) {
            case "addresses":
                click(MyAccountConstants.MYACCOUNT_ADDRESSES_LINK_XPATH);
                break;
            case "address-shipping-edit":
                click(MyAccountConstants.MYACCOUNT_SHIPADDRESSES_EDIT_LINK_XPATH);
                break;
            case "save-address":
                click(MyAccountConstants.MYACCOUNT_SHIPADDRESS_BUTTON_SAVE_XPATH);
                break;
            case "logout":
                click(MyAccountConstants.MYACCOUNT_LOGOUT_LINK_XPATH);
                break;

            default:
                System.out.println("Button or link %s%n not found!" + b);
                break;
        }
    }

    public static void enterAddressData(String fname, String lname, String street, String city, String zip) {
        setInput(MyAccountConstants.MYACCOUNT_SHIPADDRESS_TB_FNAME_ID, fname);
        setInput(MyAccountConstants.MYACCOUNT_SHIPADDRESS_TB_LNAME_ID, lname);
        setInput(MyAccountConstants.MYACCOUNT_SHIPADDRESS_TB_STREET_ID, street);
        setInput(MyAccountConstants.MYACCOUNT_SHIPADDRESS_TB_CITY_ID, city);
        setInput(MyAccountConstants.MYACCOUNT_SHIPADDRESS_TB_ZIPCODE_ID, zip);
    }


    public static boolean checkMsg(String msg) {
//        WebElement shipMsg = ActionManager.waitPresence(MyAccountConstants.MYACCOUNT_SHIPADDRESS_MSG_XPATH);
//        System.out.println("Shipping Address Text :::::> " + shipMsg.getText());

        WebElement element = DriverManager.getDriverInstance().findElement(By.cssSelector(MyAccountConstants.MYACCOUNT_SHIPADDRESS_MSG_CSSSELECTOR));
        System.out.println("The Shipping address message text:  %s%n"+ element.getText());

        return msg.equals(element.getText());
    }

    public static boolean checkLogout() {
        WebElement element = DriverManager.getDriverInstance().findElement(By.xpath(MyAccountConstants.MYACCOUNT_REGISTER_FORM_XPATH));
        return element.isDisplayed();
    }

}
