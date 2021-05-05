Feature: Create a  Cost Centers  record, edit and Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a Cost Centers t record, edit and Delete

    Then Navigate to Cost Centers Left page
      | budget      |
      | setupBudget |
      | costCenters |
    And Cost Centers   all click functions
      | addButton10 |
    When Create new Cost Centers Form Content Send Keys
      | nameInput3     | sabarimrarta |
      | costCenterCode | 1123222      |
      | orderNo        | 112          |

    And Cost Centers  form content all click functions
      | costCenterType      |
      | costCenterOperation |
      | expenseAccoutCode   |
      | expenseAccoutCode2  |
      | saveButton          |
    And Cost Centers   all click functions
      | editButton |
    When Create new Cost Centers Form Content Send Keys
      | nameInput3     | sa2ita |
      | costCenterCode | 1223   |
      | orderNo        | 12224  |

    And Cost Centers  form content all click functions
      | costCenterType      |
      | costCenterOperation |
      | expenceCancel       |
      | expenseAccoutCode3  |
      | saveButton          |
    And Cost Centers   all click functions
      | deleteButton2 |
      | yesButton     |
    Then Success message should be displayed
    And Cost Centers   all click functions
      | deleteButton2 |
      | yesButton     |
