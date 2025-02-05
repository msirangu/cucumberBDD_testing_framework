package Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import reyanshdrivers.Driverfactory;
import org.openqa.selenium.WebDriver;

public class hooksapplication{
	@SuppressWarnings("unused")
	private WebDriver driver;
	@Before
    public void setUp() {
        Driverfactory.getDriver();
        System.out.println("🔹 Browser launched before each scenario.");
    }

    @After
    public void tearDown() {
        Driverfactory.closeDriver();
        System.out.println("🔸 Browser closed after each scenario.");
    }
}

