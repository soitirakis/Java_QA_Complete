package scoalaInformala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactList {
    WebDriver driver;
    public WebElement contactListHeader;
    public By contactListHeaderBy = By.xpath("//h1[text()='Contact List']");

    public ContactList(WebDriver driver) {
        this.driver = driver;
        this.contactListHeader = driver.findElement(By.xpath("//h1[text()='Contact List']"));
    }
}
