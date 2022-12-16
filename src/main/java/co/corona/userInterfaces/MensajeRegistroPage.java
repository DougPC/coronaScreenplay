package co.corona.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeRegistroPage {

    public static final Target LBL_VALIDACION = Target.the("Texto Validacion")
            .located((By.xpath("/html/body/header/div[3]/nav/div[2]/div[4]/div[3]/a/div/span[1]")));



}
