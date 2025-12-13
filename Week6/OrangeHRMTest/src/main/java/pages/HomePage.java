package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private static final String PAGE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open(){
        navigateTo(PAGE_URL);
        return this;
    }

}
