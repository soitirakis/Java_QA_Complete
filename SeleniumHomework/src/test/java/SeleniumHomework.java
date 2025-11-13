import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Duration;

public class SeleniumHomework {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //TODO 01.
        driver.get("https://9gag.com/");

        //TODO 02. //nu functioneza - o such element: Unable to locate element
       // WebElement oldMeme = driver.findElement(By.xpath("//div[contains(text(), \"Old Meme\")]"));
        //oldMeme.click();

        //TODO 03.
        WebElement newsButton = driver.findElement(By.xpath("//div[@class=\"home-tab-bar__tab home-tab-bar__tab-news\"]"));
        newsButton.click();

        //TODO 04 //nu functioneza - no such element: Unable to locate element: {"method":"xpath","selector":"//a[@href="/trending"]"}
        // WebElement trendingButton = driver.findElement(By.xpath("//a[@href=\"/trending\"]"));
        //trendingButton.click();


        //TODO 05.
        WebElement potatozButton = driver.findElement(By.xpath("//nav[@class=\"nav-menu\"]//a[@href=\"https://www.instagram.com/potatozzz\"]"));
        potatozButton.click();

        //TODO 06.
        //WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        //searchInput.sendKeys("'happy to know that are still good people in the world'");

        WebElement searchInput = wait.until (
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search...']"))
        );
        searchInput.sendKeys("'happy to know that are still good people in the world'");

       // CookieUtils.acceptCookiesIfPresent(driver);



      /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookie = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("div > button[title=\"Accept\"]"))
                );

        cookie.click();*/
       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement cookie = driver.findElement(By.xpath("//div[@id='sp_message_container_1395349']"));
        js.executeScript("arguments[0].setAttribute('style', 'display:none')", cookie);*/


       // cookie.click();

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



    }
}
