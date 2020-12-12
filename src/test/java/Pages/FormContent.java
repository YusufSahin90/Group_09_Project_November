package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends _Parent {

    WebElement myElement;


    public FormContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//mat-form-field//input)[1]")
    private WebElement description;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement variable;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement integrationCode;

    @FindBy(xpath = "(//mat-form-field//input)[4]")
    private WebElement priority;

    @FindBy(xpath = "(//mat-form-field//input)[5]")
    private WebElement amount;

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement formContentAddButton;

    @FindBy(xpath = "(//mat-form-field//input)[6]")
    private WebElement formContentname;

    @FindBy(xpath = "(//mat-form-field//input)[7]")
    private WebElement formulaVariable;

    @FindBy(xpath = "//span[text()='Apply']")
    private WebElement applyButton;

    @FindBy(xpath = " //span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement nameInput1;

    @FindBy(xpath = "//mat-datepicker-toggle//button")
    private WebElement calenderButton;

    @FindBy(css = "div[class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")
    private WebElement calenderDatum;

    @FindBy(xpath = "//td[@aria-label='November 25, 2020']")
    private WebElement calenderDatum2;

    @FindBy(xpath = "//ms-text-field//input")
    private WebElement keyInput;

    @FindBy(xpath = "//ms-integer-field//input")
    private WebElement valueInput;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement nameInput2;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement ibanInput;

    @FindBy(xpath = "(//mat-form-field//input)[4]")
    private WebElement integrationCode2;

    @FindBy(xpath = "(//mat-select//div)[11]")
    private WebElement currency;

    @FindBy(xpath = "(//mat-option//span)[2]")
    private WebElement buttonUsd;

    @FindBy(xpath = "(//mat-option//span)[3]")
    private WebElement buttonEuro;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement nameInput3;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private WebElement costCenterCode;

    @FindBy(xpath = "(//mat-select//div)[7]")
    private WebElement costCenterType;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement orderNo;

    @FindBy(xpath = "(//mat-form-field//input)[4]")
    private WebElement expenseAccoutCode;

    @FindBy(xpath = "//span[text()=' 2.2 | Расходы на развитие образовательной деятельности ']")
    private WebElement expenseAccoutCode2;

    @FindBy(xpath = "//span[text()=' 2.5 | Административные расходы ']")
    private WebElement expenseAccoutCode3;

    @FindBy(xpath = "//span[text()=' Operation ']")
    private WebElement costCenterOperation;

    @FindBy(xpath = "//mat-icon[text()='cancel']")
    private WebElement expenceCancel;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "formContentAddButton":
                myElement = formContentAddButton;
                break;

            case "applyButton":
                myElement = applyButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "calenderButton":
                myElement = calenderButton;
                break;

            case "calenderDatum":
                myElement = calenderDatum;
                break;

            case "calenderDatum2":
                myElement = calenderDatum2;
                break;

            case "currency":
                myElement = currency;
                break;

            case "buttonUsd":
                myElement = buttonUsd;
                break;

            case "buttonEuro":
                myElement = buttonEuro;
                break;

            case "costCenterType":
                myElement = costCenterType;
                break;

            case "expenseAccoutCode":
                myElement = expenseAccoutCode;
                break;

            case "expenseAccoutCode2":
                myElement = expenseAccoutCode2;
                break;

            case "expenseAccoutCode3":
                myElement = expenseAccoutCode3;
                break;

            case "costCenterOperation":
                myElement = costCenterOperation;
                break;

            case "expenceCancel":
                myElement = expenceCancel;
                break;


        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {

            case "description":
                myElement = description;
                break;

            case "variable":
                myElement = variable;
                break;

            case "integrationCode":
                myElement = integrationCode;
                break;

            case "priority":
                myElement = priority;
                break;

            case "amount":
                myElement = amount;
                break;

            case "formContentname":
                myElement = formContentname;
                break;

            case "formulaVariable":
                myElement = formulaVariable;
                break;

            case "nameInput1":
                myElement = nameInput1;
                break;

            case "keyInput":
                myElement = keyInput;
                break;

            case "valueInput":
                myElement = valueInput;
                break;

            case "nameInput2":
                myElement = nameInput2;
                break;

            case "ibanInput":
                myElement = ibanInput;
                break;

            case "integrationCode2":
                myElement = integrationCode2;
                break;

            case "nameInput3":
                myElement = nameInput3;
                break;

            case "costCenterCode":
                myElement = costCenterCode;
                break;

            case "orderNo":
                myElement = orderNo;
                break;

        }

        sendKeysFunction(myElement, value);
    }

}
