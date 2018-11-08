package com.selendroid.test;

import org.testng.annotations.Test;
import setup.AndroidAppiumTest;

public class HomeScreenComponents extends AndroidAppiumTest {
    HomeScreenComponentsPageObject homeScreenObject;

    @Test (priority = 1)
    public void testClickonEnButton()
    {
        homeScreenObject=new HomeScreenComponentsPageObject(AndroidDriver);
        homeScreenObject.ClickonEnButton();
    }
    @Test (priority = 2)
    public void testClickonWebViewButton()
    {
        homeScreenObject=new HomeScreenComponentsPageObject(AndroidDriver);
        homeScreenObject.ClickonWebViewButton();
    }
    @Test (priority = 3)
    public void testSendTextToTextfiledSection()
    {
        homeScreenObject=new HomeScreenComponentsPageObject(AndroidDriver);
        homeScreenObject.SendTextToTextfiledSection();
    }
    @Test (priority = 4)
    public void testUnCheckCheckedBox()
    {
        homeScreenObject=new HomeScreenComponentsPageObject(AndroidDriver);
        homeScreenObject.UnCheckCheckedBox();
    }
    @Test (priority = 5)
    public void testDisplayTextBoxButton()
    {
        homeScreenObject=new HomeScreenComponentsPageObject(AndroidDriver);
        homeScreenObject.DisplayTextBoxButton();
    }

}
