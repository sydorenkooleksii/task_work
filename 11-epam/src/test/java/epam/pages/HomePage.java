package epam.pages;

import org.openqa.selenium.WebDriver;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://ecsc00105ecb.epam.com:9002/sklepstorefront/electronics/en/?site=electronics")
public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchForProduct(String product) {
        searchFiled.sendKeys(product);
        searchFiled.submit();
    }
}
