package Register_Login_Logout;

import org.openqa.selenium.JavascriptExecutor;
import org.pages.HomePage;
import org.pages.AccountInfoPage;
import org.pages.SignUpPage;
import framework.engine.DriverFactory;
import framework.engine.JsonFileManager;
import framework.engine.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SignUp {
    WebDriver driver;
    JsonFileManager testData;

    @Test
    public void VerifyRegisterUser(){
        new HomePage(driver)
                .AssertOnHomePageHeader()
                .GoToSignUpPage();
        new SignUpPage(driver)
                .AssertOnSignUpPageHeader()
                .Register(testData.getTestData("signUp.name"), testData.getTestData("signUp.email"));
        new AccountInfoPage(driver)
                .AssertOnAccountInfoPageHeader()
                .InputAccountInfo(testData.getTestData("accountInfo.pass") ,
                        testData.getTestData("accountInfo.firstname"), testData.getTestData("accountInfo.lastname"),
                        testData.getTestData("accountInfo.company"), testData.getTestData("accountInfo.address1"),
                        testData.getTestData("accountInfo.address2"), testData.getTestData("accountInfo.state"),
                        testData.getTestData("accountInfo.city"), testData.getTestData("accountInfo.zipcode"),
                        testData.getTestData("accountInfo.mobilenumber"))
                .CreateAccountButton();
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
