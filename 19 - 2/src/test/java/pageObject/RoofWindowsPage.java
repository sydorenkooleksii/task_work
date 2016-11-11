package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksii_Sydorenko on 11/10/2016.
 */
public class RoofWindowsPage {


    private final WebDriver getdriver;

    @FindBy(how = How.ID, using = "product_add_button_7498P")
    public WebElement elementDeliver;



    public RoofWindowsPage(WebDriver getdriver) {
        this.getdriver = getdriver;
        PageFactory.initElements(getdriver, this);
    }



    public CheckoutPage goToCheckoutPage(){
        elementDeliver.click();
        return new CheckoutPage(getdriver);

    }




}
