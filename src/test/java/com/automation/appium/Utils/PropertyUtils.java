package com.automation.appium.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
    static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            // load config.properties file
            prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "/resources/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        loadProperties();
    }
}
