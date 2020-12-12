package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class _03_01_CountrySteps {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();


    @And("^Navigate to country Left page$")
    public void navigateToCountryLeftPage(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Navigate to Create a country Delete a country data entry click$")
    public void navigateToCreateACountryDeleteACountrydataEntryClick(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }


    @When("^Create a country Delete a country$")
    public void createACountryDeleteACountry(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }

    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }


}
