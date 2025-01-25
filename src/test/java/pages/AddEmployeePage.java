package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {


    WebDriver driver;

    @FindBy(xpath = "//input[@id='txtUsername']")
    public WebElement usernameFiled;
    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement passwordFiled;
    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement loginFiled;
    ;

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "middleName")
    public WebElement middleNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "employeeId")
    public WebElement employeeIdField;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    // Locator for the displayed Employee ID on the confirmation page
    @FindBy(id = "personal_txtEmployeeId")
    public WebElement displayedEmployeeId;


    @FindBy(css = ".validation-error") //
    public WebElement errorMessage;


    public AddEmployeePage() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to verify if the employee was added successfully
    public boolean isEmployeeAdded() {
        return displayedEmployeeId.isDisplayed();
    }


    public String getEmployeeID() {
        return displayedEmployeeId.getText();
    }


    public String getProvidedEmployeeID() {
        return employeeIdField.getAttribute("value");
    }
}


