package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

    private By infoAccount = By.className("info-account");
    private String welcomeTitleText = "Welcome to your account. Here you can manage all of your personal information and orders.";
    private By womenSectionLocator = By.xpath("//a[@title='Women']");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInfoAccountIsDisplayed() throws Exception {
        return this.isDisplayed(infoAccount) && this.getText(infoAccount).equals(welcomeTitleText);
    }

    public void clickOnWomenSection() throws Exception {
        this.click(womenSectionLocator);
    }

}
