Feature: INTERN 7 Functionality
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create,Edit and Delete School Locations
    And Click on the element in LeftNavMenu
      | setup |
      | schoolSetup |
      | locations |
    And Click on the screen
      | addButton |
    And Enter a value for the input
      | nameInput      | Bursa |
      | shortName | Nilüfer |
      | capacity        | 50  |
    And Click on the screen
      | inputLctTypeValue |
      | laboratory |
      | saveButton |
    Then Verify that the operation was successful
    And Click on the screen
      | addButton |
    And Enter a value for the input
      | nameInput      | Bursa |
      | shortName | Nilüfer |
      | capacity        | 50  |
    And Click on the screen
      | inputLctTypeValue |
      | laboratory |
      | saveButton |
    Then Verify that the operation was unsuccessful
    And Click on the screen
      | orderBtn |
      | orderBtn |
    And Find at pages and click
      |  Nilüfer  |
    And Enter a value for the input
      | nameInput | Osmangazi  |
    And Click on the screen
      | saveButton |
      | orderBtn |
      | orderBtn |
    And Find at pages and delete
      |  Osmangazi  |
    Then Verify that the operation was successful

