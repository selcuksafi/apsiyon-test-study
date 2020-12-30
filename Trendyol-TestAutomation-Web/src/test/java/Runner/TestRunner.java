package Runner;

import Libs.WebStep;
import cucumber.api.CucumberOptions;
import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import java.io.File;

import static java.lang.System.*;

//@RunWith(Cucumber.class) ==> JUnit cancel
@CucumberOptions(

        features = "src/test/resources/TestCases/",
        glue = {"Tools","Libs"},
        dryRun = false,
        tags = {"@Run"},
        plugin = {"pretty:STDOUI","html:src/test/resources/cucumber-reports/cucumber-pretty",
                "json:src/test/resources/cucumber-reports/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/cucumber-reports/report.html"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(getProperty("user.dir")+"/src/test/resources/cucumber-reports/extent-config.xml"));
        Reporter.setSystemInfo("User Name", getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine",   getProperty("os.name") +" "+ getProperty("os.arch") +" "+ getProperty("os.version"));
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Java Version",getProperty("java.version"));


    }

}