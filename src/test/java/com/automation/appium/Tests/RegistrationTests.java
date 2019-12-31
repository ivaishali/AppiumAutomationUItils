package com.automation.appium.Tests;

import com.automation.appium.Data.DirectionEnum;
import com.automation.appium.Screen.RegistrationScreen;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Utils.AppiumSwipeUtils.*;
import static com.automation.appium.Utils.DriverUtils.*;

public class RegistrationTests {

    @BeforeClass
    public void beforeClass() {
        initDriver();
    }

    @Test
    public void registerTest() {
        RegistrationScreen registrationScreen = new RegistrationScreen();

//        swipe((AndroidDriver) getDriver(), DirectionEnum.UP);
//        swipe((AndroidDriver) getDriver(), DirectionEnum.RIGHT);
//        rotateDeviceScreenToLandscape();
        swipeAndClickToElement(registrationScreen.contactName);

    }

    @AfterClass
    public void afterClass() {
        tearDown();
    }
}
