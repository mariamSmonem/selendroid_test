package com.selendroid.test;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomeScreenComponentsPageBase {
    // Define another driver to be later equalized with the main driver to be able to perform some actions with it
    // Like Back actions and so on
    public AppiumDriver<WebElement> driverBack;

    //Define class public constructor
    public HomeScreenComponentsPageBase(AppiumDriver<WebElement> AndroidDriver)
    {

     PageFactory.initElements(new AppiumFieldDecorator(AndroidDriver),this);
     driverBack=AndroidDriver;
    }
}
