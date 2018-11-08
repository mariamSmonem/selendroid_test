package setup;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;

public class AndroidAppiumTest extends AndroidSetup {
    @BeforeTest
    public void setUp() throws MalformedURLException {
        prepareAndroidForSetUP();

    }

    @AfterTest
    public void tearDown()
    {

        AndroidDriver.quit();
    }






}

