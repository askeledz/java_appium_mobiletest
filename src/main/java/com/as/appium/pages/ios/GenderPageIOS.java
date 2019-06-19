package com.as.appium.pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

/**
 * Author: askeledzija
 */

public class GenderPageIOS  {


    public GenderPageIOS(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //FindBy XPATH
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"female\"]")
    public MobileElement femaleButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"male\"]")
    public MobileElement maleButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"other\"]")
    public MobileElement otherButton;

    @iOSXCUITFindBy(xpath = "xpath=//*[@id='genderNextPage']")
    public MobileElement nextBtn;


    public void selectFemale() {
        femaleButton.click();
    }

    public void selectMale() {
        maleButton.click();
    }

    public void selectOther() {
        otherButton.click();
    }

    public void cilckNext() {nextBtn.click();
    }


}
