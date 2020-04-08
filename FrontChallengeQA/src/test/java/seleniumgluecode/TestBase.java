package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.*;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected CreateAccountPage createAccountPage = new CreateAccountPage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected LogInPage logInPage = new LogInPage(driver);
    protected MyAccountPage myAccountPage = new MyAccountPage(driver);
    protected WomenSectionPage womenSectionPage = new WomenSectionPage(driver);
    protected TermsAndConditionsCheckoutPage termsAndConditionsCheckoutPage = new TermsAndConditionsCheckoutPage(driver);
    protected CheckoutPage checkoutPage = new CheckoutPage(driver);

}
