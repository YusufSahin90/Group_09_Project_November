Feature: Create a MySubjectCat

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @SmokeTest
  @RegressionTest
  Scenario: Create a MySubjectCat

    Then Navigate to Education Left page
      | education      |
      | setupEducation |
      | subject        |
    And  Navigate a new Subject create and save
      | addButton |
    When Create a new Subject send Keys
      | nameInput | Methods of realy Turkish |
      | codeInput | 12321                    |
    And  Navigate a new Subject create and save
      | addButton3 |
    When Create a new Subject send Keys
      | nameInput2 | Busines Turkish1 Language saLesetet |
      | codeInput2 | BTLM12asetet                        |
    And  Navigate a new Subject create and save
      | saveButton2     |
      | subjectCategory |
    When Create a new Subject send Last Input
    And  Navigate a new Subject create and save
      | Style       |
      | colorSelect |
      | saveButton  |
    Then Navigate to Education Left page
      | subjectCategories |
    And Delete Subject Categories
      | deleteButton2 |
      | yesButton     |
    And Sistem error message control
