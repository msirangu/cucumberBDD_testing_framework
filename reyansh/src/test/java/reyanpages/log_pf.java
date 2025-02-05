package reyanpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class log_pf {
    private static final String Xpath = null;

	WebDriver driver;

    @FindBy(id = "input-email")
    private WebElement usernameField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    private WebElement loginButton;

    public log_pf(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    

    public void enterUsername(String username) {
    	 System.out.println("Entering username: " + username);
    	 usernameField.sendKeys(username);
    	    System.out.println("Username entered.");
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
