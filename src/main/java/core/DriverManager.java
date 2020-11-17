package core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {

    @Getter @Setter
    private static WebDriver driver;
    @Getter @Setter
    private static WebDriverWait wait;

}
