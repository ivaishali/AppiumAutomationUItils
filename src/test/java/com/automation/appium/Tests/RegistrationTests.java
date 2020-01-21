package com.automation.appium.Tests;

import com.automation.appium.Data.DirectionEnum;
import com.automation.appium.Screen.ContactScreen;
import com.automation.appium.Screen.RegistrationScreen;
import com.automation.appium.Utils.ApplicationUtils;
import com.automation.appium.Utils.PropertyUtils;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.AppiumSwipeUtils.*;
import static com.automation.appium.Utils.ApplicationUtils.*;
import static com.automation.appium.Utils.DriverUtils.*;
import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;

public class RegistrationTests {

    @BeforeClass
    public void beforeClass() {
        initDriver();
    }

    @Test(enabled = false)
    public void registerTest() {
        RegistrationScreen registrationScreen = new RegistrationScreen();
        swipe((AndroidDriver) getDriver(), DirectionEnum.UP);
        rotateDeviceScreenToLandscape();
        swipeAndClickToElement(registrationScreen.contactName);
        pressHomeKey();
        backToCurrentApplication();
        backGroundApplicationFor(5);
        backToCurrentApplication();
        startOtherApplication(getPropertyByKey("support.application.appPackage"), getPropertyByKey("support.application.appActivity"));
        swipeByScriptUp();

    }

    @Test
    public void testCreateContact() {
        ContactScreen contactScreen = new ContactScreen();
        contactScreen.createContact();
        System.out.println(getDriver().getPageSource());
//        contactScreen.deleteContact();
    }

    @AfterClass
    public void afterClass() {
        tearDown();
    }
}
