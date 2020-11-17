package report;

import core.DriverManager;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Report extends DriverManager {

    @Attachment(value = "Page Screenshot", type = "image/png")
    public static byte[] takeScreenShot() {
        return ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);

    }
}
