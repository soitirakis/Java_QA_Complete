import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Duration;

public class SeleniumHomework {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //TODO 01.

        driver.get("https://9gag.com/");

        //TODO COOKIES

         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[id^='sp_message_iframe_']")));

         WebElement acceptBtn = wait.until(
                 ExpectedConditions.elementToBeClickable(By.cssSelector("button[title='Accept']"))
         );
        acceptBtn.click();

        driver.switchTo().defaultContent();


        //TODO 02. //nu functioneza - o such element: Unable to locate element
       // WebElement oldMeme = driver.findElement(By.xpath("//div[contains(text(), \"Old Meme\")]"));
      //  oldMeme.click();

        //TODO 03.
        WebElement newsButton = driver.findElement(By.xpath("//div[@class=\"home-tab-bar__tab home-tab-bar__tab-news\"]"));
        newsButton.click();

        //TODO 04 //nu functioneza - no such element: Unable to locate element: {"method":"xpath","selector":"//a[@href="/trending"]"}
        //WebElement trendingButton = driver.findElement(By.xpath("//a[@href=\"/trending\"]"));
        //trendingButton.click();


        //TODO 05.
        WebElement potatozButton = driver.findElement(By.xpath("//nav[@class=\"nav-menu\"]//a[@href=\"https://www.instagram.com/potatozzz\"]"));
        potatozButton.click();

        //TODO 06.
        WebElement searchButton = driver.findElement(By.xpath("//a[@class=\"search\"]"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchInput.sendKeys("'happy to know that are still good people in the world'");
        searchInput.submit();

    }
}
