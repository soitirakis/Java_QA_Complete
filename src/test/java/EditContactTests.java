import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContactDetailsPage;
import pages.EditContactPage;
import testdata.classes.EditContact;

import java.util.List;

import static testdata.pages.ContactDetailsTestData.CONTACT_DETAILS_HEADER;
import static testdata.pages.ContactListTestData.CONTACT_LIST_HEADER;
import static testdata.pages.EditContactTestData.EDIT_CONTACT_PAGE_TITLE;

public class EditContactTests extends BaseTests{
    ContactDetailsPage contactDetailsPage;
    EditContactPage editContactPage;
    EditContact editUserFile = new EditContact("editNewContact");
    String nameToEdit = "firstName";

    @BeforeMethod
    public void beforeMethod(){
        super.beforeMethod();

        loginPage.authenticate(mainUser);
        Assert.assertTrue(contactListPage.isLogoutDisplayed());
        Assert.assertEquals(contactListPage.getHeaderText(), CONTACT_LIST_HEADER);

        contactDetailsPage = new ContactDetailsPage(driver);
        contactListPage.clickNameCellValue(nameToEdit);
    }
    @Test
    public void onCorrectContact() {
        Assert.assertEquals(contactDetailsPage.getHeaderText(), CONTACT_DETAILS_HEADER);
        Assert.assertEquals(contactDetailsPage.getFirstNameValue(), nameToEdit);
    }
    @Test
    public void editContact() {
        editContactPage = new EditContactPage(driver);
        contactDetailsPage.editContactDetailsButton();

        Assert.assertEquals(editContactPage.getHeaderText(), EDIT_CONTACT_PAGE_TITLE);
        List<String> inputValues = editContactPage.getInputValues();
        Assert.assertTrue(inputValues.contains(nameToEdit));

        editContactPage.editContactNewData(editUserFile);
        Assert.assertEquals(contactDetailsPage.getHeaderText(), CONTACT_DETAILS_HEADER );

        //check values to have the same names etc
        List<String> newInputValues = contactDetailsPage.getContactDetailsValues();

        //return to contactlistpage
        contactDetailsPage.clickReturnToContactListButton();

        //check name present on page.
        Assert.assertEquals(contactListPage.getHeaderText(), CONTACT_LIST_HEADER);
        String firstName = editUserFile.getFirstName();
        String lastName = editUserFile.getLastName();
        List<String> cellValues = contactListPage.getRowValues(firstName);
        List<String> columnNames = contactListPage.getNameColumnValues();
        Assert.assertTrue(columnNames.contains(firstName+" "+lastName));
    }
    @Test
    public void deleteContact() {
        editContactPage = new EditContactPage(driver);
        Assert.assertEquals(contactDetailsPage.getHeaderText(), CONTACT_DETAILS_HEADER );
        Assert.assertEquals(contactDetailsPage.getFirstNameValue(), nameToEdit);

        contactDetailsPage.deleteContactDetailsButton();

        List<String> names = contactListPage.getNameColumnValues();

        Assert.assertEquals(contactListPage.getHeaderText(), CONTACT_LIST_HEADER);
        Assert.assertFalse(names.contains(nameToEdit));
    }
    @Test
    public void returnToContactList() {
        editContactPage = new EditContactPage(driver);
        Assert.assertEquals(contactDetailsPage.getHeaderText(), CONTACT_DETAILS_HEADER );
        Assert.assertEquals(contactDetailsPage.getFirstNameValue(), nameToEdit);

        contactDetailsPage.clickReturnToContactListButton();
        Assert.assertEquals(contactListPage.getHeaderText(), CONTACT_LIST_HEADER);
    }
}
