package pages;

import driver.WaitUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testdata.classes.EditContact;
import testdata.classes.NewEditContact;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class EditContactPage extends BasePage {
    public EditContactPage(WebDriver driver) {
        super(driver);
    }

    //elements
    private By errorMessage = By.id("error");
    private By header = By.xpath("//h1");
    private By firstNameInput = By.id("firstName");
    private By lastNameInput = By.id("lastName");
    private By birthDateInput = By.id("birthdate");
    private By emailInput = By.id("email");
    private By phoneNumberInput = By.id("phone");
    private By streetOneInput = By.id("street1");
    private By streetTwoInput = By.id("street2");
    private By cityInput = By.id("city");
    private By stateProvinceInput = By.id("stateProvince");
    private By postalCodeInput = By.id("postalCode");
    private By countryInput = By.id("country");
    private By submitButton = By.id("submit");

    private By input = By.xpath("//p/input");

    //actions
    public List<String> getInputValues() {
        WaitUtils.textToBePresentInElementLocated(header, "Edit Contact");
        WaitUtils.visibilityOfElementLocated(header);
        List<WebElement> inputs = driver.findElements(input);
        List<String> inputValues = new ArrayList<>();
        for (WebElement input : inputs) {
            inputValues.add(input.getAttribute("value"));
        }
        return inputValues;
    }

    public String getHeaderText(){
        WaitUtils.textToBePresentInElementLocated(header, "Edit Contact");
        return driver.findElement(header).getText();
    }
    public String getErrorMessage() throws InterruptedException{
        Thread.sleep(1000);
        return driver.findElement(errorMessage).getText();
    }
    public void clearInput(By element) {
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
    }
    public void editFirstName(String firstName) {
        clearInput(firstNameInput);
        driver.findElement(firstNameInput).sendKeys(firstName);
    }
    public void editLastName(String lastName) {
        clearInput(lastNameInput);
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
    public void editBirthDate(String birthDate) {
        clearInput(birthDateInput);
        driver.findElement(birthDateInput).sendKeys(birthDate);
    }
    public void editEmail(String email) {
        clearInput(emailInput);
        driver.findElement(emailInput).sendKeys(email);
    }
    public void editPhoneNumber(String phoneNumber) {
        clearInput(phoneNumberInput);
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
    }
    public void editStreetOne(String streetOne) {
        clearInput(streetOneInput);
        driver.findElement(streetOneInput).sendKeys(streetOne);
    }
    public void editStreetTwo(String streetTwo) {
        clearInput(streetTwoInput);
        driver.findElement(streetTwoInput).sendKeys(streetTwo);
    }
    public void editCity(String city) {
        clearInput(cityInput);
        driver.findElement(cityInput).sendKeys(city);
    }
    public void editStateProvince(String stateProvince) {
        clearInput(stateProvinceInput);
        driver.findElement(stateProvinceInput).sendKeys(stateProvince);
    }
    public void editPostalCode(String postalCode) {
        clearInput(postalCodeInput);
        driver.findElement(postalCodeInput).sendKeys(postalCode);
    }
    public void editCountry(String country) {
        clearInput(countryInput);
        driver.findElement(countryInput).sendKeys(country);
    }
    public void clickSubmitButton() {

        //driver.findElement(submitButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement btn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});", btn
        );

        wait.until(ExpectedConditions.elementToBeClickable(submitButton));

        try {
            btn.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
        }
    }
    public void editContactNewData(NewEditContact user) {
        editFirstName(user.getFirstName());
        System.out.println(driver.findElement(firstNameInput).getAttribute("value"));

        editLastName(user.getLastName());
        editBirthDate(user.getDob());
        editEmail(user.getEmail());
        editPhoneNumber(user.getPhone());
        editStreetOne(user.getStreet1());
        editStreetTwo(user.getStreet2());
        editCity(user.getCity());
        editStateProvince(user.getStateProvince());
        editPostalCode(user.getPostalCode());
        editCountry(user.getCountry());

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("""
  window.__dbg = {click:false, submit:false, prevented:null, submits:0};
  const btn = document.querySelector('#submit');
  const form = document.querySelector('form');

  if (btn) {
    btn.addEventListener('click', (e) => {
      window.__dbg.click = true;
    }, true);
  }

  if (form) {
    form.addEventListener('submit', (e) => {
      window.__dbg.submit = true;
      window.__dbg.submits++;
      // microtask: după ce handler-ele rulează, vedem dacă e preventDefault
      Promise.resolve().then(() => window.__dbg.prevented = e.defaultPrevented);
    }, true);
  }
""");

        clickSubmitButton();

        Object dbg = ((JavascriptExecutor) driver).executeScript("return window.__dbg;");
        System.out.println("DBG=" + dbg);
        System.out.println("URL=" + driver.getCurrentUrl());

    }
}
