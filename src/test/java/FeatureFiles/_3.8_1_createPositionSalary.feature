Feature: Create a Position Salary

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a Position Salary Edit and Delete

    Then Navigate to Human Resources Left page
      | HumanResources      |
      | humanResSetupButton |
      | positionSalary      |
    And  Navigate  to Salary and click functions
      | addButton |
    When Send to Salary Keys
      | nameInput3 | 1Mretlgasfhhdcdf |
    And  Navigate  to Salary and click functions
      | saveButton |
    Then Success message should be displayed
    And  Navigate  to Salary and click functions
      | editButton |
    When Send to Salary Keys
      | nameInput3 | 1Mefftrdoshdrd |
    And  Navigate  to Salary and click functions
      | saveButton |
    Then Success message should be displayed
    And Delete Subject Categories
      | deleteButton2 |
      | yesButton     |
    Then Success message should be displayed
