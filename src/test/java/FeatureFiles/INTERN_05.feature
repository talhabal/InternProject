Feature:create Positions Functionality

  Background:
    Given Navigate to Campus login page
    When  Enter username and password and click login button
    Then  User should login successfully


  Scenario: create to Positions Feature

    And click element in leftMenu in Positions
      | HumanResource |
      | SetUpHR       |
      | Position      |

    And click element in DialogContent in Positions
      | addButton |

    And sendKeys element in DialogContentin Positions
      | nameInput |Alim|
      | shortName |sucu|

    And click element in DialogContent in Positions
      | saveButton  |

    Then verify element in DialogContent in Positions

    And click element in DialogContent
      | addButton |

    And sendKeys element in DialogContent
      | nameInput |Alim|
      | shortName |sucu|

    And click element in DialogContent
      | saveButton  |

    Then Then Verify that the operation was unsuccessful


    And sendKeys element in DialogContent in Positions
      | nameSearch   | Alim |

    And click element in DialogContent in Positions
      | searchButton |
      | editButton   |

    And sendKeys element in DialogContent in Positions
      | nameInput   | Mehmet |
      | shortName | Alim |


    And click element in DialogContent in Positions
      | saveButton   |

    Then verify element in DialogContent in Positions

    And sendKeys element in DialogContent in Positions
      | nameSearch |mehmet|

    And click element in DialogContent in Positions
      | searchButton |
      | deleteButton |
      | deleteAgain  |

    Then verify element in DialogContent in Positions

    And sendKeys element in DialogContent
      | nameSearch |Mehmet|

    And click element in DialogContent
      | searchButton |

    Then Verify that the operation was unsuccessful in Table
