package co.corona.stepsDefinitions;


import co.corona.questions.ValidacionRegistro;
import co.corona.tasks.LoginIngreso;
import co.corona.tasks.LoginRegistro;
import co.corona.userInterfaces.LoginIngresoPage;
import co.corona.userInterfaces.LoginRegistroPage;
import co.corona.utils.EsperaImplicita;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class LoginStepDefinition {

    @Managed (driver = "chrome")
    private WebDriver navegador;
    private Actor doug = Actor.named("doug");

    private LoginIngresoPage loginIngresoPage = new LoginIngresoPage();
    private LoginRegistroPage loginRegistroPage = new LoginRegistroPage();
    EsperaImplicita esperaImplicita = new EsperaImplicita();


    @Before
    public void  configuracion (){
        doug.can(BrowseTheWeb.with(navegador));

    }

    @Dado("^el usuario se encuentre en la pagina web$")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() {
        doug.wasAbleTo(Open.browserOn(loginIngresoPage));
         doug.attemptsTo(LoginIngreso.ingresa());


    }

    @Cuando("^el usuario ingrese los datos requeridos, posterior a esto se registrara$")
    public void elIngreseLosDatosRequeridos() {
        doug.attemptsTo(LoginRegistro.iniciar());

    }





    @Entonces("^el podra visualizar su nombre de usuario$")
    public void elPodraVisualizarSuNombreDeUsuario() {
        doug.should(seeThat("el actor puede ver", ValidacionRegistro.validar(), Matchers.equalTo(true)));

    }




}
