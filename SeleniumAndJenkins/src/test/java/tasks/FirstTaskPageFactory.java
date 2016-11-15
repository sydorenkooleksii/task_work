package tasks;

import driver.GetDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.MainPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksii_Sydorenko on 11/10/2016.
 */
public class FirstTaskPageFactory {


    public final String URL_MAIN_PAGE = "http://www.screwfix.com";
    private static WebDriver driver;

    @BeforeClass(alwaysRun = true)
//    public void set_up() {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Oleksii_Sydorenko\\Desktop\\Locators\\geckodriver.exe");
//        driver = new FirefoxDriver();}
    public void set_up() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }


    @Test
    public void test(){

        driver.get(URL_MAIN_PAGE);
        MainPage mainPage = new MainPage(driver);
        mainPage.goToBuildingAndJoineryPage().goToRoofingAndInsulationPage().goToRoofWindowsPage()
                .goToCheckoutPage().goToBasketPage();
    }


    @AfterClass
    public void exit(){
        driver.quit();
    }

}
