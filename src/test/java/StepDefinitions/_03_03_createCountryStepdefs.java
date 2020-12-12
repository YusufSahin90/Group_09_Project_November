package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class _03_03_createCountryStepdefs {

    DialogContent dialogContent = new DialogContent();

    @When("^Create a Country  send data  and cityCode$")
    public void createACountrySendDataAndCityCode(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @And("^Find the added Country$")
    public void findTheAddedCountry() {
        dialogContent.selectCountry("adamGibiBirseyeem12");
    }

    @And("^add Cities , save and delete click$")
    public void addCitiesSaveAndDeleteClick(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @Then("^Error message should be displayed$")
    public void success_message_should_be_displayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "Error");
    }
}
