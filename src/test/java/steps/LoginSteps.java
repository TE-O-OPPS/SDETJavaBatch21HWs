package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utilties.CommonMethods;
import utilties.ConfigReader;

import java.time.Duration;

public class LoginSteps extends CommonMethods {
    //public static WebDriver driver;


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("the user enters empty username and valid password")
    public void the_user_enters_empty_username_and_valid_password() {
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usernameField.sendKeys("");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passwordField.sendKeys("Hum@nhrm123");

    }

    @Then("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
      //  WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
       // loginButton.click();
        click(loginPage.loginButton);
    }

    @Then("the error message {string} should be displayed")
    public void the_error_message_should_be_displayed(String string) {
        WebElement erroMessage = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        boolean errorText = erroMessage.isDisplayed();
        Assert.assertTrue(errorText);
    }

    @When("the user enters valid username and empty password")
    public void the_user_enters_valid_username_and_empty_password() {
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement emptyPassword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        sendText(ConfigReader.read("username"), loginPage.usernameField);
        //emptyPassword.sendKeys("");
       // WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
       // loginButton.click();
        click(loginPage.loginButton);
        WebElement erroMessage2 = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        boolean errorText = erroMessage2.isDisplayed();
        Assert.assertTrue(errorText);
    }

    @When("the user enters username as {string} and password as {string}")
    public void the_user_enters_username_as_and_password_as(String string, String string2) {
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("welcome");
        WebElement emptyPassword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        emptyPassword.sendKeys("welldone");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();
        WebElement erroMessage3 = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String errorText = erroMessage3.getText();
        Assert.assertEquals(errorText, "Invalid credentials");
    }
    @When("the user enters invalid username and invalid  password")
    public void the_user_enters_invalid_username_and_invalid_password() {
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Hello");
        WebElement emptyPassword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        emptyPassword.sendKeys("Bye");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();


    }
    @When("user clear the invalid credential and use valid credentials")
    public void user_clear_the_invalid_credential_and_use_valid() {
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement emptyPassword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        emptyPassword.sendKeys("Hum@nhrm123");
        //WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
       // loginButton.click();
        click(loginPage.loginButton);
    }

    @Then("the user should be successfully logged in")
    public void the_user_should_be_successfully_logged_in() {

        WebElement dashboardText = driver.findElement(By.xpath("//b[normalize-space()='Dashboard']"));
        boolean text = dashboardText.isDisplayed();
        Assert.assertTrue(text);

    }


}


