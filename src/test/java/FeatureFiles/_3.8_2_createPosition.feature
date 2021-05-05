Feature: Create a Position

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a Position  Edit and Delete

    Then Navigate to Human Resources Left page
      | HumanResources      |
      | humanResSetupButton |
      | positions           |

    And Navigate  to Position and click function
      | addButton |
    When Create a new Position Subject send Keys
      | nameInput | Java Group912     |
      | shortName | Selenium Group923 |
    And  Navigate  to Position and click function
      | saveButton |
    And Success message should be displayed
    And Navigate  to Position and click function
      | editButton |
    When Create a new Position Subject send Keys
      | nameInput | Java Grouppe |
      | shortName | Selenium G   |
    And Navigate  to Position and click function
      | saveButton |
    And Success message should be displayed
    And Navigate  to Position and click function
      | deleteButton2 |
      | yesButton     |
    And Success message should be displayed
