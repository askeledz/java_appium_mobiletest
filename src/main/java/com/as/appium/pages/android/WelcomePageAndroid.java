package com.as.appium.pages.android;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author :dkatic
 */


public class WelcomePageAndroid {


    public WelcomePageAndroid(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Register']")
    public MobileElement registerButton;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Login']")
    public MobileElement loginButton;

    //Find by XPATH
    @FindBy(xpath = "//*[@text='Skip']")
    public MobileElement skipButton;


    public void clickOnRegisterButton() { registerButton.click(); }
    public void clickOnLoginButton() { loginButton.click(); }
    public void clickOnSkipButton() {skipButton.click();}

    public RegisterPageAndroid openRegisterPage(WebDriver driver) {
        registerButton.click();
        return new RegisterPageAndroid(driver);
    }

//    public LoginPageAndroid openLoginPage(AndroidDriver driver) {
//        loginButton.click();
//        return new LoginPageAndroid(driver);
//    }

    public InitialPageAndroid openInitialPage(AndroidDriver driver) {
        skipButton.click();
        return new InitialPageAndroid(driver);
    }

}