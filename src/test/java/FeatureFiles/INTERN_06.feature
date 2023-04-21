Feature:INTERN_06_FUNCTION
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully
  Scenario: Create Subjects
    And Click on the element in LeftNavMenu
      | education |
      | setupEd |
      | subjectsCat |
    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | Education Example 1  |
      | codeInput | 658  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successfuly

    And Click on the element on the screen
      | addButton |
    And Enter a value for the input on the screen
      | nameInput | Education Example 1  |
      | codeInput | 658  |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was unsuccessful


    And Editing the user you added in the transaction
      | Education Example 1 |
    And Enter a value for the input on the screen
      | nameInput |  Example 2  |
    And click element in DialogContent
      | saveButton   |
    Then verify element in DialogContent

    And Find at pages and delete item
      |  nameSearch  |  Example 2  |
    Then Verify that the operation was successful

    And sendKeys element in DialogContent
      |  nameSearch  |  Example 2  |
    And click element in DialogContent
      | searchButton   |
    Then Verify that the operation was unsuccessful in Table
