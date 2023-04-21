Feature:INTERN_9 Functionality

  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create and Delete Bank Account
    And Click on the element in LeftNav
      | setup        |
      | parameters   |
      | bankAccounts |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | group4Bank          |
      | ibanInput | 1234 5678 9876 5432 |

    And Click on the element in Dialog
      | currency  |
      | currency1 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed




    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | group4Bank          |
      | ibanInput | 1234 5678 9876 5432 |

    And Click on the element in Dialog
      | currency  |
      | currency1 |

    And Click on the element in Dialog
      | saveButton |

    Then Already exist message should be displayed





    And User sending the keys in Dialog Content
      | nameSearch | group4Bank |

    Then Click on the element in Dialog
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog Content
      | nameInput | group4BankEdit |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed



    And User delete item from Dialog Content
      | nameSearch | group4BankEdit |

    Then Success message should be displayed




    And User sending the keys in Dialog Content
      | nameSearch | group4DiscountEdit |

    Then Click on the element in Dialog
      | searchButton |

    Then No data message should be displayed

