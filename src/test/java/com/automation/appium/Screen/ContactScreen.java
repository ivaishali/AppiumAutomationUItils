package com.automation.appium.Screen;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.automation.appium.Utils.DriverUtils.driver;
import static com.automation.appium.Utils.DriverUtils.getDriver;

public class ContactScreen {
    public ContactScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    @AndroidFindBy(id = "floating_action_button_container")
    public AndroidElement addContactBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]")
    public AndroidElement firstName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]")
    public AndroidElement lastName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    public AndroidElement phoneno;

    @AndroidFindBy(xpath = "editor_menu_save_button")
    public AndroidElement saveBtn;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='More options']")
    public AndroidElement optionIcon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView\n")
    public AndroidElement deleteOption;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n")
    public AndroidElement deleteBtn;

    public void createContact() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addContactBtn.click();
        firstName.sendKeys("ABCDS");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        lastName.sendKeys("ABCDS");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        phoneno.sendKeys("9999999999");
//        saveBtn.click();
    }

    public void deleteContact() {
        optionIcon.click();
        deleteOption.click();
        deleteBtn.click();
    }
}
