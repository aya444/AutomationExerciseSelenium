package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    private WebDriver driver;
    String pageURL = "http://automationexercise.com";
    private final By featuredItem_h2 = By.xpath("//div[@class='features_items']//h2[@class='title text-center']");
    private final By signUp_icon = By.xpath("//a[@href='/login']//i[@class='fa fa-lock']");
    private final By userLoggedIn_icon = By.xpath("//li/a[contains(., 'Logged in as') and ./b[text()='aya']]");

    private final By delete_icon = By.xpath("//li/a[contains(., 'Delete Account')]");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void NavigateToHomePage(){
        driver.navigate().to(pageURL);
    }

    public HomePage AssertOnHomePageHeader(){
        String phrase = driver.findElement(featuredItem_h2).getText();
        Assert.assertEquals(phrase, "FEATURES ITEMS");
        return this;
    }

    public HomePage GoToSignUpPage(){
        driver.findElement(signUp_icon).click();
        return this;
    }

    public HomePage VerifyLoggedIn(String name){
        String phrase = driver.findElement(userLoggedIn_icon).getText();
        Assert.assertEquals(phrase, "Logged in as " + name);
        return this;
    }

    public HomePage GoToDeletePage(){
        String phrase = driver.findElement(delete_icon).getText();
        Assert.assertEquals(phrase, "Delete Account");
        driver.findElement(delete_icon).click();
        return this;
    }
}
