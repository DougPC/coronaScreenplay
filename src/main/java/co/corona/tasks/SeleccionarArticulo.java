package co.corona.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.corona.userInterfaces.SeleccionarArticuloPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarArticulo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ELEMENTO)
        );

    }
        public static SeleccionarArticulo elemento() { return instrumented (SeleccionarArticulo.class);

        }
}
