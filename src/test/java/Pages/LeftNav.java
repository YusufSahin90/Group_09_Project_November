package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _Parent {

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement Cities;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setupEducation;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='Subjects']")
    private WebElement subject;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanResSetupButton;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategory;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement positions;

    @FindBy(xpath = "(//span[text()='Salary Types'])[1]")
    private WebElement salaryTypes;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement entranceExamsSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsChild;

    @FindBy(xpath = "//span[text()='Student']")
    private WebElement studentParent;

    @FindBy(xpath = "//span[text()='Students']")
    private WebElement studentsButton;

    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement Reports;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement reportsSetup;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement ExcelTemplate;

    @FindBy(xpath = "//fuse-nav-vertical-item//span[text()='Salary Modifiers']")
    private WebElement salaryModifiers;

    @FindBy(xpath = "//fuse-nav-vertical-item//span[text()='Salary Constants']")
    private WebElement salaryConstants;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccounts;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement setupBudget;

    @FindBy(xpath = "(//span[text()='Cost Centers'])[1]")
    private WebElement costCenters;

    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "setupOne":
                myElement = setupOne;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "country":
                myElement = country;
                break;

            case "Cities":
                myElement = Cities;
                break;
            case "education":
                myElement = education;
                break;

            case "setupEducation":
                myElement = setupEducation;
                break;

            case "subjectCategories":
                myElement = subjectCategories;
                break;

            case "subject":
                myElement = subject;
                break;

            case "HumanResources":
                myElement = HumanResources;
                break;

            case "humanResSetupButton": //fees
                myElement = humanResSetupButton;
                break;

            case "positionSalary":
                myElement = positionSalary;
                break;
            case "positions":
                myElement = positions;
                break;
            case "salaryTypes":
                myElement = salaryTypes;
                break;

            case "entranceExamsSetup":
                myElement = entranceExamsSetup;
                break;

            case "entranceExamsChild":
                myElement = entranceExamsChild;
                break;

            case "studentParent":
                myElement = studentParent;
                break;

            case "studentsButton":
                myElement = studentsButton;
                break;

            case "Reports":
                myElement = Reports;
                break;

            case "reportsSetup":
                myElement = reportsSetup;
                break;

            case "ExcelTemplate":
                myElement = ExcelTemplate;
                break;

            case "salaryModifiers":
                myElement = salaryModifiers;
                break;

            case "salaryConstants":
                myElement = salaryConstants;
                break;

            case "bankAccounts":
                myElement = bankAccounts;
                break;

            case "budget":
                myElement = budget;
                break;

            case "setupBudget":
                myElement = setupBudget;
                break;

            case "costCenters":
                myElement = costCenters;
                break;
        }

        clickFunction(myElement);
    }
}
