package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage extends BasePage {

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    //elements
    private By header = By.xpath("//h1");
    private By firstNameInput = By.id("firstName");
    private By lastNameInput = By.id("lastName");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By submitButton = By.id("submit");
    private By errorMessage = By.id("error");

    //actions
    public String getHeaderText() {
        return driver.findElement(header).getText();
    }
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }
    public String getErrorMessage() throws InterruptedException{
        Thread.sleep(1000);
        return driver.findElement(errorMessage).getText();
    }
    public void createNewUser(String firstName, String lastName, String email, String password){
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterPassword(password);
        clickSubmitButton();
    }

}
