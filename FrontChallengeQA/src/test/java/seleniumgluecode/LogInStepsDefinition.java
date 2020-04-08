package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class LogInStepsDefinition extends TestBase {

    @And("^Rellena la direccion de email con un correo no existente$")
    public void rellena_la_direccion_de_email_con_un_correo_no_existente() throws Throwable {
        String randomWord = "";

        for(int i = 0; i < 10; i++) {
            randomWord += (char)(Math.random() * 26 + 97);
        }

        logInPage.sendEmailToCreateAccount(randomWord+"@gmail.com");
    }

    @And("^El usuario hace click sobre el boton Create an account$")
    public void el_usuario_hace_click_sobre_el_boton_Create_an_account() throws Throwable {
        logInPage.clickOnCreateAnAccount();
    }

    @Then("^Se visualiza un error de registro por correo ya existente$")
    public void se_visualiza_un_error_de_registro_por_correo_ya_existente() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(By.id("create_account_error"))
        ));

        Assert.assertTrue("No se ha visualizado el error de registro",logInPage.isCreateAccountErrorDisplayed());

    }

    @And("^Inicia sesion con su usuario$")
    public void inicia_sesion_con_su_usuario() throws Throwable {
        logInPage.sendEmailToLogIn("mariette6132@gmail.com");
        logInPage.sendPasswordToLogIn("Prueba-ChallengeQAMRG07");
        logInPage.clickOnSignIn();
    }

    @And("^Rellena la direccion de email con un correo existente$")
    public void rellena_la_direccion_de_email_con_un_correo_existente() throws Throwable {
        logInPage.sendEmailToCreateAccount("mariette6132@gmail.com");
    }

}
