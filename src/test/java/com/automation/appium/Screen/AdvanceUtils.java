package com.automation.appium.Screen;

import com.automation.appium.Utils.DriverUtils;

import java.util.Map;

import static com.automation.appium.Utils.DriverUtils.driver;
import static com.automation.appium.Utils.DriverUtils.getDriver;

public class AdvanceUtils {
    public static void openNotification() {
        getDriver().openNotifications();
    }

    public static void addFingerePrint() {
        driver.fingerPrint(1);
    }

    public static void lockDevice() {
        driver.lockDevice();
    }

    public static void unLockDevice() {
        driver.unlockDevice();
    }

    public static void toggleAirPlanmode() {
//        driver.toggleWifi();
//        driver.toggleLocationServices();
//        driver.toggleData();
//        driver.sendSMS("555-123-4567", "Hey lol");
        System.out.println(driver.getBatteryInfo().getState());
        System.out.println(driver.getDeviceTime());
        System.out.println(driver.getDisplayDensity());
    }
}
