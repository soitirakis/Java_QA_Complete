import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class EasyJetTests {

    @Test
    public static void scheduleFlight() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easyjet.com/en/");


        WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[@id=\"ensCloseBanner\"]"));
        acceptCookiesButton.click();

        WebElement clearSelectedDepartureButton = driver.findElement(By.xpath("//button[@aria-label=\"Clear selected departure airport\"]"));
        clearSelectedDepartureButton.click();

        WebElement flightFromInput = driver.findElement(By.xpath("//input[@id=\"from\"]"));
        flightFromInput.sendKeys("new york");

        List<WebElement> fromOptions = driver.findElements(By.xpath("//span[@data-testid=\"airport-name\"]"));
        for (WebElement option : fromOptions) {
            System.out.println(option.getText());
            if (option.getText().contains("JFK")) {
                option.click();
                break;
            }
        }

        WebElement flightToInput = driver.findElement(By.xpath("//input[@id=\"to\"]"));
        flightToInput.sendKeys("london");

        List<WebElement> toOptions = driver.findElements(By.xpath("//span[@data-testid=\"airport-name\"]"));
        for (WebElement option : toOptions) {
            System.out.println(option.getText());
            if  (option.getText().contains("LTN")) {
                option.click();
                break;
            }
        }

        WebElement datePickerInput = driver.findElement(By.xpath("//input[@id=\"when\"]"));
        datePickerInput.click();
        WebElement dateSelected = driver.findElement(By.xpath("//button[@data-testid=\"10-12-2025\"]"));
        dateSelected.click();

        WebElement whoIsFlying = driver.findElement(By.xpath("//input[@id=\"who\"]"));
        whoIsFlying.click();

        WebElement adultButton = driver.findElement(By.xpath("//button[@aria-label='Add one adult']"));
        adultButton.click();

        WebElement addChild = driver.findElement(By.xpath("//button[@aria-label='Add one child']"));
        addChild.click();
        addChild.click();

        WebElement addInfant = driver.findElement(By.xpath("//button[@aria-label='Add one infant']"));
        addInfant.click();

        WebElement applyButtton = driver.findElement(By.xpath("//button[@data-testid='close-button']"));
        applyButtton.click();

        WebElement showFlightsButton = driver.findElement(By.xpath("//button[@data-testid=\"submit\"]"));
        showFlightsButton.click();
    }
}
