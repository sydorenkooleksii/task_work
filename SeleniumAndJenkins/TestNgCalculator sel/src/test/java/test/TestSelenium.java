package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksii_Sydorenko on 11/14/2016.
 */
public class TestSelenium {


    public final String MAIN_PAGE = "http://www.screwfix.com";
    public final String ID_BUILDING = "firstLevelCat_7";
    public final String ID_ROOFING = "sub_category_image_3";
    public final String ID_ROOF_WINDOWS = "sub_category_image_0";
    public final String ID_DELIVER = "product_add_button_7498P";
    public final String LINKTEXT_CHECKOUT = "Checkout Now";

    public final String XPATH_WINDOW_INROOF = "//*[@id='product_quoteNo_1']";
    public final String ID_WINDOW_INBASKET = "trolley_page_product_quote_number_1";
    private static WebDriver driver;



    @Test(groups = "selenium")
    public void test() throws IOException, InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(MAIN_PAGE);
        Thread.sleep(5000);
        WebElement elementBuilding = driver.findElement(By.id(ID_BUILDING));
        Thread.sleep(5000);
        elementBuilding.click();
        WebElement elementRoofing = driver.findElement(By.id(ID_ROOFING));
        elementRoofing.click();
        WebElement elementRoof = driver.findElement(By.id(ID_ROOF_WINDOWS));
        elementRoof.click();
        String elementBuy = driver.findElement(By.xpath(XPATH_WINDOW_INROOF)).getText();
        WebElement elementDeliver = driver.findElement(By.id(ID_DELIVER));
        elementDeliver.click();
        WebElement elementCheckout = driver.findElement(By.linkText(LINKTEXT_CHECKOUT));
        elementCheckout.click();
        WebElement elementBuyInBasket = driver.findElement(By.id(ID_WINDOW_INBASKET));
        Assert.assertTrue(elementBuy.contains(elementBuyInBasket.getText()));
        driver.quit();
    }


}