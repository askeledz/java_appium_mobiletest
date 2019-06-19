package com.as.appium.pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: askeledzija
 */

public class InitialPageAndroid {


    //FindBy XPATH
    @AndroidFindBy(xpath = "//*[@text=concat('Let', \"'\", 's go!')]")
    public MobileElement letsGoButton;

    public InitialPageAndroid(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public GenderPageAndroid openGenderPage(AndroidDriver driver) {
        letsGoButton.click();
        return new GenderPageAndroid(driver);
    }

}
