Feature: INTERN_12 Functionality
  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create,Edit and Delete Nationalities
    And Click on the element in LeftNavMenu
      | setup |
      | parameters |
      | nationalities |

    And Click on the element on the screen
      | addButton |

    And Enter a value for the input on the screen
      | nameInput | Porgesmoon |
    And Click on the element on the screen
      | saveButton |

    Then Verify that the operation was successful

    And Click on the element on the screen
      | addButton |

    And Enter a value for the input on the screen
      | nameInput | Porgesmoon |
    And Click on the element on the screen
      | saveButton |

    Then Verify that the operation was unsuccessful

    And Editing the user you added in the transaction
      | Porgesmoon |
    Then Enter a value for the input on the screen
      | nameInput | Porgesmodas |
    And Click on the element on the screen
      | saveButton |
    Then Verify that the operation was successful

    And Find and delete to add data
      | searchButton | Porgesmodas |


    Then Verify that the operation was successful
