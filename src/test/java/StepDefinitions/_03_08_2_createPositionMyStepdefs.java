package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class _03_08_2_createPositionMyStepdefs {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();

    @And("^Navigate  to Position and click function$")
    public void navigateToPositionAndClickFunction(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }
}
