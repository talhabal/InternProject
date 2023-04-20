Feature: INTERN_8 Functionality
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Create,Edit and Delete School Departments
    And Click on the element in LeftNavMenuu
      | setup |
      | schoolSetup |
      | departments |
    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | İngilizce  |
      | codeInput | 152  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful

    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | İngilizce  |
      | codeInput | 152  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was unsuccessful


    And Find at pages and click
      |  İngilizce  |
    And Enter a value for the input on the screen
      | nameInput | fizik  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful



