package co.corona.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://corona.co/")

public class ComprasProductosPage extends PageObject {

    public static final Target BTN_PRODUCTOS = Target.the("Boton productos")
            .located(By.xpath("//html/body/header/div[3]/nav/div[2]/div[2]/ul[2]/li[1]/a"));

}
