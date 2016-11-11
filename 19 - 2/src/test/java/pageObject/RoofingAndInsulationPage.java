package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksii_Sydorenko on 11/10/2016.
 */
public class RoofingAndInsulationPage {

    private final WebDriver getdriver;

    @FindBy(how = How.ID, using = "sub_category_image_0")
    public WebElement elementRoof;



    public RoofingAndInsulationPage(WebDriver getdriver) {
        this.getdriver = getdriver;
        PageFactory.initElements(getdriver, this);
    }



    public RoofWindowsPage goToRoofWindowsPage(){
        elementRoof.click();
        return new RoofWindowsPage(getdriver);
    }



}
