package com.as.appium.pages.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;


/**
 * Author: dkatic
 */


public class RegisterPageAndroid {

    private AndroidDriver driver;

    public RegisterPageAndroid(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Find by XPATH
    @FindBy(xpath = "//*[@text='First name']")
    public RemoteWebElement firstNameInput;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Last name']")
    public RemoteWebElement lastNameInput;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Email']")
    public RemoteWebElement emailInput;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Password']")
    public RemoteWebElement passwordInput;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='I agree to the Terms & Conditions.']")
    public MobileElement checkTC;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='I want to receive IONIQ Newsletter to my email.']")
    public MobileElement checkNS;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Create Account']")
    public MobileElement createAccountButton;

    public void enterFirstName() {
        firstNameInput.sendKeys("Name");
    }

    public void enterLastName() {
        lastNameInput.sendKeys("LAst");
    }

    public void enterEmail() {
        emailInput.sendKeys("mail@test.com");
    }

    public void enterPassword() {
        passwordInput.sendKeys("password");
    }

    public void setCheckTC() {
        checkTC.click();
    }

    public void setCheckNS() {
        checkNS.click();
    }

    public void clickOnRegisterButton() {
        createAccountButton.click();
    }

    public InitialPageAndroid openInitialPage(AndroidDriver driver) {
        createAccountButton.click();
        return new InitialPageAndroid(driver);
    }


}
