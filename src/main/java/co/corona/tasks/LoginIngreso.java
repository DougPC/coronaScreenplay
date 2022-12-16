package co.corona.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.corona.userInterfaces.LoginIngresoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class LoginIngreso implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(BTN_INGRESA)

       );
    }

    public static LoginIngreso ingresa(){
        return instrumented (LoginIngreso.class);
    }
}
