package com.automation.appium.Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

import static com.automation.appium.Utils.CommonUtils.*;
import static com.automation.appium.Utils.DriverUtils.*;
import static com.automation.appium.Utils.PropertyUtils.getPropertyByKey;

public class GithubWebTests {
    @BeforeClass
    public void beforeClassMethod() {
        initDriver();
    }

    @Test
    public void webTest1() {
        openGithubWebApp();
        switchToWebView();
        WebElement element = getDriver().findElementByXPath("(//*[text()='Sign up for GitHub'])[2]");
        clickWithWait(element);
        switchToNativeView();
    }


    public void openGithubWebApp() {
        getDriver().get(getPropertyByKey("web.app.url"));
    }

    @AfterClass
    public void afterClassMethod() {
        tearDown();
    }
}


