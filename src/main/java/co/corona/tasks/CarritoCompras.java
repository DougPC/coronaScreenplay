package co.corona.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.corona.userInterfaces.CarritoComprasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CarritoCompras implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ELIMINAR_ARTICULO1),
                Click.on(BTN_ELIMINAR_ARTICULO1)

        );
    }

    public static CarritoCompras vaciarcarrito() { return instrumented (CarritoCompras.class);


    }

}
