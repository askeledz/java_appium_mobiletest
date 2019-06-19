package com.as.appium.pages.android;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: dkatic
 */


public class RegisterPageAndroid {


    public RegisterPageAndroid(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Find by XPATH
    @FindBy(xpath = "//*[@text='First name']")
    public AndroidElement firstNameInput;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Last name']")
    public AndroidElement lastNameInput;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Email']")
    public AndroidElement emailInput;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Password']")
    public AndroidElement passwordInput;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='I agree to the Terms & Conditions.']")
    public AndroidElement checkTC;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='I want to receive IONIQ Newsletter to my email.']")
    public AndroidElement checkNS;

    // Find by XPATH
    @FindBy(xpath = "//*[@text='Create Account']")
    public AndroidElement createAccountButton;

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

        AndroidElement el2 = (AndroidElement) driver.findElementByAndroidUIAutomator("text(\"Password\")");
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
