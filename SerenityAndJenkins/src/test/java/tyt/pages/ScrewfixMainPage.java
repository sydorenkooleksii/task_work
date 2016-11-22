package tyt.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Oleksii_Sydorenko on 11/21/2016.
 */
@DefaultUrl("http://www.screwfix.com/")
public class ScrewfixMainPage extends PageObject {
    @FindBy(id = "mainSearch-input")
    private WebElementFacade searchField;

    @FindBy(id = "search_submit_button")
    private WebElementFacade searchButton;


    public void enter_keywords(String keyword) {
        searchField.type(keyword);
    }

    public void search_button_click() {
        searchButton.click();
    }


}
