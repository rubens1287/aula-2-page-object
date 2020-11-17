package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import report.Report;

public class MenuPrincipalPage  extends DriverManager {

    By lblBemVindo = By.xpath("//div[contains(text(),'Bem vindo')]");


    public boolean estaPresente(){
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        boolean valid = false;
        valid =  wait.until(ExpectedConditions
                .elementToBeClickable
                        (lblBemVindo)).isDisplayed();
        Report.takeScreenShot();
        return valid;
    }

}
