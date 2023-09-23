package Utilities;

import Hooks.HookTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.jsoup.nodes.Entities.EscapeMode.base;

public class GetScreenshot {
    public byte[] getBase64Screenshot()
    {
       // return ((TakesScreenshot) HookTest.getDriver()).getScreenshotAs(OutputType.BASE64);
        TakesScreenshot ts = (TakesScreenshot) HookTest.getDriver();

        byte[] src = ts.getScreenshotAs(OutputType.BYTES);
        return src;

    }
}
