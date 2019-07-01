package com.as.appium.pages.ios;

import com.as.appium.base.IOSBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


/**
 * Author: dkatic
 */


public class RegisterPageIOS extends IOSBasePage {


    public RegisterPageIOS(IOSDriver driver) {
        super(driver);
    }

    // Find by XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"[Q]Ioniq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public MobileElement firstNameInput;

    // Find by XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"[Q]Ioniq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    public MobileElement lastNameInput;

    // Find by XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"[Q]Ioniq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    public MobileElement emailInput;

    // Find by XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"[Q]Ioniq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField")
    public MobileElement passwordInput;

    // Find by XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"[Q]Ioniq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
    public MobileElement checkTC;

    // Find by XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"[Q]Ioniq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
    public MobileElement checkNS;

    // Find by XPATH
    @iOSXCUITFindBy(id = "Create Account")
    public MobileElement createAccountButton;

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(IOSDriver driver, String lastName) throws InterruptedException {
        lastNameInput.sendKeys(lastName);
        driver.hideKeyboard();
        Thread.sleep(3000);
    }

    public void enterEmail(String mail) {
        emailInput.sendKeys(mail);
    }

    public void enterPassword(String pass) {
        passwordInput.sendKeys(pass);

    }

    public void setCheckTC() {
        checkTC.click();
    }

    public void setCheckNS() {
        checkNS.click();
    }

    public void clickOnRegisterButton(IOSDriver driver) {
        createAccountButton.click();
    }

    public InitialPageIOS openInitialPage(IOSDriver driver) {
        createAccountButton.click();
        return new InitialPageIOS(driver);
    }


}
