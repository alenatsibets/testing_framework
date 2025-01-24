Feature: User Registration
  Scenario: Successful Registration with All Fields Filled
    Given I am on the registration page
    When I fill the form
    And I press the Register button
    Then I should see a success message indicating successful registration "Your account was created successfully."