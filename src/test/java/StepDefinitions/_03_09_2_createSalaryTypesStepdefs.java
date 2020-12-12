package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _03_09_2_createSalaryTypesStepdefs {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @When("^Salary Types  all click functions$")
    public void salaryTypesAllClickFunctions(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Salary Types  all  send Keys functions$")
    public void salaryTypesAllSendKeysFunctions(DataTable elements) {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }

    }
}
