package com.as.appium.pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: dkatic
 */


public class RegisterPageAndroid {


    public RegisterPageAndroid(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='First name']")
    public MobileElement firstNameInput;

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='Last name']")
    public MobileElement lastNameInput;

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='Email']")
    public MobileElement emailInput;

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='Password']")
    public MobileElement passwordInput;

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='I agree to the Terms & Conditions.']")
    public MobileElement checkTC;

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='I want to receive IONIQ Newsletter to my email.']")
    public MobileElement checkNS;

    // Find by XPATH
    @AndroidFindBy(xpath = "//*[@text='Create Account']")
    public MobileElement createAccountButton;

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(AndroidDriver driver, String lastName) throws InterruptedException {
        lastNameInput.sendKeys(lastName);
        driver.hideKeyboard();
        Thread.sleep(3000);
    }

    public void enterEmail(String mail) {
        emailInput.sendKeys(mail);
    }

    public void enterPassword(AndroidDriver driver, String pass) {

        TouchAction ta = new TouchAction(driver);
        ta.press(PointOption.point(591, 748)).moveTo(PointOption.point(622,197)).release().perform();

        MobileElement el2 = (MobileElement) driver.findElementByAndroidUIAutomator("text(\"Password\")");
        el2.click();
        el2.sendKeys(pass);
        //passwordInput.sendKeys(pass);
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
