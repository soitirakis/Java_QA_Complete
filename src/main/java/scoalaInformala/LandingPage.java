package scoalaInformala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    WebDriver driver;
    public WebElement passwordInput;
    public WebElement emailInput;
    public WebElement submitButton;
    public WebElement signUpButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        this.emailInput = driver.findElement(By.id("email"));
        this.passwordInput = driver.findElement(By.id("password"));
        this.submitButton = driver.findElement(By.id("submit"));
        this.signUpButton = driver.findElement(By.id("signup"));
    }

}
