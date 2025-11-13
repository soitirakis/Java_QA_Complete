import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class CookieUtils {

    public static void acceptCookiesIfPresent(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            // Try a few common selectors used by 9GAG-style banners
            // 1) Button containing "Accept" / "I Agree"
            WebElement acceptButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(., 'Accept') or contains(., 'I agree') or contains(., 'AGREE')]")
                    )
            );
            acceptButton.click();
            System.out.println("Cookie banner closed (clicked Accept).");
        } catch (TimeoutException e1) {
            // If no obvious Accept button – try to remove typical cookie elements by JS
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript(
                        "document.querySelectorAll('[id*=\"cookie\"], [class*=\"cookie\"], [id*=\"consent\"], [class*=\"consent\"]').forEach(e => e.remove());"
                );
                System.out.println("Cookie banner removed via JS.");
            } catch (Exception e2) {
                System.out.println("No cookie banner found or could not remove it.");
            }
        }
    }
}

