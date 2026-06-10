# Week 09 — Page Object Model Across Multiple Applications

Applying the Page Object Model to two different applications — the Ghost.org pricing page and EasyJet flight search — and comparing POM against raw Selenium side by side.

## Topics Covered

- POM architecture spanning multiple applications
- Selenium slider interaction
- Dynamic price verification after UI state change
- TestNG test organisation across multiple test classes
- Shared `Constants` and `Utils` classes
- Raw Selenium vs POM comparison in the same project

## Contents

| File / Folder | Description |
| ------------- | ----------- |
| `selenium-tests-POM/` | Maven project containing all pages, tests, and utilities |
| `selenium-tests-POM/src/main/java/pages/` | POM pages for Ghost.org (HomePage, HeaderNavigation, ResourcePage, PricingPage) |
| `selenium-tests-POM/src/main/java/scoalaInformala/` | POM pages for Thinking Tester (LandingPage, AddContactPage, ContactListPage) |
| `selenium-tests-POM/src/main/java/utils/DriverFactory.java` | ChromeDriver lifecycle management |
| `selenium-tests-POM/src/main/java/utils/WaitUtils.java` | Explicit wait helpers |
| `selenium-tests-POM/src/main/java/utils/Constants.java` | Application URLs and expected price constants |
| `selenium-tests-POM/src/main/java/utils/Utils.java` | Random data generators (reused from Week08) |
| `selenium-tests-POM/src/test/java/DifficultTests.java` | Ghost.org: POM and raw Selenium approaches compared |
| `selenium-tests-POM/src/test/java/EasyJetTests.java` | EasyJet flight search automation |
| `selenium-tests-POM/src/test/java/SeleniumTests.java` | Thinking Tester: sign-up, login, add contact |

## Test Scenarios

- **Ghost.org** — navigate to the Pricing page, move the members slider to 25K, and verify that publisher and business prices update to expected values (`$141` and `$266`)
- **EasyJet** — search for a flight: select departure and destination airports, choose a date, and add 2 adults and 1 infant
- **Thinking Tester** — sign-up, login, and add-contact flow (same as Week08, exercised via POM)

## How to Run

```bash
cd selenium-tests-POM
mvn test
```

---

[← Week08](../Week08) | [Back to root](../README.md) | [Week10 →](../Week10)
