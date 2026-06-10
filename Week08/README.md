# Week 08 — Thinking Tester Contact List (Selenium + TestNG)

Automating the Thinking Tester Contact List application — sign-up, login, and adding a contact using randomly generated test data.

## Topics Covered

- Selenium WebDriver with TestNG
- Page Object Model with `PageFactory` and `@FindBy`
- Randomised test data generation (email, name, phone, birthdate, location)
- Sequential test flow: sign up → login → add contact
- TestNG `Assert` for result validation

## Contents

| File / Folder | Description |
| ------------- | ----------- |
| `selenium-tests/` | Maven project containing all pages, tests, and utilities |
| `selenium-tests/src/main/java/scoalaInformala/LandingPage.java` | Page object for the login / sign-up landing page |
| `selenium-tests/src/main/java/scoalaInformala/AddContactPage.java` | Page object for the Add Contact form |
| `selenium-tests/src/main/java/scoalaInformala/ContactListPage.java` | Page object for the contact list view |
| `selenium-tests/src/test/java/SeleniumTests.java` | TestNG tests: `createUser`, `login`, `addContact` |
| `selenium-tests/src/test/java/utils/Utils.java` | Random generators for email, name, phone, birthdate, city, and country |

## Test Scenarios

- **Sign up** — register a new user account on the application
- **Login** — authenticate with valid credentials
- **Add contact** — log in and create a contact with randomly generated personal details; assert the contact appears in the list

## How to Run

```bash
cd selenium-tests
mvn test
```

---

[← Week07](../Week07) | [Back to root](../README.md) | [Week09 →](../Week09)
