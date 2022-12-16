package co.corona.stepsDefinitions;

import co.corona.questions.ValidacionCarrito;
import co.corona.questions.ValidacionRegistro;
import co.corona.tasks.*;
import co.corona.userInterfaces.ComprasProductosPage;
import co.corona.userInterfaces.LoginIngresoPage;
import co.corona.userInterfaces.SeleccionarArticuloPage;
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

public class ComprasStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor doug = Actor.named("doug");

    private ComprasProductosPage comprasProductosPage = new ComprasProductosPage();


    @Before
    public void  configuracion (){
        doug.can(BrowseTheWeb.with(navegador));

    }

    @Dado("^el usuario se encuentre en la pagina web en la seccion de productos$")
    public void elUsuarioSeEncuentreEnLaPaginaWebEnLaSeccionDeProductos() {
        doug.wasAbleTo(Open.browserOn(comprasProductosPage));
        doug.attemptsTo(ComprasProducto.productos());

    }


    @Cuando("^seleccione los porducto por categoria adicionandolos al carrito de compras$")
    public void seleccioneLosPorductoPorCategoriaAdicionandolosAlCarritoDeCompras() {
    doug.attemptsTo(SeleccionarProducto.articulo());
    doug.attemptsTo(SeleccionarArticulo.elemento());
    doug.attemptsTo(ComprarArticulo.comprarArticulo());


    }

    @Cuando("^luego eliminado los articulos del carrito$")
    public void luegoEliminadoLosArticulosDelCarrito() {
        doug.attemptsTo(CarritoCompras.vaciarcarrito());


    }

    @Entonces("^el podra visualizar el carrito de compras vacio$")
    public void elPodraVisualizarElCarritoDeComprasVacio() {
        doug.should(seeThat("el actor puede ver", ValidacionCarrito.verificar(), Matchers.equalTo(true)));


    }

}
