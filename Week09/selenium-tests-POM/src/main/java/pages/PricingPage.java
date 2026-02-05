package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitUtils;

import java.time.Duration;

import static utils.Constants.BUSINESS_PRICE;
import static utils.Constants.PUBLISHER_PRICE;


public class PricingPage extends BasePage {

    //public static final String PUBLISHER_PRICE = "141";
    //public static final String BUSINESS_PRICE = "266";

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//input[@id='members']")
    private WebElement sliderInput;

    @FindBy(xpath = "//span[contains(@class, 'js-tooltip-count')]")
    private WebElement sliderCount;

    @FindBy(xpath = "//p[@data-price='publisher']")
    private WebElement publisherPrice;

    @FindBy(xpath = "//p[@data-price='business']")
    private WebElement businessPrice;

    By publisherPriceBy = By.xpath("//p[@data-price='publisher']");
    By businessPriceBy = By.xpath("//p[@data-price='business']");

    public PricingPage(WebDriver driver) {
        super(driver);
    }

    public void pushSliderCount(String amount){
        while(!sliderCount.getText().contains(amount)){
            sliderInput.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getPublisherPriceValue() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(publisherPriceBy, PUBLISHER_PRICE));
        return publisherPrice.getText();
    }

    public String getBusinessPriceValue() {
        WaitUtils.textToBePresentInElementLocated(businessPriceBy, BUSINESS_PRICE);
        return businessPrice.getText();
    }
}
