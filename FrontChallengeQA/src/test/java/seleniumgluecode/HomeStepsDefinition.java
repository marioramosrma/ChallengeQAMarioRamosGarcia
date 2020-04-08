package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomeStepsDefinition extends TestBase {

    @Given("^El usuario se encuentra en el inicio de automationpractice$")
    public void el_usuario_se_encuentra_en_el_inicio_de_automationpractice() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton Sign in$")
    public void hace_click_sobre_el_boton_Sign_in() throws Throwable {
        homePage.clickOnSignIn();
    }

}
