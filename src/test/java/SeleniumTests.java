import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import scoalaInformala.AddContactPage;
import scoalaInformala.ContactListPage;
import scoalaInformala.LandingPage;
import utils.Utils;

import java.time.Duration;

public class SeleniumTests {


    @Test
    public static void createUser(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        WebElement signUpButton = driver.findElement(By.id("signup"));
        signUpButton.click();

        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("Razvan");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("Pruteanu");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(Utils.generateRandomEmail());

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("JKDHAKDHiiufd*&*&98_");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement contactListHeaderFound = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text() = 'Contact List']")));
        Assert.assertTrue(contactListHeaderFound.isDisplayed());

        driver.close();
    }
    @Test
    public static void login(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        LandingPage landingPage = new LandingPage(driver);
        landingPage.emailInput.sendKeys("testr@tesr.com");
        landingPage.passwordInput.sendKeys("testr123456789");
        landingPage.submitButton.click();

        ContactListPage contactListPage = new ContactListPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement contactListHeader = wait.until(ExpectedConditions.visibilityOf(contactListPage.contactListHeader));
        Assert.assertTrue(contactListHeader.isDisplayed());

        driver.close();
    }

    @Test
    public static void addContact(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        LandingPage landingPage = new LandingPage(driver);
        landingPage.emailInput.sendKeys("testr@tesr.com");
        landingPage.passwordInput.sendKeys("testr123456789");
        landingPage.submitButton.click();

        ContactListPage contactListPage = new ContactListPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement contactListHeader = wait.until(ExpectedConditions.visibilityOf(contactListPage.contactListHeader));
        contactListPage.addANewContact.click();

        //variables
        String firstName_ = Utils.generateRandomName();
        String lastName_ = Utils.generateRandomName();
        String city = Utils.generateRandomCity();

        AddContactPage addContactPage = new AddContactPage(driver);
        addContactPage.firstName.sendKeys(firstName_);
        addContactPage.lastName.sendKeys(lastName_);
        addContactPage.birthDate.sendKeys(Utils.generateRandomBirthDate());
        addContactPage.email.sendKeys(Utils.generateRandomEmail());
        addContactPage.phone.sendKeys(Utils.generateRandomPhone());
        addContactPage.street1.sendKeys("SomeStree1");
        addContactPage.street2.sendKeys("SomeStree2");
        addContactPage.city.sendKeys(city);
        addContactPage.stateProvince.sendKeys(Utils.generateProvence(city));
        addContactPage.postalCode.sendKeys("");
        addContactPage.country.sendKeys("Romania");
        addContactPage.submit.click();

        WebElement newContactAdded = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text() ='"+firstName_+" "+lastName_+"']")));
        Assert.assertTrue(newContactAdded.isDisplayed());
    }
}
