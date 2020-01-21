package com.automation.appium.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.automation.appium.Screen.AdvanceUtils.*;
import static com.automation.appium.Utils.DriverUtils.getDriver;
import static com.automation.appium.Utils.DriverUtils.initDriver;

public class DemoTests {

    @BeforeClass
    public void beforeClassMethod() {
        initDriver();
    }

    @Test
    public void test1() {
//        lockDevice();
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        unLockDevice();

        System.out.println(getDriver().getPageSource());
    }

    @AfterClass
    public void afterClassMethod() {

    }
}
