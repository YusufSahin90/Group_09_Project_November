Feature: Create a Salary Types record edit and Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario: Create a Report  Exet Template  Edit and Delete

    Then Navigate to Human Resources Left page
      | HumanResources      |
      | humanResSetupButton |
      | salaryTypes         |
    When  Salary Types  all click functions
      | addButton6 |
    And Salary Types  all  send Keys functions
      | nameInput | Babta |
    When  Salary Types  all click functions
      | salaryType              |
      | administratorSalaryType |
      | saveButton              |
    Then Success message should be displayed
    When  Salary Types  all click functions
      | editButton1 |
    And Salary Types  all  send Keys functions
      | nameInput | Arabat |
    When  Salary Types  all click functions
      | salaryTypeCancelButton |
      | userSalaryType         |
      | saveButton             |
    Then Success message should be displayed
    And Salary Types  all  send Keys functions
      | nameInput4 | Arabat |

    When  Salary Types  all click functions
      | searchButton2 |
      | deleteButton  |
      | yesButton     |
    Then Success message should be displayed