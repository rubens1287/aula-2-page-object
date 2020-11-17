package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;


    @Dado("^que eu seja um usuario$")
    public void queEuSejaUmUsuario() throws Throwable {
        loginPage = new LoginPage();
    }

    @Quando("^eu logar com usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void euLogarComUsuarioESenha(String usuario, String senha) throws Throwable {
        loginPage.logar(usuario,senha);
    }

    @Entao("^sera apresentado a mensagem \"([^\"]*)\"$")
    public void seraApresentadoAMensagem(String msg) throws Throwable {
        Assert.assertTrue("Erro ao validar mesagem de login invalido",
                loginPage.validarMesagemLoginInvalido(msg));
    }
}
