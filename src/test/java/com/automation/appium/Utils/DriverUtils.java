package com.automation.appium.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;
import static com.automation.appium.Utils.PropertyUtils.loadProperties;

public class DriverUtils {

    public static AndroidDriver<AndroidElement> driver;

    public static void initDriver() {
        loadProperties();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, getPropertyByKey("platform.name"));
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, getPropertyByKey("device.name"));
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20);
        caps.setCapability("autoGrantPermissions", true);
//        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + getPropertyByKey("application.path"));\
        caps.setCapability("appPackage", getPropertyByKey("app.package"));
        caps.setCapability("appActivity", getPropertyByKey("app.activity"));
        try {
            URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<>(remoteUrl, caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void tearDown() {
        driver.quit();
    }

    public static AppiumDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void main(String[] args) {
        initDriver();
    }

}
