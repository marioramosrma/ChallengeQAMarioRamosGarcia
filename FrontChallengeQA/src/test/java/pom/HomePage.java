package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private String titleHomePage = "My Store";
    private By signInLocator = By.className("header_user_info");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnSignIn() throws Exception {
        this.click(signInLocator);
    }

}
