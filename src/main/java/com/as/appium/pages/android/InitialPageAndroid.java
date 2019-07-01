package com.as.appium.pages.android;

import com.as.appium.base.AndroidBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Author: askeledzija
 */

public class InitialPageAndroid extends AndroidBasePage {


    //FindBy XPATH
    @AndroidFindBy(xpath = "//*[@text=concat('Let', \"'\", 's go!')]")
    public MobileElement letsGoButton;

    public InitialPageAndroid(AndroidDriver driver) {
        super(driver);
    }

    public GenderPageAndroid openGenderPage(AndroidDriver driver) {
        letsGoButton.click();
        return new GenderPageAndroid(driver);
    }

}
