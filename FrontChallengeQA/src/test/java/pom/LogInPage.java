package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

    private By emailCreateLocator = By.id("email_create");
    private By sumbitCreateLocator = By.id("SubmitCreate");
    private By createAcountErrorLocator = By.id("create_account_error");
    private String errorCreateAccountText = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
    private By emailLogInLocator = By.id("email");
    private By passwordLogInLocator = By.id("passwd");
    private By signInLocator = By.id("SubmitLogin");

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void sendEmailToCreateAccount(String email) throws Exception {
        this.sendKeys(emailCreateLocator, email);
    }

    public void clickOnCreateAnAccount() throws Exception {
        this.click(sumbitCreateLocator);
    }

    public boolean isCreateAccountErrorDisplayed() throws Exception {
        return this.isDisplayed(createAcountErrorLocator) && this.getText(createAcountErrorLocator).equals(errorCreateAccountText);
    }

    public void sendEmailToLogIn(String email) throws Exception {
        this.sendKeys(emailLogInLocator, email);
    }

    public void sendPasswordToLogIn(String email) throws Exception {
        this.sendKeys(passwordLogInLocator, email);
    }

    public void clickOnSignIn() throws Exception {
        this.click(signInLocator);
    }

}
