# Week 07 — Selenium Form Interactions (DemoQA)

Automating DemoQA form controls — filling text inputs, expanding a checkbox tree, and selecting radio buttons.

## Topics Covered

- Selenium WebDriver form interactions
- Locating elements by CSS selector and XPath
- Expanding tree nodes and toggling checkboxes
- Selecting radio buttons
- Using `Actions` for click-and-release interactions
- JUnit 4 test structure

## Contents

| File / Folder | Description |
| ------------- | ----------- |
| `DemoQA/` | Maven project containing all test code |
| `DemoQA/src/test/java/DemoQA.java` | Selenium test: fill text box form, toggle checkboxes, select radio button |

## Test Scenarios

- Fill the [DemoQA Text Box](https://demoqa.com/text-box) form with name, email, current address, and permanent address; submit and verify the output
- Expand the checkbox tree on the [Check Box](https://demoqa.com/checkbox) page and check the Desktop and Documents nodes
- Select the **Impressive** radio button on the [Radio Button](https://demoqa.com/radio-button) page

## How to Run

```bash
cd DemoQA
mvn test
```

---

[← Week06](../Week06) | [Back to root](../README.md) | [Week08 →](../Week08)
