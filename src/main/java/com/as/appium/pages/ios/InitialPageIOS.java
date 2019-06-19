package com.as.appium.pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: askeledzija
 */

public class InitialPageIOS {


    //FindBy XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Let's go!\"]")
    public MobileElement letsGoButton;

    public InitialPageIOS(IOSDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public GenderPageIOS openGenderPage(IOSDriver driver) {
        letsGoButton.click();
        return new GenderPageIOS(driver);
    }

}
