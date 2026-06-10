# Week 10 — Full POM Framework (Thinking Tester v2)

A professional-grade POM framework for the Thinking Tester Contact List app — dedicated driver factory, comprehensive page objects, and a full TestNG suite covering login, user creation, and contact CRUD.

## Topics Covered

- Layered POM architecture (`driver/`, `pages/`, test classes)
- `DriverFactory` with `ChromeOptions` (popup and notification suppression)
- Shared `BasePage` and `WaitUtils`
- TestNG `@BeforeMethod` for consistent test setup
- Positive and negative test scenarios with error message assertions
- Browser alert handling (confirm-delete dialog)
- Contact CRUD: create, read, update, delete

## Contents

| File / Folder | Description |
| ------------- | ----------- |
| `thinking-tester-v2/` | Maven project containing all source and test code |
| `thinking-tester-v2/src/main/java/driver/DriverFactory.java` | Creates and tears down a ChromeDriver with options |
| `thinking-tester-v2/src/main/java/driver/WaitUtils.java` | Explicit wait utilities |
| `thinking-tester-v2/src/main/java/pages/BasePage.java` | Shared base page with WebDriver reference and navigation helper |
| `thinking-tester-v2/src/main/java/pages/LoginPage.java` | Login page — `authenticate()` convenience method |
| `thinking-tester-v2/src/main/java/pages/AddUserPage.java` | Sign-up page — `createNewUser()` convenience method |
| `thinking-tester-v2/src/main/java/pages/ContactListPage.java` | Contact list — visibility checks and add/edit navigation |
| `thinking-tester-v2/src/main/java/pages/AddContactPage.java` | Add Contact form — all fields including address and country |
| `thinking-tester-v2/src/main/java/pages/ContactDetailsPage.java` | Contact detail view — edit, delete (with alert), and return |
| `thinking-tester-v2/src/main/java/pages/EditContactPage.java` | Edit Contact form — field-level update methods |
| `thinking-tester-v2/src/test/java/BaseTests.java` | `@BeforeMethod`: driver setup and login page initialisation |
| `thinking-tester-v2/src/test/java/LoginTests.java` | Valid login, invalid credentials, missing credentials |
| `thinking-tester-v2/src/test/java/AddUserTests.java` | Valid sign-up, missing fields, invalid email, invalid password |
| `thinking-tester-v2/src/test/java/AddContactTests.java` | Valid contact creation, missing required fields |
| `thinking-tester-v2/src/test/java/EditContactTests.java` | Edit contact, first name too long, delete contact, return to list |

## Test Scenarios

- **Login** — valid credentials, invalid credentials, missing credentials
- **Sign up** — valid user, missing required fields, invalid email format, password too short
- **Add contact** — complete valid contact, missing required fields validation
- **Edit contact** — update all fields, first name exceeds length limit, delete with alert confirmation, return to contact list

## How to Run

```bash
cd thinking-tester-v2
mvn test
```

---

[← Week09](../Week09) | [Back to root](../README.md) | [Week11 →](../Week11)
