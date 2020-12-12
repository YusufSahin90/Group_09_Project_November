Feature: Create a Subjects

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button


  @RegressionTest
  Scenario: Create a Subjects

    Then Navigate to Education Left page
      | education      |
      | setupEducation |
      | subject        |
    And  Navigate a new Subject create and save
      | addButton |
    When Create a new Subject send Keys
      | nameInput | Methods of Turkish Language |
      | codeInput | MTL                         |
    And  Navigate a new Subject create and save
      | addButton3 |
    When Create a new Subject send Keys
      | nameInput2 | Busines Turkish Language Lesson |
      | codeInput2 | BTLM                            |
    And  Navigate a new Subject create and save
      | saveButton2     |
      | subjectCategory |

    When Create a new Subject send businessTurkish
    And  Navigate a new Subject create and save
      | Style       |
      | colorSelect |
      | saveButton  |
    And Delete Subject function
    # active butona tiklayip pasif etmezseniz data sistemden silinmiyor hata veriyor
      | activeButton  |
      | deleteButton2 |
      | yesButton     |
    Then User should login successfully
   # Arkadaslar buradan sonrasi sistemden silinmesi icin Subject Categories e
     # tekrar donmek gerekti yoksa program tekrar calisinca hata veriyordu asagisi 3.5 ten alinmadir
    Then Navigate to Education Left page
      | subjectCategories |
    And Delete Subject Categories
      | deleteButton2 |
      | yesButton     |
    Then User should login successfully

