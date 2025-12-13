package pages;

import org.openqa.selenium.WebDriver;
import utils.Constants;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        navigate(Constants.PAGE_URL);
        return this;
    }
}
