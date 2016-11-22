package tyt.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Oleksii_Sydorenko on 11/21/2016.
 */
public class ScrefixResultPage extends PageObject {


    @FindBy(className = "h1wrapper__h1-special")
    private WebElementFacade resultView;


    public void finderAssert(String keyword) {
        assertTrue(resultView.getText().toLowerCase().contains(keyword));
    }

}
