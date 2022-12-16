package co.corona.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://corona.co/")
public class LoginIngresoPage extends PageObject {

    public static final Target BTN_INGRESA = Target.the("Boton Ingresar")
            .located(By.xpath("/html/body/header/div[3]/nav/div[2]/div[4]/div[3]/a/div/span[1]"));



}
