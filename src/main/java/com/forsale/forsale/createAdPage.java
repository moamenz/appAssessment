package com.forsale.forsale;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class createAdPage {

    public static AppiumDriver driver;
    public static void createNewAd(){

        WebElement post = driver.findElement(By.xpath(
                "//android.widget.FrameLayout[@content-desc=\"Post an Ad\"]/android.widget.FrameLayout/android.widget.ImageView"));
        WebElement next = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button"));
        WebElement validation = driver.findElement(By.id("com.forsale.forsale:id/textinput_error"));
        WebElement categoryDDl = driver.findElement(By.id("com.forsale.forsale:id/chooseCategoryField"));
        WebElement category_select = driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView"));
        post.click();
        categoryDDl.click();
        next.click();
        String message = validation.getText();
        while(true){
            if (message.equals("Required")){
                //open drop down list for category
                categoryDDl.click();
                //select from ddl
                category_select.click();
                //select sub member of the ddl

                //move to the next step
                next.click();
            }else{
                break;
            }

        }


    }


}