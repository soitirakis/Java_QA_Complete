package pages;

import driver.WaitUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static testdata.pages.ContactDetailsTestData.CONTACT_DETAILS_HEADER;

public class ContactDetailsPage extends BasePage{

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    //elements
    private By header = By.xpath("//h1");
    private By editButton = By.id("edit-contact");
    private By deleteButton = By.id("delete");
    private By returnToContactListButton = By.id("return");
    private By contactDetailsValues = By.xpath("//span");

    private By firstNameValue = By.id("firstName");
    private By lastNameValue = By.id("lastName");
    private By dateOfBirthValue = By.id("birthdate");
    private By emailValue = By.id("email");
    private By phoneValue = By.id("phone");
    private By street1Value = By.id("street1");
    private By street2Value = By.id("street2");
    private By cityValue = By.id("city");
    private By stateValue = By.id("stateProvince");
    private By postalCodeValue = By.id("postalCode");
    private By countryValue = By.id("country");


    //actions
    public String getHeaderText() {
        WaitUtils.visibilityOfElementLocated(header);
        WaitUtils.textToBePresentInElementLocated(header, CONTACT_DETAILS_HEADER);
        return driver.findElement(header).getText();
    }
    public void editContactDetailsButton() {
        driver.findElement(editButton).click();
    }
    public void deleteContactDetailsButton() {
        driver.findElement(deleteButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void clickReturnToContactListButton() {
        driver.findElement(returnToContactListButton).click();
    }
    public String getFirstNameValue() {
        WaitUtils.visibilityOfElementLocated(firstNameValue);
        return  driver.findElement(firstNameValue).getText();
    }
    public List<String> getContactDetailsValues() {
        WaitUtils.textToBePresentInElementLocated(header, CONTACT_DETAILS_HEADER);
        WaitUtils.visibilityOfElementLocated(header);
        List<WebElement> spans = driver.findElements(contactDetailsValues);
        List<String> spanValues = new ArrayList<>();
        for (WebElement span : spans) {
           spanValues.add(span.getText());
        }
        return spanValues;
    }

}
