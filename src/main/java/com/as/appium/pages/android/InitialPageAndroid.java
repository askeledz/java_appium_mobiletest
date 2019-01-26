package com.as.appium.pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: askeledzija
 */

public class InitialPageAndroid {


    //FindBy XPATH
    @FindBy(xpath = "//*[@text=concat('Let', \"'\", 's go!')]")
    public MobileElement letsGoButton;

    public InitialPageAndroid(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public GenderPageAndroid openGenderPage(WebDriver driver) {
        letsGoButton.click();
        return new GenderPageAndroid(driver);
    }

}
