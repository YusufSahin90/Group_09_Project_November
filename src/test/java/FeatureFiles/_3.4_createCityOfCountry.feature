Feature: Create a Country und delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a Country und delete


    And Navigate to country Left page
      | setupOne   |
      | parameters |
      | country    |
    And  add Cities , save and delete click
      | addButton |
    When Create a Country  send data  and cityCode
      | nameInput | adamGibiBirseyeem12 |
    And  city add , save and delete click
      | saveButton |
    Then Success message should be displayed
    And  add Cities , save and delete click
      | Cities        |
      | addButton     |
      | countryChoice |
    And Find the added Country
    When Create a Country  send data  and cityCode
      | nameInput | 5725034 |
    And  add Cities , save and delete click
      | saveButton |
    Then Success message should be displayed
    And Navigate to country Left page
      | country |
    When Create a Country  send data  and cityCode
      | nameInput1 | adamGibiBirseyeem12 |
    And  add Cities , save and delete click
      | searchButton  |
      | deleteButton3 |
      | yesButton     |
    Then Error message should be displayed