package com.automation.appium.Utils;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.time.Duration;

import static com.automation.appium.Utils.DriverUtils.driver;

public class ApplicationUtils {
    public static void pressHomeKey() {
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public static void backGroundApplicationFor(int seconds) {
        driver.runAppInBackground(Duration.ofSeconds(seconds));
    }

    public static void backToCurrentApplication() {
        driver.currentActivity();
    }

    public static void startOtherApplication(String appPackage, String appActivity) {
        Activity activity = new Activity(appPackage, appActivity);
        driver.startActivity(activity);
    }
}
