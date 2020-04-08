package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CheckOutPageStepsDefinition extends TestBase {

    @And("^Escoge un metodo de pago$")
    public void escoge_un_metodo_de_pago() throws Throwable {
        checkoutPage.clickOnPayByCheck();
    }

    @And("^Confirma el pedido$")
    public void confirma_el_pedido() throws Throwable {
        checkoutPage.clickOnConfirmOrder();
    }

    @Then("^El pedido se habra completado correctamente$")
    public void el_pedido_se_habra_completado_correctamente() throws Throwable {
        Assert.assertTrue("El pedido no se ha podido realizar correctamente",myAccountPage.isInfoAccountIsDisplayed());
    }

}
