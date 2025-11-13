import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRM {
    public static void main(String[] args) {
        WebDriver  driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String userName = "Admin";
        String password = "admin123";


        //TODO 01. login on site
        WebElement usernameInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]"))
        );
        usernameInput.sendKeys(userName);

        WebElement passwordInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]"))
        );
        passwordInput.sendKeys(password);


        WebElement submitButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]"))
        );
       submitButton.click();

       //TODO 02. click on PIM
        WebElement buttonPIM = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/web/index.php/pim/viewPimModule\"]"))
        );
        buttonPIM.click();

        //TODO 03. search user by name
        WebElement searchByName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][1]//input"))
        );
        searchByName.sendKeys("aaa");

        WebElement searchButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]"))
        );
        searchButton.click();

        //TODO 04. access the user page
        WebElement selectFirstElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"oxd-table-body\"]/div[@class=\"oxd-table-card\"][1]"))
        );
        selectFirstElement.click();

        //TODO 05. navigate to contact details
        WebElement contactDetails =  wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), \"Contact Details\")]"))
        );
        contactDetails.click();

        //TODO 06. add contacts or update
        //Street 1
        WebElement streetOne =   wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), \"Street 1\")]/following::input[1]"))
        );
        streetOne.sendKeys("Some Street");

        //City
        WebElement city =   wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), \"City\")]/following::input[1]"))
        );
        city.sendKeys("Best City");

        //Mobile
        WebElement mobilePhone =   wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), \"Mobile\")]/following::input[1]"))
        );
        mobilePhone.sendKeys("0123456789");

        //TODO 07. save
        WebElement saveButton =   wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]"))
        );
        saveButton.click();
    }
}
