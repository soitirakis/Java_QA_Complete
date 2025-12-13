package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class ResourcePage extends BasePage {

    @FindBy(xpath = "//input[@id='search-input']")
    private WebElement searchInput;

    @FindBy(xpath = "//li[@class='ais-Hits-item search-result-item'][10]")
    private WebElement tenthSearchResult;

    private By tenthSearchResultBy = By.xpath("//li[@class='ais-Hits-item search-result-item'][10]");

    public ResourcePage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String query) {
        searchInput.sendKeys(query);
    }

    public BlogPage clickSearchResult() {
        WaitUtils.visibilityOfElementLocated(tenthSearchResultBy);
        tenthSearchResult.click();
        return new BlogPage(driver);
    }
}
