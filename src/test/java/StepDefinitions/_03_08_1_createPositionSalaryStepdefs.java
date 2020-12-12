package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.util.List;

public class _03_08_1_createPositionSalaryStepdefs {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @Then("^Navigate to Human Resources Left page$")
    public void navigateToHumanResourcesLeftPage(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }


    @And("^Navigate  to Salary and click functions$")
    public void navigateToSalaryandclickfunctions(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Send to Salary Keys$")
    public void sendToSalaryKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }


    @Then("^Navigate a new Positions Subject create and save$")
    public void navigateANewPositionsSubjectCreateAndSave(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @When("^Create a new Position Subject send Keys$")
    public void createANewPositionSubjectSendKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }
}

