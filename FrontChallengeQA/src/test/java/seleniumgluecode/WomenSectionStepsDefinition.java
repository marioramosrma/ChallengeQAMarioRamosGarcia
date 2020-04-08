package seleniumgluecode;

import cucumber.api.java.en.And;

public class WomenSectionStepsDefinition extends TestBase {

    @And("^Hace click sobre un articulo$")
    public void hace_click_sobre_un_articulo() throws Throwable {
        womenSectionPage.clickOnAnArticle();
    }

    @And("^Añade el articulo al carrito$")
    public void añade_el_articulo_al_carrito() throws Throwable {
        womenSectionPage.clickOnAddToCart();
    }

    @And("^Hace click en Proceed to checkout$")
    public void hace_click_em_proceed_to_checkout() throws Throwable {
        womenSectionPage.clickOnProceedToCheckout();
    }



}
