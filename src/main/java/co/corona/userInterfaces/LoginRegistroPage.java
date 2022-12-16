package co.corona.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginRegistroPage extends PageObject {


    public static final Target TXT_NOMBRE = Target.the("Ingresa Nombre")
            .located(By.xpath("//*[@id='register.firstName']"));

    public static final Target TXT_APELLIDO = Target.the("Ingresa Apellido")
            .located(By.xpath("//*[@id='register.lastName']"));

    public static final Target TXT_CORREO = Target.the("Ingresa Correo")
            .located(By.xpath("//*[@id='register.email']"));

    public static final Target TXT_CLAVE = Target.the("Ingresa Contraseña")
            .located(By.xpath("//*[@id='password']"));

    public static final Target TXT_CONFIRMARCLAVE = Target.the("Confirmar Contraseña")
            .located(By.xpath("//*[@id='register.checkPwd']"));

    public static final Target CHECK_AUTORIZAR = Target.the("Autorizar Datos")
            .located(By.xpath("//*[@id='registerForm']/div[6]/label/div"));

    public static final Target CHECK_ACEPTAR = Target.the("Aceptar Terminos")
            .located(By.xpath("//*[@id='registerForm']/div[7]/div/label/div"));

    public static final Target CHECK_CAPTCHA = Target.the("Aceptar Captcha")
            .located(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div/div/div/form/div[8]/div[2]"));


    public static final Target BTN_REGISTAR = Target.the("Click boton registar")
            .located(By.xpath("//*[@id='registerForm']/div[9]/button"));


}
