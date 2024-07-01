package Register_Login_Logout;

import framework.engine.DriverFactory;
import framework.engine.JsonFileManager;
import framework.engine.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.pages.DeletePage;
import org.pages.HomePage;
import org.pages.LogInPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogIn {
    WebDriver driver;
    JsonFileManager testData;

    @Test
    public void VerifyLogInUser(){
        new HomePage(driver)
                .AssertOnHomePageHeader()
                .GoToSignUpPage();
        new LogInPage(driver)
                .AssertOnLogInPageHeader()
                .LogIn(testData.getTestData("logIn.email"), testData.getTestData("logIn.password"));
        new HomePage(driver)
                .VerifyLoggedIn(testData.getTestData("signUp.name"))
                .GoToDeletePage();
        new DeletePage(driver)
                .AssertDeleteAccountHeader();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.initDriver();
        new HomePage(driver).NavigateToHomePage();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    @BeforeClass
    public void beforeClass() {
        PropertiesReader.loadProperties();
        testData = new JsonFileManager("src/test/resources/TestData.json");
    }
}
