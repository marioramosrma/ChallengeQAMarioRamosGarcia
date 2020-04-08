package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

    private By mrGenderLocator = By.id("id_gender1");
    private By customerFirstnameLocator = By.id("customer_firstname");
    private By customerLastnameLocator = By.id("customer_lastname");
    private By passwordLocator = By.id("passwd");
    private By adressLocator = By.id("address1");
    private By cityLocator = By.id("city");
    private By stateLocator = By.id("id_state");
    private By postCodeLocator = By.id("postcode");
    private By phoneMobileLocator = By.id("phone_mobile");
    private By sumbitAccountLocator = By.id("submitAccount");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMrGrender() throws Exception {
        this.click(mrGenderLocator);
    }

    public void sendCustomerFirstName(String text) throws Exception {
        this.sendKeys(customerFirstnameLocator, text);
    }

    public void sendCustomerLastName(String text) throws Exception {
        this.sendKeys(customerLastnameLocator, text);
    }

    public void sendPassword(String text) throws Exception {
        this.sendKeys(passwordLocator, text);
    }

    public void sendAdress(String text) throws Exception {
        this.sendKeys(adressLocator, text);
    }

    public void sendCity(String text) throws Exception {
        this.sendKeys(cityLocator, text);
    }

    public void clickOnState() throws Exception {
        this.click(stateLocator);
    }

    public void sendPostCode(String text) throws Exception {
        this.sendKeys(postCodeLocator, text);
    }

    public void sendPhoneMobile(String text) throws Exception {
        this.sendKeys(phoneMobileLocator, text);
    }

    public void clickOnRegister() throws Exception {
        this.click(sumbitAccountLocator);
    }

}
