package co.corona.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.corona.userInterfaces.ComprasProductosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ComprasProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_PRODUCTOS)
        );


    }

    public static ComprasProducto productos() { return instrumented (ComprasProducto.class);
    }
}
