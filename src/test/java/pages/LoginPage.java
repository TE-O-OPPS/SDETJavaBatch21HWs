package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilties.CommonMethods;

public class LoginPage extends CommonMethods {

        @FindBy(xpath = "//input[@id='txtUsername']")
        public WebElement usernameField;

        @FindBy(xpath= "//input[@id='txtPassword']")
        public WebElement passwordField;

        @FindBy(xpath = "//input[@id='btnLogin']")
        public WebElement loginButton;
        @FindBy(xpath = "//span[@id='spanMessage']")
        public WebElement errorMessage;

        public LoginPage() {
                //page factory which is used to initialize all the locators/elements
                PageFactory.initElements(driver, this);
        }
}