Feature: INTERN_12 Functionality
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Nationalities
    And Click on the element in LeftNavMenu
      | setup |
      | parameters |
      | nationalities |
