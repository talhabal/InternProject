Feature:INTERN_9 Functionality

  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete Bank Account
    And Click on the element in LeftNav
      | setup       |
      | parameters  |
      | bankAccount |
