Feature: INTERN_12 Functionality
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Edit and Delete Nationalities
    And Click on the element in LeftNav
      | setup |
      | parameters |
      | nationalities |
    And Click on the element in Nationalities
      | addBtn |
    And User sending the keys in Nationalities
      | nameInput | ismetU1lask12 |
      | codeInput | i34asd34      |

