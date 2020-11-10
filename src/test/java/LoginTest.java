import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class LoginTest extends Hooks{

    @Test
    public void executarLoginComSucesso(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.logar("teste123@teste.com.br","1234");
        MenuPrincipalPage menuPrincipalPage =  new MenuPrincipalPage(driver);
        Assert.assertTrue("Erro ao tentar logar na aplicação"
                ,menuPrincipalPage.estaPresente());
    }

    @Test
    public void executarLoginSemSucesso(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.logar("teste123@teste.com.br","12345");
        Assert.assertTrue("Erro ao validar mesagem de login invalido"
                ,loginPage.validarMesagemLoginInvalido());

    }


}
