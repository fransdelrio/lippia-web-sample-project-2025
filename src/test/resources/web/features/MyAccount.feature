@MyAccount
Feature: Login

  Background:
    Given User is on home page

  @EditAddress @MyAccountTest6
  Scenario Outline: Edit and save address
    When User clic "MyAccount" menu
    When User enter email <mail> in <textbox> textbox
    And User enter <password> in password textbox
    And User click on "login" button
    Then User is successfully logged
    When User click on "addresses" link
    When User click on "address-shipping-edit" link
    And User enter name <firstname> lastname <lastname> street <street> city <city> and zipcode <zip>
    And User click on "save-address" link
    Then User receives message "Address changed successfully."

    Examples:
      | mail                  | password          | textbox                       | firstname | lastname  | street      | city     | zip      |
      | "user@registered.com" | "1234.Prueba-"    | "Username or email address"   | "John"    | "Smither" | "Street Six"| "Dallas" | "D06006" |


  @Logout @MyAccountTest8
  Scenario Outline: Edit and save address
    When User clic "MyAccount" menu
    When User enter email <mail> in <textbox> textbox
    And User enter <password> in password textbox
    And User click on "login" button
    Then User is successfully logged
    When User click on "logout" link
    Then User successfully comes out from the site

    Examples:
      | mail                    | password          | textbox                     |
      | "myuser@registered.com" | "1234.Prueba-"    | "Username or email address"   |
