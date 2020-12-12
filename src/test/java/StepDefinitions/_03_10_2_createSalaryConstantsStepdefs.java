package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _03_10_2_createSalaryConstantsStepdefs {

    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();

    @And("^Salary Constants  all click functions$")
    public void salaryConstantsAllClickFunctions(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Create new Salary Constant Form Content Send Keys$")
    public void createNewSalaryConstantFormContentSendKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            formContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^Salary Constants  form content all click functions$")
    public void salaryConstantsFormContentAllClickFunctions(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            formContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }
}
