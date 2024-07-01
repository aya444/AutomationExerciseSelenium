package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountInfoPage {
    private WebDriver driver;
    private final By accountInfo_h2 = By.xpath("//div[@class='login-form']/h2[@class='title text-center']");
    private final By gender_textarea = By.xpath("//input[@id='id_gender2']");
    private final By passphrase_textarea = By.xpath("//input[@data-qa='password']");
    private final By days_select = By.xpath("//select[@id='days']//option[@value='3']");
    private final By months_select = By.xpath("//select[@id='months']//option[@value='12']");
    private final By years_select = By.xpath("//select[@id='years']//option[@value='2001']");
    private final By newspaper_check = By.xpath("//label[@for='newsletter']");
    private final By option_check = By.xpath("//label[@for='optin']");
    private final By firstName_textarea = By.xpath("//input[@name='first_name']");
    private final By lastName_textarea = By.xpath("//input[@name='last_name']");
    private final By company_textarea = By.xpath("//input[@name='company']");
    private final By address1_textarea = By.xpath("//input[@name='address1']");
    private final By address2_textarea = By.xpath("//input[@name='address2']");
    private final By country_select = By.xpath("//select[@id='country']//option[@value='Canada']");
    private final By state_textarea = By.xpath("//input[@name='state']");
    private final By city_textarea = By.xpath("//input[@name='city']");
    private final By zipcode_textarea = By.xpath("//input[@name='zipcode']");
    private final By mobileNumber_textarea = By.xpath("//input[@name='mobile_number']");
    private final By createAccount_button = By.xpath("//button[@data-qa='create-account']");
    private final By accountCreated_h2 = By.xpath("//h2[@class='title text-center']");

    public AccountInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public AccountInfoPage AssertOnAccountInfoPageHeader(){
        String phrase = driver.findElement(accountInfo_h2).getText();
        Assert.assertEquals(phrase, "ENTER ACCOUNT INFORMATION");
        return this;
    }

    public AccountInfoPage InputAccountInfo(String pass, String firstname, String lastname,
                                            String company, String address1, String address2, String state, String city,
                                            String zipcode, String mobilenumber){
        driver.findElement(gender_textarea).click();
        driver.findElement(passphrase_textarea).sendKeys(pass);
        driver.findElement(days_select).click();
        driver.findElement(months_select).click();
        driver.findElement(years_select).click();
        driver.findElement(newspaper_check).click();
        driver.findElement(option_check).click();
        driver.findElement(firstName_textarea).sendKeys(firstname);
        driver.findElement(lastName_textarea).sendKeys(lastname);
        driver.findElement(company_textarea).sendKeys(company);
        driver.findElement(address1_textarea).sendKeys(address1);
        driver.findElement(address2_textarea).sendKeys(address2);
        driver.findElement(country_select).click();
        driver.findElement(state_textarea).sendKeys(state);
        driver.findElement(city_textarea).sendKeys(city);
        driver.findElement(zipcode_textarea).sendKeys(zipcode);
        driver.findElement(mobileNumber_textarea).sendKeys(mobilenumber);
        driver.findElement(createAccount_button).click();
        return this;
    }

    public AccountInfoPage InputAccountInfo(){
        driver.findElement(gender_textarea).click();
        driver.findElement(passphrase_textarea).sendKeys("123456");
        driver.findElement(days_select).click();
        driver.findElement(months_select).click();
        driver.findElement(years_select).click();
        driver.findElement(newspaper_check).click();
        driver.findElement(option_check).click();
        driver.findElement(firstName_textarea).sendKeys("Aya");
        driver.findElement(lastName_textarea).sendKeys("Alam");
        driver.findElement(company_textarea).sendKeys("Giza Systems");
        driver.findElement(address1_textarea).sendKeys("Giza");
        driver.findElement(address2_textarea).sendKeys("Giza");
        driver.findElement(country_select).click();
        driver.findElement(state_textarea).sendKeys("Giza");
        driver.findElement(city_textarea).sendKeys("Giza");
        driver.findElement(zipcode_textarea).sendKeys("123456");
        driver.findElement(mobileNumber_textarea).sendKeys("01234567898");
        driver.findElement(createAccount_button).click();
        return this;
    }

    public AccountInfoPage CreateAccountButton(){
        String phrase = driver.findElement(accountCreated_h2).getText();
        Assert.assertEquals(phrase, "ACCOUNT CREATED!");
        return this;
    }
}
