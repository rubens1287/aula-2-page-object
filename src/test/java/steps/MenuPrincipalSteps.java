package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import pages.MenuPrincipalPage;

public class MenuPrincipalSteps {

    MenuPrincipalPage menuPrincipalPage;

    @Entao("^serie redirecionado para o menu principal$")
    public void serieRedirecionadoParaOMenuPrincipal() throws Throwable {
        menuPrincipalPage =  new MenuPrincipalPage();
        Assert.assertTrue("Erro ao tentar logar na aplicação"
                ,menuPrincipalPage.estaPresente());
    }
}
