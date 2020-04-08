package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TermsAndConditionsCheckoutPage extends BasePage {

    private By checkboxTermsAndConditionsLocator = By.id("cgv");

    public TermsAndConditionsCheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTermsAndConditionsCheckbox() throws Exception {
        this.click(checkboxTermsAndConditionsLocator);
    }

}
