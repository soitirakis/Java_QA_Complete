package pages;

import driver.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage{

    String contactToEdit = "zsz";
    String newContactEditedExist = "New First Name";

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    //elements
    private By header = By.xpath("//h1");
    private By logoutButton = By.id("logout");
    private By addNewContactButton = By.id("add-contact");
    private By editContactButton = By.xpath("//tr/td[2][contains(.,'" +contactToEdit+ "')]");
    private By newContactEdit = By.xpath("//tr/td[2][contains(.,'" +newContactEditedExist+"')]");

    //actions
    public boolean isLogoutDisplayed() {
        return driver.findElement(logoutButton).isDisplayed();
    }
    public String getHeaderText() {
        WaitUtils.textToBePresentInElementLocated(header, "Contact List");
        return driver.findElement(header).getText();
    }
    public void  clickAddNewContactButton() {
        driver.findElement(addNewContactButton).click();
    }
    public void clickToEditContact() {
        driver.findElement(editContactButton).click();
    }
    public boolean isContactDisplayed() {
        return driver.findElement(newContactEdit).isDisplayed();
    }
    public boolean isContactDeleted() {
        try {
            return !driver.findElement(editContactButton).isDisplayed();
        } catch (NoSuchElementException e) {
            return true;
        }
    }
}
