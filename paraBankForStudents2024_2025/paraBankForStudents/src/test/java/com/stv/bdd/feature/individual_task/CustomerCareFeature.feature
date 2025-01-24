Feature: Email Button Validation (CustomerCare)
  Scenario: Verify that Name field is empty when Email button is clicked
    Given I am on the Overview page
    When I click the Email button
    Then the Name field should be empty
