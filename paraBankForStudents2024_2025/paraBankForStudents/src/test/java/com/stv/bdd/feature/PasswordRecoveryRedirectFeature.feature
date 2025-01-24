Feature: Password Recovery Redirect

  Scenario: User is redirected to the account validation page after clicking the password recovery link
    Given I am on the main page
    When I click on the password recovery link in the login form area
    Then I should be redirected to the password recovery page
    And the new page should contain the text "Customer Lookup"