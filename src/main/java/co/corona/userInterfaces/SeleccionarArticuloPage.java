package co.corona.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarArticuloPage {

    public static final Target BTN_ELEMENTO = Target.the("Boton elemento")
            .located(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[1]/div[3]/div/div/div/a"));


}
