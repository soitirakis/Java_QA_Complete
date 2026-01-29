import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddNewContactPage;
import pages.BasePage;
import testdata.classes.NewContact;

import java.util.List;

import static testdata.pages.AddNewContactTestData.ADD_NEW_CONTACT_HEADER;
import static testdata.pages.AddNewContactTestData.MISSING_MANDATORY_FIELDS;
import static testdata.pages.ContactListTestData.CONTACT_LIST_HEADER;
import static testdata.pages.LoginTestData.HEADER_TITLE;

public class AddNewContactTests extends BaseTests {
    static AddNewContactPage addNewContactPage;

    NewContact newContactFile;

    @BeforeMethod
    public void beforeMethod() {
        super.beforeMethod();
        addNewContactPage = new AddNewContactPage(driver);
        Assert.assertEquals(loginPage.getHeaderText(), HEADER_TITLE);

        loginPage.authenticate(mainUser);
        Assert.assertTrue(contactListPage.isLogoutDisplayed());
        Assert.assertEquals(contactListPage.getHeaderText(), CONTACT_LIST_HEADER);

        contactListPage.clickAddNewContactButton();
        Assert.assertEquals(addNewContactPage.getHeaderText(), ADD_NEW_CONTACT_HEADER);
    }
    @Test
    public void testAddNewContactAllData() {
        newContactFile = new NewContact("newAccount1");
        addNewContactPage.addNewContact(newContactFile);
        String firstName = newContactFile.getFirstName();
        String lastName = newContactFile.getLastName();
        String address = newContactFile.getStreet1() + " " + newContactFile.getStreet2();

        List<String> names = contactListPage.getNameColumnValues();
        System.out.println(names.toString());
        Assert.assertTrue(names.contains(firstName+" "+lastName));

        List<String> cellValues = contactListPage.getRowValues(firstName);
        Assert.assertTrue(cellValues.contains(address));
    }
    @Test
    public void testAddNewContactRequiredData() {
        newContactFile = new NewContact("newAccountMandatoryFields");
        addNewContactPage.addNewContact(newContactFile);
        String firstName = newContactFile.getFirstName();
        String lastName = newContactFile.getLastName();

        List<String> names = contactListPage.getNameColumnValues();
        Assert.assertTrue(names.contains(firstName+" "+lastName));
    }
    @Test
    public void testMissingRequiredFields() throws InterruptedException {
        newContactFile = new NewContact("newAccountMissingRequiredFields");
        addNewContactPage.addNewContact(newContactFile);

        Assert.assertEquals(addNewContactPage.getErrorMessage(), MISSING_MANDATORY_FIELDS);
    }

}
