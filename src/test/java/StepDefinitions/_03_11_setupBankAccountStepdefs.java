package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _03_11_setupBankAccountStepdefs {

    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();
    LeftNav leftNav = new LeftNav();

    @Then("^Navigate to Bank Account Left page$")
    public void navigateToBankAccountLeftPage(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Bank Account  all click functions$")
    public void bankAccountAllClickFunctions(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^Create new Bank Account Form Content Send Keys$")
    public void createNewBankAccountFormContentSendKeys(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            formContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^Bank Account  form content all click functions$")
    public void bankAccountFormContentAllClickFunctions(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            formContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }
}
