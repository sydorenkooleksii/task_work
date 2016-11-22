package tyt.before;

import net.serenitybdd.core.Serenity;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.BeforeStory;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * Created by Oleksii_Sydorenko on 11/21/2016.
 */
public class Setup {


   @BeforeScenario
    public void setUpWebDriver() {
//        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
////        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//        WebDriver driver = new ChromeDriver();
//        Serenity.getWebdriverManager().setCurrentDriver(driver);
//        Serenity.getWebdriverManager().getWebdriver().manage().window().maximize();
//    }

    System.setProperty("webdriver.chrome.driver", "D:/tyt/drivers/chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//        Serenity.getWebdriverManager().setCurrentDriver(driver);
    getDriver().manage().window().maximize();


}}
