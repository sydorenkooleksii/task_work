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
 * Created by Oleksii_Sydorenko on 11/8/2016.
 */
//public class SecondTask {
//    public final String MAIN_PAGE = "http://docs.seleniumhq.org/";
//    public final String ID_DOWNLOAD = "menu_download";
//    public final String XPATH_SECOND_HEADER = ".//*[@id='mainContent']/h3[2]";
//    public final String VERIFY_SECOND_HEADER = "Server";
//    public final String XPATH_VERIFY_FIRST_TABLE = "//table[1][contains(.,'Ruby')]";
//    public final String XPATH_VERIFY_SECOND_TABLE = "//table[2][contains(.,'Ruby')]";
//
//    @BeforeClass(alwaysRun = true)
//    public void set_up() {
//        GetDriver.getNewDriver();
//    }
//
//    @Test
//    public void test() throws IOException {
//        GetDriver.getdriver().get(MAIN_PAGE);
//        WebElement elementDownload = GetDriver.getdriver().findElement(By.id(ID_DOWNLOAD));
//        elementDownload.click();
//        Assert.assertTrue(GetDriver.getdriver().findElement(By.xpath(XPATH_SECOND_HEADER)).getText().contains(VERIFY_SECOND_HEADER));
//
//        Assert.assertTrue(GetDriver.getdriver().findElement(By.xpath(XPATH_VERIFY_FIRST_TABLE)).isEnabled());
//        Assert.assertTrue(GetDriver.getdriver().findElements(By.xpath(XPATH_VERIFY_SECOND_TABLE)).size()==0);
//    }
//    @AfterClass
//    public void exit(){
//        GetDriver.getQuitDriver();
//    }
//}
