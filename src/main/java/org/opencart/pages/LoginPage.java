package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    //By Locators
    private By emailAddressLoc = By.id("input-email");
    private By passwordLoc = By. id("input-password");
    private By loginButtonLoc = By.xpath("//input[@value='Login']");
    private By logoutLoc = By.xpath("//div[@class='list-group']//a[text()='Logout']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmailAddress(String emailAddress) {
        driver.findElement(emailAddressLoc).sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLoc).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButtonLoc).click();
    }

    public boolean checkLogoutLink() {
        return driver.findElement(logoutLoc).isDisplayed();
    }
}
