package Pages;

import Hooks.HookTest;
import Utilities.UtilityFetchProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LeavePage {
    public static WebDriver driver;
    public static void InitializeDriverandCallURL1(){
        //driver=new ChromeDriver();

        HookTest.getDriver().get(UtilityFetchProperty.fetchPropertyvalue("url"));
        HookTest.getDriver().manage().window().maximize();
        HookTest.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void navigateleave() throws InterruptedException {
        HookTest.getDriver().findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Leave']")).click();
        Thread.sleep(2000);
    }


}
