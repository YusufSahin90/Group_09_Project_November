Feature: City functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button

  @RegressionTest
  Scenario: Create City


    And Navigate to City Left page
      | setupOne   |
      | parameters |
      | Cities     |
    And  city add , save and delete click
      | addButton |
      | addBttn2  |

    When Create a City  send data input a country and cityName
      | nameInput2 | Deutschla7nda |
      | codeInput  | 12345665a     |
    And  city add , save and delete click
      | saveButton2 |
      | closeDialog |

    And  city add , save and delete click
      | deleteButton |
      | yesButton    |
      | closeDialog  |
    Then Success message should be displayed
