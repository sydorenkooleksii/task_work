package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksii_Sydorenko on 11/10/2016.
 */
public class CheckoutPage {

    private final WebDriver getdriver;

    @FindBy(how = How.LINK_TEXT, using = "Checkout Now")
    public WebElement elementCheckout;



    public CheckoutPage(WebDriver getdriver) {
        this.getdriver = getdriver;
        PageFactory.initElements(getdriver, this);
    }

    public BasketPage goToBasketPage(){
        elementCheckout.click();

        return new BasketPage(getdriver);
    }



}
