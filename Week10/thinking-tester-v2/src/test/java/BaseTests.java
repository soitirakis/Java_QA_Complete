import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContactListPage;
import pages.LoginPage;

public class BaseTests {

    static WebDriver driver;
    static LoginPage loginPage;
    static ContactListPage contactListPage;

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();

        loginPage = new LoginPage(driver);
        contactListPage = new ContactListPage(driver);
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        Assert.assertEquals(loginPage.getHeaderText(), "Contact List App");
    }
    /*@AfterMethod
    public void afterMethod() {
        DriverFactory.closeDriver();
    }*/
}
