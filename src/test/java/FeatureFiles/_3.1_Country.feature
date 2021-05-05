Feature: Country functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create Country

    And Navigate to country Left page
      | setupOne   |
      | parameters |
      | country    |
    And Navigate to Create a country Delete a country data entry click
      | addButton |

    When Create a country Delete a country
      | nameInput | avusturyar |
      | codeInput | 12113131   |

    And Navigate to Create a country Delete a country data entry click
      | saveButton |
    Then Success message should be displayed

    And Navigate to Create a country Delete a country data entry click
      | deleteButton |
      | yesButton    |






