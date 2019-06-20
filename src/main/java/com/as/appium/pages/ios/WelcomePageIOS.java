package com.as.appium.pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author :dkatic
 */


public class WelcomePageIOS {


    public WelcomePageIOS(IOSDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Find by XPATH
    @iOSXCUITFindBy(id = "Register")
    public MobileElement registerButton;

    // Find by XPATH
    @iOSXCUITFindBy(id = "Login")
    public MobileElement loginButton;

    //Find by XPATH
    @iOSXCUITFindBy(id = "Skip")
    public MobileElement skipButton;


    public void clickOnRegisterButton() { registerButton.click(); }
    public void clickOnLoginButton() { loginButton.click(); }
    public void clickOnSkipButton() {skipButton.click();}

    public RegisterPageIOS openRegisterPage(IOSDriver driver) {
        registerButton.click();
        return new RegisterPageIOS(driver);
    }


    public InitialPageIOS openInitialPage(IOSDriver driver) {
        skipButton.click();
        return new InitialPageIOS(driver);
    }

}