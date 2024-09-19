# Test Automation Using Selenium

A project designed to practice and enhance automation testing skills using Selenium. The project focuses on automating various user interactions with the Automation Exercise website, providing a hands-on approach to web UI testing.

## Key Features

- Automates test cases for an e-commerce website.
- Validates critical key user flows such as registration, login, product search, cart management, checkout, etc.
- Implements effective use of Selenium WebDriver for browser automation.
- Utilizes TestNG framework for structuring tests and generating reports.

## Technologies Used

- Java: Core language for test automation.
- Selenium WebDriver: Browser automation tool to interact with the web application.
- TestNG: Test framework for managing and executing tests.
- Maven: Build automation tool for managing dependencies and running test suites.

## Prerequisites

- Java JDK 8 or higher installed on your system.
- Maven installed and configured in your environment.
- A preferred browser (Chrome, Firefox, etc.) for running the automated tests.
- WebDriver for your preferred browser installed (e.g., chromedriver for Chrome).

## Setup Instructions

1. Clone the repository:

```bash
git clone https://github.com/your-username/AutomationExerciseSelenium.git
```
2. Ensure Maven is installed by running:

```bash
mvn -version
```
3. Install all necessary dependencies:

```bash
mvn clean install
```

4. Update the WebDriver path in the src/test/resources/config.properties file (if required).

## Project Structure

* src/main/java: Contains utility classes and WebDriver configuration.
* src/test/java: Contains test cases written using Selenium and TestNG.
* src/test/resources: Contains configuration files and test data.

## Current Test Cases

1. User Registration
2. User Login

## Future Enhancements

1. Complete the remaining test cases to ensure comprehensive test coverage.
2. Integrate Jenkins for streamlined Continuous Integration and automated testing workflows.
    
