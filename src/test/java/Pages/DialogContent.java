package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class DialogContent extends _Parent {
    WebElement myElement;


    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "(//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button)[2]")
    private WebElement addBttn2;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon'])[38]")
    private WebElement addButton3;

    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']//button")
    private WebElement addButton4;

    @FindBy(xpath = "//ms-add-button[@tooltip='BUDGET_EXCEL_TEMPLATE.FIELD.ADD']//button")
    private WebElement addButton5;

    @FindBy(xpath = "//ms-add-button[@tooltip='SALARY_TYPE.TITLE.ADD']")
    private WebElement addButton6;

    @FindBy(xpath = "//ms-add-button[@tooltip='SALARY_MODIFIER.TITLE.ADD']//button//span")
    private WebElement addButton7;

    @FindBy(xpath = "(//ms-add-button[@tooltip='SALARY_CONSTANTS.TITLE.ADD']//button//span)[1]")
    private WebElement addButton8;

    @FindBy(xpath = "//ms-add-button[@tooltip='BANK_ACCOUNT.TITLE.ADD']")
    private WebElement addButton9;

    @FindBy(xpath = "//ms-add-button[@tooltip='COST_CENTER.TITLE.ADD']")
    private WebElement addButton10;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement nameInput1;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='name']/input)[2]")
    private WebElement nameInput2;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement nameInput3;

    @FindBy(xpath = "//mat-form-field//input")
    private WebElement nameInput4;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='code']/input)[2]")
    private WebElement codeInput2;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//ms-save-button//button)[2]")
    private WebElement saveButton2;

    @FindBy(xpath = "(//span[text()='Country'])[3]")
    private WebElement country;

    @FindBy(xpath = "(//span[text()='Cities'])[1]")
    private WebElement Cities;

    @FindBy(xpath = "(//mat-select//div)[11]")
    private WebElement countryChoice;

    @FindBy(xpath = "//span[text()='Subject Category']")
    private WebElement subjectCategory;

    @FindBy(xpath = "(//span[text()='Style'])[1]")
    private WebElement Style;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({

            @FindBy(xpath = "//div[@id='toast-container']")

    })
    private List<WebElement> msjContainers;


    @FindAll({

            @FindBy(css = "mat-option[id^='mat-option-']")

    })
    private List<WebElement> subjectCategory1;


    @FindBy(css = "mat-option[style='color: black; background-color: rgb(255, 128, 171);']")
    private WebElement colorSelect;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton2;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "(//mat-slide-toggle//label)[1]")
    private WebElement activeButton;

    @FindAll({

            @FindBy(linkText = "Got it!")

    })
    private List<WebElement> gotItBtns;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted'])[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//span[text()='Country'])[3]")
    private WebElement countryButton;

    @FindBy(xpath = "(//span[text()='Country'])[1]")
    private WebElement countryInput;

    @FindBy(xpath = "(//button//fa-icon[@class='ng-fa-icon'])[6]")
    private WebElement deleteButton3;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    private WebElement editButton;

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon'])[5]")
    private WebElement editButton1;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='rowSize']//input")
    private WebElement rowSize;

    @FindBy(xpath = "(//ms-integer-field//input)[2]")
    private WebElement columnSize;

    @FindBy(xpath = "//span[text()='Add Version']")
    private WebElement addVersion;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchInput;

    @FindBy(xpath = "//mat-chip-list[@focused='unFocus']")
    private WebElement salaryType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement administratorSalaryType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement userSalaryType;

    @FindBy(xpath = "//mat-icon[text()='cancel']")
    private WebElement salaryTypeCancelButton;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton2;

    @FindAll({
            @FindBy(css = "span[class='mat-option-text']")
    })
    public List<WebElement> allCountries;

    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement userTypeDropdown;

    @FindAll({
            @FindBy(xpath = "//span[@class='mat-option-text']")
    })
    public List<WebElement> userTypeAllOptions;


    public void findElementAndClickFunction(String ElementName) {


        switch (ElementName) {

            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":

                if (gotItBtns.size() == 0)
                    return;

                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "saveButton2":
                myElement = saveButton2;
                break;

            case "closeDialog":
                myElement = closeDialog;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;

            case "Cities":
                myElement = Cities;
                break;
            case "countryChoice":
                myElement = countryChoice;
                break;

            case "searchButton":
                myElement = searchButton;
                break;
            case "countryButton":
                myElement = countryButton;
                break;

            case "deleteButton3":
                myElement = deleteButton3;
                break;
            case "addBttn2":
                myElement = addBttn2;
                break;
            case "addButton3":
                myElement = addButton3;
                break;
            case "addButton4":
                myElement = addButton4;
                break;
            case "addButton5":
                myElement = addButton5;
                break;

            case "subjectCategory":
                myElement = subjectCategory;
                break;
            case "Style":
                myElement = Style;
                break;

            case "colorSelect":
                myElement = colorSelect;
                break;
            case "deleteButton2":
                myElement = deleteButton2;
                break;

            case "activeButton":
                myElement = activeButton;
                break;

            case "editButton":
                myElement = editButton;
                break;

            case "editButton1":
                myElement = editButton1;
                break;

            case "countryInput":
                myElement = countryInput;
                break;

            case "addVersion":
                myElement = addVersion;
                break;

            case "addButton6":
                myElement = addButton6;
                break;

            case "salaryType":
                myElement = salaryType;
                break;

            case "administratorSalaryType":
                myElement = administratorSalaryType;
                break;

            case "userSalaryType":
                myElement = userSalaryType;
                break;

            case "salaryTypeCancelButton":
                myElement = salaryTypeCancelButton;
                break;

            case "searchButton2":
                myElement = searchButton2;
                break;

            case "addButton7":
                myElement = addButton7;
                break;
            case "addButton8":
                myElement = addButton8;
                break;
            case "addButton9":
                myElement = addButton9;
                break;
            case "addButton10":
                myElement = addButton10;
                break;
        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {


        switch (ElementName) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement = nameInput;
                break;
            case "nameInput1":
                myElement = nameInput1;
                break;
            case "nameInput2":
                myElement = nameInput2;
                break;

            case "nameInput3":
                myElement = nameInput3;
                break;

            case "codeInput":
                myElement = codeInput;
                break;
            case "codeInput2":
                myElement = codeInput2;
                break;

            case "shortName":
                myElement = shortName;
                break;
            case "rowSize":
                myElement = rowSize;
                break;
            case "columnSize":
                myElement = columnSize;
                break;

            case "country":
                myElement = country;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "nameInput4":
                myElement = nameInput4;
                break;


        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
        }

        verifyElementContainsText(myElement, msg);
    }


    public void selectCountry(String userType) {

        for (WebElement n : allCountries) {
            if (n.getText().contains(userType)) {
                clickFunction(n);
                break;
            }
        }
    }

    public void selectSubject(String userType) {

        for (WebElement m : subjectCategory1) {
            if (m.getText().contains(userType)) {
                clickFunction(m);
                break;
            }
        }
    }
}
