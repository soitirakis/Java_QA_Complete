package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PersonalDetailsPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Contact Details')]")
    private WebElement userContactDetails;

    private By userContactDetailsBy = By.xpath("//a[contains(text(), 'Contact Details')]");

    public PersonalDetailsPage(WebDriver driver) {
        super(driver);
    }

    public ContactDetails clickUserContactDetails() {
        waitUtils.visibilityOfElementLocated(userContactDetailsBy);
        userContactDetails.click();
        return new ContactDetails(driver);
    }
}
