package com.as.appium.tests.android;


import com.as.appium.base.BaseAppium;
import com.as.appium.pages.android.InitialPageAndroid;
import com.as.appium.pages.android.RegisterPageAndroid;
import com.as.appium.pages.android.WelcomePageAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * Author: dkatic
 */

public class AndroidTest01 extends BaseAppium {

    private static WebDriver driver = null;

    protected WelcomePageAndroid welcomePageAndroid;
    protected RegisterPageAndroid registerPageAndroid;
    protected InitialPageAndroid initialPageAndroid;

    @BeforeTest
    public void doBeforeTest() throws Exception {
        driver = getDriver();
    }


    @Test
    public void RegisterSuccessTest() throws Exception {
        welcomePageAndroid = new WelcomePageAndroid((AndroidDriver)driver);
        registerPageAndroid = welcomePageAndroid.openRegisterPage((AndroidDriver)driver);
        registerPageAndroid.enterFirstName("Andrej");
//        registerPageAndroid.enterLastName((AndroidDriver) driver, "Skeledzija");
//        registerPageAndroid.enterEmail("andrej.skeledzija@gmail.com");
        registerPageAndroid.enterPassword( (AndroidDriver) driver, "password123");
        registerPageAndroid.setCheckTC();
        registerPageAndroid.setCheckNS();
        registerPageAndroid.clickOnRegisterButton((AndroidDriver) driver);

        Thread.sleep(2000);
    }

//    @Test
//    public void RegisterSuccessTest() throws Exception {
//        welcomePageAndroid = new WelcomePageAndroid((AndroidDriver)driver);
//        registerPageAndroid = welcomePageAndroid.openRegisterPage((AndroidDriver)driver);
//        registerPageAndroid.enterFirstName("Andrej");
//        registerPageAndroid.enterLastName((AndroidDriver) driver, "Skeledzija");
//        registerPageAndroid.enterEmail("andrej.skeledzija@gmail.com");
//        registerPageAndroid.enterPassword( (AndroidDriver) driver, "password123");
//        registerPageAndroid.setCheckTC();
//        registerPageAndroid.setCheckNS();
//        registerPageAndroid.clickOnRegisterButton();
//
//        Thread.sleep(2000);
//    }


}
