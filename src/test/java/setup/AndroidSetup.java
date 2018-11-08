package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {
    protected AndroidDriver<WebElement> AndroidDriver;

    public  void prepareAndroidForSetUP() throws MalformedURLException {

         // File appDir= new File("C:\\Users\\marya\\IdeaProjects\\appiumTest\\apps");
        // File app =new File(appDir,"selendroid-test-app-0.17.0.apk");
        DesiredCapabilities Capability= new DesiredCapabilities();
        Capability.setCapability("platformName","Android");
        Capability.setCapability("platformVersion","8.1.0");
        Capability.setCapability("deviceName","1ed2893e");
       //  Capability.setCapability("app",app.getAbsolutePath());
        Capability.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
        Capability.setCapability("appPackage","io.selendroid.testapp");
        Capability.setCapability("--session-override",true);
        AndroidDriver= new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), Capability);




    }

}


