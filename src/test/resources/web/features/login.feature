@Login
Feature: Login

    Background:
        Given User is on home page

    @LoginSuccess @LoginTest1
    Scenario Outline: Registered user success login
        When User clic "MyAccount" menu
        When User enter email <mail> in <textbox> textbox
        And User enter <password> in password textbox
        And User click on "login" button
        Then User is successfully logged
        Examples:
            | mail                  | password          | textbox                       |
            | "fc.mlibre@gmail.com" | "1234.Prueba"     | "Username or email address"   |


    @LoginFail @LoginTest2 @LoginTest3 @LoginTest4
    Scenario Outline: Login failed Tests 2, 3, 4 and 5
        When User clic "MyAccount" menu
        When User enter email <mail> in <textbox> textbox
        And User enter <password> in password textbox
        And User click on "login" button
        Then User is unsuccessfully logued
        Examples:
            | mail                          | password          | textbox                       |
            | "itsnotcorrect@testmail.com"  | "1234"            | "Username or email address"   |
            | "fc.mlibre@gmail.com"         | " "               | "Username or email address"   |
            | " "                           | "1234"            | "Username or email address"   |
            | " "                           | " "               | "Username or email address"   |
