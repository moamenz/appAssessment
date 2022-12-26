package com.forsale.forsale;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class driverActions {
    public static AppiumDriver driver;
    public void openApp()throws Exception{

        try {
            openApp();
        } catch (Exception exp) {
            System.out.print(exp.getCause());
            System.out.print(exp.getMessage());
            exp.printStackTrace();
            throw new RuntimeException(exp);
        }

        DesiredCapabilities cap = new DesiredCapabilities();
        //device capabilities
        cap.setCapability("deviceName", "Redmi");
        cap.setCapability("udid", "8727c8a1");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0.0");
        //App capabilities
        cap.setCapability("AppPackage", "com.forsale.forsale");
        cap.setCapability("AppActivity", "com.forsale.app.features.postad.PLFActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AppiumDriver(url,cap);

    }

    public void quitApp(){
        driver.quit();
    }
}
