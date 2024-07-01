package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUpPage {
    private WebDriver driver;
    private final By signUp_h2 = By.xpath("//div[@class='signup-form']//h2");
    private final By name_textarea = By.xpath("//input[@name='name']");
    private final By email_textarea = By.xpath("//div[@class='signup-form']//input[@name='email']");
    private final By signUp_button = By.xpath("//button[@data-qa='signup-button']");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage AssertOnSignUpPageHeader(){
        String phrase = driver.findElement(signUp_h2).getText();
        Assert.assertEquals(phrase, "New User Signup!");
        return this;
    }

    public SignUpPage Register(String name, String email){
        driver.findElement(name_textarea).sendKeys(name);
        driver.findElement(email_textarea).sendKeys(email);
        driver.findElement(signUp_button).click();
        return this;
    }

}
