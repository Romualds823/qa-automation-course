Feature: 1a.lv registration
  Scenario: Success registration test
   Given user name: "Roma"
    And user last name: "Tester"
    And user email: "123@test.lv"
    And new password is "Qwerty123"

    When we open browser window
    And we open home page
    And we accept cookies
    And we are pressing Registration - Login button
    And we are opening registration form
    And we are filling in registration form

    #Then validation errors count is 1
   #And wrong password message appears