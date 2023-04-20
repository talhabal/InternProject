Feature: INTERN_8 Functionality
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Create,Edit and Delete School Departments
    And Click on the element in LeftNavMenu
      | setup |
      | schoolSetup |
      | departments |
    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | Math  |
      | codeInput | 569423  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful

    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | Math  |
      | codeInput | 569423  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was unsuccessful


    And Find at pages and click
      |  Math  |
    And Enter a value for the input on the screen
      | nameInput | mathematical  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful
    And Find at pages and delete
      |  mathematical  |
    Then Verify that the operation was successful


