Feature:INTERN_9 Functionality

  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete Bank Account
    And Click on the element in LeftNav
      | setup       |
      | parameters  |
      | bankAccount |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | sryBank |
      | IBANInput | 1234 5678 9876 5432 |

