Feature: Fields Functionality
  Background:
    Given Navigate to Campus login page
    When  Enter username and password and click login button
    Then  User should login successfully

  Scenario: Add, Edit and Delete Field
    And Navigate to fields page
    When Add a field
    Then Success message should be displayed

    And Add a field
    Then Then Verify that the operation was unsuccessful

    And Edit a exist field
    Then Success message should be displayed

    And Delete field
    Then Success message should be displayed
