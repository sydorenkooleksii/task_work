package driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Oleksii_Sydorenko on 11/8/2016.
 */
public class GetDriver {
    private static WebDriver driver;

    public static WebDriver getdriver (){
        if(driver==null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }
        return driver;
    }


    public static boolean isElementPresent(By by) throws IOException {
        boolean screen = driver.findElements(by).size() > 0;
        if(!screen){
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("D:\\screenshot.jpg"));
        }
        return screen;
    }
}
