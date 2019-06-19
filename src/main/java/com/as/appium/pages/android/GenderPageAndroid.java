package com.as.appium.pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: askeledzija
 */

public class GenderPageAndroid {


    public GenderPageAndroid(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //FindBy XPATH
    @FindBy(xpath = "//*[@text='female']")
    public MobileElement femaleButton;

    @FindBy(xpath = "//*[@text='male']")
    public MobileElement maleButton;

    @FindBy(xpath = "//*[@text='other']")
    public MobileElement otherButton;

    @FindBy (xpath = "//*[@id='genderNextPage']")
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
