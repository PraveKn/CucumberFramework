package Hooks;

import DriverSetup.driverInstance;
import Utilities.GetScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class HookTest {
    private static WebDriver driver;

    @Before
    public void initiliaze() {
        if (driver == null) {
            driver = driverInstance.initiliazeDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;

    }

    @After
    public void closeInstance(Scenario sc) {
        //driver.close();
        GetScreenshot gs = new GetScreenshot();
        if (sc.isFailed()) {
            sc.attach(gs.getBase64Screenshot(), "image/jpg", sc.getName());


        }
    }

}
