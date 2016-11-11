package tasks;

import driver.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Oleksii_Sydorenko on 11/4/2016.
 */
public class FirstTask {
    public final String MAIN_PAGE = "http://www.screwfix.com";
    public final String ID_BUILDING = "firstLevelCat_7";
    public final String ID_ROOFING = "sub_category_image_3";
    public final String ID_ROOF_WINDOWS = "sub_category_image_0";
    public final String ID_DELIVER = "product_add_button_7498P";
    public final String LINKTEXT_CHECKOUT = "Checkout Now";

    public final String XPATH_WINDOW_INROOF = "//*[@id='product_quoteNo_1']";
    public final String ID_WINDOW_INBASKET = "trolley_page_product_quote_number_1";

    @BeforeClass
//    public void set_up() {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Oleksii_Sydorenko\\Desktop\\Locators\\geckodriver.exe");
//        driver = new FirefoxDriver();}
    public void set_up() {
        GetDriver.getdriver();
    }


    @Test(groups = {"positive"})
    public void test() throws IOException {
        GetDriver.getdriver().get(MAIN_PAGE);
        WebElement elementBuilding = GetDriver.getdriver().findElement(By.id(ID_BUILDING));
        elementBuilding.click();
        WebElement elementRoofing = GetDriver.getdriver().findElement(By.id(ID_ROOFING));
        elementRoofing.click();
        WebElement elementRoof = GetDriver.getdriver().findElement(By.id(ID_ROOF_WINDOWS));
        elementRoof.click();
        String elementBuy = GetDriver.getdriver().findElement(By.xpath(XPATH_WINDOW_INROOF)).getText();
        WebElement elementDeliver = GetDriver.getdriver().findElement(By.id(ID_DELIVER));
        elementDeliver.click();
        WebElement elementCheckout = GetDriver.getdriver().findElement(By.linkText(LINKTEXT_CHECKOUT));
        elementCheckout.click();
        WebElement elementBuyInBasket = GetDriver.getdriver().findElement(By.id(ID_WINDOW_INBASKET));
        Assert.assertTrue(elementBuy.contains(elementBuyInBasket.getText()));
    }

    @AfterClass
    public void exit(){
        GetDriver.getdriver().close();
    }
}