package steps;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import utilties.CommonMethods;

import java.io.IOException;
import java.time.Duration;




public class Hooks extends CommonMethods  {
    //this is for precondition of the project
    @Before
    public void start() throws IOException {
      //  openBrowserAndLaunchApplication();
    }

    @After
    public void end(){
        //scenario class - this class contains all the information about execution logs
        //screenshot right before the browser closes
        closeBrowser();
    }

}