package com.as.appium.tests.ios;

import com.as.appium.base.AppiumBase;
import com.as.appium.pages.ios.GenderPageIOS;
import com.as.appium.pages.ios.InitialPageIOS;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Author: askeledzija
 */


class IOSTest01 extends AppiumBase {

    private static WebDriver driver = null;

    protected GenderPageIOS genderPageIOS ;
    protected InitialPageIOS initialPageIOS;

    @BeforeTest
    public void doBeforeTest() throws Exception {
        driver = getDriver();
    }

    @Test
    public void SomeTest() {
        initialPageIOS = new InitialPageIOS(driver);
        initialPageIOS.openGenderPage();
        genderPageIOS = new GenderPageIOS(driver);
        genderPageIOS.selectOther();
    }
}