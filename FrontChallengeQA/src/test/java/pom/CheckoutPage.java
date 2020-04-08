package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    private By payByCheckLocator = By.xpath("//a[@title='Pay by check.']");
    private By confirmOrderLocator = By.className("button btn btn-default button-medium");
    private By confirmOrderSuccessLocator = By.className("alert alert-success");
    private String confirmOrderSuccessText = "Your order on My Store is complete.";

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPayByCheck() throws Exception {
        this.click(payByCheckLocator);
    }

    public void clickOnConfirmOrder() throws Exception {
        this.click(confirmOrderLocator);
    }

    public boolean isOrderConfirmed() throws Exception {
        return this.isDisplayed(confirmOrderSuccessLocator) && this.getText(confirmOrderSuccessLocator).equals(confirmOrderSuccessText);
    }

}
