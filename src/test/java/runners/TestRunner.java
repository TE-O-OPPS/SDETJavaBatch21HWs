package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
//path of the features directory
            features = "src/test/resources/features/",// this is for all to execute
// features = "src/test/resources/features/Login.feature"// this is only for what we want
// glue keyword we use to provide the name of the package we use for all step definition class
            // to stick together destination and feature file
            glue = "steps",

            dryRun= false,
            //dryRun= false //: is when we want to  execute
            //pretty keyword print all the steps in the console
            plugin = {"pretty","html:target/cucumber.html","rerun:target/failed.text","json:target/cucumber.json"} ,
            tags= "retrylogin"


    )



    public class TestRunner {
    }


