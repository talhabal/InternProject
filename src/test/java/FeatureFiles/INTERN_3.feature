Feature: INTERN_3 Functionality
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Create,Edit and Delete Document Types
    And Click on the element in LeftNavMenu
      | setup |
      | parameters |
      | DocumentTypes |
    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | Excel Doc Types  |
    And Click on the element on the screen
      | stageSelect |
      | examSelectOption |
      | saveButton |
    
    Then Verify that the operation was successful
    And Click on the element on the screen
      | addButton |
      And Enter a value for the input on the screen
        | nameInput | Excel Doc Types  |
    And Click on the element on the screen
      | stageSelect |
      | examSelectOption |
      | stageSelect |
      | saveButton |
    Then Verify that the operation was unsuccessful
    And Enter a value for the input on the screen
      | searchInput | Excel Doc Types  |
    And Click on the element on the screen
      | searchButton |
    And Click on the element in Dialog
      | editButton  |
    And Enter a value for the input on the screen
      | nameInput | PowerPoint Doc Types  |
    And Click on the element in Dialog
      | saveButton  |
    Then Verify that the operation was successful
    And Click on the element in Dialog
      | deleteButton  |
    And Enter a value for the input on the screen
      | searchInput | Excel Doc Types  |
    And Click on the element on the screen
      | searchButton |
    Then Verify that the operation was unsuccessful in Table





