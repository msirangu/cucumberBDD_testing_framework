package stepDefinitions;
import io.cucumber.java.en.*;
import reyanpages.log_pf;
import org.openqa.selenium.WebDriver;
import reyanshdrivers.Driverfactory;
import utilities.Excelreader;
import static org.junit.Assert.*;

public class LoginSteps {
    private WebDriver driver;
    private log_pf loginPage;

    public LoginSteps() {
        this.driver = Driverfactory.getDriver();
        this.loginPage = new log_pf(driver);
    }

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    }

    @When("the user enters valid credentials from Excel")
    public void userEntersValidCredentialsFromExcel() {
        Object[][] data = Excelreader.getCSVData();
        for (Object[] credentials : data) {
       	 System.out.println("Entering username: " + credentials[0].toString() + " " + credentials[1].toString());

            loginPage.enterUsername(credentials[0].toString());
            loginPage.enterPassword(credentials[1].toString());
            loginPage.clickLogin();

            String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/account";
            assertEquals(expectedUrl, driver.getCurrentUrl());
        }
    }

    @Then("the user should be redirected to the homepage")
    public void userIsRedirectedToHomepage() {
        String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/account";
        assertEquals(expectedUrl, driver.getCurrentUrl());
        Driverfactory.closeDriver();
    }
}
