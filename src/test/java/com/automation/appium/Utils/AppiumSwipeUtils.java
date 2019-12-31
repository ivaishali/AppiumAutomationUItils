package com.automation.appium.Utils;

import com.automation.appium.Data.DirectionEnum;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;

import static com.automation.appium.Utils.DriverUtils.driver;
import static com.automation.appium.Utils.DriverUtils.getDriver;
import static io.appium.java_client.touch.offset.PointOption.point;

public class AppiumSwipeUtils {
    public static void swipe(AndroidDriver driver, DirectionEnum direction) {
        Dimension size = driver.manage().window().getSize();

        int startX = 0;
        int endX = 0;
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case LEFT:
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.05);
                new TouchAction(driver)
                        .longPress(point(startX, startY))
                        .moveTo(point(endX, startY))
                        .release()
                        .perform();
                break;

            case RIGHT:
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.10);
                endX = (int) (size.width * 0.90);
                new TouchAction(driver)
                        .longPress(point(startX, startY))
                        .moveTo(point(endX, startY))
                        .release()
                        .perform();

                break;

            case DOWN:
                endY = (int) (size.height * 0.70);
                startY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                new TouchAction(driver)
                        .longPress(point(startX, startY))
                        .moveTo(point(startX, endY))
                        .release()
                        .perform();
                break;


            case UP:
                startY = (int) (size.height * 0.70);
                endY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                new TouchAction(driver)
                        .longPress(point(startX, startY))
                        .moveTo(point(startX, endY))
                        .release()
                        .perform();

                break;
        }
    }

    public static void rotateDeviceScreenToLandscape() {
        ((Rotatable) driver).rotate(ScreenOrientation.LANDSCAPE);
    }

    public  static void swipeAndClickToElement(AndroidElement element) {
        while (!element.isDisplayed()) {
            swipe((AndroidDriver) getDriver(), DirectionEnum.UP);
        }
    }
}
