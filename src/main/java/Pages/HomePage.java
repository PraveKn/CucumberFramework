package Pages;

import Hooks.HookTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    public void clickAdmin() {
        System.out.println("Login Successfully");
        HookTest.getDriver().findElement(By.xpath("//span[text()='Admin']")).click();

    }
}
