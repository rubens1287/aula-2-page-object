import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    By txtEmail = By.id("email");
    By txtSenha = By.id("senha");
    By btnLogar = By.xpath("//form");
    By lblErroMsg = By.xpath("//div[contains(text(),'Problemas com o login do usuário')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logar(String user, String senha){
        driver.findElement(txtEmail).sendKeys(user);
        driver.findElement(txtSenha).sendKeys(senha);
        driver.findElement(btnLogar).submit();
    }

    public boolean validarMesagemLoginInvalido(){
        WebDriverWait wait = new WebDriverWait(driver,30);

        return wait.until(ExpectedConditions
                .elementToBeClickable
                        (lblErroMsg)).isDisplayed();
    }
}
