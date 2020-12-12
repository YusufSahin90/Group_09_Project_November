package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _03_12_createCostCentersStepdefs {

    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();
    LeftNav leftNav = new LeftNav();

    @Then("^Navigate to Cost Centers Left page$")
    public void navigateToCostCentersLeftPage(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Cost Centers   all click functions$")
    public void costCentersAllClickFunctions(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Create new Cost Centers Form Content Send Keys$")
    public void createNewCostCentersFormContentSendKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            formContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^Cost Centers  form content all click functions$")
    public void costCentersFormContentAllClickFunctions(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            formContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }
}
