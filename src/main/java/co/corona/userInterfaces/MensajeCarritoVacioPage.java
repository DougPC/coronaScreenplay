package co.corona.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeCarritoVacioPage  {

    public static final Target LBL_CARRITO_VACIO = Target.the("Texto Validacion")
            .located((By.xpath("/html/body/main/div[3]/div[3]/div/div/h2")));

}
