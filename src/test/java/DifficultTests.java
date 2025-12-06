import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class DifficultTests {
     /*
    Using any language, framework and design pattern please write an
    automated test that performs the following:
    A. Navigate to https://ghost.org/
    B. Navigate to "Start here" section using the "Resources" menu.
    C. Search for “create new blog”
    D. Open the 10th result
    E. Scroll to the top of the page and open the “Pricing” section
    F. Change the “Based on an audience” slider to 25k members and verify that all the
    prices have increased.
     */

    @Test
    public void firstTest(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://ghost.org/");

        WebElement resourcesButton = driver.findElement(By.xpath("//button[span[text()='Resources']]"));
        resourcesButton.click();

        WebElement startHereButton = driver.findElement(By.xpath("//p[contains(text(),'Start here')]"));
        startHereButton.click();

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search-input']"));
        searchInput.sendKeys("create new blog");

        WebElement tenthResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ais-Hits-item search-result-item'][10]")));
        tenthResult.click();

        WebElement pricingButton = driver.findElement(By.xpath("//a[text()='Pricing']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(pricingButton).perform();

        pricingButton.click();


        //06.12.2025
        WebElement sliderInput = driver.findElement(By.xpath("//input[@id='members']"));

        WebElement audienceMembersNo = driver.findElement(By.xpath("//span[contains(@class, 'js-tooltip-count')]"));
        System.out.println(audienceMembersNo.getText());

        WebElement initialPricePublisher = driver.findElement(By.xpath("//p[contains(@data-price, \"publisher\")]"));
        String initialPricePublisherValue = initialPricePublisher.getText();

        WebElement initialPriceBusiness = driver.findElement(By.xpath("//p[contains(@data-price, \"business\")]"));
        String initialPriceBusinessValue = initialPriceBusiness.getText();

        while (!audienceMembersNo.getText().contains("25k")) {
            sliderInput.sendKeys(Keys.ARROW_RIGHT);
        }


        //WebElement audienceMembersNoAfter = driver.findElement(By.xpath("//span[contains(@class, 'js-tooltip-count')]"));
        //System.out.println(audienceMembersNoAfter.getText());


        By publisherPriceBy = By.xpath("//p[contains(@data-price, \"publisher\")]");
        By businessPriceBy = By.xpath("//p[contains(@data-price, \"business\")]");

        wait.until(ExpectedConditions.textToBePresentInElementLocated(publisherPriceBy, "141"));

        WebElement finalPricePublisher = driver.findElement(By.xpath("//p[contains(@data-price, \"publisher\")]"));
        String finalPricePublisherValue = finalPricePublisher.getText();


        wait.until(ExpectedConditions.textToBePresentInElementLocated(businessPriceBy, "266"));

        WebElement finalPriceBusiness = driver.findElement(By.xpath("//p[contains(@data-price, \"business\")]"));
        String finalPriceBusinessValue = finalPriceBusiness.getText();


        Assert.assertEquals(initialPricePublisherValue, "29");
        Assert.assertEquals(initialPriceBusinessValue, "199");


        Assert.assertEquals(finalPricePublisherValue, "141");
        Assert.assertEquals(finalPriceBusinessValue, "266");
        Assert.assertNotEquals(finalPriceBusinessValue, "260");

        WebElement tryForFreeLinkStarter = driver.findElement(By.xpath("//a[contains(@href, 'signup') and contains(text(), 'Try for free')]"));
        String classesTryForFreeLinkStarter = tryForFreeLinkStarter.getAttribute("class");

        Assert.assertTrue(classesTryForFreeLinkStarter.contains("opacity-60 cursor-not-allowed"));


    }
}
