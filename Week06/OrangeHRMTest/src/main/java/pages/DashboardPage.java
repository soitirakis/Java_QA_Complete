package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;


public class DashboardPage extends BasePage {

    @FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
    private WebElement buttonPIM;

    private By buttonPIMBy = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public PimPage clickOnPIMButton(){
        waitUtils.visibilityOfElementLocated(buttonPIMBy);
        buttonPIM.click();
        return new PimPage(driver);
    }
}
