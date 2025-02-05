Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials from Excel
    Then the user should be redirected to the homepage
