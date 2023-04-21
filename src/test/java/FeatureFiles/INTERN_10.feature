Feature: INTERN_10 Functionality
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Create,Edit and Delete Grade Levels
    And Click on the element in LeftNavMenu
      | setup |
      | parameters |
      | gradeLevels |
    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | 27th  |
      | shortName | cls27th  |
      | orderInput | 9 |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful

    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | 27th  |
      | shortName | cls27th  |
      | orderInput | 9 |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was unsuccessful


    And Find at pages and click
      |  27th  |
    And Enter a value for the input on the screen
      | nameInput | edit class 27th  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful


    And Click on the element on the screen
      | updateTableButton |
      | updateTableButton |
    And Find at pages and delete
      |  27th  |
    Then Verify that the operation was successful




