package com.as.appium.pages.ios;

import com.as.appium.base.IOSBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;



/**
 * Author: askeledzija
 */

public class GenderPageIOS extends IOSBasePage {


    public GenderPageIOS(IOSDriver driver) {
        super(driver);
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
