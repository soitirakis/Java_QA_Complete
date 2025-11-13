import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Duration;

public class SeleniumHomework {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://9gag.com/");

       // CookieUtils.acceptCookiesIfPresent(driver);

       // WebElement trendingButton = driver.findElement(By.xpath("//article[@id=\"jsid-post-awyP97B\"]//h1"));
        // trendingButton.click();

      /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookie = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("div > button[title=\"Accept\"]"))
                );

        cookie.click();*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement cookie = driver.findElement(By.xpath("//div[@id='sp_message_container_1395349']"));
        js.executeScript("arguments[0].setAttribute('style', 'display:none')", cookie);


       // cookie.click();

        WebElement newsButton = driver.findElement(By.xpath("//div[@class=\"home-tab-bar__tab home-tab-bar__tab-news\"]/h2"));
        newsButton.click();

        WebElement potatozButton = driver.findElement(By.xpath("//nav[@class=\"nav-menu\"]//a[@href=\"https://www.instagram.com/potatozzz\"]"));
        potatozButton.click();

       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement oldMeme = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[contains(@class ,'drawer-menu-item') and contains(@href, '/interest/oldmeme')]")
                )
        );
        oldMeme.click();*/

       // WebElement oldMeme = driver.findElement(By.xpath("//a[@class='drawer-menu-item' and contains(@href, '/interest/oldmeme')]"));
        //oldMeme.click();


        //remove cookies
     /*   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.9gag.com");
        try {
            WebElement acceptButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[@title='Accept']")
                    )
            );
            acceptButton.click();
            System.out.println("Accept button clicked");
        } catch (TimeoutException e) {
            System.out.println("Accept button timed out");
            System.out.println(e.getMessage());
        }
        driver.manage().deleteAllCookies();*/
     /*   WebElement searchButton = driver.findElement(By.xpath("//a[@class='search']"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchInput.sendKeys("'happy to know that are still good people in the world'");*/
    }
}
