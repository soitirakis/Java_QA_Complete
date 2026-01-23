import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddContactPage;

public class AddContactTests extends BaseTests{
    AddContactPage addContactPage;
    @BeforeMethod
    public void beforeMethod(){
        super.beforeMethod();
        Assert.assertEquals(contactListPage.getHeaderText(), "Contact List App");

        loginPage.authenticate("gr8test@test.com", "gr8test!");
        Assert.assertTrue(contactListPage.isLogoutDisplayed());
        Assert.assertEquals(contactListPage.getHeaderText(), "Contact List");

        contactListPage.clickAddNewContactButton();
        addContactPage = new AddContactPage(driver);

    }
    @Test
    public void testValidContactCreation(){
        Assert.assertEquals(addContactPage.getHeaderText(), "Add Contact");

        addContactPage.addNewContact("firstName", "lastName", "1999-10-12", "test@test.com", "07123123123",
                "street1", "street2", "BestCity", "Provence", "102102", "Best Country");

        Assert.assertTrue(contactListPage.isLogoutDisplayed());
        contactListPage.getHeaderText();
        Assert.assertEquals(contactListPage.getHeaderText(), "Contact List");
    }
    @Test
    public void testMissingFirstNameLastName() throws InterruptedException {
        addContactPage.addNewContact("", "", "", "", "", "", "", "", "", "","");

        Assert.assertEquals(addContactPage.getHeaderText(), "Add Contact");
        Assert.assertEquals(addContactPage.getErrorMessage(), "Contact validation failed: firstName: Path `firstName` is required., lastName: Path `lastName` is required.");
    }
}
