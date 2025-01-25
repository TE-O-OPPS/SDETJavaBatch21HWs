package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddEmployeePage;
import utilties.CommonMethods;

import java.util.Map;

public class AddemployeeSteps extends CommonMethods {
    //WebDriver driver;
    @Given("the admin user is logged into the HRMS application")
    public void the_admin_user_is_logged_into_the_hrms_application() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement usernameFiled = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usernameFiled.sendKeys("Admin");
        WebElement passwordFiled = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passwordFiled.sendKeys("Hum@nhrm123");
        WebElement loginFiled = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginFiled.click();
        //sendText("Admin",addEmployeePage.usernameFiled);
        //sendText("Hum@nhrm123",addEmployeePage.passwordFiled);
        //click(addEmployeePage.loginFiled);
        boolean isWelcomeMessageDisplayed = dashBoardPage.welcomeMessage.isDisplayed();
        if (!isWelcomeMessageDisplayed) {
            throw new AssertionError("Welcome message is not displayed on the dashboard.");
        }
    }

    @When("the admin clicks on the PIM option")
    public void the_admin_clicks_on_the_pim_option() {
        click(dashBoardPage.pimOption);
    }

    @When("the admin clicks on the Add Employee option")
    public void the_admin_clicks_on_the_add_employee_option() {
        click(dashBoardPage.addempbutton);
    }

    @When("the admin enters the employee details:")
    public void the_admin_enters_the_employee_details(DataTable dataTable) {
        Map<String, String> employeeDetails = (Map<String, String>) dataTable.asMaps(String.class, String.class);
        sendText(employeeDetails.get("First Name"), addEmployeePage.firstNameField);
        sendText(employeeDetails.get("Middle Name"), addEmployeePage.middleNameField);
        sendText(employeeDetails.get("Last Name"), addEmployeePage.lastNameField);

        if (employeeDetails.containsKey("Employee ID") && employeeDetails.get("Employee ID") != null) {
            sendText(employeeDetails.get("Employee ID"), addEmployeePage.employeeIdField);
        }
    }

    @When("the admin clicks on the Save button")
    public void the_admin_clicks_on_the_save_button() {
        click(addEmployeePage.saveButton);
        click(dashBoardPage.addempbutton);
    }

    @Then("the system should save the employee with an auto-generated ID")
    public void the_system_should_save_the_employee_with_an_auto_generated_id() {
        Assert.assertTrue("Employee was not saved successfully.", addEmployeePage.isEmployeeAdded());

        // Verify that the Employee ID is generated and displayed
        String generatedEmpID = addEmployeePage.getEmployeeID();
        Assert.assertNotNull(generatedEmpID, "Employee ID was not auto-generated.");
        Assert.assertFalse("Employee ID is empty after auto-generation.", generatedEmpID.isEmpty());

    }

    @Then("the system should save the employee with the provided ID")
    public void the_system_should_save_the_employee_with_the_provided_id() {
        // Verify that the employee was saved successfully
        Assert.assertTrue("Employee was not saved successfully.", addEmployeePage.isEmployeeAdded());

        // Verify that the provided Employee ID matches the saved Employee ID
        String providedEmpID = addEmployeePage.getProvidedEmployeeID();
        String displayedEmpID = addEmployeePage.getEmployeeID();
        Assert.assertEquals(displayedEmpID, providedEmpID, "The displayed Employee ID does not match the provided Employee ID.");
    }

    @Then("the system should display {string}")
    public void theSystemShouldDisplay(String outcome) {
        if (outcome.contains("save the employee")) {
            Assert.assertTrue("Employee was not added successfully.", addEmployeePage.isEmployeeAdded());
        } else {
            Assert.assertTrue("Error message not displayed.", addEmployeePage.errorMessage.isDisplayed());
        }
    }


    @When("the admin clicks on the PIM option")
    public void theAdminClicksOnThePIMOption() {
    }

    @Then("the system should save the employee with the provided employee details")
    public void theSystemShouldSaveTheEmployeeWithTheProvidedEmployeeDetails() {

    }
}