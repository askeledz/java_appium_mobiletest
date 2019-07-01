package com.as.appium.pages.android;

import com.as.appium.base.AndroidBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Author :dkatic
 */


public class WelcomePageAndroid extends AndroidBasePage {


    public WelcomePageAndroid(AndroidDriver driver) {
        super(driver);
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