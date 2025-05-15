@Registration
Feature: Registration

  Background:
    Given User is on home page

    @RegisterSuccess @RegisterTest1
    Scenario Outline: Registration-Sign-in
      When User clic "MyAccount" menu
      And User enter email <mail> in <textbox> textbox
      And User enter <password> in reg-password textbox
      And User click on "register" button
      Then User is successfully logged
      Examples:
        | mail                       | password              | textbox          |
        | "testregister9@gmail.com"  | "abc1234.Prueba7890"  | "Email address"  |
        | "testregister10@gmail.com" | "abc1234.Prueba0987"  | "Email address"  |


    @RegisterFail @RegisterTest2  @RegisterTest3
    Scenario Outline: Registration with invalid & empty email ID
      When User clic "MyAccount" menu
      And User enter email <mail> in <textbox> textbox
      And User enter <password> in reg-password textbox
      And User click on "register" button
      Then Registration fails with <msg> message
      Examples:
        | mail              | password                  | textbox          | msg                                              |
        | "invalid@mailID"  | "a1B2c3.Test456789"       | "Email address"  | "Error: Please provide a valid email address."   |
        | " "               | "a1B2c3.Test.emptyMailID" | "Email address"  | "Error: Please provide a valid email address."   |


