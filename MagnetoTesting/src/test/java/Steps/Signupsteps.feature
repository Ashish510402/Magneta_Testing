Feature: Account Creation and Sign In

  Scenario: Create an account and sign in with valid credentials
    Given launch the Browser
    When Click on create an Account button
    And Enter first name "miltons", last name "user", email "milto3@gmail.com", password "Testuse@123", confirmpassword = "Testuse@123"
    Then Click on the logout
    And Click on the Sign out


  Scenario: Login with existing email id
    Given launch the Browser
    When Click on Sign In button
    And Enter email "milt03@gmail.com" , password "Testuse@123"

