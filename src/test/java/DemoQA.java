import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;
import org.junit.Assert;

import java.time.Duration;

public class DemoQA {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriver driver2 = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/");
        driver2.get("https://demoqa.com/elements");

        String userName = "Andrei";
        String userEmail = "someEmail.com";
        String userCurrentAddress = "some random address";
        String userPermanentAddress = "some random address too";


        //TODO 01. Elements->Text box

        /*WebElement elements = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"category-cards\"]/div[1]"))
        );*/
        WebElement elements = driver.findElement(By.xpath("//div[@class=\"category-cards\"]/div[1]"));
        //clickWithActions(driver, elements);
        new Actions(driver).moveToElement(elements).pause(Duration.ofSeconds(1)).click(elements).perform();


        //TODO 02. Text box
        WebElement textBox = driver2.findElement(By.xpath("//ul[@class=\"menu-list\"]/li[@id=\"item-0\"]/span[contains(text(), \"Text Box\")]"));
        textBox.click();

        //TODO 03. submit the form
        WebElement inputUserName = driver2.findElement(By.xpath("//input[@id=\"userName\"]"));
        inputUserName.sendKeys(userName);

        WebElement inputUserEmail = driver2.findElement(By.xpath("//input[@id=\"userEmail\"]"));
        inputUserEmail.sendKeys(userEmail);

        WebElement inputUserCurrentAddress = driver2.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
        inputUserCurrentAddress.sendKeys(userCurrentAddress);

        WebElement inputUserPermanentAddress = driver2.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        inputUserPermanentAddress.sendKeys(userPermanentAddress);

        WebElement submitButton = driver2.findElement(By.xpath("//button[@id=\"submit\"]"));
        new Actions(driver2).click(submitButton).perform();

        //TODO 04. Elements -> Check box -> Desktop + Documents
        WebElement checkBox = driver2.findElement(By.xpath("//ul[@class=\"menu-list\"]/li[@id=\"item-1\"]/span[contains(text(), \"Check Box\")]"));
        checkBox.click();

        WebElement buttonToggle = driver2.findElement(By.xpath("//button[@title=\"Toggle\"]"));
        buttonToggle.click();

        WebElement treeNodeDesktop = driver2.findElement(By.xpath("//label[@for=\"tree-node-desktop\"]"));
        treeNodeDesktop.click();

        WebElement treeNodeDocuments = driver2.findElement(By.xpath("//label[@for=\"tree-node-documents\"]"));
        treeNodeDocuments.click();

        //TODO 05. Elements->Radio buttons -> Impressive
        WebElement radioButtons = driver2.findElement(By.xpath("//ul[@class=\"menu-list\"]/li[@id=\"item-2\"]/span[contains(text(), \"Radio Button\")]"));
        radioButtons.click();

        WebElement impressiveRadioButton = driver2.findElement(By.xpath("//label[@for=\"impressiveRadio\"]"));
        impressiveRadioButton.click();

    }
    public static void clickWithActions(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    @Test
    public void clickandRelease(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        WebElement clickable = driver.findElement(By.xpath("//div[@class=\"category-cards\"]/div[1]"));

        new Actions(driver).click(clickable).perform();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://demoqa.com/elements"));

    }
}
