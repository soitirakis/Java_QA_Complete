# SauceDemo Test Automation Framework

![Java](https://img.shields.io/badge/Java-17-blue)
![Selenium](https://img.shields.io/badge/Selenium-4-green)
![TestNG](https://img.shields.io/badge/TestNG-Framework-orange)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![CI](https://github.com/soitirakis/saucedemo_final_project/actions/workflows/run-tests.yml/badge.svg)

Automated UI testing framework for the [SauceDemo](https://www.saucedemo.com) e-commerce web application, built with **Java, Selenium WebDriver, TestNG, and Maven**.

This project demonstrates a clean, scalable, and maintainable automation framework using industry best practices including Page Object Model, externalized test data, and CI/CD integration via GitHub Actions.

---

## 📌 What Is Tested

| Module | Test Scenarios |
|---|---|
| Login | Valid login, invalid credentials, locked-out user, empty fields |
| Inventory | Product listing, sorting (A-Z, Z-A, price low-high, price high-low) |
| Cart | Add/remove items, cart badge count, cart persistence |
| Checkout | Full checkout flow, user info validation, order confirmation |
| End-to-End | Complete purchase journey from login to order completion |
| Logout | Session termination and redirect |

---

## 🛠 Tech Stack

| Tool | Purpose |
|---|---|
| Java 17 | Primary language |
| Selenium WebDriver 4 | Browser automation |
| TestNG | Test framework and assertions |
| Maven | Build and dependency management |
| Jackson / json-simple | Test data handling (JSON) |
| Logback | Logging |
| GitHub Actions | CI/CD pipeline |

---

## 📁 Project Structure

```
saucedemo_final_project/
├── .github/
│   └── workflows/
│       └── run-tests.yml          # GitHub Actions CI pipeline
│
├── src/
│   ├── main/java/
│   │   ├── driver/
│   │   │   ├── DriverFactory.java         # WebDriver setup (Chrome/Firefox)
│   │   │   └── WaitUtils.java             # Explicit wait utilities
│   │   ├── pages/                         # Page Object Model classes
│   │   │   ├── BasePage.java
│   │   │   ├── LoginPage.java
│   │   │   ├── InventoryPage.java
│   │   │   ├── ShoppingCart.java
│   │   │   └── CheckoutSteps.java
│   │   ├── testdata/                      # Externalized test data
│   │   │   ├── classes/
│   │   │   ├── files/
│   │   │   └── pages/
│   │   └── utils/
│   │       ├── Reader.java
│   │       ├── Writer.java
│   │       ├── RandomGenerator.java
│   │       └── SortedGenerator.java
│   │
│   └── test/java/tests/
│       ├── BaseTests.java
│       ├── LoginTests.java
│       ├── InventoryTests.java
│       ├── FilterTests.java
│       ├── EndToEndTests.java
│       └── UserInformationTests.java
│
├── pom.xml
├── testng.xml
├── README.md
└── .gitignore
```

---

## 🚀 How to Run

### Prerequisites

- Java JDK 17+
- Maven 3.6+
- Google Chrome or Firefox

Verify your setup:
```bash
java -version
mvn -version
```

### Clone & Run

```bash
git clone https://github.com/soitirakis/saucedemo_final_project.git
cd saucedemo_final_project
```

Run all tests:
```bash
mvn clean test
```

Run with TestNG suite:
```bash
mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
```

Run on a specific browser:
```bash
mvn clean test -Dbrowser=chrome
mvn clean test -Dbrowser=firefox
```

### Test Reports

After execution, reports are available at:
```
target/surefire-reports/
```

---

## 📐 Design Principles

**Page Object Model (POM)** — Each page has a dedicated class, separating test logic from UI interaction for easier maintenance.

**DRY Principle** — Common functionality (driver setup, waits, utilities) is abstracted into reusable components.

**Test Isolation** — Each test is independent and can run individually or as part of a suite.

**Externalized Test Data** — Test data is stored in JSON files, keeping test logic clean and flexible.

**Logging** — Logback integration provides execution visibility and simplifies debugging.

**CI/CD Ready** — GitHub Actions pipeline runs the full test suite automatically on every push.

---

## 👤 Author

**Andrei-Cătălin Anghel**  
QA Automation Engineer | ATC Domain Specialist  
10+ years in safety-critical NATO ATC and C2 operations · Java · Selenium · TestNG

- GitHub: [github.com/soitirakis](https://github.com/soitirakis)
- LinkedIn: [linkedin.com/in/your-profile](https://linkedin.com/in/your-profile)
- Email: andrei.catalin.anghel04@gmail.com
