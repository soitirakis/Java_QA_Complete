import jdk.jshell.execution.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Utils;

import java.time.Duration;

public class SeleniumTests {


    @Test
    public static void createUser(){
        String userFirstName = "Andrei";
        String userLastName = "Andy";
        String userEmail = "andrei123@example.com";
        String userPassword = "andrei123";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        WebElement signUpButton = driver.findElement(By.id("signup"));
        signUpButton.click();

        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        //firstNameInput.sendKeys("Razvan");
        firstNameInput.sendKeys(userFirstName);

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        //lastNameInput.sendKeys("Pruteanu");
        lastNameInput.sendKeys(userLastName);

        WebElement emailInput = driver.findElement(By.id("email"));
        //emailInput.sendKeys(Utils.generateRandomEmail());
        emailInput.sendKeys(userEmail);

        WebElement passwordInput = driver.findElement(By.id("password"));
        //passwordInput.sendKeys("JKDHAKDHiiufd*&*&98_");
        passwordInput.sendKeys(userPassword);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement contactListHeaderFound = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text() = 'Contact List']")));
        Assert.assertTrue(contactListHeaderFound.isDisplayed());

        driver.close();
    }

    @Test
    public static void login(){
        String userEmail = "andrei123@example.com";
        String userPassword = "andrei123";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(userEmail);

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(userPassword);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout")));
        Assert.assertTrue(logoutButton.isDisplayed());

        logoutButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://thinking-tester-contact-list.herokuapp.com/"));
        driver.close();
    }

}
