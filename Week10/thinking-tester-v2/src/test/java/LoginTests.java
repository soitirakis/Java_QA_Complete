import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests{
    @Test
    public void validLoginTest() {
        loginPage.authenticate("gr8test@test.com", "gr8test!");

        Assert.assertTrue(contactListPage.isLogoutDisplayed());
        Assert.assertEquals(contactListPage.getHeaderText(), "Contact List");
    }

    @Test
    public void invalidLoginTest() throws InterruptedException {
        loginPage.authenticate("gr8test", "gr8test!");

        Assert.assertEquals(loginPage.getError(), "Incorrect username or password");
    }

    @Test
    public void loginWithMissingCredentials()  throws InterruptedException {
        loginPage.authenticate("", "");

        Assert.assertEquals(loginPage.getError(), "Incorrect username or password");
    }
}
