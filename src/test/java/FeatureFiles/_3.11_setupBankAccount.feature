Feature: Create a  Bank Account  record, edit and Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario: Create a Bank Account t record, edit and Delete

    Then Navigate to Bank Account Left page
      | setupOne     |
      | parameters   |
      | bankAccounts |

    And Bank Account  all click functions
      | addButton9 |
    When Create new Bank Account Form Content Send Keys
      | nameInput2       | sabilivmata        |
      | ibanInput        | DE1245625432131354 |
      | integrationCode2 | 1313543            |
    And Bank Account  form content all click functions
      | currency   |
      | buttonUsd  |
      | saveButton |
    Then Success message should be displayed
    And Bank Account  all click functions
      | editButton |
    When Create new Bank Account Form Content Send Keys
      | nameInput2       | sabilivma        |
      | ibanInput        | DE12456584321313 |
      | integrationCode2 | 13132            |
    And Bank Account  form content all click functions
      | currency   |
      | buttonEuro |
      | saveButton |
    Then Success message should be displayed
    And Bank Account  all click functions
      | deleteButton2 |
      | yesButton     |
    Then Success message should be displayed
