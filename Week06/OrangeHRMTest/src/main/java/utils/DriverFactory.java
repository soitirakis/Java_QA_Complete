package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver setUp(WebDriver driver){
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver TearDown(WebDriver driver) {
        driver.quit();
        return driver;
    }
}
