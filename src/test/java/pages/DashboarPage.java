package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilties.CommonMethods;

public class DashboarPage extends CommonMethods {



    public static class DashboardPage extends CommonMethods {

        @FindBy(id="menu_pim_viewPimModule")
        public WebElement pimOption;

        @FindBy(id="menu_pim_viewEmployeeList")
        public WebElement empListOption;

        @FindBy(id="menu_pim_addEmployee")
        public WebElement addEmployeeOption;
        @FindBy(id="welcome")
        public WebElement messageText;

        public DashboardPage(){
            PageFactory.initElements(driver, this);
        }
    }
}
