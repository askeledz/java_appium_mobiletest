package com.as.appium.tests.android;

import com.as.appium.base.BaseAppium;
import com.as.appium.pages.android.GenderPageAndroid;
import com.as.appium.pages.android.InitialPageAndroid;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Author: askeledzija
 */


public class AndroidTest01 extends BaseAppium {

    private static WebDriver driver = null;

    protected GenderPageAndroid genderPageAndroid;
    protected InitialPageAndroid initialPageAndroid;

    @BeforeTest
    public void doBeforeTest() throws Exception {
        driver = getDriver();
    }

    @Test
    public void SomeTest() throws InterruptedException {
        initialPageAndroid = new InitialPageAndroid(driver);
        genderPageAndroid = initialPageAndroid.openGenderPage(driver);
        genderPageAndroid.selectMale();
        genderPageAndroid.selectOther();
        Thread.sleep(2000);
    }
}