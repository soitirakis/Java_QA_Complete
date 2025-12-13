package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PimPage extends BasePage{

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//input")
    private WebElement employeeNameInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='oxd-table-body']/div[@class='oxd-table-card']")
    private WebElement employeeSearchResult;

    private By employeeNameInputBy = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//input");
    private By searchButtonBy = By.xpath("//button[@type='submit']");
    private By employeeSearchResultBy = By.xpath("//div[@class='oxd-table-body']/div[@class='oxd-table-card']");

    public PimPage(WebDriver driver) {
        super(driver);
    }

    public void addEmployeeNameInput(String employeeName){
        waitUtils.visibilityOfElementLocated(employeeNameInputBy);
        employeeNameInput.sendKeys(employeeName);
    }

    public void searchForEmployee(){
        waitUtils.visibilityOfElementLocated(searchButtonBy);
        searchButton.click();
    }

    public PersonalDetailsPage clickEmployeeResultLink(){
        waitUtils.visibilityOfElementLocated(employeeSearchResultBy);
        employeeSearchResult.click();
        return new PersonalDetailsPage(driver);
    }

}
