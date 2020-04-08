package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp() {
        numberOfCase++;
        System.out.println("Se esta ejecutando el escenario número: " + numberOfCase + ".");
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        System.out.println("El escenario número " + numberOfCase + " se ha ejecutado correctamente.");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
