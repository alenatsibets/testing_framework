Feature: Update Contact Info Validation
  Scenario: Validate content on Update Contact Info page
    Given I am logged in as a user
    When I navigate to the Update Contact Info page
    Then I should be redirected to Update Contact Page
    And I should see the Update Profile Button