Feature: Create a Salary Constants record, edit and Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a Salary Constants record, edit and Delete

    Then Navigate to Human Resources Left page
      | HumanResources      |
      | humanResSetupButton |
      | salaryConstants     |

    And Salary Constants  all click functions
      | addButton8 |
    When Create new Salary Constant Form Content Send Keys
      | nameInput1 | sabilivmat |
    And Salary Constants  form content all click functions
      | calenderButton |
      | calenderDatum  |
    When Create new Salary Constant Form Content Send Keys
      | keyInput   | tatva1 |
      | valueInput | 7      |
    And Salary Constants  form content all click functions
      | saveButton |
    Then Success message should be displayed
    And Salary Constants  all click functions
      | editButton |
    When Create new Salary Constant Form Content Send Keys
      | nameInput1 | Asvlna |
    And Salary Constants  form content all click functions
      | calenderButton |
      | calenderDatum2 |
    When Create new Salary Constant Form Content Send Keys
      | keyInput   | a1av1 |
      | valueInput | 4     |
    And Salary Constants  form content all click functions
      | saveButton |
    Then Success message should be displayed
    And Salary Constants  all click functions
      | deleteButton2 |
      | yesButton     |
    Then Success message should be displayed
