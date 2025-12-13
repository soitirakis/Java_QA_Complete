package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;



public class LoginPage extends BasePage{


    @FindBy(xpath = "//input[@name='username']")
    private WebElement loginUser;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    By loginUserBy = By.xpath("//input[@name='username']");
    By loginPasswordBy = By.xpath("//input[@name='password']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void addUsernameIntoInput(String username) {
        waitUtils.visibilityOfElementLocated(loginUserBy);
        loginUser.sendKeys(username);
    }

    public void addPasswordIntoInput(String password) {
        waitUtils.visibilityOfElementLocated(loginPasswordBy);
        loginPassword.sendKeys(password);
    }

    public DashboardPage submitLogin() {
        loginButton.click();
        return new DashboardPage(driver);
    }
}
