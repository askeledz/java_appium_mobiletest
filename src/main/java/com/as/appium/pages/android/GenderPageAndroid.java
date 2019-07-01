package com.as.appium.pages.android;

import com.as.appium.base.AndroidBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


/**
 * Author: askeledzija
 */

public class GenderPageAndroid extends AndroidBasePage {


    public GenderPageAndroid(AndroidDriver driver) {
        super(driver);
    }

    //FindBy XPATH
    @AndroidFindBy(xpath = "//*[@text='female']")
    public MobileElement femaleButton;

    @AndroidFindBy(xpath = "//*[@text='male']")
    public MobileElement maleButton;

    @AndroidFindBy(xpath = "//*[@text='other']")
    public MobileElement otherButton;

    @AndroidFindBy (xpath = "//*[@id='genderNextPage']")
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
