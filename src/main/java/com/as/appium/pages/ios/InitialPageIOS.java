package com.as.appium.pages.ios;

import com.as.appium.base.IOSBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * Author: askeledzija
 */

public class InitialPageIOS extends IOSBasePage {


    //FindBy XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Let's go!\"]")
    public MobileElement letsGoButton;

    public InitialPageIOS(IOSDriver driver) {
        super(driver);
    }

    public GenderPageIOS openGenderPage(IOSDriver driver) {
        letsGoButton.click();
        return new GenderPageIOS(driver);
    }

}
