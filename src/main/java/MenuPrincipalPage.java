import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPrincipalPage {

    private WebDriver driver;
    By lblBemVindo = By.xpath("//div[contains(text(),'Bem vindo')]");

    public MenuPrincipalPage(WebDriver driver) {
        this.driver = driver;

    }

    public boolean estaPresente(){
        WebDriverWait wait = new WebDriverWait(driver,30);

        return wait.until(ExpectedConditions
                .elementToBeClickable
                        (lblBemVindo)).isDisplayed();
    }

}
