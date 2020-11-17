package hooks;

import core.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import report.Report;

public class Hooks {


    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        DriverManager.setDriver(new ChromeDriver());
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get("https://seubarriga.wcaquino.me/login");
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed())
            Report.takeScreenShot();

        DriverManager.getDriver().quit();
    }

}
