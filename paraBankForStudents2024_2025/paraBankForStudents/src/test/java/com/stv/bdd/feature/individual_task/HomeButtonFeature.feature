Feature: Footer Visibility and Home Page Content Validation

  Scenario: Ensure footer is visible
    Given I am logged in
    When I scroll down to the bottom of the page
    Then the footer panel should be visible

  Scenario: Validate Home page content
    Given I am logged in
    When I click Home link
    Then I should see the "Latest News" title

  Scenario: Validate that nothing changed on the Home page
    Given I am logged in
    When I click Home link
    Then the Home page url should remain unchanged
    And I should see the "Latest News" title