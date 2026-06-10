# 🧪 Thinking Tester – Selenium Automation Project

This repository contains automated UI tests developed as part of **Thinking Tester homework**, using **Java + Selenium WebDriver** and following good QA automation practices.

The project is designed as a **learning and portfolio project**, demonstrating:
- UI automation concepts
- Page Object Model
- Test structuring
- Basic assertions and test flows

---

## 🚀 Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **IntelliJ IDEA**
- **ChromeDriver**

---

## 📂 Project Structure

```
thinking-tester-final/
├── .github/
│   └── workflows/
│       └── run-tests.yml          # GitHub Actions CI pipeline
│
├── src/
│   ├── main/
│   │   └── java/
|   |        └── driver/            
│   │          ├── DriverFactory.java
│   │          ├── WaitUtils.java
│   │        └── pages/               # Page Object Model (POM) classes
│   │          ├── BasePage.java
│   │          ├── LoginPage.java
│   │          └── HomePage.java
│   │        └── testdata/             # Test data classes, json files, constants 
│   │          ├── classes
│   │          ├── files
│   │          └── pages
│   │        └── utils/             
│   │          ├── Reader.java
│   │   
│   └── test/
│       └──  java/
│             └── tests/             # Test classes
│               ├── LoginTest.java
│               └── BaseTests.java
|               └── EditContactTests.java
|               └── AddNewContactTest.java
│                   
│
├── pom.xml                        # Maven dependencies & build config
├── README.md                      # Project documentation
└── .gitignore                     # Git ignored files
```