package tasks;

import driver.GetDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.MainPage;

/**
 * Created by Oleksii_Sydorenko on 11/10/2016.
 */
public class FirstTaskPageFactory {


    public final String URL_MAIN_PAGE = "http://www.screwfix.com";


    @BeforeClass
//    public void set_up() {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Oleksii_Sydorenko\\Desktop\\Locators\\geckodriver.exe");
//        driver = new FirefoxDriver();}
    public void set_up() {
        GetDriver.getdriver();
    }


    @Test(groups = {"positive"})
    public void test(){

        GetDriver.getdriver().get(URL_MAIN_PAGE);
        MainPage mainPage = new MainPage(GetDriver.getdriver());
        mainPage.goToBuildingAndJoineryPage().goToRoofingAndInsulationPage().goToRoofWindowsPage()
                .goToCheckoutPage().goToBasketPage();



    }



    @AfterClass
    public void exit(){
        GetDriver.getdriver().close();
    }

}
