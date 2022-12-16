package co.corona.questions;

import co.corona.userInterfaces.MensajeRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeRegistroPage.LBL_VALIDACION.resolveFor(actor).isVisible();
    }







    public static Question validar () {
        return new ValidacionRegistro();
    }
}
