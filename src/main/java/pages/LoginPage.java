package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends DriverManager {


    By txtEmail = By.id("email");
    By txtSenha = By.id("senha");
    By btnLogar = By.xpath("//form");


    public void logar(String user, String senha){
        getDriver().findElement(txtEmail).sendKeys(user);
        getDriver().findElement(txtSenha).sendKeys(senha);
        getDriver().findElement(btnLogar).submit();
    }

    public boolean validarMesagemLoginInvalido(String msg){
        WebDriverWait wait = new WebDriverWait(getDriver(),30);

        return wait.until(ExpectedConditions
                .elementToBeClickable
                        (By.xpath("//div[contains(text(),'"+msg+"')]"))).isDisplayed();
    }
}
