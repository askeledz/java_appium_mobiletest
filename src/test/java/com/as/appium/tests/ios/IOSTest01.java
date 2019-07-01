package com.as.appium.tests.ios;

import com.as.appium.base.BaseAppium;
import com.as.appium.pages.ios.InitialPageIOS;
import com.as.appium.pages.ios.RegisterPageIOS;
import com.as.appium.pages.ios.WelcomePageIOS;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Author: askeledzija
 */


class IOSTest01 extends BaseAppium {

    private static WebDriver driver = null;

    protected WelcomePageIOS welcomePageIOS;
    protected RegisterPageIOS registerPageIOS;
    protected InitialPageIOS initialPageIOS;


    @BeforeTest
    public void doBeforeTest() throws Exception {
        driver = getDriver();
    }


    @Test
    public void RegisterSuccessIOSTest() throws InterruptedException {
        welcomePageIOS = new WelcomePageIOS((IOSDriver)driver);
        registerPageIOS = welcomePageIOS.openRegisterPage((IOSDriver)driver);


        registerPageIOS.enterFirstName("Andrej");
        registerPageIOS.enterLastName((IOSDriver) driver, "Skeledzija");
        registerPageIOS.enterEmail("andrej.skeledzija@gmail.com");
        registerPageIOS.enterPassword( "password123");
        registerPageIOS.setCheckTC();
        registerPageIOS.setCheckNS();
        registerPageIOS.clickOnRegisterButton((IOSDriver) driver);

        Thread.sleep(2000);
    }
}