package com.as.appium.pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: askeledzija
 */

public class GenderPageIOS  {


    public GenderPageIOS(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //FindBy XPATH
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"female\"]")
    public MobileElement femaleButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"male\"]")
    public MobileElement maleButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"other\"]")
    public MobileElement otherButton;

    public void selectFemale() {
        femaleButton.click();
    }

    public void selectMale() {
        maleButton.click();
    }

    public void selectOther() {
        otherButton.click();
    }


}
