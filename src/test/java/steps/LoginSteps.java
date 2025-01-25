package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utilties.CommonMethods;

import java.time.Duration;
import java.util.List;
import java.util.Map;



public class LoginSteps extends CommonMethods {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
       // loginPage = new LoginPage(driver);
        driver= new ChromeDriver();
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

    }

    @When("the user attempts to log in with the following credentials:")
    public void the_user_attempts_to_log_in_with_the_following_credentials(DataTable credentials) {
        List<Map<String, String>> rows = credentials.asMaps(String.class, String.class);

        for (Map<String, String> row : rows) {
            String username = row.get("Username");
            String password = row.get("Password");

            // Simulate login attempt using POM
            loginPage.enterUsername(username);
            loginPage.enterPassword(password);
            loginPage.clickLoginButton();
        }
    }

    @Then("the system should display the following error messages:")
    public void the_system_should_display_the_following_error_messages(DataTable  expectedMessages) {

        List<Map<String, String>> rows = expectedMessages.asMaps(String.class, String.class);

        for (Map<String, String> row : rows) {
            String username = row.get("Username");
            String password = row.get("Password");
            String expectedMessage = row.get("Error Message");

            String actualMessage;

            // Determine which error message to validate based on the input
            if (username.isEmpty()) {
                actualMessage = loginPage.getUsernameErrorMessage();
            } else if (password.isEmpty()) {
                actualMessage = loginPage.getPasswordErrorMessage();
            } else {
                actualMessage = loginPage.getLoginErrorMessage();
            }

            // Validate the actual error message against the expected one
            Assert.assertEquals(actualMessage, expectedMessage, "Error message mismatch!");
        }


    }

    @When("the user attempts to log in with valid credentials:")
    public void the_user_attempts_to_log_in_with_valid_credentials(DataTable credentials) {

        List<Map<String, String>> rows =credentials.asMaps(String.class, String.class);

        for (Map<String, String> row : rows) {
            String username = row.get("Username");
            String password = row.get("Password");

            // Perform login using POM
            loginPage.enterUsername(username);
            loginPage.enterPassword(password);
            loginPage.clickLoginButton();
        }

}
    @Then("the user should be successfully logged in")
    public void theUserShouldBeSuccessfullyLoggedIn() {

            // Verify successful login
        Assert.assertTrue( loginPage.welcomeMessage.isDisplayed());

    }
}



