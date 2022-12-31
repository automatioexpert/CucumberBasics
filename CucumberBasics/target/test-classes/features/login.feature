Feature: Login
  
  In order to perform successful login
  As a user
  I want to enter correct username and password

  Scenario: In order to verify login to facebook
    Given user navigates to facebook website
    When user validates the homepage title
    Then user entered the username
    Then user entered the password
    Then user should be successfully logged in
