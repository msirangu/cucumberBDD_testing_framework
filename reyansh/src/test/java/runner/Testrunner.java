package runner;
//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepDefinitions","dsalgohooks"},
    plugin = {"pretty",
    		  "html:target/report.html",
     		  "json:target/report.json",
     		 //"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
     		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
     		 }
)

	public class Testrunner extends AbstractTestNGCucumberTests {

	    @Override
	    @DataProvider(parallel = false) // Change to 'true' for parallel execution
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	}



