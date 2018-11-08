package com.selendroid.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

// In this class we are going to define App screen elements and functions to be tested
// it is a kind of refactoring and code organization factors
public class HomeScreenComponentsPageObject extends HomeScreenComponentsPageBase{

    // Creating public constructor matching super constructor in HomeScreenPageObject class
    public HomeScreenComponentsPageObject(AppiumDriver<WebElement> AndroidDriver) {
        super(AndroidDriver);
    }
    // This to find [locate] specific element here i am using [id] parameter]
    // To find ENButton from HomeScreen
    @AndroidFindBy(id="io.selendroid.testapp:id/buttonTest")
    public WebElement EnButton;
    // From The pop appeared we choose option No [locate]
    @AndroidFindBy(id="android:id/button2")
    public WebElement ChooseNoOption;
    // Locate WebView Button
    @AndroidFindBy(id="buttonStartWebviewCD")
    public WebElement WebViewButton;
    // Locate Text Box Filed in Home Screen
    @AndroidFindBy(id="my_text_fieldCD")
    public WebElement TextFiled;
    //Locate ShowingProgressBarButton
    @AndroidFindBy(id="io.selendroid.testapp:id/waitingButtonTest")
    public WebElement ShowProgressBarForAwhileButton;
    // Locate CheckBox to unchecked it
    @AndroidFindBy(id="io.selendroid.testapp:id/input_adds_check_box")
    public WebElement CheckBoxAction;
    //Locate DisplayTextViewButton
    @AndroidFindBy(id="io.selendroid.testapp:id/visibleButtonTest")
    public WebElement DisplayTextViewButton;
    //Locate DisplayAtoastButton
    @AndroidFindBy(id="io.selendroid.testapp:id/showToastButton")
    public WebElement DisplayAtoastButton;
    // Locate Display A Pop up Button
    @AndroidFindBy(id="io.selendroid.testapp:id/showPopupWindowButton")
    public WebElement DisplayApopUpButton;


    public void ClickonEnButton()
    {
        EnButton.click();
        ChooseNoOption.click();
    }
    public void ClickonWebViewButton()
    {
        WebViewButton.click();
        driverBack.navigate().back();
    }
    public void SendTextToTextfiledSection()
    {
        TextFiled.sendKeys("Hello Appium");
    }
    public void ShowProgressBarForAwhile() throws InterruptedException {
        ShowProgressBarForAwhileButton.click();
        driverBack.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        sleep(3000);
    }
    public void UnCheckCheckedBox()
    {
        CheckBoxAction.click();
    }
    public void DisplayTextBoxButton()
    {
        DisplayTextViewButton.click();
    }
    public void ClickOnDisplayToastButton()
    {
        DisplayAtoastButton.click();
    }
    public void ClickOnShowPopUpButton()
    {
        DisplayApopUpButton.click();
    }








}
