package co.corona.tasks;

import co.corona.utils.Datos;
import co.corona.utils.EsperaImplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.Assert;

import java.io.IOException;

import static co.corona.userInterfaces.LoginRegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginRegistro implements Task {



    EsperaImplicita esperaImplicita = new EsperaImplicita();
    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    (Performable) Enter.theValue(datos.leerDatosExcel("Datos.xlsx","DatosRegistro",1,0))
                            .into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","DatosRegistro",1,1))
                            .into(TXT_APELLIDO),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","DatosRegistro",1,2))
                            .into(TXT_CORREO),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","DatosRegistro",1,3))
                            .into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","DatosRegistro",1,4))
                            .into(TXT_CONFIRMARCLAVE),

                    Click.on(CHECK_AUTORIZAR),
                    Click.on(CHECK_ACEPTAR)




            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       // esperaImplicita.esperaImplicita(5);

        actor.attemptsTo(
                Click.on(CHECK_CAPTCHA),
                Click.on(BTN_REGISTAR)
        );




    }


    public static LoginRegistro iniciar(){
        return instrumented (LoginRegistro.class);
    }


}
