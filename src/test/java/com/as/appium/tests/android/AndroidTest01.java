package com.as.appium.tests.android;

import com.as.appium.base.AppiumBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AndroidTest01 extends AppiumBase {

    private static WebDriver driver = null;


    @BeforeTest
    public void doBeforeTest() throws Exception {
        driver = getDriver();
    }

    @Test
    public void SomeTest() {

    }
}