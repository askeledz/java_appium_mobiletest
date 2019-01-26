package com.as.appium.tests.ios;

import com.as.appium.base.BaseAppium;
import com.as.appium.pages.ios.GenderPageIOS;
import com.as.appium.pages.ios.InitialPageIOS;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Author: askeledzija
 */


class IOSTest01 extends BaseAppium {

    private static WebDriver driver = null;

    protected GenderPageIOS genderPageIOS;
    protected InitialPageIOS initialPageIOS;

    @BeforeTest
    public void doBeforeTest() throws Exception {
        driver = getDriver();
    }


    @Test
    public void SomeTest() throws InterruptedException {
        initialPageIOS = new InitialPageIOS(driver);
        genderPageIOS = initialPageIOS.openGenderPage(driver);
        genderPageIOS.selectMale();
        genderPageIOS.selectOther();
        Thread.sleep(2000);
    }
}