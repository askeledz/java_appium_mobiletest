package com.as.appium.pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: askeledzija
 */

public class InitialPageIOS {


    //FindBy XPATH
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Let's go!\"]")
    public MobileElement letsGoButton;

    public InitialPageIOS(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public GenderPageIOS openGenderPage(WebDriver driver) {
        letsGoButton.click();
        return new GenderPageIOS(driver);
    }

}
