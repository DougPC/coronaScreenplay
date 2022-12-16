package co.corona.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarArticuloPage {
    public static final Target BTN_COMPRAR_ARTICULOS = Target.the("Boton Comprar Articulos")
            .located(By.xpath("/html/body/main/div[2]/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/a[2]"));

    public static final Target BTN_AUMENTAR_ARTICULOS = Target.the("Boton Aumentar Articulos")
            .located(By.xpath("/html/body/main/div[2]/div[2]/div[3]/div[5]/div/div/div[2]/div/button[2]"));

    public static final Target BTN_AGREGAR_ARTICULOS = Target.the("Boton Agregar Articulos")
            .located(By.xpath("//*[@id='addToCartButton']"));

    public static final Target BTN_CONTINUAR_COMPRA = Target.the("Boton Continuar Compra")
            .located(By.xpath("//*[@id='addToCartLayer']/div[5]/div[1]/button"));

    public static final Target BTN_PRODUCTOS = Target.the("Boton productos")
            .located(By.xpath("//html/body/header/div[3]/nav/div[2]/div[2]/ul[2]/li[1]/a"));


    public static final Target BTN_PRODUCTO2 = Target.the("Boton producto2")
            .located(By.xpath("/html/body/main/div[2]/div[4]/div[2]/div[2]/div/div[2]/div[6]/div[2]/a[2]"));

    public static final Target BTN_IR_CARRITO = Target.the("Boton ir al carrito")
            .located(By.xpath("//*[@id='addToCartLayer']/div[5]/div[2]/a"));

}
