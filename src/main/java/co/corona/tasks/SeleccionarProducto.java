package co.corona.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.corona.userInterfaces.SeleccionarProductosPage.BTN_ARTICULOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ARTICULOS)
        );
    }

        public static SeleccionarProducto articulo() { return instrumented (SeleccionarProducto.class);
    }
}
