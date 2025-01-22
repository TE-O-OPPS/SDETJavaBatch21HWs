package utilties;

import pages.AddEmployeePage;
import pages.DashboarPage;
//import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializer {

    public static LoginPage loginPage;
   // public static EmployeeSearchPage employeeSearchPage;
    public static DashboarPage.DashboardPage dashboardPage;
    public static AddEmployeePage addEmployeePage;

    public static void initializePageObjects(){
        loginPage = new LoginPage();
      //  employeeSearchPage = new EmployeeSearchPage();
        dashboardPage = new DashboarPage.DashboardPage();
        addEmployeePage = new AddEmployeePage();

    }



}