Feature: Create a Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a Subject Categories

    Then Navigate to Education Left page
      | education         |
      | setupEducation    |
      | subjectCategories |
    And  Navigate a new Subject Category and save
      | addButton |

    When Create a new Subject Category
      | nameInput | Antep11112 |
      | codeInput | 121213232  |
    And  Navigate a new Subject Category and save
      | saveButton |
    Then User should login successfully
    And Delete Subject Categories
      | deleteButton |
      | yesButton    |
    Then User should login successfully