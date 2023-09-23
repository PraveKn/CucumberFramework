package DriverSetup;

import Utilities.UtilityFetchProperty;
import com.beust.jcommander.IStringConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driverInstance {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver initiliazeDriver() {
        String browsername = UtilityFetchProperty.fetchPropertyvalue("browser");
        switch (browsername) {
            case "Chrome":
                driver = new ChromeDriver();

                break;
            case "safari":

                driver = new SafariDriver();

                break;
            case "edge":
                driver = new EdgeDriver();

                break;
            default:
                driver = new ChromeDriver();

                break;
        }
        return driver;
    }
}
