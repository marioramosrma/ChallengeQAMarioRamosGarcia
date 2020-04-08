package seleniumgluecode;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountStepsDefinition extends TestBase {

    @And("^Rellena el formulario de informacion personal$")
    public void rellena_el_formulario_de_informacion_personal() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1"))
        ));

        createAccountPage.clickOnMrGrender();
        createAccountPage.sendCustomerFirstName("Mario");
        createAccountPage.sendCustomerLastName("Ramos");
        createAccountPage.sendPassword("Prueba-ChallengeQAMRG07");
        createAccountPage.sendAdress("Avenida del Llano Castellano 5");
        createAccountPage.sendCity("Madrid");
        createAccountPage.clickOnState();

        WebElement stateLocator = driver.findElement(By.id("id_state"));
        Select sateteValueLocator = new Select(stateLocator);
        sateteValueLocator.selectByValue("5");

        createAccountPage.sendPostCode("28034");
        createAccountPage.sendPhoneMobile("+34666666666");

    }

    @And("^El usuario hace click sobre el boton Register$")
    public void el_usuario_hace_click_sobre_el_boton_Register() throws Throwable {
        createAccountPage.clickOnRegister();
    }

}
