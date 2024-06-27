package cucumber.options;


import utilities.Log;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "./src/test/java/features",
    glue = {"stepDefination", "helper"},
    tags = "@sanity",
    plugin = {"pretty", "json:target/jsonReports/report.json","html:target/cucumber-reports/Cucumber.html",}
)

public class testRunner extends AbstractTestNGCucumberTests {

   
}

