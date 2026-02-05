package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetails extends BasePage{

    @FindBy(xpath = "//label[contains(text(), 'Street 1')]/following::input[1]")
    private WebElement streetOneInput;

    @FindBy(xpath = "//label[contains(text(), 'City')]/following::input[1]")
    private WebElement cityInput;

    @FindBy(xpath = "//label[contains(text(), 'Mobile')]/following::input[1]")
    private WebElement mobilePhoneInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;

    private By streetOneInputBy = By.xpath("//label[contains(text(), 'Street 1')]/following::input[1]");
    private By cityInputBy = By.xpath("//label[contains(text(), 'City')]/following::input[1]");
    private By mobilePhoneInputBy = By.xpath("//label[contains(text(), 'Mobile')]/following::input[1]");

    public ContactDetails(WebDriver driver) {
        super(driver);
    }
    public void addStreetOneInput(String url) {
        waitUtils.visibilityOfElementLocated(streetOneInputBy);
        streetOneInput.sendKeys(url);
    }
    public void addCityInput(String url) {
        waitUtils.visibilityOfElementLocated(cityInputBy);
        cityInput.sendKeys(url);
    }
    public void addMobilePhoneInput(String url) {
        waitUtils.visibilityOfElementLocated(mobilePhoneInputBy);
        mobilePhoneInput.sendKeys(url);
    }
    public void clickSaveButton() {
        saveButton.click();
    }

}
