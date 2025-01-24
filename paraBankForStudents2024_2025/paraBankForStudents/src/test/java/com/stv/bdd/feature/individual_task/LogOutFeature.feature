Feature: LogOut Validation
  Scenario: Validate content after logging out
    Given I am logged in as a user
    When I click the LogOut button
    Then I should see the Login Button