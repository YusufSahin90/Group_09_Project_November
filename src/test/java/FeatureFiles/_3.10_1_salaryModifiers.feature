Feature: Create a Salary Modifiers record, edit and Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a Salary Modifiers record, edit and Delete

    Then Navigate to Human Resources Left page
      | HumanResources      |
      | humanResSetupButton |
      | salaryModifiers     |

    And Salary Modifiers  all click functions
      | addButton7 |
    When Create new Salary Modifiers Form Content Send Keys
      | description     | okul taksiti |
      | variable        | 153          |
      | integrationCode | 1525152      |
      | priority        | 13           |
      | amount          | 30050        |
    And Salary Modifiers  form content all click functions
      | formContentAddButton |
    When Create new Salary Modifiers Form Content Send Keys
      | formContentname | asdfa |
      | formulaVariable | 14    |
    And Salary Modifiers  form content all click functions
      | applyButton |
      | saveButton  |
    Then Navigate to Human Resources Left page
      | HumanResources      |
      | humanResSetupButton |
      | salaryModifiers     |
    And Salary Modifiers  all click functions
      | editButton |
    When Create new Salary Modifiers Form Content Send Keys
      | description     | okul taksiti1 |
      | variable        | 1531          |
      | integrationCode | 15251521      |
      | priority        | 131           |
      | amount          | 300501        |
    And Salary Modifiers  form content all click functions
      | formContentAddButton |
    When Create new Salary Modifiers Form Content Send Keys
      | formContentname | asdfal |
      | formulaVariable | 152    |
    And Salary Modifiers  form content all click functions
      | applyButton |
      | saveButton  |
    Then Navigate to Human Resources Left page
      | HumanResources      |
      | humanResSetupButton |
      | salaryModifiers     |
    And Salary Modifiers  all click functions
      | deleteButton2 |
      | yesButton     |