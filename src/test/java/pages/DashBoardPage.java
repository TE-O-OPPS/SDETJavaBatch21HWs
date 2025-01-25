package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilties.CommonMethods.driver;

public class DashBoardPage {


    @FindBy(id = "//b[normalize-space()='PIM']") // Add Employee option
    public WebElement pimOption;

    @FindBy(linkText = "Welcome Admin")
    public WebElement welcomeMessage;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addempbutton;
    public DashBoardPage ( ) {

        PageFactory.initElements(driver, this);
    }
}


