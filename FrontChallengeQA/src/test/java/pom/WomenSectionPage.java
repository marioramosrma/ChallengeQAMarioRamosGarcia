package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumgluecode.Hooks;

public class WomenSectionPage extends BasePage {

    private By addToCartLocator = By.xpath("//button[@name='Submit']");
    private By proceedToCheckoutLocator = By.xpath("//a[@title='Proceed to checkout']");
    private By enlace = By.xpath("//img[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']");
    protected WebDriver driver = Hooks.getDriver();

    public WomenSectionPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAnArticle() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@class, 'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line')]"))
        ));

        // Aquí habria que coger la lista de los artículos y escoger un artículo aleatorio, por falta de tiempo no he podido realizarlo, es por eso que escojo el primer articulo
        this.click(enlace);
    }

    public void clickOnAddToCart() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(addToCartLocator)
        ));

        this.click(addToCartLocator);
    }

    public void clickOnProceedToCheckout() throws Exception {
        this.click(proceedToCheckoutLocator);
    }

}
