package co.corona.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarProductosPage  {

    public static final Target BTN_ARTICULOS = Target.the("Boton ARTICULOS")
            .located(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div[1]/div[11]/div/div/div/a"));



}
