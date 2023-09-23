package Pages;

import Hooks.HookTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchAdminRoles {
    public void AdminSearch() throws InterruptedException {
        Thread.sleep(2000);
        HookTest.getDriver().findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).click();
        List<WebElement> roles = HookTest.getDriver().findElements(By.xpath("//div[@role='listbox']/child::*"));
        for (WebElement ele : roles) {

            if (ele.getText().equals("Admin"))
            {
                ele.click();
                break;
            }
        }
        HookTest.getDriver().findElement(By.xpath("//button[@type='submit']")).click();

    }
}
