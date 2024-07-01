package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DeletePage {
    private WebDriver driver;
    private final By deleteAccount_text = By.xpath("//div[@class='col-sm-9 col-sm-offset-1']//b");

    public DeletePage(WebDriver driver) {this.driver=driver;}

    public DeletePage AssertDeleteAccountHeader(){
        String phrase = driver.findElement(deleteAccount_text).getText();
        Assert.assertEquals(phrase, "ACCOUNT DELETED!");
        return this;
    }

}
