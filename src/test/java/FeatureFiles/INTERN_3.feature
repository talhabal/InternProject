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
    And click outside select option
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful
    And Enter a value for the input on the screen
      | nameSearch | Excel Doc Types  |
    And Click on the element on the screen
      | searchButton |


    And Editing the user you added in the transaction
      | Excel Doc Types |
    Then Enter a value for the input on the screen
      | nameInput | PowerPoint Doc Types |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful

    And Find and delete to add data
      | nameSearch | PowerPoint Doc Types  |
    Then Verify that the operation was successful






