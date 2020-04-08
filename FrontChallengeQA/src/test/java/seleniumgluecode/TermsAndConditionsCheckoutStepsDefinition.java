package seleniumgluecode;

import cucumber.api.java.en.And;

public class TermsAndConditionsCheckoutStepsDefinition extends TestBase {

    @And("^Acepta los terminos y condiciones$")
    public void acepta_los_terminos_y_condiciones() throws Throwable {
        termsAndConditionsCheckoutPage.clickOnTermsAndConditionsCheckbox();
    }

}
