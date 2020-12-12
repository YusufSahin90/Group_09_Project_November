package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _03_07_MySubjectMyStepdefs {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @When("^Create a new Subject send Last Input$")
    public void createANewSubjectSendLastInput() {
        dialogContent.selectSubject("Busines Turkish1 Language saLesetet");
    }

    @And("^Sistem error message control$")
    public void sistemErrorMessageControl() {
        dialogContent.findElementAndVerifyContainsText("ErrorMessage", "Error");
    }
}
