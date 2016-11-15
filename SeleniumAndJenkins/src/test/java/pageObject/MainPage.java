package pageObject;

import driver.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Oleksii_Sydorenko on 11/10/2016.
 */
public class MainPage {
    private final WebDriver getdriver;


    @FindBy(how = How.ID, using = "firstLevelCat_7")
    public WebElement elementBuilding;


    public MainPage(WebDriver getdriver) {
        this.getdriver = getdriver;
        PageFactory.initElements(getdriver, this);
    }

    public BuildingAndJoineryPage goToBuildingAndJoineryPage(){

        elementBuilding.click();
        return new BuildingAndJoineryPage(getdriver);
    }


}
