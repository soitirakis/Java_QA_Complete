import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.DriverFactory;

public class OrangeHRMTests {

    private WebDriver driver;
    private static final String USER_NAME = "Admin";
    private static final String PASSWORD = "admin123";
    private String userToSearch = "akash Raouf lala";
    private String streetOne = "Some Street";
    private String city = "Best City";
    private String mobile = "0123456789";

    /*
    01. Login on site
    02. Click on PIM
    03. Search user by name
    04. Access the user page
    05. Navigate to contact details
    06. Add contacts or update
    07. Save
    * */

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.setUp(driver);
        driver.manage().window().maximize();
    }

   /* @AfterMethod
    /*public void tearDown() {
        DriverFactory.TearDown(driver);
    }*/

    @Test
    public void orangeHRMPOMTest(){
//      01. Login on site
        HomePage homePage = new HomePage(driver);
        homePage.open();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.addUsernameIntoInput(USER_NAME);
        loginPage.addPasswordIntoInput(PASSWORD);
        DashboardPage dashboardPage = loginPage.submitLogin();
//      02. Click on PIM
        PimPage pimPage = dashboardPage.clickOnPIMButton();
//      03. Search user by name
        pimPage.addEmployeeNameInput(userToSearch);
        pimPage.searchForEmployee();
//      04. Access user page
        PersonalDetailsPage personalDetailsPage = pimPage.clickEmployeeResultLink();
//      05. Navigate to "contact details"
        ContactDetails userContactDetails = personalDetailsPage.clickUserContactDetails();
//      06. Add contacts or update
        userContactDetails.addStreetOneInput(streetOne);
        userContactDetails.addCityInput(city);
        userContactDetails.addMobilePhoneInput(mobile);
        userContactDetails.clickSaveButton();


    }

}
