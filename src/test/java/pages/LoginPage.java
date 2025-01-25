package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilties.CommonMethods;

import java.awt.*;

public class LoginPage  {
    WebDriver driver;

    @FindBy(id = "txtUsername")
    public WebElement usernameField;

    @FindBy(id = "txtPassword")
    public WebElement passwordField;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(id = "usernameError")
    public  WebElement usernameError;

    @FindBy(id = "passwordError")
    public WebElement passwordError;

    @FindBy(id = "loginError")
    public WebElement loginError;

    @FindBy(id = "welcome")
    public WebElement welcomeMessage;

    public LoginPage() {
       // this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getUsernameErrorMessage() {
        return usernameError.getText();
    }

    public String getPasswordErrorMessage() {
        return passwordError.getText();
    }

    public String getLoginErrorMessage() {
        return loginError.getText();
    }

    public boolean isUserLoggedIn() {
        return welcomeMessage.isDisplayed();
    }

}



