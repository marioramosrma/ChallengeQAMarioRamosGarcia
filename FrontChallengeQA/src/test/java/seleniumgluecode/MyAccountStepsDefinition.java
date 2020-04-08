package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MyAccountStepsDefinition extends TestBase {

    @Then("^El usuario quedara registrado correctamente$")
    public void el_usuario_quedara_registrado_correctamente() throws Throwable {
        Assert.assertTrue("La cuenta no se ha creado correctamente",myAccountPage.isInfoAccountIsDisplayed());
    }

    @And("^Hace click sobre el boton WOMEN$")
    public void hace_click_sobre_el_boton_women() throws Throwable {
        myAccountPage.clickOnWomenSection();
    }

}
