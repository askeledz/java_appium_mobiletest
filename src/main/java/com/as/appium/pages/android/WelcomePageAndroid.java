package com.as.appium.pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Author :dkatic
 */


public class WelcomePageAndroid {


    public WelcomePageAndroid(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='Register']")
    public MobileElement registerButton;

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='Login']")
    public MobileElement loginButton;

    //Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='Skip']")
    public MobileElement skipButton;


    public void clickOnRegisterButton() { registerButton.click(); }
    public void clickOnLoginButton() { loginButton.click(); }
    public void clickOnSkipButton() {skipButton.click();}

    public RegisterPageAndroid openRegisterPage(AndroidDriver driver) {
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