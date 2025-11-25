package scoalaInformala;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {
    private final WebDriver driver;

    public  AddContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
