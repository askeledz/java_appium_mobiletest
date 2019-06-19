package com.as.appium.pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: askeledzija
 */

public class GenderPageAndroid {


    public GenderPageAndroid(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
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
