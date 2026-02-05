import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddNewContactPage;
import pages.ContactDetailsPage;
import pages.EditContactPage;
import testdata.classes.EditContact;
import testdata.classes.NewEditContact;

import java.time.Duration;
import java.util.List;

import static testdata.pages.AddNewContactTestData.ADD_NEW_CONTACT_HEADER;
import static testdata.pages.ContactDetailsTestData.CONTACT_DETAILS_HEADER;
import static testdata.pages.ContactListTestData.CONTACT_LIST_HEADER;
import static testdata.pages.EditContactTestData.EDIT_CONTACT_PAGE_TITLE;

public class EditContactTests extends BaseTests{
    AddNewContactPage addNewContactPage;
    ContactDetailsPage contactDetailsPage;
    EditContactPage editContactPage;
    NewEditContact addNewContactFile;
    NewEditContact editUserFile;
    String nameToEdit = "name1";

    @BeforeMethod
    public void beforeMethod(){
        super.beforeMethod();

        loginPage.authenticate(mainUser);
        Assert.assertTrue(contactListPage.isLogoutDisplayed());
        Assert.assertEquals(contactListPage.getHeaderText(), CONTACT_LIST_HEADER);

        contactDetailsPage = new ContactDetailsPage(driver);
        //contactListPage.clickNameCellValue(nameToEdit);
    }
    @Test
    public void onCorrectContact() {
        Assert.assertEquals(contactDetailsPage.getHeaderText(), CONTACT_DETAILS_HEADER);
        Assert.assertEquals(contactDetailsPage.getFirstNameValue(), nameToEdit);
    }
    @Test
    public void editContact() {
        contactListPage.clickNameCellValue(nameToEdit);
        editContactPage = new EditContactPage(driver);
        contactDetailsPage.editContactDetailsButton();

        Assert.assertEquals(editContactPage.getHeaderText(), EDIT_CONTACT_PAGE_TITLE);
        List<String> inputValues = editContactPage.getInputValues();
        Assert.assertTrue(inputValues.contains(nameToEdit));

        editUserFile = new NewEditContact("editNewContact");
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
        contactListPage.clickNameCellValue(nameToEdit);

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
        contactListPage.clickNameCellValue(nameToEdit);

        editContactPage = new EditContactPage(driver);
        Assert.assertEquals(contactDetailsPage.getHeaderText(), CONTACT_DETAILS_HEADER );
        Assert.assertEquals(contactDetailsPage.getFirstNameValue(), nameToEdit);

        contactDetailsPage.clickReturnToContactListButton();
        Assert.assertEquals(contactListPage.getHeaderText(), CONTACT_LIST_HEADER);
    }
    @Test
    public void addEditDeleteNewContact() {

        //create a new contact
        addNewContactPage = new AddNewContactPage(driver);
        contactListPage.clickAddNewContactButton();

        Assert.assertEquals(addNewContactPage.getHeaderText(), ADD_NEW_CONTACT_HEADER);

        addNewContactFile = new NewEditContact("newAccount1");

        addNewContactPage.addNewContact(addNewContactFile);
        String firstName = addNewContactFile.getFirstName();
        String lastName = addNewContactFile.getLastName();

        List<String> names = contactListPage.getNameColumnValues();
        Assert.assertTrue(names.contains(firstName+" "+lastName));

        //edit the contact created
        contactListPage.clickNameCellValue(firstName);

        editContactPage = new EditContactPage(driver);
        contactDetailsPage.editContactDetailsButton();

        Assert.assertEquals(editContactPage.getHeaderText(), EDIT_CONTACT_PAGE_TITLE);
        List<String> inputValues = editContactPage.getInputValues();
        Assert.assertTrue(inputValues.contains(firstName));

        editUserFile = new NewEditContact("editNewContact");
        editContactPage.editContactNewData(editUserFile);
        editContactPage.clickSubmitButton();

        if (driver.getCurrentUrl().contains("/editContact")) {
            String body = driver.findElement(By.tagName("body")).getText();
            Assert.fail("Save failed. Still on /editContact. Page text:\n" + body);
        }

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.not(ExpectedConditions.urlContains("/editContact")));

        contactDetailsPage = new ContactDetailsPage(driver);
        Assert.assertEquals(contactDetailsPage.getHeaderText(), CONTACT_DETAILS_HEADER );

        //check values to have the same names etc
        List<String> newInputValues = contactDetailsPage.getContactDetailsValues();

        //return to contactlistpage
        contactDetailsPage.clickReturnToContactListButton();

        //check name present on page.
        Assert.assertEquals(contactListPage.getHeaderText(), CONTACT_LIST_HEADER);
        String firstNameUpdated = editUserFile.getFirstName();
        String lastNameUpdated = editUserFile.getLastName();
        List<String> cellValues = contactListPage.getRowValues(firstNameUpdated);
        List<String> columnNames = contactListPage.getNameColumnValues();
        Assert.assertTrue(columnNames.contains(firstNameUpdated+" "+lastNameUpdated));

        //delete the contact
    }
}
