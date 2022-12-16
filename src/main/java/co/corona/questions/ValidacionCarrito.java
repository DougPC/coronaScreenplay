package co.corona.questions;

import co.corona.userInterfaces.MensajeCarritoVacioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCarrito implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeCarritoVacioPage.LBL_CARRITO_VACIO.resolveFor(actor).isVisible();
    }



    public static Question verificar () {
        return new ValidacionCarrito();
    }
}
