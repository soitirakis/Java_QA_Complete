import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddNewContactPage;
import testdata.classes.NewEditContact;

import java.util.List;

import static testdata.pages.AddNewContactTestData.ADD_NEW_CONTACT_HEADER;
import static testdata.pages.AddNewContactTestData.MISSING_MANDATORY_FIELDS;
import static testdata.pages.ContactListTestData.CONTACT_LIST_HEADER;
import static testdata.pages.LoginTestData.HEADER_TITLE;

public class AddNewEditContactTests extends BaseTests {
    static AddNewContactPage addNewContactPage;

    NewEditContact newEditContactFile;

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
        newEditContactFile = new NewEditContact("newAccount1");
        addNewContactPage.addNewContact(newEditContactFile);
        String firstName = newEditContactFile.getFirstName();
        String lastName = newEditContactFile.getLastName();
        String address = newEditContactFile.getStreet1() + " " + newEditContactFile.getStreet2();

        List<String> names = contactListPage.getNameColumnValues();
        System.out.println(names.toString());
        Assert.assertTrue(names.contains(firstName+" "+lastName));

        List<String> cellValues = contactListPage.getRowValues(firstName);
        Assert.assertTrue(cellValues.contains(address));
    }
    @Test
    public void testAddNewContactRequiredData() {
        newEditContactFile = new NewEditContact("newAccountMandatoryFields");
        addNewContactPage.addNewContact(newEditContactFile);
        String firstName = newEditContactFile.getFirstName();
        String lastName = newEditContactFile.getLastName();

        List<String> names = contactListPage.getNameColumnValues();
        Assert.assertTrue(names.contains(firstName+" "+lastName));
    }
    @Test
    public void testMissingRequiredFields() throws InterruptedException {
        newEditContactFile = new NewEditContact("newAccountMissingRequiredFields");
        addNewContactPage.addNewContact(newEditContactFile);

        Assert.assertEquals(addNewContactPage.getErrorMessage(), MISSING_MANDATORY_FIELDS);
    }

}
