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
    #Then Verify that the operation was successfuly

#    And Click on the element on the screen
#      | addButton |
#    And Enter a value for the input on the screen
#      | nameInput | Education Example 1  |
#      | codeInput | 658  |
#    And Click on the element on the screen
#      | saveButton |
#    Then Verify that the operation was unsuccessfuly


    And Enter a value for the input on the screen
      | nameSearch | Education Example 1  |
    And Click on the element on the screen
      | searchButton |

    And Click on the element on the screen
     |  editButton|
    And Enter a value for the input on the screen
      | nameInput |  Example 2  |
    And Click on the element on the screen
      | saveButton  |
      | deleteButton  |
      | deleteAgain |

