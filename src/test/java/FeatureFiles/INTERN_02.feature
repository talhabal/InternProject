Feature: Create Attestations functionality

  Background:
    Given Navigate to Campus login page
    When  Enter username and password and click login button
    Then  User should login successfully


    Scenario: Login to Attestations categories features
      And Click element in Menu
      |   HumanRes     |
      |   setupHR        |
      |   ATSN |
      And Click element in Dialog
      | add |
      And Enter a value on the screen
      |  inputATT | Yasin |
      And Click element in Dialog
        | save |
      And Verify that the operation
      And Enter a value on the screen
        |  srcInput | Yasin |
      And Click element in Dialog
        | searchButton |
      And Click element in Dialog
        | edit |
      And Enter a value on the screen
        |  inputATT | Yasin Yasa |
      And Click element in Dialog
        | save |
      And Verify that the operation
      And Enter a value on the screen
        |  srcInput | Yasin Yasa |
      And Click element in Dialog
        | delete |
        | deleteModal |
      And Verify that the operation






