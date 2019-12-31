package com.automation.appium.Screen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.automation.appium.Utils.DriverUtils.getDriver;

public class RegistrationScreen {

    public RegistrationScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(accessibility = "Ravina")
    public AndroidElement contactName;
}
