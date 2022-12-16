package co.corona.tasks;

import co.corona.userInterfaces.SeleccionarArticuloPage;
import co.corona.userInterfaces.SeleccionarProductosPage;
import co.corona.utils.EsperaImplicita;
import com.gargoylesoftware.htmlunit.javascript.host.Window;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static co.corona.userInterfaces.ComprarArticuloPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.corona.userInterfaces.SeleccionarProductosPage.*;
import static co.corona.userInterfaces.SeleccionarArticuloPage.*;



public class ComprarArticulo implements Task {
    //SeleccionarProductosPage seleccionarProductosPage = new SeleccionarProductosPage();
   // SeleccionarArticuloPage seleccionarArticuloPage = new SeleccionarArticuloPage();
    EsperaImplicita esperaImplicita = new EsperaImplicita();



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_COMPRAR_ARTICULOS),
                Click.on(BTN_AUMENTAR_ARTICULOS),
                Click.on(BTN_AUMENTAR_ARTICULOS),
                Click.on(BTN_AGREGAR_ARTICULOS),
                Click.on(BTN_CONTINUAR_COMPRA),
                Click.on(BTN_PRODUCTOS),
                Click.on(BTN_ARTICULOS),
                Click.on(BTN_ELEMENTO),
                Click.on(BTN_PRODUCTO2),
                Click.on(BTN_AGREGAR_ARTICULOS),
                Click.on(BTN_IR_CARRITO)


        );

        esperaImplicita.esperaImplicita(5);









    }

    public static ComprarArticulo comprarArticulo() { return instrumented (ComprarArticulo.class);

    }
}
