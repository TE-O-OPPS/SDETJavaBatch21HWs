package utilties;


import pages.AddEmployeePage;
import pages.DashBoardPage;
import pages.LoginPage;


public class PageInitilaizer {

    public static AddEmployeePage addEmployeePage;
    public static LoginPage loginPage;
    public static DashBoardPage dashBoardPage;

    // Constructor to initialize the WebDriver and page objects
    public static void initializePageObjects() {
       LoginPage loginPage = new LoginPage();
       DashBoardPage dashBoardPage= new DashBoardPage();
       AddEmployeePage addEmployeePage= new AddEmployeePage();
    }
}


