Feature: INTERN_11 Functionality

  Background:
    Given Navigate to Campus login page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Edit and Delete Discounts

    And Click on the element in LeftNav11
      | setup      |
      | parameters |
      | discounts  |

    And Click on the element in Dialog11
      | addButton |

    And User sending the keys in Dialog Content11
      | description     | group4Discount |
      | integrationCode | 1234           |
      | priority        | 2              |

    And Click on the element in Dialog11
      | integrationCode |

    And Click on the element in Dialog11
      | saveButton |

    Then Success message should be displayed11




    And Click on the element in Dialog11
      | addButton |

    And User sending the keys in Dialog Content11
      | description     | group4Discount |
      | integrationCode | 1234           |
      | priority        | 2              |

    And Click on the element in Dialog11
      | integrationCode |

    And Click on the element in Dialog11
      | saveButton |

    Then Already exist message should be displayed11



    And User sending the keys in Dialog Content11
      | descriptionSearch | group4Discount |

    And Click on the element in Dialog11
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog Content11
      | description | group4DiscountEdit |

    And Click on the element in Dialog11
      | saveButton |

    Then Success message should be displayed11




    And User delete item from Dialog Content11
      | descriptionSearch | group4DiscountEdit |

    Then Success message should be displayed11






    And User sending the keys in Dialog Content11
      | descriptionSearch | group4DiscountEdit |

    Then Click on the element in Dialog11
      | searchButton |

    Then No data message should be displayed11