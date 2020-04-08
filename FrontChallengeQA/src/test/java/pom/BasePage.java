package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("No se ha podido clickar sobre el elemento: " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
           return driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            throw new Exception("No se ha podido encontrar el elemento: " + element);
        }
    }

    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se ha podido obtener el texto del elemento: " + element);
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se ha podido obtener el titulo del driver.");
        }
    }

    public void sendKeys(By element, String text) throws Exception {
        try {
            driver.findElement(element).sendKeys(text);
        } catch (Exception e) {
            throw new Exception("No se ha podido escribir en el elemento: " + element);
        }
    }

}
