Feature: User Login
  Scenario Outline: Successful Login with Valid Credentials
    Given I am Log Out
    When I enter <username> into the username field
    And I enter <password> into the password field
    And I press the Login button in the login form area
    Then I should be redirected to the home page
    And the page should contain the text "Accounts Overview"

    Examples:
      | username   | password    |
      | nsakcn      | nsakcn       |
      | johndoe1234 | password123 |
