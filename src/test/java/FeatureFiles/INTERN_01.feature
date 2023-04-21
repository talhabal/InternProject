Feature:create Position Categories Functionality

  Background:
    Given Navigate to Campus login page
    When  Enter username and password and click login button
    Then  User should login successfully

  Scenario: Login to Position Categories Feature


    And click element in leftMenu
      | HumanResource       |
      | SetUpHR             |
      | PositionsCategories |

    And click element in DialogContent
      | addButton |
    And sendKeys element in DialogContent
      | nameInput |Alim|
    And click element in DialogContent
      | saveButton  |
    Then verify element in DialogContent

    And click element in DialogContent
      | addButton |
    And sendKeys element in DialogContent
      | nameInput |Alim|
    And click element in DialogContent
      | saveButton  |
    Then Then Verify that the operation was unsuccessful

    And Editing the user you added in the transaction
      | Alim |
    And sendKeys element in DialogContent
      | nameInput |mehmet|
    And click element in DialogContent
      | saveButton   |
    Then verify element in DialogContent

    And Find at pages and delete item
      |  nameSearch  |  mehmet  |
    Then Verify that the operation was successful

    And sendKeys element in DialogContent
      |  nameSearch  |  mehmet  |
    And click element in DialogContent
      | searchButton   |
    Then Verify that the operation was unsuccessful in Table
