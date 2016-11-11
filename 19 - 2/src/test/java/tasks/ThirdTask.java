package tasks;

import driver.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Oleksii_Sydorenko on 11/9/2016.
 */
public class ThirdTask {

    public final String MAIN_PAGE = "http://demos.telerik.com/aspnet-ajax/dropdownlist/examples/overview/defaultcs.aspx";
    public final String ID_DROPLIST = "ctl00_ContentPlaceholder1_RadDropDownProducts";
    public final String XPATH_FOURTH_ELEMENT = ".//*[@id='ctl00_ContentPlaceholder1_RadDropDownProducts_DropDown']//li[4]";
    public final String ID_GETDETAILS = "ctl00_ContentPlaceholder1_GetDetails";
    public final String CLASS_BLOCK_PRODUCT = "order-summary";
    public final String VERIFY_CHEF = "Chef Anton's Cajun Seasoning";
    public final String VERIFY_TEST = "To test the behavior";
    public final String XPATH_PAGE = "//body";
    WebDriverWait wait  = new WebDriverWait(GetDriver.getdriver(), 5);;

    @BeforeClass
    public void set_up() {
        GetDriver.getdriver();
    }


    @Test
    public void test() {
        GetDriver.getdriver().get(MAIN_PAGE);
        WebElement elementDrop = GetDriver.getdriver().findElement(By.id(ID_DROPLIST));
        elementDrop.click();
        WebElement elementDropFourth = GetDriver.getdriver().findElement(By.xpath(XPATH_FOURTH_ELEMENT));
        Actions actions = new Actions(GetDriver.getdriver());
        actions.moveToElement(elementDropFourth).build().perform();
        elementDropFourth.click();
        WebElement elementGetDetails = GetDriver.getdriver().findElement(By.id(ID_GETDETAILS));
        elementGetDetails.sendKeys(Keys.ENTER);


//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className(CLASS_BLOCK_PRODUCT), VERIFY_CHEF));
//        Assert.assertTrue(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className(CLASS_BLOCK_PRODUCT), VERIFY_CHEF)));


        Assert.assertTrue(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className(CLASS_BLOCK_PRODUCT), VERIFY_CHEF)));


//        Assert.assertTrue(GetDriver.getdriver().findElement(By.className(CLASS_BLOCK_PRODUCT)).getText().contains(VERIFY_CHEF));
        Assert.assertFalse(GetDriver.getdriver().findElement(By.className(CLASS_BLOCK_PRODUCT)).getText().contains(VERIFY_TEST));
        Assert.assertTrue(GetDriver.getdriver().findElement(By.xpath(XPATH_PAGE)).getText().toLowerCase().contains(VERIFY_TEST.toLowerCase()));

    }

    @AfterClass
    public void exit(){
        GetDriver.getdriver().close();
    }
}

