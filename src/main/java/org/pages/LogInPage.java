package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogInPage {
    private WebDriver driver;
    private final By logIn_h2 = By.xpath("//div[@class='login-form']//h2");
    private final By logIn_email_textarea = By.xpath("//div[@class='login-form']//input[@name='email']");
    private final By getLogIn_Password_textarea = By.xpath("//div[@class='login-form']//input[@name='password']");
    private final By logIn_button = By.xpath("//div[@class='login-form']//button[@type='submit']");

    public LogInPage(WebDriver driver) {this.driver=driver;}

    public LogInPage AssertOnLogInPageHeader(){
        String phrase = driver.findElement(logIn_h2).getText();
        Assert.assertEquals(phrase, "Login to your account");
        return this;
    }

    public LogInPage LogIn(String email, String password){
        driver.findElement(logIn_email_textarea).sendKeys(email);
        driver.findElement(getLogIn_Password_textarea).sendKeys(password);
        driver.findElement(logIn_button).click();
        return this;
    }

}
