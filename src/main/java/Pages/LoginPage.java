package Pages;

import Hooks.HookTest;
import Utilities.UtilityFetchProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    public static  WebDriver driver;
    public static void InitializeDriverandCallUrl(){

        HookTest.getDriver().get(UtilityFetchProperty.fetchPropertyvalue("url"));
        HookTest.getDriver().manage().window().maximize();
        HookTest.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void LoginCredens(String username,String pwd){
        HookTest.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        HookTest.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
        HookTest.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }
    public void VerifyPageURL(){
        String actualURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String expectedURL = HookTest.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.equals(expectedURL),"Invalid User");
    }


}
