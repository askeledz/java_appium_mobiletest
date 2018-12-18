package com.as.appium.pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Created by Andrej on Jun 2017.
 */
public class InitialPageIOS {

    public InitialPageIOS(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    //FindBy XPATH
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Let's go!\"]")
    public MobileElement letsGoButton;


    public void openGenderPage() {
        letsGoButton.click();
    }

}
