# Week 06 — Selenium WebDriver Basics

First Selenium tests — automating the OrangeHRM application with a raw WebDriver script, then refactoring to a Page Object Model structure with TestNG.

## Topics Covered

- Selenium WebDriver setup and ChromeDriver configuration
- Locating elements with CSS selectors and XPath
- TestNG and JUnit test runners
- Page Object Model (POM) pattern
- `PageFactory` and `@FindBy` annotations
- Explicit waits with `WebDriverWait`
- Extracting driver lifecycle into a `DriverFactory`

## Contents

| File / Folder | Description |
| ------------- | ----------- |
| `OrangeHRM/` | Raw Selenium project: single-script login-to-save flow |
| `OrangeHRM/src/test/java/OrangeHRM.java` | Login → PIM → search employee → update contact details |
| `OrangeHRMTest/` | Refactored project using POM and TestNG |
| `OrangeHRMTest/src/main/java/pages/` | Page classes: HomePage, LoginPage, DashboardPage, PimPage, PersonalDetailsPage, ContactDetails |
| `OrangeHRMTest/src/main/java/utils/DriverFactory.java` | ChromeDriver lifecycle management |
| `OrangeHRMTest/src/main/java/utils/WaitUtils.java` | Explicit wait utility methods |
| `OrangeHRMTest/src/test/java/OrangeHRMTests.java` | TestNG test covering the full POM-based contact update flow |
| `src/test/java/CalculatorTest.java` | JUnit unit test for a simple Calculator class |

## Test Scenarios

- Log in to [OrangeHRM](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login) with valid credentials
- Navigate to the PIM module and search for an employee by name
- Open the employee's Contact Details tab
- Update Street 1, City, and Mobile Phone fields and save

## How to Run

```bash
# POM project (TestNG)
cd OrangeHRMTest
mvn test

# Raw Selenium project (JUnit)
cd OrangeHRM
mvn test
```

---

[← Week05](../Week05) | [Back to root](../README.md) | [Week07 →](../Week07)
