Feature: Create a Report Exel Template

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a Report  Exet Template  Edit and Delete

    Then Navigate to Reports Resources Left page
      | Reports       |
      | reportsSetup  |
      | ExcelTemplate |
    When Navigate  to Exel Template and click functions
      | addButton5 |
    And Create a new Report Exel Subject send Keys
      | nameInput | Posche ABCDEf |
    When Navigate  to Exel Template and click functions
      | saveButton |
    And Create a new Report Exel Subject send Keys
      | rowSize    | 15 |
      | columnSize | 15 |
    When Navigate  to Exel Template and click functions
      | addVersion |
      | saveButton |
    Then Success message should be displayed
    When Navigate  to Exel Template and click functions
      | closeDialog |
    And Create a new Report Exel Subject send Keys
      | searchInput | Posche ABCDEf |
    When Navigate  to Exel Template and click functions
      | searchButton |
      | editButton1  |
    And Create a new Report Exel Subject send Keys
      | nameInput | Posche GTE |
    When Navigate  to Exel Template and click functions
      | saveButton  |
      | closeDialog |
    Then Success message should be displayed
    And Create a new Report Exel Subject send Keys
      | searchInput | Posche GTE |
    When Navigate  to Exel Template and click functions
      | searchButton  |
      | deleteButton2 |
      | yesButton     |
